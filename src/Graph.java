import java.util.ArrayList;
import java.util.LinkedList;

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

        LinkedList<Integer> queue = new LinkedList<>();

        visited[start] = true;

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
    }

}
