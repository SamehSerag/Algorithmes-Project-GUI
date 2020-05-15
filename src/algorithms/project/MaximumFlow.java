package algorithms.project;

import java.util.Vector;

class path{
    Vector <Edge> edges = new Vector<>();
}

public class MaximumFlow {
    private Graph graph;
    private Vector<Edge> edges;
    Vector <path> paths;
    int res;
    public MaximumFlow(Graph graph){
        this.graph = new Graph(graph);
        edges = graph.getEdges();
        paths = new Vector<>();
        res = 0;
    }

    private int[] BFS(int initialVertex , int terminalVertex ){
        int path[] = new int[graph.vertexNum];
        boolean visted[] = new boolean[graph.vertexNum];
        for(int i = 0 ; i < graph.vertexNum ; i++)
            visted[i] = false;
        Vector <Integer> queue = new Vector<>();
        queue.add(initialVertex);
        visted[initialVertex] = true;
        path[initialVertex] = -1;
        while (queue.size() != 0){
            int current = queue.remove(0);
            Vector<Integer> adj = graph.getAdj(current);
            for(int j = 0 ; j < adj.size() ; j++){
                if(!visted[adj.get(j)]){
                    queue.add(adj.get(j));
                    visted[adj.get(j)] = true;
                    path[adj.get(j)] = current;
                }
            }
        }
        if(visted[terminalVertex])
            return path;
        return null;
    }

    public void fordFulkerson(String initialVertex , String terminalVertex ){
        int sum = 0;
      
        if(initialVertex.equals(terminalVertex)) return;
        int start = graph.getVertices().indexOf(initialVertex);
        int end = graph.getVertices().indexOf(terminalVertex);
        while(true){
            int parent[] = BFS(start,end);
            if(parent == null) break;
            int min = Integer.MAX_VALUE;
            for(int i = end ; i != start ; i = parent[i]){
                int j = parent[i];
                min = Math.min(min,graph.getMat()[j][i]);
            }
            path path = new path();
            for(int i = end ; i != start ; i = parent[i]){
                int j = parent[i];
                //graph.getMat()[i][j] += min;
                graph.getMat()[j][i] -= min;
                path.edges.add(0,new Edge(graph.getVertices().get(j),graph.getVertices().get(i),graph.getMat()[j][i]));
            }
            paths.add(path);
            sum += min;
        }
        res =  sum;
    }


}
