package Model;

import java.util.Objects;

public abstract class Task {


    private String taskID;
    private String description;

    public Task(String taskID, String description) {
        this.taskID = taskID;
        this.description = description;
    }

    public String getTaskID() {
        return taskID;
    }

    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void execute(){};

    public String toString(){
        return "ID=" +taskID + "|"+ description;
    }

    public boolean equals(Task obj){
        if (this == obj){
            return true;
        }
        if(!(obj instanceof  Task)){
            return false;
        }
        return (Objects.equals(getTaskID(),obj.getTaskID() ) && Objects.equals(getDescription() , obj.getDescription()));
    }
    public int hashcode(){
        return Objects.hash(getTaskID(),getDescription());
    }

}
