package ey_class5;

import java.util.Enumeration;
import java.util.Vector; // Import the correct Vector class from java.util

public class VectorExample {
    public static void main(String[] args) {
        Vector vec = new Vector(10, 5); // Create a Vector without parameterized type

        vec.addElement("Z");
        vec.addElement("Z");
        vec.addElement("Z");
        vec.addElement("Z");
        vec.addElement("A");
        vec.addElement("X");
        vec.addElement("B");
        vec.addElement("P");
        vec.addElement("P");
        vec.addElement("R");
        vec.addElement("M");

        System.out.println("Size of vector is " + vec.size());
        System.out.println("Capacity of vector is " + vec.capacity());

        Enumeration en = vec.elements(); // Use the raw Enumeration type
        while (en.hasMoreElements()) {
            System.out.print(en.nextElement() + " ");
        }
    }
}