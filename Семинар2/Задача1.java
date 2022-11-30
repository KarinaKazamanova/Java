package Семинар2;

import java.util.ArrayList;
import java.util.List;


public class Задача1{ 
    public static ArrayList<String> clone(ArrayList<String> Array) throws Exception{
        ArrayList<String> clone = new ArrayList<>();
        for (int index = 0; index < Array.size(); index++) {
            clone.add(Array.get(index));
            
        }

        return clone;
    }
    public static void main(String[] args) throws Exception { 
        String query = "select * from students where";
        String jstring = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}";
        jstring = jstring.substring(1, jstring.length()-1);
        ArrayList<String> parsing_jstring_1 = new ArrayList<>();
        List<ArrayList<String>> parsing_jstring_2 = new ArrayList<ArrayList<String>>();
        String[] jlist = jstring.split(", ");
        for (int index = 0; index < jlist.length; index++){
            String[] temp_list = jlist[index].split(":");
            for (int i = 0; i < temp_list.length; i++) {
                parsing_jstring_1.add(temp_list[i]);
                
            }
            ArrayList<String> clone_list = clone(parsing_jstring_1);
            parsing_jstring_2.add(clone_list);
            parsing_jstring_1.clear();
        }
        for (int index = 0; index < parsing_jstring_2.size(); index++) {
            if(parsing_jstring_2.get(index).get(1).equals("'null'")){
                parsing_jstring_2.remove(index);
            }
        }
        System.out.println(parsing_jstring_2);
        for (int index = 0; index < parsing_jstring_2.size(); index++) {
            if(index < parsing_jstring_2.size() - 1){
                query = query + " " + parsing_jstring_2.get(index).get(0).substring(1, parsing_jstring_2.get(index).get(0).length() - 1) + " = " + parsing_jstring_2.get(index).get(1).substring(1, parsing_jstring_2.get(index).get(1).length() -1) + " AND";
            }
            else if(index == parsing_jstring_2.size() - 1){
                query = query + " " + parsing_jstring_2.get(index).get(0).substring(1, parsing_jstring_2.get(index).get(0).length() - 1) + " = " + parsing_jstring_2.get(index).get(1).substring(1, parsing_jstring_2.get(index).get(1).length() -1);
            }
        }
        System.out.println(query);
        }
        
    } 

    