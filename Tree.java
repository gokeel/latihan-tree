public class Tree<T> {
    Node<T> root;

    public Tree(Node<T> root) {
        this.root = root;
    }

    public Tree(T data) {
        this.root = new Node<T>(data);
    }

    public void add(T dataParent, T data) {
        Node<T> node = getNode(root, dataParent);
        if(node != null) {
            node.children.add(new Node<T>(data));
        } else {
            System.out.println("Parent tidak ditemukan");
        }
    }

    public Node getNode(Node<T> node, T data) {
        if(node.data == data) return node;

        for(Object currentNode: node.children) {
            Node<T> returnNode = getNode((Node) currentNode, data);
            if(returnNode != null) return returnNode;
        }

        return null;
    }

    public void access() {
        System.out.println(root.data);
        access(root, " ");
    }

    public void access(Node<T> node, String space) {
        System.out.println("");
        for(Object currentNode: node.children) {
            System.out.println(space + "-->" + ((Node) currentNode).data);
            access((Node) currentNode, space + " ");
        }

        return;
    }
}
