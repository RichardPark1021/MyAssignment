/**
 * @Class: MyAssignment
 * @Author: Richard Park
 * @Course: ITEC 2140 - 04, Spring 2023
 * @Written: March 24, 2023
 * Description: Problems from CodingBat, and each problem deals with methods.
 */

public class MyAssignment {
    public static void main(String[] args) {
        MyAssignment assignment = new MyAssignment();

    }

    //Given a string, return a string where for every char is the original, there are two chars.
    public String reverseDoubleChar(String word) {
        String str1 = "";
        for(int i = word.length()-1; i >=0; i--) {
            str1 = str1 + word.charAt(i) + word.charAt(i);
        }
        return str1;
    }

    //Given a non-negative int n, return the sum of its digits (must use while loop)
    public int sumDigits(int n) {
        int sum = 0;
        if(n < 10) {
            return n;
        }
        else {
            int i = n;
            while(i != 0) {
                sum = sum + i % 10;
                i /= 10;
            }
        }
        return sum;
    }

    //Given a string name, return a message of the form "Happy Birthday Susan!"
    public String birthdayName(String name){
        return "Happy Birthday " + name + "!";
    }

    //Given a string, return a version without the first 3 chars
    public String missingFront(String str){
        return str.substring(3);
    }

    //Given a string, return a new string where the first and last char have been exchanged
    public String swapEnds(String str) {
        if(str.length() <= 1) {
            return str;
        }
        else {
            char first = str.charAt(0);
            char last = str.charAt(str.length()-1);
            String middle = str.substring(1, str.length()-1);
            return last + middle + first;
        }
    }

    //Return a new string made of every other character starting with the first character
    public String everyOther(String str) {
        String str1 = "";
        for(int i = 0; i <= str.length()-1; i++) {
            if(i % 2 == 0) {
                str1 = str1 + str.charAt(i);
            }
        }
        return str1;
    }

    //Given two strings, return their concatenation, except omit the first characters of each string
    public String nonStart(String a, String b) {
        if (a.length() < 2 || b.length() < 2) {
            return "";
        } else {
            return a.substring(1) + b.substring(1);
        }
    }

    //The Fibonacci sequence is a series of numbers in which each number is the sum of the two preceding ones,
    // usually starting with 0 and 1.
    public int fibonacci(int n) {
        int a = 0;
        int b = 1;
        int c;
        if(n == 0) {
            return n;
        }
        else {
            for(int i = 1; i < n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
        }
        return b;
    }

    //Given three int values, a, b, and c, return their sum. However, if one of the value is 13
    //then it does not count towards the sum and the values to its right do not count
    public int luckySum(int a, int b, int c) {
        if(a == 13) {
            return 0;
        }
        else if(b == 13) {
            return a;
        }
        else if(c == 13) {
            return a + b;
        }
        else {
            return a + b + c;
        }
    }

    // Write a method countPalindromes that takes a string as input and returns if the string is a palindrome or not
    public boolean hasPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        for (int i = 0; i < str.length(); i++) {
            int left = i - 1;
            int right = i + 1;
            while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
                return true;
            }
            left = i;
            right = i + 1;
            while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
                return true;
            }
        }
        return false;
    }

    //Given a non-negative int n, return true if it is a power of 2.
    public boolean powerOfTwo(int n) {
        if (n == 0) {
            return false;
        } else {
            do {
                if (n == 1) {
                    return true;
                } else if (n % 2 != 0) {
                    return false;
                }
                n /= 2;
            } while (true);
        }
    }
}
