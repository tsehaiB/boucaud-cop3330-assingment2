/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex34;

public class employees {
    public String[] baseList(){
        return new String[]{"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
    }
    public String[] removeEmployee(String name, String[] list){
        for(int i = 0; i < list.length; i++){
            if(list[i].equals(name)){
                list[i] = null;
                break;
            }
        }
        return list;
    }
    public int countString(String[] list) {
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                continue;
            }
            count++;
        }
        return count;
    }
    public void printCount(int count) {
        System.out.println("There are " + count + " employees:");
    }
    public void printNames(String names){
            System.out.println(names);
    }
    public String writeNames(String[] list){
        String output = "";
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                continue;
            }
            output += list[i];
            if(i < list.length-1)
                output += "\n";
        }
        return output;
    }
}
