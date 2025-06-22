public class Main {
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