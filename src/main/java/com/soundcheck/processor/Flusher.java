package com.soundcheck.processor;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class Flusher {
    public Map<String, Distribution> flush(Map<String, Distribution> derivations, Set<String> flushSet) {
        Map<String, List<Location>> locations = new HashMap<>();
        for(String var: derivations.keySet()) {
            Distribution<String> dist = derivations.get(var);
            for(String der: dist.getValues()) {
                for(String id: der.split("-")) {
                    if(derivations.containsKey(id) || flushSet.contains(id)) {
                        locations.computeIfAbsent(id, k -> new ArrayList<>()).add(new Location(var, der));
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
            List<Location> locs = locations.get(var);
            for(Location location: locs) {
                try {
                    derivations.get(location.variable).remove(location.derivation);
                } catch(NullPointerException e) {
                    continue;
                }
                if(derivations.get(location.variable).isEmpty()) {
                    queue.add(location.variable);
                    flushSet.add(location.variable);
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
