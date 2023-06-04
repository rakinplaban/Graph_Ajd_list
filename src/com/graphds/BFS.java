package com.graphds;
import java.util.*;

public class BFS {
    private Map<Character, List<Character>> graph;

    public BFS(Map<Character, List<Character>> graph) {
        this.graph = graph;
    }

    public void traversal(char source) {
        Map<Character, Character> color = new HashMap<>();
        Map<Character, Character> prev = new HashMap<>();
        Map<Character, Integer> distance = new HashMap<>();

        // Initialization
        for (char u : graph.keySet()) {
            if (u != source) {
                color.put(u, 'W');
                prev.put(u, 'N');
                distance.put(u, Integer.MAX_VALUE);
            }
        }

        color.put(source, 'G');
        distance.put(source, 0);

        Queue<Character> queue = new LinkedList<>();
        queue.add(source);

        while (!queue.isEmpty()) {
            char u = queue.remove();

            for (char v : graph.get(u)) {
                if (color.get(v) == 'W') {
                    color.put(v, 'G');
                    distance.put(v, distance.get(u) + 1);
                    prev.put(v, u);
                    queue.add(v);
                }
            }

            color.put(u, 'B');
        }

        // Print the results
        System.out.println("Data: color[V], prev[V], d[V]");
        for (char v : graph.keySet()) {
            System.out.println("color[" + v + "] = " + color.get(v));
            System.out.println("prev[" + v + "] = " + prev.get(v));
            System.out.println("d[" + v + "] = " + distance.get(v));
        }
    }

}
