package ey_6;
import java.util.HashMap;

public class PrintVowelInaString {
    public static void main(String[] args) {
        String str = "amitthakur";
        System.out.println("Next Vowel String is " + printNextVowel(str.toCharArray()));
    }

    public static String printNextVowel(char[] str) {
        HashMap<Character, Character> hMap = new HashMap<>();
        hMap.put('a', 'e');
        hMap.put('e', 'i');
        hMap.put('i', 'o');
        hMap.put('o', 'u');
        hMap.put('u', 'a');
        
        
        hMap.put('A', 'E');
        hMap.put('E', 'I');
        hMap.put('I', 'O');
        hMap.put('O', 'U');
        hMap.put('U', 'A');
        
        int lengthOfString = str.length;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < lengthOfString; i++) {
            char c = str[i];

            if (hMap.containsKey(Character.toLowerCase(c))) {
                char nextVowel = hMap.get(Character.toLowerCase(c));

                
                if (c == 'a' || c == 'A') {
                    result.append(Character.isUpperCase(c) ? Character.toUpperCase(nextVowel) : nextVowel);
                } else {
                   
                    result.append(Character.isUpperCase(c) ? Character.toUpperCase(nextVowel) : nextVowel);
                }
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}