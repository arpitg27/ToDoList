
import java.util.*;
import java.time.LocalDate;

class Task{
    int id;
    String task;
    LocalDate date;
    String status;

    Task(int id){
        this.status="Not Completed";
        this.date = LocalDate.now();
        this.task="";
        this.id=id;

    }
    public void addTask(String s){
        task=s;
    }
    public void changeStatus(){
        status = "Completed";
    }



    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", task='" + task + '\'' +
                ", date=" + date +
                ", status='" + status + '\'' +
                '}';
    }
}
class ToDo{
    ArrayList<Task>tasks;
    int counter;

    ToDo()
    {
        tasks= new ArrayList<Task>();
        counter=0;

    }
    void perform(int i){
        Scanner sc= new Scanner(System.in);
        if(i==1){
            try{
                System.out.println("Enter the task:- ");
                String s = sc.nextLine();
                counter++;
                Task t = new Task(counter);
                t.addTask(s);
                tasks.add(t);
            }catch(Exception e){
                System.out.println(
                        "Something went wrong!!"
                );
            }


        }else if(i==2){

            try{
                System.out.println("Enter the date in yyyy-mm-dd   :--");
                String s = sc.nextLine();
                LocalDate d= LocalDate.parse(s);
                for(Task tt:tasks){
                    if(d.equals(tt.date)){
                        System.out.println(tt);
                    }
                }
            }catch(Exception e){
                System.out.println("Enter the correct date format!!");
            }



        }else if(i==3){
            try{
                System.out.println("Enter the Id to delete the task:-  ");
                int idd= sc.nextInt();
                tasks.removeIf(t->(t.id==idd));
                System.out.println("Deletion Succesfull");
            }catch(Exception e){
                System.out.println("Give the proper output!!");
            }

        }else if(i==4){


            try{
                System.out.println("Enter the task id which you want to complete");
                int idd= sc.nextInt();
                for(Task tt:tasks){
                    if(tt.id==idd){
                        tt.changeStatus();
                    }
                }
                System.out.println("Done!");
            }catch(Exception e){
                System.out.println("Something went wrong!!");
            }


        }else if(i==5){


            try{

                System.out.println("Enter the first word:-");
                String s= sc.next();
                for(Task tt:tasks){
                    String word[] = tt.task.split(" ");
                    if(word[0].equals(s)){
                        System.out.println(tt);
                    }

                }
                System.out.println(" Done !");

            }catch(Exception e){
                System.out.println("Something went wrong!!");
            }
        }
    }



}
public class ToDoList {

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
