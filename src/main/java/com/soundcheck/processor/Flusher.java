package com.soundcheck.processor;

import java.util.*;

public class Flusher {
    public Map<String, Distribution> flush(Map<String, Distribution> derivations, Set<String> flushSet) {
        Map<String, List<Object[]>> locations = new HashMap<>();
        for(String var: derivations.keySet()) {
            Distribution<String> dist = derivations.get(var);
            for(String der: dist.getValues()) {
                for(String id: der.split("-")) {
                    if(derivations.containsKey(id) || flushSet.contains(id)) {
                        locations.computeIfAbsent(id, k -> new ArrayList<>()).add(new Object[]{var, der});
                    }
                }
            }
        }

        Queue<String> queue = new LinkedList<>();
        for(String str: flushSet) {
            queue.add(str);
        }

        while(!queue.isEmpty()) {
            String var = queue.remove();
            List<Object[]> locs = locations.get(var);
            for(Object[] location: locs) {
                String variable = (String) location[0];
                String derivation = (String) location[1];
                try {
                    derivations.get(variable).remove(derivation);
                } catch(NullPointerException e) {
                    continue;
                }
                if(derivations.get(variable).isEmpty()) {
                    queue.add(variable);
                    flushSet.add(variable);
                }
            }
        }

        for(String str: flushSet) {
            if(derivations.containsKey(str)) {
                derivations.remove(str);
            }
        }

        return derivations;
    }
}
