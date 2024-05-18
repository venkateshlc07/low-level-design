import java.util.ArrayList;
import java.util.List;

public class TaskManagement {

    private List<Task> tasks;

    private List<User> users;
    private final NotificationService ns;

    public TaskManagement(NotificationService ns) {
        this.users = new ArrayList<>();
        this.tasks = new ArrayList<>();
        this.ns = ns;
    }

    public void addTask(String taskId, String title, String description) {
        Task task = new  Task(taskId, title, description);
        tasks.add(task);
        ns.sendNotification(task.toString());
    }

    public void addUser(String userId, String name){
        users.add(new User(userId, name));
    }

    public void assignTask(String userId, String taskId){
        User user = findUserById(userId);
        Task task = findTaskById(taskId);

        if (user != null && task != null){
            task.assignUser(user);
            ns.sendNotification(task.toString());
        }
    }

    public void updateTaskStatus(TaskStatus status, String taskId, String userId){
        Task task = findTaskById(taskId);
        if (task.getAssignee().getUserId().equals(userId)){
            task.updateTask(status);
            ns.sendNotification(task.toString());
        }

    }


    private User findUserById(String userId) {
        for(User user: users){
            if (user.getUserId().equals(userId)){
                return user;
            }
        }
        return null;
    }

    private Task findTaskById(String taskId) {
        for(Task task: tasks){
            if (task.getTaskId().equals(taskId)){
                return task;
            }
        }
        return null;
    }



}
