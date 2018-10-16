package elec5620.sydney.edu.au.keyhealth.models;

public class Target {
    //Variables
    private String endUserId;
    private String targetId;
    private double goalWeight;
    private double goalBMI;
    private String date;

    //Constructor
    public Target(){}

    public Target(String endUserId, String targetId, double goalWeight, double goalBMI, String date) {
        this.endUserId = endUserId;
        this.targetId = targetId;
        this.goalWeight = goalWeight;
        this.goalBMI = goalBMI;
        this.date = date;
    }

    //getXxx
    public String getTargetId() {
        return targetId;
    }

    public double getGoalWeight() {
        return goalWeight;
    }

    public double getGoalBMI() {
        return goalBMI;
    }

    public String getDate() {
        return date;
    }

    public String getEndUserId() {
        return endUserId;
    }

    //setXxx

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public void setGoalWeight(double goalWeight) {
        this.goalWeight = goalWeight;
    }

    public void setGoalBMI(double goalBMI) {
        this.goalBMI = goalBMI;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setEndUserId(String endUserId) {
        this.endUserId = endUserId;
    }

//toString


    @Override
    public String toString() {
        return "Target{" +
                "endUserId='" + endUserId + '\'' +
                ", targetId='" + targetId + '\'' +
                ", goalWeight=" + goalWeight +
                ", goalBMI=" + goalBMI +
                ", date='" + date + '\'' +
                '}';
    }
}
