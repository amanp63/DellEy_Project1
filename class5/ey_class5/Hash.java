package ey_class5;
import java.util.HashSet;
import java.util.Iterator;

public class Hash<T> { // Make the class generic
    private HashSet<T> set;

    public Hash() {
        set = new HashSet<>();
    }

    public void add(T item) {
        set.add(item);
    }

    public Iterator<T> iterator() {
        return set.iterator();
    }

    public static void main(String[] args) {
        Hash<String> hSet = new Hash<>(); // Use diamond operator to infer the type
        hSet.add("Z");
        hSet.add("Z");
        hSet.add("Z");
        hSet.add("Z");
        hSet.add(null); // "null" to null
        hSet.add(null); // "null" to null
        hSet.add(null); // "null" to null
        hSet.add("X");
        hSet.add("A");
        hSet.add("B");
        hSet.add("Y");

        Iterator<String> itr = hSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next() + " ");
        }
    }
}