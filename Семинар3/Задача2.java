package Семинар3;

import java.util.ArrayList;
import java.util.Random;


public class Задача2 {
    public static void main(String[] args) throws Exception {
        // Задаем массив случаынйм образом
        ArrayList<Integer> massive = new ArrayList<>(); 
        Random random = new Random();
        for (int index = 0; index < 10; index++) {
            massive.add(random.nextInt(0,100));
        }
        System.out.println(massive);
        // Удаляем из массива четные элементы
        ArrayList<Integer> new_massive = new ArrayList<>(); 
        for (int index = 0; index < massive.size(); index++) {
            if(massive.get(index) % 2 != 0){
                new_massive.add(massive.get(index));
            }
        }
        System.out.println(new_massive);
}
}