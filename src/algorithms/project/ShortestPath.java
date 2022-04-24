package algorithms.project;

import java.lang.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class ShortestPath {
    int vertexNum ;
    static int[] distance;
    static Vector<String> vertexNames;
    static String[] arrangedEdges ;
    int[][] steps;
    static Map map; 
    static Map map2;
    ArrayList<String> sortedKeys;

    int src;



    ShortestPath(int vertexNum, Vector<String> vertexNames){
        this.vertexNum = vertexNum;
        this.vertexNames = vertexNames;
        steps = new int [vertexNum][2];
        map=new HashMap();
        map2=new HashMap(); 
       // arrangedEdges =  new Vector<>() ;
    }
    ShortestPath(){}

    void printDijkstra(int[] dist)
    {
        System.out.println("Vertex \t\t Distance from "+ vertexNames.get(src));
        for (int i = 0; i < vertexNum; i++)
            System.out.println(vertexNames.get(i) + " \t\t\t\t " + dist[i]);
    }
    int findMinDist(int[] dist, Boolean[] sptSet)
    {
        int minimum = Integer.MAX_VALUE, minIndex = -1;

        for (int i = 0; i < vertexNum; i++)
            if (!sptSet[i] && dist[i] <= minimum) {
                minimum = dist[i];
                minIndex = i;
            }

        return minIndex;
    }

    public void sortbykey() 
    { 
       sortedKeys = new ArrayList<String>(map.keySet()); 
          
        Collections.sort(sortedKeys);     
    } 
    public void sortDist(){
        for (int i = 1; i < distance.length; i++) {
            for (int j = i; j > 0; j--) {
                if (distance[j] < distance [j - 1]) {
                    int temp = distance[j];
                    distance[j] = distance[j - 1];
                    distance[j - 1] = temp;
                    
                    String temp2 = arrangedEdges[j];
                    arrangedEdges[j]=  arrangedEdges[j-1];
                    arrangedEdges[j-1] = temp2;
                }
            }
         }
    }
      
    
    int[] dijkstra(int[][] graphMatrix, int src)
    {
        distance = new int[vertexNum];
        arrangedEdges = new String[vertexNum];
        this.src = src;
        Boolean[] spSet = new Boolean[vertexNum];

        for (int i = 0; i < vertexNum; i++) {
            distance[i] = Integer.MAX_VALUE;
            spSet[i] = false;
        }

        distance[src] = 0;

        for (int c = 0; c < vertexNum - 1; c++) {
            int i = findMinDist(distance, spSet);
            System.out.println("Return = " + i);
            spSet[i] = true;
            for (int j = 0; j < vertexNum; j++) {
                if (!spSet[j] && graphMatrix[i][j] > 0  && distance[i] + graphMatrix[i][j] < distance[j] && distance[i] != Integer.MAX_VALUE ) {
                    distance[j] = distance[i] + graphMatrix[i][j];
                    steps[j][0] = i;
                    steps[j][1] = j;
                    
//                    String s = Integer.toString(i) ;
//                    s+= " ";
//                    s+= Integer.toString(j);
                    String s = vertexNames.get(i) +" "+vertexNames.get(j);
                    map.put(j, s);
                    
                    System.out.println("Edge = "+ s);
                    
                    System.out.println("Arranged Edges befor if = "+ arrangedEdges );
//                    if(arrangedEdges.){
//                        arrangedEdges.remove(s);   
//                    }
//                    arrangedEdges.add(s);
                       arrangedEdges[j] = s;
                          
//                    System.out.println("index = " + j);
                    System.out.println("Dis = " + distance[j]);
//                    System.out.println(i +" "+j);

                }
               // else


            }
            System.out.println("\n");
        }

        for (int i = 0; i < vertexNum; i++) {
            if (distance[i] == Integer.MAX_VALUE)
                distance[i] = -1;
        }
        map.forEach((k,v) -> map2.put(v, k));
        
        
//        for (int i = 1; i < distance.length; i++) {
//            for (int j = i; j > 0; j--) {
//                if (distance[j] < distance [j - 1]) {
//                 int temp = distance[j];
//                 distance[j] = distance[j - 1];
//                 distance[j - 1] = temp;
//                 Collections.swap(vertexNames, j, j-1);
//
//                }
//            }
//        }
        
        
        
        printDijkstra(distance);
        sortDist();
        for (int i = 0; i < distance.length; i++) {
           System.out.print(arrangedEdges[i] +"      "+ distance[i] + "  ");

        }
        System.out.println("\nArranged Edges = "+ arrangedEdges );
        for (int i = 0; i < vertexNum; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(steps[i][j]);

            }
            System.out.println("");
        }
        return  distance;
    }


}
