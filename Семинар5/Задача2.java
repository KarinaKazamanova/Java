package Семинар5;


import java.util.ArrayList;

import java.util.HashSet;

import java.util.TreeMap;

public class Задача2 {
    public static void main(String[] args) throws Exception {
        String  [] workers = {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"};
        HashSet<String> uniq_names = new HashSet<>();
        for (int index = 0; index < workers.length; index++) {
            String  [] temp_string = workers[index].split(" ");
            uniq_names.add(temp_string[0]); 
        }
        ArrayList<String> names = new ArrayList<>(uniq_names);

        TreeMap<Integer, String> totals = new TreeMap<>() ;
        for (int index = 0; index < names.size(); index++) {
            int count = 0;
            
            for (int j = 0; j < workers.length; j++) {
                String  [] temp_string_1 = workers[j].split(" ");
                if(names.get(index).equals(temp_string_1[0])){
                    count ++;
                }
                totals.put(count, names.get(index)); // Так как нам важно лишь самое популярное имя, то нас не интересует тот факт, что имена с повторяющимся количеством будут перезаписаны (ключ - число должен быть уникальным), и выводим последний эелемент treeMap (отсортирует по ключу в порядке возрастания)

                
            }
        }
        System.out.println(totals.get(totals.size()- 1));
        
    }
}
