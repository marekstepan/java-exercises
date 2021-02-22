package com.ms;

public class DigitsInString {

    public static void main(String[] args) {
        String string = "wra585rer7f788aawgawre7qf47fef4df7g";
        System.out.println(sumDigitsInString(string));
    }

    public static int sumDigitsInString(String string) {
        int sum = 0;
        for(char c : string.toCharArray()) {
            if(Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        return sum;
    }
}
