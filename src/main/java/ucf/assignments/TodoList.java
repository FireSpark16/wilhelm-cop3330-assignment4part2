/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Xander Wilhelm
 */

package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class TodoList {
    String listName = "";
    ObservableList<TodoItem> todoObservableList = FXCollections.observableArrayList();

    public class TodoItem
    {
        String description = "(blank)";
        String dueDate = "(blank)";
        String completedStatus = "Incomplete";
    }

}
