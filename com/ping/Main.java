package com.ping;

public class Main {
	public static void main(String[] args) {
		
		Tree t1 = null;
		String[] key1 = new String[]{"t","s","p","i","p","f","b","s","t"};
		String[] key2 = new String[]{"a","b","c","d","e","f","g","h","i"};
		for(int i=0; i<9; i++) {
			Tree t2 = insert(key1[i], t1);
			t1 = t2;
		}
		System.out.println(""+t1.lookup("b", t1));
		//Print(t1);
	}
	
	static void Print(Tree t) {
		if(t != null) {
			System.out.println(t.key);
			Print(t.left);
			Print(t.right);
		}
	}
	
	
	
	static Tree insert(String key, Tree t) {
		if (t == null) {
			return new Tree(key, null, null);
		} else if (key.compareTo(t.key) < 0) {
			return new Tree(t.key, insert(key, t.left), t.right);
		} else if (key.compareTo(t.key) > 0) {
			return new Tree(t.key, t.left, insert(key, t.right));
		} else
			return new Tree(key, t.left, t.right);
	}

}
