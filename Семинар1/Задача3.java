package Семинар1;
import java.util.Scanner;
public class Задача3 {
    public static void main(String[] args) throws Exception {
        Scanner iScanner = new Scanner(System.in);
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
        System.out.println(result);
        }
        
    }
    

