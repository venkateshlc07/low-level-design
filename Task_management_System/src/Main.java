public class Main {
    public static void main(String[] args) {
        TaskManagement taskManagement = new TaskManagement(new ConsoleNotificationService());

        taskManagement.addUser("USER-1", "VLC");

        taskManagement.addTask("ASOC-1", "fetch Test API", "Design the API to return JSON of some data");

        taskManagement.assignTask("USER-1", "ASOC-1" );

        taskManagement.updateTaskStatus(TaskStatus.IN_PROGRESS,"ASOC-1", "USER-1");
        taskManagement.updateTaskStatus(TaskStatus.CLOSED,"ASOC-1", "USER-1");
    }
}