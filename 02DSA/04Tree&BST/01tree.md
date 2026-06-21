# CONTENT => Tree

Tree is a hierarchical DS (Unlike array, linkedList, queue).

## Binary tree

Every node can have **atmost** 2 child. 

Other terms related to tree(binary tree) => Root(the top one), child, siblings, leaf(which has no child) ||  subtree, ancestors, levels/height of BT

Types of binary tree =>
1. FBT - Full binary tree(either has 0 or 2 children for each node )
2. CBT - Complete BT (Every level is completely filled except possibly the last level, and in the last level, all nodes are as far left as possible.)
3. PBT - Perfect BT (All leaves are on same level)
4. BBT - Balanced BT (Height can be maximum LOGn) 
5. Degenrate Tree (every node has a single child)


```java
class Main {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
            
        }
    }
    static class BinaryTree {
        static int idx = -1;
        public static Node(int nodes[]){
            
        }
    }
    public static void main(String[] args) {
        System.out.println("pro");
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
    }
}
```













