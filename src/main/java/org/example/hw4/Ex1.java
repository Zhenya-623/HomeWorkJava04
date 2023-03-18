package org.example.hw4;

import java.util.LinkedList;

/*
1)Вывести список на экран в перевернутом виде (без массивов и ArrayList)
Пример:
1 -> 2->3->4
Вывод:
4->3->2->1
 */
public class Ex1 {
    public static void main(String[] args) {
        LinkedList someList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            someList.add(i);
        }
        System.out.println(someList);
        LinkedList reverse = reverseList(someList);
        System.out.println(reverse);
    }

    private static LinkedList reverseList(LinkedList someList) {
        LinkedList res = new LinkedList();
        for (int i = 0; i < someList.size(); i++) {
            res.addFirst(i);
        }
        return res;
    }
}
