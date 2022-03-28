package com.java.bridgelabs;
import  java.util.*;

public class BinaryTreeClass
{
    //create Node Class
   static class Node
   {
       // variables
     int data;
     Node left;
     Node right;
     // create node class constructor
       Node(int data)
       {
           this.data = data;
           this.left = left;
           this.right = right;
       }
   }
   static class BinaryTree {
       static int index = -1;

       public static Node buildTree(int nodes[]) {
           index++;
           if (nodes[index] == -1) {
               return null;
           }
           Node newNode = new Node(nodes[index]);
           newNode.left = buildTree(nodes);
           newNode.right = buildTree(nodes);
           return newNode;
       }
   }
       // Add preorder Method
       public static void preorder(Node root)
       {
           if( root == null)
           {
               return;
           }
           System.out.print(root.data +"  ");
           preorder(root.left);
           preorder(root.right);
       }
  // Added Inorder Method
  public static void inorder(Node root)
  {
      if(root == null)
      {
          return;
      }
      inorder(root.left);
      System.out.print(root.data + "  ");
      inorder(root.right);
  }


    public static void main(String[] args)
    {
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-Welcome Binary Tree Program -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println();
       int nodes[] = { 1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1 };
       BinaryTree binarytree = new BinaryTree();
       Node root = binarytree.buildTree(nodes);
        System.out.println("Display Root : ");
        System.out.println(root.data);

        System.out.println("======================================================");
        System.out.println("Display Preorder : ");
        preorder(root);
        System.out.println();
        System.out.println("======================================================");
        System.out.println("Display Inorder : ");
        inorder(root);
    }
}
