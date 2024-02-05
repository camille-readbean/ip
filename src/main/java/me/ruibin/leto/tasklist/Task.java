package me.ruibin.leto.tasklist;

public class Task {
    private boolean completed;
    private String message;

    public Task(Boolean completed, String message) {
        this.completed = completed;
        this.message = message;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markCompleted() {
        this.completed = true;
    }

    public void markUncompleted() {
        this.completed = false;
    }

    @Override
    public String toString() {
        return "[" + (isCompleted() ? "X" : " ") + "] " + this.message;
    }

    /**
     * Returns the object as a row in a csv table according to format
     * Completed,Task
     * @return String in csv format
     */
    public String toCSVString() {
        return (isCompleted() ? "Y" : "N") + "," + this.message;
    }
}

