package Семинар3;


import My_project.my_lib;

public class Задача1 {
    public static void main(String[] args) throws Exception {
        int[] massive = {3, 0, 124};
        
        my_lib.bose_nelson(massive);
        for (int index = 0; index < massive.length; index++) {
            System.out.println(massive[index]);
        }
        
    }
}
