package com.ge.binarytree;

import java.util.Scanner;

public class Tree {
	
	private static Node root;
	
	private class Node{
		private Node left = null;
		private Node right= null;
		private int data;
		
		public Node(int data){
			this.data = data;
		}
		
	}
		
		public void  createBinaryTree(){
			Node first = new Node(2);
			Node second = new Node(7);
			Node third = new Node(5);
			Node fourth = new Node(2);
			Node fifth = new Node(6);
			Node sixth = new Node(9);
			Node seventh = new Node(5);
			Node eigth = new Node(11);
			Node nineth = new Node(4);
			
			
			root = first;
			first.left =second;
			first.right=third;
			
			second.left = fourth;
			second.right = fifth;
			
			third.left = null;
			third.right = sixth;
			
			fourth.left = null;
			fourth.right =null;
			
			fifth.left = seventh;
			fifth.right = eigth;
			
			sixth.left = nineth;
			sixth.right = null;
			
			seventh.left= null;
			seventh.right = null ;
			
			eigth.left = null;
			eigth.right =null;
			
			nineth.left = null;
			nineth.right = null;
			
		}
		
		public static boolean isPresent(Node root , int x){
			if(root != null){
				
				if(root.data == x){
					return true;
				}else{
					return isPresent(root.left, x) || isPresent(root.right, x);
				}
				
			}
			return false;
		}
		public static void main(String[] args) {

			Tree tree = new Tree();
			tree.createBinaryTree();
			System.out.println("Provide an Integer to find in the tree:");
			Scanner scanner = new Scanner(System.in);
			int search = scanner.nextInt();
			System.out.println("Does " +search+ " exists in the tree: " + isPresent(root, search));
		}
	}

	 


