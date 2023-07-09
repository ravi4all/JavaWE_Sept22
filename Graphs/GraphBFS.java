package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class GraphBFS {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void bfs(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean[] visited = new boolean[v+1];
        int source = 1;
        for(int i = 1; i < v + 1; i++) {
            visited[i] = false;
        }
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited[source] = true;
        while(queue.size() != 0) {
            source = queue.poll();
            // get number of adjacent vertices or current source
            int size = adj.get(source).size();
            for(int i = 0; i < size; i++) {
                int adjNode = adj.get(source).get(i);
                if(visited[adjNode] == false) {
                    visited[adjNode] = true;
                    queue.add(adjNode);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int V  = 6;
        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 1,2);
        addEdge(adj, 1,3);
        addEdge(adj, 2,4);
        addEdge(adj, 2,5);
        addEdge(adj, 3,5);
        addEdge(adj, 4,5);
        addEdge(adj, 4,6);
        addEdge(adj, 5,6);
    }
}
