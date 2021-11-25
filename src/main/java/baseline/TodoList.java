package baseline;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TodoList {
    private String description;
    private String title;
    private int id;
    private Map<String,TodoListItem> itemMap;
    private ArrayList<TodoListItem> items;

    public TodoList(){
        //Init items
    }

    public void AddItem(TodoListItem item){
        //Put name as key, and item into map and arraylist

    }
    public void RemoveItem(String key){
        //Call remove function for both array and map

    }
    public void EditDueDate(String itemName,String newDate){
        //Calls the key required
        //Sets the new Due Date

    }

    public void EditDescription(String itemName, String description){
        //Calls the key
        //Sets the description
    }

    public void MarkAsDone(String itemName){
        //Call the Key
        //Set as Done
    }

    public void MarkAsIncomplete(String itemName){
        //Call the Key
        //Set as Done
    }

    public void ClearList(){
        //Call clear function

    }

    public void readFile(File file){
        //Read the file using a scanner that reads the lines
        //Read the lines using another scanner
        //Each bits of data read are put into a new Inventory item
        //Add the item
        //return the new inventory
    }
    public void saveFile(File file){
        //Create a writer object
        //Use formatted string that saves the file with CSV values
        //output to text
    }

    public ArrayList<TodoListItem> getItems() {
        return items;
    }

    public Map<String, TodoListItem> getItemMap() {
        return itemMap;
    }
}
