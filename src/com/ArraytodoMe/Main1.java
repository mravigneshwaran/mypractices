
package com.ArraytodoMe;
import java.util.Scanner;
public class Main1 {
    
    private static Scanner scanner = new Scanner(System.in); //Getting user input we use Scanner
    private static TodoFunction1 mytodo = new TodoFunction1();//call Todofunction1 in main like importing
    
    public static void main(String args[]){
        int commmand = 0;
        boolean exit = false;
        printCommand();
        
        while(!exit){ //!exit-true go to this statement
        System.out.println("Enter Your Command/Choice:");
        command = scanner.nextInt();
        scanner.nextLine();
        
        switch(command){
            case 0:
                printCommand();
                break;
            case 1:
                mytodo.allList();
                break;
            case 2:
                addMyItem();
                break;
            case 3:
                removeMyItem();
                break;
            case 4:
                updateItem();
                break;
            case 5:
                searchItem();
                break;
            case 6:
                exit = true;
                break;
            default:
                System.out.println("Please pick only from one to six");
              
        }
        
        }
 
    
    }
    
    public static void printCommand(){
        System.out.println("\n commands" + 
                           "\n Press 0 : To print Instructions"+
                           "\n Press 1 : To Print All List Items"+
                           "\n Press 2 : TO Add List"
                           "\n Press 3 : To Reomove Item"
                           "\n Press 4 : To Update Item"
                           "\n Press 5 :  TO Search Item in List"
                           "\n Press 6 :  To Exit the app");
    }
}
