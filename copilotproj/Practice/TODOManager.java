
import java.security.AlgorithmConstraints;
import java.util.ArrayList;

public class TODOManager {
    public TODOManager(){
        
        
    }
   
    ArrayList<TODO> al = new ArrayList<TODO>();
    int nextid = 1;
    TODO tsk ;
    

    public void addTask(String matter){
        tsk= new TODO(nextid,matter);
        al.add(tsk);
        nextid++;
        System.out.println("Task added : "+tsk);
    }
    public void viewTasks(){
        for(TODO view : al){
            System.out.println(view);
        }
    }
    public void deleteTask(int id){
       al.removeIf(tsk -> tsk.getid() == id);
       }
       
        
    
    public void set_completed(int id){
        for(TODO set : al){
            if(set.getid() == id){
                set.set_status_completed();
            }
        }
    }
    
    
}
