package com.ms;

public class CharRemoval {

    public static void main(String[] args) {
	// How do you remove a given character from String?
        System.out.println(removeString("Rrramtarara Ruly prt.", 'r'));
    }

    public static String removeString(String s, char c) {
        char[] a = s.toLowerCase().toCharArray();
        Character.toLowerCase(c);
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            if(a[i] != c) {
                b.append(s.charAt(i));
            }
        }
        return b.toString();
    }
}
