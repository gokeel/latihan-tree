public class Latihan {
    public static void main(String[] args) {
        // create a new tree
        Tree<String> tree = new Tree<String>("ABC");
        // System.out.println(tree.root.data);
        tree.add("ABC", "A");
        tree.add("ABC", "B");
        tree.add("ABC", "C");

        tree.add("A", "AA");
        tree.add("A", "AB");
        tree.add("A", "AC");

        tree.add("B", "BA");
        tree.add("B", "BB");

        tree.add("AC", "ACA");
        tree.access();
    }

    
}
