/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 *
 * @author User
 */
public class Graph {
    
    private int V;
    private LinkedList<Integer> adj[];
    private Queue<Integer> queue;
    
    Graph(int v){
    V=v;
    adj = new LinkedList[v];
    for(int i=0;i<v;i++){
        adj[i]=new LinkedList<>();
    }
    queue = new LinkedList<Integer>();
}
    void addEdge(int v,int w){
        adj[v].add(w);
    }
    
    void BFS( int n){
        boolean nodes[]=new boolean[V];
        int a= 0;
        nodes[n]=true;
        queue.add(n);
        
        while(queue.size()!=0){
            n=queue.poll();
            System.out.print(n+" ");
            for(int i=0;i<adj[n].size();i++){
                a=adj[n].get(i);
                if(!nodes[a]){
                    nodes[a]=true;
                    queue.add(a);
                }
            }
        }
        
    }
    

    public static void main(String[] args) {
        Graph graph = new Graph(6);
                graph.addEdge(0, 1);
                graph.addEdge(0, 3);
                graph.addEdge(0, 4);
                graph.addEdge(4, 5);
                graph.addEdge(3, 5);
                graph.addEdge(1, 2);
                graph.addEdge(1, 0);
                graph.addEdge(2, 1);
                graph.addEdge(4, 1);
                graph.addEdge(3, 1);
                graph.addEdge(5, 4);
                graph.addEdge(5, 3);
                
                
                System.out.println("BSF print Output");
                
                graph.BFS(0);
                
    }
}
