/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.project;

import java.util.Vector;

class Edge {
    String initial;
    String terminate;
    int weight;
    Edge(String initial, String terminate, int weight){
        this.initial = initial;
        this.terminate = terminate;
        this.weight = weight;
    }
}

public class Graph {
    Vector<String> vertices;
    int mat[][];
    int vertexNum ;
    boolean directed = true;
    
    public Graph(Vector <String> vertices){
        vertexNum = vertices.size();
        this.vertices = new Vector<>();
        mat = new int[vertexNum][vertexNum];
        builtMatrix();
        for ( int i = 0 ; i < vertexNum ; i++)
            this.vertices.add(vertices.get(i));
    }
    public Graph (){
       // this.vertices = new Vector<>();
    }
    public Graph(Graph graph){
        this.copy(graph);
    }
    
    public void setDirected(boolean directed){
        this.directed = directed;
    }

    public void addEdge(String initialVertex , String terminalVertex,int weight){
        int init = vertices.indexOf(initialVertex);
        int ter = vertices.indexOf(terminalVertex);
        if (directed == false ) mat[ter][init] = weight;
        mat[init][ter] = weight;
    }

    public Vector<Edge> getEdges() {
        Vector <Edge> edges = new Vector<>();
        for(int i = 0 ; i < vertexNum ; i++){
            for (int j = 0 ; j < vertexNum ; j++){
                if(mat[i][j] >= 0 && (directed || (!directed && j <= i))){
                    edges.add(new Edge(vertices.get(i),vertices.get(j),mat[i][j]));
                }
            }
        }
        return edges;
    }

    public Vector<String> getVertices() {
        return vertices;
    }

    public int[][] getMat(){
        return mat;
    }

    public Vector<Integer> getAdj(int row){
        //int row = vertices.indexOf(vertex);
        Vector <Integer> res = new Vector<>();
        for ( int i = 0 ; i < vertexNum ; i++){
            if(mat[row][i] > 0)
                res.add(i);
        }
        return res;
    }

    public  void setValue(String start,String end ,int value){
        int row = vertices.indexOf(start);
        int col = vertices.indexOf(end);
        mat[row][col] = value;
    }
    
    private void builtMatrix(){
        for(int i = 0 ; i < vertexNum ; i++)
            for(int j = 0 ; j < vertexNum ; j++)
                mat[i][j] = -1;
    }

    void print(){
        for(int i = 0 ; i < vertexNum ; i++){
            System.out.print(vertices.get(i)+ ": ");
            for (int j = 0 ; j < vertexNum ; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void copy(Graph graph){
        vertexNum = graph.vertexNum;
        vertices = new Vector<>();
        directed = graph.directed;
        for(int i = 0 ; i < vertexNum ; i++)
            vertices.add(graph.getVertices().get(i));
        mat = new int[vertexNum][vertexNum];
        for(int i = 0 ; i < vertexNum ; i++)
            for(int j = 0 ; j < vertexNum ; j++)
                mat[i][j] = graph.getMat()[i][j];
    }

}
