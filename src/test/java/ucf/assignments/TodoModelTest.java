package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TodoModelTest {

    //Note: AE = Assert Equals

    @Test
    void useTextOutput() {
        /*
         * Define a string
         * Pass string into function
         * AE that the textOutput and string match
         */
    }

    @Test
    void useTextInputGet() {
        /*
         * Call function and set return equal to a string
         * AE that the string is not blank
         */
    }

    @Test
    void useTextInputSet() {
        /*
         * Pass a string into function
         * Get value from useTextInput's get method
         * AE that that initial string and return value match
         */
    }

    @Test
    void useCornerBox() {
        /*
         * Define a string
         * Pass string into function
         * AE that the cornerBox's and string match
         */
    }

    @Test
    void useSelectedListViewGet() {
        /*
         * Call function and set return equal to a string
         * AE that the string is not blank
         */
    }

    @Test
    void useSelectedListViewSet() {
        /*
         * Pass a string into function
         * Get value from useSelectedListView's get method
         * AE that that initial string and return value match
         */
    }

    @Test
    void createNewList() {
        /*
         * Put a string in textInput
         * Call createNewList()
         * After processing, check Assert if list exists
         */
    }

    @Test
    void loadList() {
        /*
         * Create file (used for testing)
         * Run loadList()
         * Input name of list in textInput
         * Check loaded files for new one created
         * If found, set a boolean to true, else to false
         * AE that the boolean is true (meaning it was located)
         */
    }

    @Test
    void loadMultipleLists() {
        /*
         * Create files (used for testing)
         * Input multiple lists as string to textInput
         * Run loadMultipleLists()
         * Assert that each list loaded exists (separately)
         */
    }

    @Test
    void saveList() {
        /*
         * Create a list
         * Run saveList() using the new list (put into textInput)
         * Check if the directory for a file with that list name
         * If exists, set boolean to true, else false
         * AE that the boolean is true
         */
    }

    @Test
    void saveMultipleLists() {
        /*
         * Create multiple lists
         * Run saveMultipleLists() using new lists (put into textInput)
         * Assert that each list was found one by one
         */
    }

    @Test
    void deleteList() {
        /*
         * Make a new list
         * Run deleteList() with this list
         * Check if both the list and file exist
         * If they both do not exist, set boolean to true, else to false
         * Assert True
         */
    }

    @Test
    void help() {
        /*
         * Assert that a new window was created
         */
    }

    @Test
    void editListName() {
        /*
         * Create list with name A
         * Run editListName() and change it to newName
         * Get current list name (B)
         * Assert that A and B do not match
         */
    }

    @Test
    void editItemDescription() {
        /*
         * Make a new list
         * Create item with description A
         * Run editItemDescription() and change it to newDesc
         * Get current description (B)
         * Assert that A and B do not match
         */
    }

    @Test
    void editItemDueDate() {
        /*
         * Make a new list
         * Create item with description A
         * Run editItemDueDate() and change it to newDueDate
         * Get current description (B)
         * Assert that A and B do not match
         */
    }

    @Test
    void deleteItem() {
        /*
         * Make a new list
         * Create item with description and due date
         * Run deleteItem() with item
         * Check the list for the item
         * If not found, set boolean to true, else to false
         * Assert True
         */
    }

    @Test
    void displayList() {
        /*
         * Make a new list
         * Create items
         * Run displayList() with list
         * Assert that useSelectedView's get method is not blank
         */
    }

    @Test
    void displayAllItems() {
        /*
         * Make a new list
         * Create X amount of items
         * Run displayAllItems() with list
         * Get each currently displayed item, add to counter
         * AE that counter and list size match
         */
    }

    @Test
    void displayCompletedItems() {
        /*
         * Make a new list
         * Create X amount of items, where Y are completed
         * Run displayAllItems() with list
         * Get each currently displayed item, add to counter
         * AE that counter and Y match
         */
    }

    @Test
    void displayIncompleteItems() {
        /*
         * Make a new list
         * Create X amount of items, where Y are incomplete
         * Run displayAllItems() with list
         * Get each currently displayed item, add to counter
         * AE that counter and Y match
         */
    }

    @Test
    void markAsComplete() {
        /*
         * Make a new list
         * Create an item marked as incomplete
         * Run markAsComplete() with item
         * Assert that item's status is now complete
         */
    }

    @Test
    void markAsIncomplete() {
        /*
         * Make a new list
         * Create an item marked as complete
         * Run markAsComplete() with item
         * Assert that item's status is now incomplete
         */
    }

    @Test
    void addItem() {
        /*
         * Make a new list
         * Get counter of items in list
         * Run addItem()
         * Get new counter of items in list
         * Assert that new counter is +1 counter
         */
    }

    @Test
    void submit() {
        /*
         * Assert that it returns true
         */
    }
}