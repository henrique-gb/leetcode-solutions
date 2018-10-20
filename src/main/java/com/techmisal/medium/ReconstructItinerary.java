package com.techmisal.medium;

import java.util.*;

public class ReconstructItinerary {
    public List<String> findItinerary(String[][] tickets) {
        Map<String, PriorityQueue<String>> destinations = new HashMap<>();
        List<String> path = new ArrayList<>();

        for (String[] ticket : tickets) {
            PriorityQueue<String> queue = destinations.get(ticket[0]);
            if(queue == null) {
                queue = new PriorityQueue<>();
                destinations.put(ticket[0], queue);
            }
            queue.add(ticket[1]);
        }

        Deque<String> deque = new ArrayDeque<>();
        deque.push("JFK");

        while (!deque.isEmpty()) {
            while (destinations.containsKey(deque.peek()) && !destinations.get(deque.peek()).isEmpty()) {
                deque.push(destinations.get(deque.peek()).poll());
            }
            path.add(0, deque.pop());
        }

        return path;
    }
}
