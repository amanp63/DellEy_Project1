package ey_9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
    int empID;
    String empName;

    // Constructor
    public Employee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
    }
}

public class SerializableAndDeserializeBasicClassObject {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Employee emp = new Employee(123, "ABC");

        // Serialize the Employee object
        FileOutputStream fos = new FileOutputStream("abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(emp);
        oos.close();

        // Deserialize the Employee object
        FileInputStream fis = new FileInputStream("abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employee empDeserialized = (Employee) ois.readObject();
        ois.close();

        // Print the deserialized Employee details
        
        System.out.println("ID: " + empDeserialized.empID);
        System.out.println("Name: " + empDeserialized.empName);
    }
}