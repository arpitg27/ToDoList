
import java.util.*;
import java.time.LocalDate;
import Task.Task;


import ToDo.ToDo;
public class
ToDoList {

    public static void main(String args[]){
        ToDo tasks= new ToDo();
        while(true){
            System.out.println("Enter specific option's Id from below:-");
            System.out.println("Id Action");
            System.out.println("1. Add a Task");
            System.out.println("2. Show all the tasks grouped by a date");
            System.out.println("3. Enter The Id of task to delete ");
            System.out.println("4. Enter the Id of task to mark as Complete");
            System.out.println("5. Enter the starting word for the search");
            System.out.println("6. Quit ");

            Scanner sc = new Scanner(System.in);
            int j = sc.nextInt();

            if(j==6){
                return ;
            }

            tasks.perform(j);

        }

    }

}
