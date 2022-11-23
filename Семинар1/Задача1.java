
package Семинар1;
import java.util.Scanner;

public class Задача1 {
    private static int factorial(int n) {
        int result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n * factorial(n-1);
        return result;
    }
    private static int triangle_sum(int n) {
        int result = 0;
        if (n == 0) {
            return result;
        }
        result = n + factorial(n-1);
        return result;
    }
    public static int function(String f, int n) {
        int result = 0;
        if(f.equalsIgnoreCase("Factorial")){
            result = factorial(n);
            
        }
        else if(f.equalsIgnoreCase("Triangle sum")){
            result = triangle_sum(n);
        }
        else{
            System.out.println("Выбери одну из двух функций: факториал или треугольная сумма ");
        }
        return result;
    }
    
    public static void main(String[] args) throws Exception {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number =Integer.parseInt(iScanner.nextLine());
        String func = iScanner.nextLine();
        iScanner.close();
        int result = function(func, number);
        System.out.println(result);
        
    }
}
