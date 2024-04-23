package Exercise5;

import java.util.*;

public class TaskList implements Iterable<Task>{

    private ArrayList<Task> tasksToDo;

    public TaskList() {
        this.tasksToDo = new ArrayList<>();
    }

    public ArrayList<Task> getTasksToDo() {
        return tasksToDo;
    }

    public void setTasksToDo(ArrayList<Task> tasksToDo) {
        this.tasksToDo = tasksToDo;
    }

    public void addTask(Task t){
        tasksToDo.add(t);
    }

    public void deleteTask(String description){
        boolean found = false;
        for (Task task : tasksToDo){
            if (task.getDescription().equals(description)){
                tasksToDo.remove(task);
                System.out.println(task.getDescription() + " - Eliminado");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No se encontró ninguna tarea con esa descripción");
        }
    }


    public int getTotalTaks(){
        return tasksToDo.size();
    }

    public void orderedList(){
        Collections.sort(this.tasksToDo, new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return Integer.compare(o2.getPriority(), o1.getPriority());
            }
        });
        for (Task task : tasksToDo) {
            System.out.println(task.getPriority() + ": " + task.getDescription());
        }
    }


    @Override
    public Iterator<Task> iterator() {
        return tasksToDo.iterator();
    }
}
