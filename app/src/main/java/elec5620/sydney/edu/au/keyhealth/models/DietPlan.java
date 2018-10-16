package elec5620.sydney.edu.au.keyhealth.models;

public class DietPlan {
    //Variables
    private String dietPlanId;
    private String type;
    private String description;
    private String dateCreated;
    private String endUserId;

    //Constructor
    public DietPlan(){}

    public DietPlan(String dietPlanId, String type, String description, String dateCreated, String endUserId) {
        this.dietPlanId = dietPlanId;
        this.type = type;
        this.description = description;
        this.dateCreated = dateCreated;
        this.endUserId = endUserId;
    }

    //getXxx
    public String getDietPlanId() {
        return dietPlanId;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public String getEndUserId() {
        return endUserId;
    }

    //setXxx

    public void setDietPlanId(String dietPlanId) {
        this.dietPlanId = dietPlanId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setEndUserId(String endUserId) {
        this.endUserId = endUserId;
    }

    //toString


    @Override
    public String toString() {
        return "DietPlan{" +
                "dietPlanId=" + dietPlanId +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", dateCreated='" + dateCreated + '\'' +
                ", endUserId=" + endUserId +
                '}';
    }
}
