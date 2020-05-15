package algorithms.project;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

class path{
    Vector <Edge> edges = new Vector<>();
    Map map = new HashMap();
    public void addEdge(String s,String e,int w){
        edges.add(0,new Edge(s,e,w));
        String str = s + " " +e ;
        map.put(str, w);
    }
}

public class MaximumFlow {
    public static Graph graph;
    public Vector<Edge> edges;
    Vector <path> paths;
    int res;
    Vector <Integer> minimum;
    Vector <String > routs;
    public MaximumFlow(Graph graph){
        this.graph = new Graph(graph);
        edges = graph.getEdges();
        paths = new Vector<>();
        res = 0;
        minimum = new Vector<>();
        routs = new Vector<>();
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
            minimum.add(min);
            path path = new path();
            for(int i = end ; i != start ; i = parent[i]){
                int j = parent[i];
                //graph.getMat()[i][j] += min;
                graph.getMat()[j][i] -= min;
               // path.edges.add(0,new Edge(graph.getVertices().get(j),graph.getVertices().get(i),graph.getMat()[j][i]));
                path.addEdge(graph.getVertices().get(j), graph.getVertices().get(i), graph.getMat()[j][i]);
            }
            String pathName ="";
            for(int i = 0 ; i < path.edges.size() ; i++){
                pathName += path.edges.get(i).initial + ",";
            }
            pathName += path.edges.get(path.edges.size() - 1).terminate;
            routs.add(pathName);
            paths.add(path);
            
            sum += min;
        }
        res =  sum;
    }


}
