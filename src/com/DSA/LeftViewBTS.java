package com.DSA;

import java.util.ArrayList;

class Node
{
   int data;
   Node left, right;

   Node(int item)
   {
       data = item;
       left = right = null;
   }
}

public class LeftViewBTS {
	
	int max_level =0;
	
    void leftViewUtil(ArrayList<Integer> result, Node node, int level)
    {
        //if root is null, we simply return.
       if (node==null) return;
        
        //if this is the first node of its level then it is in the left view.
        if (max_level < level)
        {
            //storing data of current node in list.
            result.add(node.data);
            max_level = level;
        }
        
        //calling function recursively for left and right 
        //subtrees of current node.
        leftViewUtil(result, node.left, level+1);
        leftViewUtil(result, node.right, level+1);
    }    //Function to return list 
    ArrayList<Integer> leftView(Node root)
    {
       ArrayList<Integer> result = new ArrayList<Integer>();
		leftViewUtil(result, root, 1);
		//returning the list.
		return result;

    }
	
	 public static void main(String[] args) {
		int arr[] = {2, 2, 13, 7, 10, 1, 10, 5, 2,0,14, 5, 11, 5, 5, 13};
		LeftViewBTS leftViewBTS = new LeftViewBTS();
		
		
	}

}
