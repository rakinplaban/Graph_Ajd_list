package com.graphds;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Vector<Character> r_list = new Vector<Character>();
		HashMap<Character,Vector> adj_list = new HashMap<Character,Vector>();
		r_list.add('s');
		r_list.add('v');
		adj_list.put('r', r_list);
		Vector<Character> s_list = new Vector<Character>();
		s_list.add('r');
		s_list.add('w');
		adj_list.put('s', s_list);
		Vector<Character> t_list = new Vector<Character>();
		t_list.add('w');
		t_list.add('x');
		t_list.add('u');
		adj_list.put('t', t_list);
		Vector<Character> u_list = new Vector<Character>();
		u_list.add('t');
		u_list.add('y');
		adj_list.put('u', u_list);
		Vector<Character> v_list = new Vector<Character>();
		v_list.add('r');
		adj_list.put('v', v_list);
		Vector<Character> w_list = new Vector<Character>();
		w_list.add('s');
		w_list.add('t');
		w_list.add('x');
		adj_list.put('w', w_list);
		Vector<Character> x_list = new Vector<Character>();
		x_list.add('w');
		x_list.add('t');
		x_list.add('y');
		adj_list.put('x', x_list);
		Vector<Character> y_list = new Vector<Character>();
		y_list.add('x');
		y_list.add('u');
		adj_list.put('y', y_list);
		System.out.print(adj_list);
	}

}
