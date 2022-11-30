package Семинар2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import java.util.ArrayList;

import My_project.my_lib;

public class Задача3 {
    public static void main(String[] args) throws Exception {
    try{
        File file = new File("C:/Users/Super/OneDrive - ФГОБУ ВО Финансовый университет при Правительстве РФ/Рабочий стол/Java/Семинар2/data.json");
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        String line = reader.readLine();
        while(line != null){
            ArrayList<String> parsing_jstring = new ArrayList<>();
            parsing_jstring = my_lib.json_Reader(line);
            StringBuilder result_string = new StringBuilder("Студент(ка) " + parsing_jstring.get(1) + " получил(а) " + parsing_jstring.get(3) + " по предмету " + parsing_jstring.get(5));
            System.out.println(result_string);
            line = reader.readLine();
            }
        }
        catch (Exception e){
        
        System.out.println("\n" + e.toString());
        }
        

}
}