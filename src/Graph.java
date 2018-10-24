import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Graph {
    private int vert;   // No. of vertices
    private ArrayList<Integer> adj[]; //Adjacency Lists

    Graph(int v)
    {
        vert = v;
        adj = new ArrayList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new ArrayList();
    }

    //  xcds vg  add an edge into the graph
    public void addEdge(int v,int w)
    {
        adj[v].add(w);
    }

    public void bfs (int start){
        boolean[] visited = new boolean[vert];
        visited[start] = true;

        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(start);

        while(!queue.isEmpty()){
            int node = queue.pop();
            System.out.print(node +" -> ");
            ArrayList<Integer> children = adj[node];
            for (Integer child: children){
                if (!visited[child]){
                    visited[child] = true;
                    queue.add(child);
                }
            }
        }
        System.out.println();
    }

    public void dfs (int start, Set<Integer> visited){
        System.out.print(start+" -> ");
        visited.add(start);

        for(Integer child: adj[start]){
            if(!visited.contains(child)) {
                dfs(child, visited);
            }
        }
    }


    public static void main(String[] args){
        Graph graph = new Graph(6);
        graph.addEdge(0,1);
        graph.addEdge(1,3);
        graph.addEdge(1,2);
        graph.addEdge(3,4);
        graph.addEdge(2,4);
        graph.addEdge(4,1);
        graph.addEdge(3,5);

        graph.bfs(0);
        graph.dfs(0, new HashSet<>());
    }

}
