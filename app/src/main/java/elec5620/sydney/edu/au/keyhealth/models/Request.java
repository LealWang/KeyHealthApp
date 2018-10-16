package elec5620.sydney.edu.au.keyhealth.models;

public class Request {
    //Variables
    private String trainerId;
    private String endUserId;
    private String requestId;
    private String date;
    private String description;

    //Constructor
    public Request(){}

    public Request(String trainerId, String endUserId, String requestId, String date, String description) {
        this.trainerId = trainerId;
        this.endUserId = endUserId;
        this.requestId = requestId;
        this.date = date;
        this.description = description;
    }

    //getXxx

    public String getRequestId() {
        return requestId;
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

    public String getTrainerId() {
        return trainerId;
    }

    //setXxx

    public void setEndUserId(String endUserId) {
        this.endUserId = endUserId;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTrainerId(String trainerId) {
        this.trainerId = trainerId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

//toString


    @Override
    public String toString() {
        return "Request{" +
                "trainerId='" + trainerId + '\'' +
                ", endUserId='" + endUserId + '\'' +
                ", requestId='" + requestId + '\'' +
                ", date='" + date + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
