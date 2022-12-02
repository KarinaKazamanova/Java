package Семинар3;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.Random;


public class Задача3 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> massive = new ArrayList<>(); 
        Random random = new Random();
        for (int index = 0; index < 10; index++) {
            massive.add(random.nextInt(0,100));
        }
        System.out.println("Изначальный список - " + massive);
        IntSummaryStatistics stats = massive.stream().mapToInt(Integer::intValue).summaryStatistics();
        System.out.println(stats);
        
    }
}