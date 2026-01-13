package com.texteditor;

import java.util.Stack;

public class TextEditor {

    private String content = "";
    private Stack<Action> undoStack = new Stack<>();
    private Stack<Action> redoStack = new Stack<>();

    // Insert text
    public void insert(String text) {
        content += text;
        undoStack.push(new Action("INSERT", text));
        redoStack.clear(); // clear redo on new action
        System.out.println("Inserted: " + text);
    }

    // Delete last n characters
    public void delete(int n) {
        if (content.length() < n) {
            System.out.println("Delete failed");
            return;
        }

        String removed = content.substring(content.length() - n);
        content = content.substring(0, content.length() - n);

        undoStack.push(new Action("DELETE", removed));
        redoStack.clear();
        System.out.println("Deleted: " + removed);
    }

    // Undo last action
    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }

        Action action = undoStack.pop();

        if (action.type.equals("INSERT")) {
            content = content.substring(0, content.length() - action.text.length());
        } else {
            content += action.text;
        }

        redoStack.push(action);
        System.out.println("Undo performed");
    }

    // Redo last undone action
    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo");
            return;
        }

        Action action = redoStack.pop();

        if (action.type.equals("INSERT")) {
            content += action.text;
        } else {
            content = content.substring(0, content.length() - action.text.length());
        }

        undoStack.push(action);
        System.out.println("Redo performed");
    }

    public void showContent() {
        System.out.println("Current Text: " + content);
    }
}
