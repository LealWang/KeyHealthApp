package elec5620.sydney.edu.au.keyhealth.models;

public class BMI {
    //Variables
    private String BMIId;
    private String type;
    private double BMIValue;
    private String date;


    //Constructors
    public BMI(String BMIId, String type, double BMIValue, String date) {
        this.BMIId = BMIId;
        this.type = type;
        this.BMIValue = BMIValue;
        this.date = date;
    }

    public BMI(){}


    //getXxx
    public String getBMIId() {
        return BMIId;
    }

    public String getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public double getBMIValue() {
        return BMIValue;
    }

    //setXxx
    public void setBMIId(String BMIId) {
        this.BMIId = BMIId;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBMIValue(double BMIValue) {
        this.BMIValue = BMIValue;
    }

    //toString

    @Override
    public String toString() {
        return "BMI{" +
                "BMIId='" + BMIId + '\'' +
                ", type='" + type + '\'' +
                ", BMIValue=" + BMIValue +
                ", date='" + date + '\'' +
                '}';
    }
}
