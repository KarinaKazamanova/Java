package Семинар4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class Задача3 {
  
    public static void main(String[] args) throws Exception {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Что Вы хотите сделать: вычеслить (команда: calc) или удалить последнюю операцию (команда: del)?");
        String attemption = iScanner.nextLine();
        FileWriter file = new FileWriter("turbo_calculator_3000.txt", true);
        if(attemption.equalsIgnoreCase("calc")){
            System.out.println("Введите первое число: ");
            float number_1 = Float.parseFloat(iScanner.nextLine());
            System.out.println("Введите второе число: ");
            float number_2 = Float.parseFloat(iScanner.nextLine());
            System.out.println("Введите знак: ");
            String sign = iScanner.nextLine(); 
            float result = 0;
            iScanner.close();
            switch (sign){
                case "+":
                    result = number_1 + number_2;
                    break;
                case "-":
                    result = number_1 - number_2;
                    break;
                case "*":
                    result = number_1 * number_2;
                    break;
                case "/":
                    result = number_1 / number_2;
                    break;
                case "^":
                    result = (int) Math.pow(number_1, number_2);
                    break; 
                }
                file.write("\n" + number_1 + " " + sign + " " + number_2 + " = " + result);
                file.close();
            }  
        else if(attemption.equalsIgnoreCase("del")){ 
            LinkedList<String> actions = new LinkedList<>();
            File file_r = new File("C:/Users/Super/OneDrive - ФГОБУ ВО Финансовый университет при Правительстве РФ/Рабочий стол/Java/turbo_calculator_3000.txt");
            FileReader fr = new FileReader(file_r);
            BufferedReader reader = new BufferedReader(fr);
            String string = reader.readLine();
            while(string != null){
                actions.add(string); 
                string = reader.readLine();
            }
            FileWriter file_2 = new FileWriter("turbo_calculator_3000.txt");
            actions.removeLast();
            for (int index = 0; index < actions.size(); index++) {
                file_2.write("\n" + actions.get(index));
            }
            file_2.close();
        }
        else {
            System.out.println("Введите корректное название требуемой операции");
        }
    }
}



