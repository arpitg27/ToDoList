package ToDo;

import Task.Task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDo{
    List<Task> tasks;
    int counter;

   public ToDo()
    {
        tasks= new ArrayList<Task>();
        counter=0;
    }
   public void perform(int i,String j){
        Scanner sc= new Scanner(System.in);
        if(i==1){
            try{
                System.out.println("Enter the task:- ");

                counter++;
                Task t = new Task(counter);
                t.addTask(j);
                tasks.add(t);
            }catch(Exception e){
                System.out.println(
                        "Something went wrong!!"
                );
            }


        }else if(i==2){

            try{
                System.out.println("Enter the date in yyyy-mm-dd   :--");

                LocalDate d= LocalDate.parse(j);
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
                int idd= Integer.parseInt(j);
                tasks.removeIf(t->(t.id==idd));
                System.out.println("Deletion Succesfull");
            }catch(Exception e){
                System.out.println("Give the proper output!!");
            }

        }else if(i==4){


            try{
                System.out.println("Enter the task id which you want to complete");
                int idd= Integer.parseInt(j);
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

                for(Task tt:tasks){
                    String word[] = tt.task.split(" ");
                    if(word[0].equals(j)){
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