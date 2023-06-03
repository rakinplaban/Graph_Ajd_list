package com.graphds;
import java.util.*;
import java.lang.*;
public class BFS extends Data{
	private static char[] color ;
	private static int[] d ;
	private static char[] prev ;
	private Queue<Character> Q = new LinkedList<Character>();
	private HashMap<Character,Vector<Character>> graph = new HashMap<Character,Vector<Character>>();
	
	public BFS(HashMap<Character, Vector<Character>> graph) {
	    super(color, d, prev);
	    this.graph = graph;
	}

	
	public void traversal(char source) {
		color = new char[graph.size()];
	    d = new int[graph.size()];
	    prev = new char[graph.size()];
	    
		for(char u : graph.keySet()) {
			if(u==source) {
				continue;
			}
			else {
				color[u] = 'W';
				d[u] = -1;
				prev[u] = 'N';
			}
		}
		
		color[source]='G';
		d[source]=0; 
		prev[source]= 'N';
		
		Q = null;
		Q.add(source);
		
		while(!Q.isEmpty()) {
			char u = Q.remove();
			for(char v : graph.get(u)) {
				if(color[v]=='W') {
					color[v] = 'G';
					d[v] = d[u] + 1;
					prev[v] = u;
					Q.add(v);
				}
			}
			color[u] = 'B';
			System.out.print(u);
		}
		
	}
}
