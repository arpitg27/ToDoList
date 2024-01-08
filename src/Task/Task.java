package Task;

import java.time.LocalDate;

public class Task{
  public int id;
  public  String task;
  public   LocalDate date;
   public String status;

    public Task(int id){
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