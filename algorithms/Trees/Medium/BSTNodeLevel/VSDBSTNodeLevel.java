import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left = null, right = null;

    Node(int data) {
        this.data = data;
    }
}

public class Main {

    static int levelOrder(Node root, int data) {
        Queue<Node> q = new LinkedList<>();

        HashMap<Node, Integer> map = new HashMap<>() {
            {
                put(root, 0);
            }
        };
        q.add(root);
        while (!q.isEmpty()) {
            Node node = q.poll();

            int level = map.get(node);

            if (node.data == data) {
                System.out.println(level);
                return level;
            }

            if (node.left != null)
                map.put(node.left, level + 1);
            q.add(node.left);
            if (node.right != null)
                map.put(node.right, level + 1);
            q.add(node.right);

        }
        return -1;

    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        System.out.println(levelOrder(root, 70));
    }
}