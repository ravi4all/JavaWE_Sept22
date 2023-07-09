import java.util.ArrayList;

public class GraphDFS {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void dfs(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited) {
        visited[s] = true;
        System.out.println(s);
        for(int i : adj.get(s)) {
            if(visited[i] == false) {
                dfs(adj, s, visited);
            }
        }
    }

    static void dfs_call(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean[] visited = new boolean[v+1];
        int source = 1;
        for(int i = 1; i < v + 1; i++) {
            visited[i] = false;
        }
        dfs(adj, source, visited);
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
