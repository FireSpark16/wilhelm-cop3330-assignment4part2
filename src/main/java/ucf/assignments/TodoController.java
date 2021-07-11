/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Xander Wilhelm
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class TodoController {
    TodoList todoList;

    int currentDisplayModel = 1;
    TodoList.TodoItem selected = null;

    @FXML
    private TextArea textOutput;
    @FXML
    private TextField textInput;
    @FXML
    private TextField cornerBox;
    @FXML
    private ListView<String> listViewDescriptions;
    @FXML
    private ListView<String> listViewDueDates;
    @FXML
    private ListView<String> listViewCompletedStatus;

    @FXML
    public void createNewListClicked(ActionEvent actionEvent) {
        //calls createNewList()
        createNewList();
    }

    @FXML
    public void loadListClicked(ActionEvent actionEvent) {
        //calls loadList()
        loadList();
    }

    @FXML
    public void saveListClicked(ActionEvent actionEvent) {
        //calls saveList()
        saveList();
    }

    @FXML
    public void helpClicked(ActionEvent actionEvent) {
        //calls help()
        help();
    }

    @FXML
    public void editListNameClicked(ActionEvent actionEvent) {
        //calls editListName()
        editListName();
    }

    @FXML
    public void editItemDescriptionClicked(ActionEvent actionEvent) {
        //calls editItemDescription()
        editItemDescription();
    }

    @FXML
    public void editItemDueDateClicked(ActionEvent actionEvent) {
        //calls editItemDueDate()
        editItemDueDate();
    }

    @FXML
    public void displayAllItemsClicked(ActionEvent actionEvent) {
        //calls displayAllItems()
        displayAllItems();
    }

    @FXML
    public void displayCompletedItemsClicked(ActionEvent actionEvent) {
        //calls displayCompletedItems()
        displayCompletedItems();
    }

    @FXML
    public void displayIncompleteItemsClicked(ActionEvent actionEvent) {
        //calls displayIncompleteItems()
        displayIncompleteItems();
    }

    @FXML
    public void markAsCompleteClicked(ActionEvent actionEvent) {
        //calls markAsComplete()
        markAsComplete();
    }

    @FXML
    public void markAsIncompleteClicked(ActionEvent actionEvent) {
        //calls markAsIncomplete()
        markAsIncomplete();
    }

    @FXML
    public void addItemClicked(ActionEvent actionEvent) {
        //calls addItem()
        addItem();
    }

    @FXML
    public void deleteItemClicked(ActionEvent actionEvent) {
        //calls deleteItem()
        deleteItem();
    }

    @FXML
    public void setListNameClicked(ActionEvent actionEvent) {
        //calls setListName()
        setListName();
    }

    @FXML
    public void setItemDescriptionClicked(ActionEvent actionEvent) {
        //calls setItemDescription()
        setItemDescription();
    }

    @FXML
    public void setItemDueDateClicked(ActionEvent actionEvent) {
        //calls setItemDueDate()
        setItemDueDate();
    }

    @FXML
    public void itemDueDateClicked(MouseEvent mouseEvent) {
        //calls updateSelectedItem() with 1
        updateSelectedItem(1);
    }

    @FXML
    public void itemDescriptionClicked(MouseEvent mouseEvent) {
        //calls updateSelectedItem() with 2
        updateSelectedItem(2);
    }

    @FXML
    public void itemCompletedStatusClicked(MouseEvent mouseEvent) {
        //calls updateSelectedItem() with 3
        updateSelectedItem(3);
    }

    private void setTextOutput(String input) {
        // Update Method: Change textOutput's text to new string
        textOutput.setText(input);
    }

    private String getTextInput() {
        // Get Method: Retrieve selected item from textInput
        return textInput.getText();
    }

    private void setTextInput(String input) {
        // Get Method: Retrieve selected item from textInput
        textInput.setText(input);
    }

    private void setCornerBox(String input) {
        // Update Method: Change cornerBox's text to new string
        cornerBox.setText(input);
    }

    private void createNewList() {
        // Create new instance of TodoList
        todoList = new TodoList();

        // Prompt for list name
        setTextOutput("What would you like to name your list?\n(Select \"Set as List Name\" when ready)");
    }

    public void loadList() {

        // Prompt user for list name
        // Wait for submit to be pressed
        // Get text from textInput
        // Check directory for list name
        // If found, read it
        // Assign values from .txt file to new lists using createNewList()

    }

    public void saveList() {

        // Prompt user for list they want to save
        // Wait for submit to be pressed
        // Get text from textInput
        // Check current lists to see if name exists
        // If found, create a new file named [listName].txt
        // Print list name to new file
        // Print item values to list, separated by new lines

    }

    public void help() {

        // Note: This may not make it into the final product
        // Output information regarding how to use program
        // Ex: How to edit an item description
        //     Step 1: Have an opened list
        //     Step 2: Select item from list
        //     Step 3: Click edit list description
        // (Depending on how many items there are for this section,
        //  it may output to either textOutput or selectedListView)

    }

    public void editListName() {

        // Check if list is opened and an item is selected
        if(listExists())
        {
            // Prompt for change in input
            setTextOutput("Edit your list name.\n(Select \"Set as List Name\" when ready)");
            // Set textInput to previous description
            setTextInput(todoList.listName);
        }

    }

    public void editItemDescription() {
        // Check if list is opened and an item is selected
        if(listExists() && itemIsSelected() && !selectedDescriptionIsBlank())
        {
            // Prompt for change in input
            setTextOutput("Edit your description.\n(Select \"Set as Item Description\" when ready)");
            // Set textInput to previous description
            setTextInput(selected.description);
        }
    }

    private boolean selectedDescriptionIsBlank() {
        if (selected.description.equals("(blank)"))
        {
            setTextOutput("Please add your description first.");
            deselect();
            return true;
        }
        else
            return false;
    }

    private boolean selectedDueDateIsBlank() {
        if (selected.dueDate.equals("(blank)"))
        {
            setTextOutput("Please add your due date first.");
            deselect();
            return true;
        }
        else
            return false;
    }

    public void editItemDueDate() {
        // Check if list is opened and an item is selected
        if(listExists() && itemIsSelected() && !selectedDueDateIsBlank())
        {
            // Prompt for change in input
            setTextOutput("Edit your due date.\n(Select \"Set as Item Due Date\" when ready)");
            // Set textInput to previous description
            setTextInput(selected.dueDate);
        }
    }

    public void updateDisplay() {
        // get current display model and show updated information
        switch (currentDisplayModel) {
            case 1 -> displayAllItems();
            case 2 -> displayCompletedItems();
            case 3 -> displayIncompleteItems();
        }
    }

    public void displayAllItems() {
        // Check if list is opened
        if(listExists())
        {
            // Update (if needed) current Display Model
            currentDisplayModel = 1;
            // Clear current view
            clearLists();
            // Update cornerBox
            setCornerBox(todoList.listName);
            // Output all list items
            for (int i = 0; i < todoList.todoObservableList.size(); i++)
            {
                listViewDueDates.getItems().add(todoList.todoObservableList.get(i).dueDate);
                listViewDescriptions.getItems().add(todoList.todoObservableList.get(i).description);
                listViewCompletedStatus.getItems().add(todoList.todoObservableList.get(i).completedStatus);
            }
        }
    }

    public void displayCompletedItems() {
        // Check if list is opened
        if(listExists())
        {
            // Update (if needed) current Display Model
            currentDisplayModel = 2;
            // Clear current view
            clearLists();
            // Update cornerBox
            setCornerBox(todoList.listName);
            // Check if an item's completed is true and output if it is
            for (int i = 0; i < todoList.todoObservableList.size(); i++)
            {
                if(todoList.todoObservableList.get(i).completedStatus.equals("Complete")) {
                    listViewDueDates.getItems().add(todoList.todoObservableList.get(i).dueDate);
                    listViewDescriptions.getItems().add(todoList.todoObservableList.get(i).description);
                    listViewCompletedStatus.getItems().add(todoList.todoObservableList.get(i).completedStatus);
                }
            }
        }
    }

    public void displayIncompleteItems() {
        // Check if list is opened
        if(listExists())
        {
            // Update (if needed) current Display Model
            currentDisplayModel = 3;
            // Clear current view
            clearLists();
            // Update cornerBox
            setCornerBox(todoList.listName);
            // Check if an item's completed is true and output if it is
            for (int i = 0; i < todoList.todoObservableList.size(); i++)
            {
                if(todoList.todoObservableList.get(i).completedStatus.equals("Incomplete")) {
                    listViewDueDates.getItems().add(todoList.todoObservableList.get(i).dueDate);
                    listViewDescriptions.getItems().add(todoList.todoObservableList.get(i).description);
                    listViewCompletedStatus.getItems().add(todoList.todoObservableList.get(i).completedStatus);
                }
            }
        }
    }

    private void clearLists() {
        // Clears all listViews of data
        listViewDueDates.getItems().clear();
        listViewDescriptions.getItems().clear();
        listViewCompletedStatus.getItems().clear();
        // Also clears cornerBox
        cornerBox.setText("");
    }

    public void markAsComplete() {
        // Check if list is opened and an item is selected
        if(listExists() && itemIsSelected())
        {
            // If so, set item's completed value to Complete
            todoList.todoObservableList.get(todoList.todoObservableList.indexOf(selected)).completedStatus = "Complete";
            setTextOutput("Marked \"" + todoList.todoObservableList.get(todoList.todoObservableList.indexOf(selected)).description + "\" as Complete");
        }
        updateDisplay();
    }

    public void markAsIncomplete() {
        // Check if list is opened and an item is selected
        if(listExists() && itemIsSelected())
        {
            // If so, set item's completed value to Incomplete
            todoList.todoObservableList.get(todoList.todoObservableList.indexOf(selected)).completedStatus = "Incomplete";
            setTextOutput("Marked \"" + todoList.todoObservableList.get(todoList.todoObservableList.indexOf(selected)).description + "\" as Incomplete");
        }
        updateDisplay();
    }

    public void addItem() {
        // Check if list is opened
        if(listExists())
        {
            // Explanation: First, see if list has 1 or more items. If so, then see that they aren't blank. I would include these in the same step, but then
            // it would cause the program to possibly check an index that does not exist. Instead, only if there are items will it check if they are blank.
            // If they are not blank, or if there are no items in the list then make a new item. Otherwise, prompt them to and don't make a new item.
            if(todoList.todoObservableList.size() >= 1)
            {
                if (todoList.todoObservableList.get(todoList.todoObservableList.size() - 1).description.equals("(blank)") || todoList.todoObservableList.get(todoList.todoObservableList.size() - 1).dueDate.equals("(blank)"))
                {
                    setTextOutput("Please ensure your description and due date are not blank before continuing.");
                }
                else {
                    // If so, create new instance of todoItem
                    TodoList.TodoItem todoItem = todoList.new TodoItem();
                    // Add the item to the list
                    todoList.todoObservableList.add(todoItem);
                    // Clear selected (if any are)
                    deselect();
                    // Prompt for description and due date
                    setTextOutput("Please add a description for your item.\n(Select \"Set as Item Description\" when ready)\nPlease add a due date for your item (MM/DD/YYYY).\n(Select \"Set as Item Due Date\" when ready)");
                }
            } else {
                // If so, create new instance of todoItem
                TodoList.TodoItem todoItem = todoList.new TodoItem();
                // Add the item to the list
                todoList.todoObservableList.add(todoItem);
                // Clear selected (if any are)
                deselect();
                // Prompt for description and due date
                setTextOutput("Please add a description for your item.\n(Select \"Set as Item Description\" when ready)\nPlease add a due date for your item (MM/DD/YYYY).\n(Select \"Set as Item Due Date\" when ready)");
            }
        }
        updateDisplay();
    }

    public void deleteItem() {
        // Check if list is opened and an item is selected
        if(listExists() && itemIsSelected())
        {
            // Remove item from list
            todoList.todoObservableList.remove(selected);
        }
        updateDisplay();
    }

    private void setListName() {
        // Check if list is opened
        if(listExists()) {
            // Take input from textInput
            String input = getTextInput();
            // Clear textInput
            clearTextInput();
            // Set todoList title to this input
            todoList.listName = input;
            // Alert user to list creation
            if(todoList.todoObservableList.size() == 0)
                setTextOutput("List \"" + todoList.listName + "\" successfully created.\nAdd an item using Item --> Add Item");
            else
                setTextOutput("List \"" + todoList.listName + "\" successfully renamed.");
        }
        updateDisplay();
    }

    private void setItemDescription() {
        // Check if list is opened
        if(listExists()) {
            // Get user input
            String input = getTextInput();
            // Clear textInput
            clearTextInput();
            // Use selected if one is, or else assign it to new item
            if(itemIsSelected() && !selectedDescriptionIsBlank()) {
                // Update selected item's description
                todoList.todoObservableList.get(todoList.todoObservableList.indexOf(selected)).description = input;
                // Alert user to list edit
                setTextOutput("Item description \"" + todoList.todoObservableList.get(todoList.todoObservableList.indexOf(selected)).description + "\" successfully changed.");
            }
            else
            {
                // Grab last item in list and assign it the input
                int itemNumber = todoList.todoObservableList.size();
                todoList.todoObservableList.get(itemNumber - 1).description = input;
                // Alert user to list creation
                setTextOutput("Item description \"" + todoList.todoObservableList.get(itemNumber - 1).description + "\" successfully added.");
            }
            // Deselect
            deselect();
        }
        updateDisplay();
    }

    private boolean itemIsSelected() {
        if (selected != null)
        {
            return true;
        }
        else
        {
            setTextOutput("Please select an item from the list first.\nIf you already have, please also ensure you set your item description and due date first before you attempt to edit them.");
            return false;
        }
    }

    private void setItemDueDate() {
        // Check if list is opened
        if(listExists()) {
            String input = getTextInput();
            // Clear textInput
            clearTextInput();
            // Use selected if one is, or else assign it to new item
            if(itemIsSelected() && !selectedDueDateIsBlank()) {
                // Update selected item's due date
                todoList.todoObservableList.get(todoList.todoObservableList.indexOf(selected)).dueDate = input;
                // Alert user to list edit
                setTextOutput("Item due date \"" + todoList.todoObservableList.get(todoList.todoObservableList.indexOf(selected)).dueDate + "\" successfully changed.");
            }
            else
            {
                // Grab last item in list and assign it the input
                int itemNumber = todoList.todoObservableList.size();
                todoList.todoObservableList.get(itemNumber - 1).dueDate = input;
                // Alert user to list creation
                setTextOutput("Item due date \"" + todoList.todoObservableList.get(itemNumber - 1).dueDate + "\" successfully added.");
            }
            // Deselect
            deselect();
        }
        updateDisplay();
    }

    private void clearTextInput() {
        // Call setTextInput and set it to an empty string
        setTextInput("");
    }

    private void updateSelectedItem(int i) {
        // Create selectedIndex
        int selectedIndex;
        // Get the index of the selected item
        switch (i)
        {

            case 1:
                // Due date was selected
                selectedIndex = listViewDueDates.getSelectionModel().getSelectedIndex();
                break;
            case 2:
                // Description was selected
                selectedIndex = listViewDescriptions.getSelectionModel().getSelectedIndex();
                break;
            case 3:
                // Completion status was selected
                selectedIndex = listViewCompletedStatus.getSelectionModel().getSelectedIndex();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + i);
        }
        selected = todoList.todoObservableList.get(selectedIndex);
    }

    private boolean listExists() {
        try {
            // Check if the list exists via checking if the list name can be grabbed
            if (!todoList.listName.equals("") || todoList.listName.equals("")) {
                return true;
            }
        } catch (NullPointerException e) {
            // If the list does not exist, a NullPointerException error will be caught and the user will be prompted to make a new list
            setTextOutput("Please create a list first using:\nFile --> New Todo List\nYou can also load a file using:\nFile --> Load Todo List");
            return false;
        }
        // If it fails for some reason, return false
        System.out.println("It missed the try catch.");
        return false;
    }
    
    private void deselect() {
        selected = null;
    }
}
