import java.time.LocalDate;

public class Task {

    private String taskId;
    private String title;
    private String description;
    private TaskStatus status;
    private LocalDate createdAt;
    private User user;

    public Task(String taskId, String title, String description) {
        this.taskId = taskId;
        this.title = title;
        this.description = description;
        this.createdAt = LocalDate.now();
        this.status = TaskStatus.OPEN;
        this.user = new NullUser("0","unassigned");
    }

    public void updateTask(TaskStatus status){
        this.status = status;
    }

    public void assignUser(User user){
        this.user = user;
    }

    public String getTaskId(){
        return taskId;
    }

    public User getAssignee(){
        return user;

    }

    public String toString(){
        return "Task " + taskId + " Created " + "with " + status.name() + " and currently assigned to " + user.toString();
    }


}

