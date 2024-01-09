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

        switch(i){
            case 1:
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
            break;
            case 2:
                try{
                    System.out.println("Enter the date in yyyy-mm-dd   :--");
                    boolean flag= false;
                    LocalDate d= LocalDate.parse(j);
                    for(Task tt:tasks){
                        if(d.equals(tt.date)){
                            flag=true;
                            System.out.println(tt);
                        }
                    }
                    if(!flag){
                        System.out.println("No Task at given date");
                    }
                }catch(Exception e){
                    System.out.println("Enter the correct date format!!");
                }
                break;

            case 3:
                try{
                    System.out.println("Enter the Id to delete the task:-  ");
                    int idd= Integer.parseInt(j);
                    int initialLength= tasks.size();
                    tasks.removeIf(t->(t.id==idd));
                    int finalLength=tasks.size();
                    if(initialLength==finalLength){
                        System.out.println("No task with this Id");
                    }else
                        System.out.println("Deletion Succesfull");
                }catch(Exception e){
                    System.out.println("Give the proper output!!");
                }
                break;
            case 4:
                try{
                    System.out.println("Enter the task id which you want to complete");
                    int idd= Integer.parseInt(j);
                    boolean flag=false;
                    for(Task tt:tasks){
                        if(tt.id==idd){
                            flag=true;
                            tt.changeStatus();
                        }
                    }
                    if(!flag){
                        System.out.println("No Task with this Id");
                    }else
                        System.out.println("Done!");
                }catch(Exception e){
                    System.out.println("Something went wrong!!");
                }
                break;

            case 5:

                try{

                    System.out.println("Enter the first word:-");
                    boolean flag=false;
                    for(Task tt:tasks){
                        String word[] = tt.task.split(" ");
                        if(word[0].equals(j)){
                            flag=true;
                            System.out.println(tt);
                        }
                    }
                    if(!flag){
                        System.out.println("No task with this word");
                    }else
                        System.out.println(" Done !");

                }catch(Exception e){
                    System.out.println("Something went wrong!!");
                }
                break;

            default:
                System.out.println("Enter correct choices from the action");
        }

    }



}