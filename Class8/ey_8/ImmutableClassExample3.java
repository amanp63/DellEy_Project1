package ey_8;

public class ImmutableClassExample3 {

    public static void main(String[] args) {

        String name = "AmanXYZ";
        System.out.println("Original name: " + name);

       
        name = name.replace("XYZ", "");
        System.out.println("Modified name using String: " + name);

        StringBuilder sb = new StringBuilder("AmanXYZ");
        
        sb.delete(sb.length() - "XYZ".length(), sb.length());
        System.out.println("Modified name using StringBuilder: " + sb.toString());
    }
}