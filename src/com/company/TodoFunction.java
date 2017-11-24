package com.company;
import java.util.ArrayList;
public class TodoFunction {
    //we use private because this method need only in this class
    private ArrayList<String> todoList = new ArrayList<String>();
    
    //Add list item
    public void addItem(String item){
        todoList.add(item);
    }
    //remove list item
    public void removeItem(int index){
        String myItem = todoList.get(index);
        todoList.remove(index);
    }
    //print the entirelist
    public void printtodoList(){
        System.out.println("To do list consists of "+ todoList.size() + " items");
        
        for(int i=0; i<todoList.size(); i++){
            System.out.println("Item at position" + (i+1)+ todoList.get(i));
        }
    }
    //update the list
    public void updateToDo(int index,String list){
        todoList.set(index, list);
        System.out.println("updation completed at position" + index + 1);
    }
    //search feature for user
    public String findItem(String searchItem){
        int index = todoList.indexOf(searchItem);
        
        if(index == -1){
            return null;
        }else{
            return todoList.get(index);
        }
    }
}
