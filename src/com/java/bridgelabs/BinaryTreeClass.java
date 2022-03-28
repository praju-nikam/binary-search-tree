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
   static class BinaryTree
   {
       static int index = -1;
       public static Node buildTree(int nodes[])
       {
           index ++;
           if(nodes[index] == -1)
           {
               return null;
           }
         Node newNode = new Node(nodes[index]);
           newNode.left = buildTree(nodes);
           newNode.right = buildTree(nodes);
           return newNode;
       }




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

    }
}
