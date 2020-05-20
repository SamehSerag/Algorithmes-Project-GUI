package algorithms.project;

import java.lang.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

public class ShortestPath {
    int vertexNum ;
    static int[] distance;
    static Vector<String> vertexNames;
    int[][] steps;
    static Map map; 
    static Map map2;

    int src;



    ShortestPath(int vertexNum, Vector<String> vertexNames){
        this.vertexNum = vertexNum;
        this.vertexNames = vertexNames;
        steps = new int [vertexNum][2];
        map=new HashMap();
        map2=new HashMap(); 

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


    int[] dijkstra(int[][] graphMatrix, int src)
    {
        distance = new int[vertexNum];
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
                    System.out.println(map);
                          
                    System.out.println("index = " + j);
                    System.out.println("Dis = " + distance[j]);
                    System.out.println(i +" "+j);

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
        for (int i = 0; i < vertexNum; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(steps[i][j]);

            }
            System.out.println("");
        }
        return  distance;
    }


}
