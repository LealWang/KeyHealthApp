package elec5620.sydney.edu.au.keyhealth.models;

public class ExercisePlan {
    //Variables
    private String exercisePlanId;
    private String type;
    private String description;
    private String date;
    private String endUserId;

    //Constructor
    public ExercisePlan(){}


    public ExercisePlan(String exercisePlanId, String type, String description, String date, String endUserId) {
        this.exercisePlanId = exercisePlanId;
        this.type = type;
        this.description = description;
        this.date = date;
        this.endUserId = endUserId;
    }

    //getXxx
    public String getExercisePlanId() {
        return exercisePlanId;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public String getEndUserId() {
        return endUserId;
    }

    //setXxx
    public void setExercisePlanId(String exercisePlanId) {
        this.exercisePlanId = exercisePlanId;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEndUserId(String endUserId) {
        this.endUserId = endUserId;
    }

    public void setType(String type) {
        this.type = type;
    }

    //toString


    @Override
    public String toString() {
        return "ExercisePlan{" +
                "exercisePlanId=" + exercisePlanId +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                ", endUserId=" + endUserId +
                '}';
    }
}
