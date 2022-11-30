package My_project;
import java.util.ArrayList;
import java.util.List;

public class my_lib {
    public static ArrayList<String> clone(ArrayList<String> Array) throws Exception{
        ArrayList<String> clone = new ArrayList<>();
        for (int index = 0; index < Array.size(); index++) {
            clone.add(Array.get(index));
            
        }

        return clone;
    }


    public static ArrayList<String> json_Reader(String jstring) throws Exception { 
        if(jstring.substring(0).equals("[")){
            jstring = jstring.substring(2, jstring.length()-2);
        }
        else{
            jstring = jstring.substring(1, jstring.length()-2);
        }
        ArrayList<String> parsing_jstring = new ArrayList<>();
        String[] jlist = jstring.split(",");
        for (int index = 0; index < jlist.length; index++){
            String[] temp_list = jlist[index].split(":");
            for (int i = 0; i < temp_list.length; i++) {
                parsing_jstring.add(temp_list[i]);
                
            }
        }
        ArrayList<String> parsing_jstring_r = new ArrayList<>();      
        for(String item : parsing_jstring){
            parsing_jstring_r.add(item.substring(1, item.length() - 1));
        }    
            return parsing_jstring_r;
        }





    }




