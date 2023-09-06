package ey_8;

public class ImmutableClassExample2{

    public static void main(String[] args) {

        String name = "Aman";
        System.out.println("Original name: " + name);

        name = name.concat("XYZ"); 
        System.out.println("Modified name: " + name);
        
        StringBuilder sb = new StringBuilder("Aman");
        sb.append("XYZ"); 
        System.out.println("Using StringBuilder: " + sb.toString());
    }
}
