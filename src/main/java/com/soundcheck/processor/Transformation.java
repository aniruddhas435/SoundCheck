package com.soundcheck.processor;

import com.soundcheck.player.Sargam;
import com.soundcheck.player.transformers.DigitsToNotes;
import com.soundcheck.player.transformers.SchemeToDerivation;
import com.soundcheck.player.transformers.SchemeToSequence;
import com.soundcheck.syntax.Syntax;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class Transformation {
    private Syntax syntax;
    private Set<String> flushSet = new HashSet<>();
    private Map<String, Boolean> schemeInRange = new HashMap<>();

    @Autowired
    private DigitsToNotes digitsToNotes;

    public Syntax getSyntax() {
        return syntax;
    }

    public void setSyntax(Syntax syntax) {
        this.syntax = syntax;
    }

    public DigitsToNotes getDigitsToNotes() {
        return digitsToNotes;
    }

    public void setDigitsToNotes(DigitsToNotes digitsToNotes) {
        this.digitsToNotes = digitsToNotes;
    }

    public Set<String> getFlushSet() {
        return flushSet;
    }

    public void transform(String low, String high) {
        Map<String, Distribution> derivations = syntax.getDerivations();

        Queue<Distribution<String>> queue = new LinkedList<>();
        for(Distribution<String> dist: derivations.values()) {
            queue.add(dist);
        }

        while(!queue.isEmpty()) {
            Distribution<String> dist = queue.remove();
            for(String ders: dist.getValues()) {
                for(String str: ders.split("-")) {
                    if (!Sargam.swar.containsKey(str) && !derivations.containsKey(str)) {
                        if (str.contains("*") &&
                                derivations.containsKey(str.replace("*", ""))) {
                            queue = editQueue(queue, str.replace("*", ""),
                                    '*', low, high);
                        } else if (str.contains("_") &&
                                derivations.containsKey(str.replace("_", ""))) {
                            queue = editQueue(queue, str.replace("_", ""),
                                    '_', low, high);
                        }
                    }
                }
            }
        }
    }

    private Queue<Distribution<String>> editQueue(Queue<Distribution<String>> queue, String var,
                                                  char appendix, String low, String high) {

        String newVar = var + appendix;

        Map<String, Distribution> derivations = syntax.getDerivations();

        Distribution<String> oldDist = derivations.get(var);
        Distribution<String> newDist = new Distribution<>();

        for(String der: oldDist.getValues()) {
            String currDer = "";
            boolean hasOutOfRange = false;

            String oldDer = der;

            for(String str: der.split("-")) {
                if(appendix == '_') {
                    String id = "";
                    if(str.contains("(")) {
                        String[] parts = str.split("\\(");
                        String schemeCalled = parts[0];
                        String swar = parts[1].substring(0, parts[1].length() - 1);

                        String changedSwar = downgrade(swar);

                        if(changedSwar == null) id = null;
                        else id = schemeCalled + "(" + changedSwar + ")";

//                        hasOutOfRange = checkRange(schemeCalled, changedSwar, low, high);
//                        if(hasOutOfRange) id = null;

                        if(!inRange(changedSwar, low, high)) {
                            id = null;
                        }
                    } else {
                        id = downgrade(str);
                    }

                    if(id == null) {
                        hasOutOfRange = true;
                        break;
                    } else if(Sargam.swar.containsKey(id)) {
                        if(inRange(id, low, high)) currDer += id + "-";
                        else {
                            hasOutOfRange = true;
                            break;
                        }
                    } else {
                        currDer += id + "-";
                    }
                } else if(appendix == '*') {
                    String id = "";
                    if(str.contains("(")) {
                        String[] parts = str.split("\\(");
                        String schemeCalled = parts[0];
                        String swar = parts[1].substring(0, parts[1].length() - 1);

                        String changedSwar = upgrade(swar);
                        if(changedSwar == null) id = null;
                        else id = schemeCalled + "(" + changedSwar + ")";

//                        hasOutOfRange = checkRange(schemeCalled, changedSwar, low, high);
//                        if(hasOutOfRange) id = null;

                        if(!inRange(changedSwar, low, high)) {
                            id = null;
                        }
                    } else {
                        id = upgrade(str);
                    }

                    if(id == null) {
                        hasOutOfRange = true;
                        break;
                    } else if(Sargam.swar.containsKey(id)) {
                        if(inRange(id, low, high)) currDer += id + "-";
                        else {
                            hasOutOfRange = true;
                            break;
                        }
                    } else {
                        currDer += id + "-";
                    }
                }
            }

            if(hasOutOfRange) {
                continue;
            } else {
                currDer = currDer.substring(0, currDer.length() - 1);
                newDist.add(currDer, oldDist.get(oldDer));
            }
        }

        queue.add(newDist);

        if(newDist.isEmpty()) {
            flushSet.add(newVar);
        } else {
            derivations.put(newVar, newDist);
        }

        return queue;
    }

    private boolean checkRange(String schemeCalled, String swar,
                               String low, String high) {

        String key = schemeCalled + "(" + swar + ")";
        if(schemeInRange.containsKey(key)) {
            return schemeInRange.get(key);
        } else {
            Distribution<String> scheme = syntax.getSchemes().get(schemeCalled);
            boolean hasOutOfRange = false;

            for(String digits: scheme.getValues()) {
                List<String> notes = digitsToNotes.transform(digits, swar,
                        syntax.getAscent(), syntax.getDescent());

                for(String note: notes) {
                    if(Sargam.swar.get(note) < Sargam.swar.get(low) ||
                       Sargam.swar.get(note) > Sargam.swar.get(high)) {
                        hasOutOfRange = true;
                        break;
                    }
                }

                if(hasOutOfRange) break;
            }

            schemeInRange.put(key, hasOutOfRange);
            return hasOutOfRange;
        }
    }

    private String upgrade(String str) {
        char last = str.charAt(str.length() - 1);
        if(last == '*') return null;
        if(last == '_') {
            return str.replace("_", "");
        } else {
            return str + "*";
        }
    }

    private String downgrade(String str) {
        char last = str.charAt(str.length() - 1);
        if(last == '_') return null;
        if(last == '*') {
            return str.replace("*", "");
        } else {
            return str + "_";
        }
    }

    private boolean inRange(String swar, String low, String high) {
        if(!Sargam.swar.containsKey(swar)) return false;
        return Sargam.swar.get(swar) <= Sargam.swar.get(high) &&
                Sargam.swar.get(swar) >= Sargam.swar.get(low);
    }
}
