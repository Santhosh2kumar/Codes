

public class TODO {
   private int id;
   private String task;
   private boolean is_task_completed;
   
   //creating constructor
   public TODO(int id, String task){
        this.id = id;
        this.task = task;
        this.is_task_completed = false;
   }

   //getters and setters
     //getters
   public int getid(){
        return id;
    }
    public String gettask(){
        return task;
    }
    //setters
    public void settask(String newtask){
        this.task = newtask;
    }
    public void set_status_completed(){
        this.is_task_completed = true;
    }

    //overring to toString()
    @Override
    public String toString(){
        return "\n task "+id+
        "\n description: "+task+
        "\n Completed: "+is_task_completed+"\n";
    }


}
