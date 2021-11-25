package baseline;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;

public class TodoListController {

    @FXML
    private Button addNewItemButtn;

    @FXML
    private DatePicker calenderEntryField;

    @FXML
    private Button clearListBttn;

    @FXML
    private Label dueDateLabel;

    @FXML
    private Button editDateBttn;

    @FXML
    private Button itemDescription;

    @FXML
    private Label itemDescriptionLabel;

    @FXML
    private Button markAsDoneBttn;

    @FXML
    private MenuBar menuBox;

    @FXML
    private MenuItem menuButtonClose;

    @FXML
    private MenuItem menuButtonLoad;

    @FXML
    private MenuItem menuButtonSave;

    @FXML
    private MenuItem menuItemAbout;

    @FXML
    private TextArea newItemDescriptionField;

    @FXML
    private TextField newItemNameField;

    @FXML
    private Button removeSelectionButtn;

    @FXML
    private RadioButton showAllRadio;

    @FXML
    private RadioButton showIncompleteRadio;

    @FXML
    private RadioButton showOnlyCompleteRadio;

    @FXML
    private ListView<?> todoNameListView;

    @FXML
    private ToggleGroup viewGroup;

    @FXML
    //When clicked a new item is added to the list
    void addNewItem(ActionEvent event) {
        //When button is clicked, update listview
        //If any issues are incoutnered, output error
    }

    //Close the program if the user rrequests it
    @FXML
    void closeProgram(ActionEvent event) {
        //System.exit(0)
    }

    @FXML
    void deleteAllItems(ActionEvent event) {
        //Clear all the items in the inventory list
        //reflect that change on the list view
    }

    @FXML
    void editItemDescription(ActionEvent event) {
        //An item is retrived from the list of the inventory
        //Get desecription update
        //Error handle has needed
        //Once retrieved setDescription
        //Update the description text
    }

    @FXML
    void editduedate(ActionEvent event) {
        //Get date from datepicker
        //reformat it to output
        //Set the date in the inventory array
    }

    @FXML
    void markAsComplete(ActionEvent event) {
        //Set complete in array
    }

    @FXML
    void openListFile(ActionEvent event) {
        //Call open file from inventory object
    }

    @FXML
    void removeSelected(ActionEvent event) {
        //Update the list view to reflect removal
        //Call remove function from Inventory Object
    }

    @FXML
    void saveFile(ActionEvent event) {
        //Call save file from Inventory Object
    }

    @FXML
    void showAllItems(ActionEvent event) {
        //Radio button that shows all items in list view
        //Update listview to show items
    }

    @FXML
    void showHelp(ActionEvent event) {
        //Opens help pop up
    }

    @FXML
    void showItemDetails(MouseEvent event) {
        //
    }

    @FXML
    void showOnlyCopmlete(ActionEvent event) {
        //Clear
        //Makes a new sublist that only displays completed items

    }

    @FXML
    void showOnlyIncomplete(ActionEvent event) {
        //clear list
        //Makes a new sublist that only displays incompleted items
    }

}
