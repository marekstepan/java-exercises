package com.ms;

public class VowelsInString {

    public static void main(String[] args) {
	    String string = "You're the match of cherry coal\n" +
            "That will burn this whole madhouse down\n" +
            "You’ll not throw open like the worn-out safe\n" +
            "More like a love that's a bottle of exquisite stuff, best";
        System.out.println(countVowels(string));
    }

    public static int countVowels(String string) {
        int count = 0;
        for(Character c : string.toLowerCase().toCharArray()) {
            if((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u') || (c == 'y')) {
                count += 1;
            }
        }
        return count;
    }
}
