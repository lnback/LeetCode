package offer;

import java.util.ArrayList;

/**
 * @program: LeetCode *
 * @classname: T36 *
 * @author: lnback *
 * @create: 2020-07-31 12:39
 **/

public class T36 {
    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }
    //中序遍历后再保存节点即可
    public Node treeToDoublyList(Node root) {
        if(root == null){
            return null;
        }
        ArrayList<Node> nodes = new ArrayList<>();
        Inorder(nodes,root);
        Node head = nodes.get(0);
        Node pre = head;
        for(int i = 1;i<nodes.size();i++){
            Node node = nodes.get(i);
            pre.right = node;
            node.left = pre;
            pre = pre.right;
        }
        pre.right = head;
        head.left = pre;
        return head;
    }

    public void Inorder(ArrayList<Node> nodes,Node root){
        if(root.left != null){
            Inorder(nodes,root.left);
        }
        nodes.add(root);
        if(root.right != null){
            Inorder(nodes,root.right);
        }

    }
}


