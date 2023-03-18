package org.example.hw4;

import java.util.Deque;
import java.util.LinkedList;

public class Ex2 {
    public static void main(String[] args) {
        String text1 = "()";
        String text2 = "()[]{}";
        String text3 = "(]";
        String text4 = "]";
        String text5 = "(])";

        System.out.println("1= " + isValid(text1));
        System.out.println("2= " + isValid(text2));
        System.out.println("3= " + isValid(text3));
        System.out.println("4= " + isValid(text4));
        System.out.println("5= " + isValid(text5));
    }
    private static boolean isValid (String text) {
        char[] array = text.toCharArray();
        Deque list = new LinkedList();
        String open = "([{";
        for (Character ch : array) {
            if (open.contains(ch.toString())) list.add(ch);
            else if (list.isEmpty()) return false;
            else if (ch.equals(']') && !list.pollLast().equals('[')) return false;
            else if (ch.equals('}') && !list.pollLast().equals('{')) return false;
            else if (ch.equals(')') && !list.pollLast().equals('(')) return false;
        }
        return list.isEmpty();
    }
}
