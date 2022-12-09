package Семинар4;

import java.util.LinkedList;
import java.util.List;

public class Задача1 {
    public static void main(String[] args) throws Exception {
    LinkedList<String> list = new LinkedList<>();
    list.add("1");
    list.add("12");
    list.add("3");
    list.add("7");
    LinkedList<String> reversed_list = new LinkedList<>();
    for (int index = list.size() - 1; index > -1 ; index--) {
        reversed_list.add(list.get(index));
    }

    LinkedList<String> reversed_list_2 = new LinkedList<>();
    for (int index = 0; index < list.size() ; index++) {
        reversed_list_2.addFirst(list.get(index));
    }
    System.out.println("Первоначальный список: " + list);
    System.out.println("Развернутый список (1 способ): " + reversed_list);
    System.out.println("Развернутый список (2 способ): " + reversed_list_2);
}}