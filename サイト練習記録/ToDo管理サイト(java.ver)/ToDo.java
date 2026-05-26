public class ToDo {
    private final String task;
    private boolean completed;

    public ToDo(String task) {
        this.task=task;
        completed=false;
    }

    public void completed() {
        completed=true;
    }

    public boolean isCompleted() {
        return completed;
    }

    public String getTask() {
        return task;
    }

    @Override
    public String toString() {
        return (completed ? "☑ " : "□ ")+task;
    }
}