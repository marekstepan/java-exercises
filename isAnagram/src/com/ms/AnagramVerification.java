package com.ms;

public class AnagramVerification {

    public static void main(String[] args) {
	String string1 = "funeral";
	String string2 = "real fun";
        System.out.println(isAnagram(string1, string2));
    }

    public static boolean isAnagram(String string1, String string2) {
        String cleanString1 = string1.replace(" ", "").toLowerCase();
        String cleanString2 = string2.replace(" ", "").toLowerCase();

        if(cleanString1.length() != cleanString2.length()) {
            return false;
        } else {
            for (int i = 0; i < cleanString1.length(); i++) {
                if(!cleanString2.contains(String.valueOf(cleanString1.charAt(i)))) {
                    return false;
                }
            }
        }
        return true;

    }
}
