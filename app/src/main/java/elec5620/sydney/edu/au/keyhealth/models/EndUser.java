package elec5620.sydney.edu.au.keyhealth.models;

import java.util.ArrayList;

public class EndUser extends User {
    //Variables
    private int age;
    private double height;
    private double weight;


    private ArrayList<BMI> bmis;
    private ArrayList<Target> targets;
    private ArrayList<ExercisePlan> exercisePlans;
    private ArrayList<DietPlan> dietPlans;
    private ArrayList<AutoSuggestion> autoSuggestions;

    //Constructor
    public EndUser(){}

    public EndUser(String userId, String email, String password,
                   String name, ArrayList<Request> requests,
                   int age,
                   double height, double weight,
                   ArrayList<BMI> bmis,
                   ArrayList<Target> targets,
                   ArrayList<ExercisePlan> exercisePlans,
                   ArrayList<DietPlan> dietPlans,
                   ArrayList<AutoSuggestion> autoSuggestions) {

        super(userId, email, password, name, requests);
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.bmis = bmis;
        this.targets = targets;
        this.exercisePlans = exercisePlans;
        this.dietPlans = dietPlans;
        this.autoSuggestions = autoSuggestions;
    }

    //getXxx
    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public ArrayList<BMI> getBmis() {
        return bmis;
    }
    public ArrayList<Target> getTargets() {
        return targets;
    }

    public ArrayList<ExercisePlan> getExercisePlans() {
        return exercisePlans;
    }

    public ArrayList<DietPlan> getDietPlans() {
        return dietPlans;
    }

    public ArrayList<AutoSuggestion> getAutoSuggestions() {
        return autoSuggestions;
    }




    //setXxx
    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setBmis(ArrayList<BMI> bmis) {
        this.bmis = bmis;
    }

    public void setTargets(ArrayList<Target> targets) {
        this.targets = targets;
    }

    public void setExercisePlans(ArrayList<ExercisePlan> exercisePlans) {
        this.exercisePlans = exercisePlans;
    }

    public void setDietPlans(ArrayList<DietPlan> dietPlans) {
        this.dietPlans = dietPlans;
    }

    public void setAutoSuggestions(ArrayList<AutoSuggestion> autoSuggestions) {
        this.autoSuggestions = autoSuggestions;
    }


    //toString


    @Override
    public String toString() {
        return "EndUser{" +
                "age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", bmis=" + bmis +
                ", targets=" + targets +
                ", exercisePlans=" + exercisePlans +
                ", dietPlans=" + dietPlans +
                ", autoSuggestions=" + autoSuggestions +
                '}';
    }
}
