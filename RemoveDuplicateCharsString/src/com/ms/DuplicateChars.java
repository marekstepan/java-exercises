package com.ms;

public class DuplicateChars {

    public static void main(String[] args) {
	// how to remove the duplicate character from String?
        String s = "Sssss ttttt oulalalaii.";
        System.out.println(removeDuplicateChars(s));
    }

    public static String removeDuplicateChars(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if(s.substring(0, i).indexOf(s.charAt(i)) == -1) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
