package misty.task;

public class Task {
    private String description;
    private boolean isDone;

    public Task(String description) {
        this.description = description;
        isDone = false;
    }

    public String getDescription() {
        return description;
    }
    public String getStatus() {
        return (isDone ? "[X]" : "[ ]");
    }

    public boolean getIsDone() {
        return isDone;
    }
    public void setTaskAsDone() {
        isDone = true;
    }
    public void setTaskAsNotDone() {
        isDone = false;
    }
}
