package data_structures;

import java.util.Stack;

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.left = null;
        this.right = null;
        this.value = value;
    }
}


class BinaryTree {
    static void insertNewNode(Node cur, int value) {
        if(value <= cur.value) {
            if(cur.left == null) {
                cur.left = new Node(value);
            } else insertNewNode(cur.left, value);
        } else {
            if(cur.right == null) {
                cur.right = new Node(value);
            } else insertNewNode(cur.right, value);
        }
    }

    static void inOrderTraversal(Node cur) {
        // if(cur != null) {
        //     inOrderTraversal(cur.left);
        //     System.out.print(cur.value + ", ");
        //     inOrderTraversal(cur.right);
        // }

        Stack<Node> stack = new Stack<Node>();

        while(cur!=null || !stack.isEmpty()) {
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            System.out.println(cur.value);
            cur = cur.right;
        }

        // while(cur != null || !stack.isEmpty()) {
        //     while(cur != null) {
        //         stack.push(cur);
        //         cur = cur.left;
        //     }
        //     cur = stack.pop();
        //     System.out.println(cur.value);
        //     cur = cur.right;
        //     // if(cur == null) {
        //     //     cur = stack.pop();
        //     //     System.out.println(cur.value);
        //     //     cur = cur.right;
        //     // } else {
        //     //     if(cur.left != null) {
        //     //         stack.push(cur);
        //     //         cur = cur.left;
        //     //     } else {
        //     //         System.out.println(cur.value);
        //     //         cur = cur.right;
        //     //     }
        //     // }
        // }

        // if(cur.left == null) {
        //     System.out.print(cur.value + ", ");
        //     inOrderTraversal(cur.right);
        // } else {
        //     inOrderTraversal(cur.left);
        // }

        // Stack<Node> stack = new Stack<Node>();
        // do {
        //     if(cur.left != null) {
        //         stack.push(cur);
        //         cur = cur.left;
        //     } else {
        //         System.out.println(cur.value);
        //         if(cur.right != null) {
        //             cur = cur.right;
        //         } else {
        //             if(!stack.isEmpty()) break;
        //             else cur = stack.pop();
        //         } 
        //     }
        // } while(!stack.isEmpty());
    }

    static void preOrderTraversal(Node cur) {
        // if(cur != null) {
        //     System.out.println(cur.value);
        //     preOrderTraversal(cur.left);
        //     preOrderTraversal(cur.right);
        // }
        Stack<Node> stack = new Stack<Node>();
        if(cur!=null) stack.push(cur);

        while(!stack.isEmpty()) {
            cur = stack.pop();
            System.out.println(cur.value);
            if(cur.right != null) stack.push(cur.right);
            if(cur.left != null) stack.push(cur.left);
        }
    }
    
    public static void main(String[] args) {
        Node root = null;

        int[] feeder = new int[]{15, 14, 10, 12, 7, 9, 19, 16, 22, 17};

        for(int i=0;i<feeder.length;i++) {
            if(root == null) {
                root = new Node(feeder[i]);
            } else {
                insertNewNode(root, feeder[i]);
            }
        }
        System.out.println();

        inOrderTraversal(root);
        // preOrderTraversal(root);
    }
}