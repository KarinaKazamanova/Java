// Вывести все простые числа от 1 до 1000
package Семинар1;


public class Задача2 { 
    private static boolean simple(int n) {
        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                flag = false;
                break;
            }    
        }
        return flag;
    }
    public static void main(String[] args) throws Exception {
        for (int index = 2; index < 1001; index++) {
            if(simple(index)){
                System.out.println(index);
            }
        }
        
    }
}
