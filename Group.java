package avivahealthtracker;
//Change package accordingly
import java.util.ArrayList;

public class Group {
    private String uniqueName;
    private String goal;
    private String location;
    private ArrayList<User> users;
    
    public Group(){
        uniqueName = null;
        users = null;
    }

    public Group(String uniqueName, ArrayList users) {
        this.uniqueName = uniqueName;
        this.users = users;
    }

    public String getUniqueName() {
        return uniqueName;
    }

    public String getGoal() {
        return goal;
    }

    public String getLocation() {
        return location;
    }

    public ArrayList getUsers() {
        return users;
    }

    public void setUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setUsers(ArrayList users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Group: " + "UniqueName: " + uniqueName + ", Goal: " + goal + ", Location: " + location + ", Users: " + users;
    }
    
}



