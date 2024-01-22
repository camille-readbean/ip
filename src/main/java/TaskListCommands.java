public class TaskListCommands {
    private static final Task[] list = new Task[100];
    private static int taskNextIndex = 0;

    public TaskListCommands() {}

    public static void addToList(String inputs) {
        System.out.println("  << Duke Leto >> ");
        System.out.println("  > Task added: " + inputs);
        TaskListCommands.list[TaskListCommands.taskNextIndex] = new Task(inputs);
        TaskListCommands.taskNextIndex++;
    }

    public static void markTaskCompleted(int index) {
        Task temp;
        try {
            temp = TaskListCommands.list[index];
            if (temp == null) {
                System.out.println("  << Duke Leto >>\n  > The task is empty!");
                return;
            }
            if (temp.isCompleted()) {
                System.out.println("  << Duke Leto >>");
                System.out.println("  > Task already completed");
                return;
            } else {
                temp.markCompleted();
                System.out.println("  << Duke Leto >>\n  > Task marked as completed! Congratulations");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }

    public static void markTaskUncompleted(int index) {
        Task temp;
        try {
            temp = TaskListCommands.list[index];
            if (temp == null) {
                System.out.println("  << Duke Leto >>\n  > The task is empty!");
                return;
            }
            if (!temp.isCompleted()) {
                System.out.println("  << Duke Leto >>");
                System.out.println("  > Task already not completed (╬▔皿▔)╯");
                return;
            } else {
                temp.markUncompleted();
                System.out.println("  << Duke Leto >>\n  > Task marked as uncompleted! Things happen, dont worry we account for it");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }

    public static void printList() {
        System.out.println("  << Duke Leto >> ");
        System.out.println("  ┌ < Task list >");
        for (int i = 0; i < taskNextIndex; i++) {
            System.out.println("  ├ " + (i+1) + ": " + TaskListCommands.list[i].toString());
        }
        System.out.println("  └─ end of list");
    }
}