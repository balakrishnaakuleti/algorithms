package algorithms;

import java.io.PrintStream;

class Node {
	Node(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}

	Node left;
	Node right;
	int value;
}

public class BinarySearchTree {

	public static Node root;
	public static StringBuilder output = new StringBuilder();
	public static void main(String[] args) {
		BinarySearchTree.root = new Node(1);
		root.left= new Node(2);
		root.right= new Node(3);
		root.left.left= new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
		root.right.right= new Node(7);
		printBST(output,BinarySearchTree.root);
		print(System.out);
	}
	public static void print(PrintStream os) {
	    printBST(output,BinarySearchTree.root);
	    os.print(output.toString());
	}
	static void printBST(StringBuilder output, Node root) {
		if (root == null)
		{
			return;
		}
		output.append(" "+root.value+" ");
		output.append("\n");
		printBST(output,root.left);
		printBST(output,root.right);		
	}
}
