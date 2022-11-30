package Семинар2;
import java.io.FileWriter;

public class Задача2 {
    public static void main(String[] args) throws Exception {
    Integer[] int_massive = {12, 155, 7,  687, 4,77,4, 4877, 48788697};
    String design_string = ""; // Нужна для оформления вывода в файлик
    for (int i = 0; i < int_massive.length; i++) {
        design_string = design_string + int_massive[i];
    }
    System.out.println(design_string);
    System.out.println(design_string.length());
    FileWriter new_file = new FileWriter("bubblelogging.txt", true);

    for (int i = 0; i < int_massive.length-1; i++) {
     
        for (int j = 0; j < int_massive.length-1; j++) {
            if(int_massive[j] > int_massive[j + 1]){
                Integer temp = int_massive[j +1];
                int_massive[j +1] = int_massive[j];
                int_massive[j] = temp; 
            }
            
            
        
    }
    new_file.write(String.format("Этап %d " + "--".repeat(design_string.length()-2)+ "|" + "\n", i + 1));
    for (int index = 0; index < int_massive.length; index++) {
        
        new_file.write(int_massive[index] + "\t");
    }
    
    new_file.write("\n");
    
}
new_file.write(String.format( "~~~".repeat(design_string.length()-7) + "\n"));
   new_file.close();
    
}
}
