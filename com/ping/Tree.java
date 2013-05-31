package com.ping;

public class Tree {

	String key;
	Tree left;
	Tree right;

	public Tree(String key, Tree left, Tree right) {
		this.key = key;
		this.left = left;
		this.right = right;
	}

	public boolean lookup(String key, Tree t) {
		if (t != null) {
			if (t.key.equals(key)) {
				return true;
			} else {
				return lookup(key, t.left) || lookup(key, t.right);
			}
		} else
			return false;
	}

}
