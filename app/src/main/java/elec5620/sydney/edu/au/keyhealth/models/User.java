package elec5620.sydney.edu.au.keyhealth.models;

import java.util.ArrayList;

public abstract class User {
    //Variables
    protected String userId;
    protected String email;
    protected String password;
    protected String name;

    protected ArrayList<Request> requests;

    //Constructor
    public User(){}

    public User(String userId, String email, String password, String name, ArrayList<Request> requests) {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.name = name;
        this.requests = requests;
    }


    //getXxx
    public String getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Request> getRequests() {
        return requests;
    }

    //setXxx
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRequests(ArrayList<Request> requests) {
        this.requests = requests;
    }

    //toString

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", requests=" + requests +
                '}';
    }
}
