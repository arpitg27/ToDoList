package ToDo;

import Task.Task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ToDo{
    ArrayList<Task> tasks;
    int counter;

   public ToDo()
    {
        tasks= new ArrayList<Task>();
        counter=0;

    }
   public void perform(int i){
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