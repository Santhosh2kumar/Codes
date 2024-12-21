import java.util.Scanner;

public class TODO_Main {
    public static void displayMenu(){
      System.out.println("<---ACTIONS TO-DO--->");
      System.out.println("---------------------------------------------");
      System.out.println("1.Add a New Task:");
      System.out.println("2.view all Task's");
      System.out.println("3.Delete Task");
      System.out.println("4.Set Task status");
      System.out.println("5.Terminate");
      System.out.println("---------------------------------------------");
    }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      TODOManager s = new TODOManager();
      System.out.println("Eneter Choice");
      System.out.println("---------------------------------------------");
      while(true){
        displayMenu();
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
              System.out.println("enter description for task");
              System.out.println("---------------------------------------------");
              String des = sc.nextLine();
              s.addTask(des);
              break;
            case 2:
              System.out.println("ALL Tasks");
              System.out.println("---------------------------------------------");
              s.viewTasks();
              System.out.println("Displayed All Tasks");
              System.out.println("---------------------------------------------");
              break;
            case 3:
              System.out.println("Enter id to delete task :");
              int id = sc.nextInt();
              
              System.out.println("Task removed!");
              s.deleteTask(id);
              break;
            
            case 4:
              System.out.println("Enter id to set Task completed");
              id = sc.nextInt();
              s.set_completed(id);
              System.out.println("Marked as Completed!");
              break;

            case 5:
            System.out.println("Exited");
            return;
            default:
                System.out.println("Sorry! for the inconvinence");
        }
      }
    }
}
