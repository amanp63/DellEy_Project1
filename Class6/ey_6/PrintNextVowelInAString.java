package ey_6;
import java.util.HashMap;

public class PrintNextVowelInAString {
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
        
        char[] arr = {'a','e','i','o','u'};
        int lengthOfString = str.length;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < lengthOfString; i++) {
            char c = str[i];
        	
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                char nextVowel = hMap.get(c);
                result.append(nextVowel);
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}