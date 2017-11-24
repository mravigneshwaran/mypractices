
package com.ArraytodoMe;
import java.util.ArrayList;
public class TodoFunction1 {
    //we create private because this method only use with in this class
    private ArrayList<String> todoarray = new ArrayList<String>();
    
    //Add list item
    public void addMyItem(String items){
        todoarray.add(items);
    }
    //remove list item
    public void removeMyItem(int index){
        todoarray.remove(index);
    }
    //print the entire list
    public void allList(){
        System.out.println("Lists are "+todoarray.size());
        
        for(int i=0; i<todoarray.size(); i++){
            System.out.println("Item at Position" + (i+1) + todoarray.get(i));
        }
    }
    //update the items
    public void updateList(int index, String item){
        todoarray.set(index, item);
        System.out.println("Updation completed at" + index + 1);
    }
    //search the items
    public String findItem(String searchItem){
        int index = todoarray.indexOf(searchItem);
        
        if(index == -1){ // -1 means empty not null
            return null;
        }else{
            return todoarray.get(index);
        }
    }
    
}
