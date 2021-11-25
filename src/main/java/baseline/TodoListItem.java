package baseline;

public class TodoListItem {
    private String itemName;
    private String description;
    private String dueDate;
    boolean isComplete;

    public TodoListItem(String i,String d, String DD){
        this.itemName = i;
        this.description = d;
        this.dueDate = DD;
        this.isComplete = false;
    }

    public TodoListItem(String itemName, String description){
        this.itemName = itemName;
        this.description = description;
        this.dueDate = "N/A";
        this.isComplete = false;
    }

    public TodoListItem(){
        this.description = "N/A";
        this.dueDate = "N/A";
        this.isComplete = false;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
