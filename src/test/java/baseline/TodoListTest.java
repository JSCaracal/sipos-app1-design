package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TodoListTest {

    @Test
    void addItem() {
        //Hard Code a new Inventory for expected results
        //Call the add item function with identical paramters
        //Assert equals
    }

    @Test
    void removeItem() {
        //Hard Code a new Inventory for expected results
        //Call the remove item function with identical paramters
        //Assert equals
    }

    @Test
    void editDueDate() {
        //Have a string of a due date
        //Set it in an inventoryItem object
        //Call the function with the new date
        //Assert equals

        //If there is no due date have a null
        //assert equals
    }

    @Test
    void editDescription() {
        //Have a string of a description
        //Set it in an inventoryItem object
        //Call the function with the new description
        //Assert equals

        //If above 256 chars
        //assert equals
    }

    @Test
    void markAsDone() {
        //Check to see if isCompleted is true
        //Assert Equals
    }

    @Test
    void markAsIncomplete() {
        //Check to see if isCompleted is false
        //Assert Equals
    }

    @Test
    void clearList() {
        //Add items to an inventory list
        //Clear the list
        //Assertequals null
    }

    @Test
    void readFile() {
        //Have a test file in resources
        //Call the readfile function and make sure it returns an inventory object
        //Assert equal attributes in the objects
    }
}