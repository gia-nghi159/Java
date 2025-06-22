import java.util.ArrayList;
import java.util.LinkedList;

public class HashTable {
    private final int SIZE = 15;

    private ArrayList<LinkedList<Node>> table;

    class Node {
        String key;
        String value;

        Node(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTable() {
        table = new ArrayList<>(SIZE);

        for (int i = 0; i < SIZE; i++) {
            table.add(new LinkedList<>());
        }
    }
    // hash code calculation
    private int hash(String key) {
        int hashCode = 0;
        for (char c : key.toCharArray()) {
            hashCode += (int) c;
        }
        return hashCode % SIZE;
    }

    // insert key-value pair
    public void put(String key, String value) {
        int index = hash(key);
        for (Node node : table.get(index)) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }
        table.get(index).add(new Node(key, value));
    }

    // retrieve value by key
    public String get(String key) {
        int index = hash(key);
        for (Node node : table.get(index)) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null;
    }

    public boolean containsKey(String key){
        int index = hash(key);
        for (Node node : table.get(index)) {
            if (node.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public boolean remove(String key){
        int index = hash(key);
        LinkedList<Node> bucket = table.get(index);
        for (Node node : bucket){
            if(node.key.equals(key)){
                bucket.remove(node);  // remove method of LinkedList
                return true;
            }
        }
        return false;
    }

    // retrieve key list
    public ArrayList<String> keys(){
        ArrayList<String> keyList = new ArrayList<>();
        for (LinkedList<Node> bucket : table){
            for(Node node : bucket){
                keyList.add(node.key);
            }
        }
        return keyList;
    }

    public ArrayList<String> values() {
        ArrayList<String> valuesList = new ArrayList<>();
        for (LinkedList<Node> bucket : table) {
            for (Node node : bucket) {
                valuesList.add(node.value);
            }
        }
        return valuesList;
    }

    public void display() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print("bucket " + i + ": ");
            for (Node node : table.get(i)) {
                System.out.print("[" + node.key + ": " + node.value + "] -> ");
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        char c ='h';
        System.out.println((int) c);
        HashTable hashTable = new HashTable();

        hashTable.put("cat", "Value1");
        hashTable.put("dog", "Value2");
        hashTable.put("apple", "Value3");
        hashTable.put("hello", "Value4");
        hashTable.put("world", "Value5");



        hashTable.containsKey("dog");
        hashTable.containsKey("cat");

//        hashTable.display();

        System.out.println("Value for 'cat': " + hashTable.get("cat"));
        System.out.println("Value for 'world': " + hashTable.get("world"));
        System.out.println("Value for 'nonexistent': " + hashTable.get("nonexistent"));
        System.out.println("Removing cat: " + hashTable.remove("cat"));
        System.out.println("Contains dog: " + hashTable.containsKey("dog"));
        System.out.println("Contains cat: " + hashTable.containsKey("cat"));
        System.out.println("All keys: " + hashTable.keys());
        System.out.println("All values: " + hashTable.values());
    }
}

