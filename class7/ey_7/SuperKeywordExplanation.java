package ey_7;

class Parent {
    void show() {
        System.out.println("Parent class Function -show");
    }
    
    int data = 10;
}

public class SuperKeywordExplanation extends Parent {
    
    @Override
    void show() {
        System.out.println("Child class Function -show");
    }
    
    int data = 20;
    
    void display() {
        System.out.println("The value of current object data is " + this.data);
        System.out.println("The value of immediate parent class object is " + super.data);
        
        this.show();  // Calling the overridden method in the Child class
        super.show(); // Calling the method from the Parent class
    }
    
    public static void main(String[] args) {
        SuperKeywordExplanation obj = new SuperKeywordExplanation();
        obj.display();
    }
}