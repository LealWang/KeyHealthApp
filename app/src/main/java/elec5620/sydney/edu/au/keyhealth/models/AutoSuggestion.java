package elec5620.sydney.edu.au.keyhealth.models;

public class AutoSuggestion {
    //Variables
    private String autoSuggestionId;
    private String title;
    private String description;
    private String endUserId;

    //Constructor
    public AutoSuggestion(){}

    public AutoSuggestion(String autoSuggestionId, String title, String description, String endUserId) {
        this.autoSuggestionId = autoSuggestionId;
        this.title = title;
        this.description = description;
        this.endUserId = endUserId;
    }

    //getXxx

    public String getAutoSuggestionId() {
        return autoSuggestionId;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public String getEndUserId() {
        return endUserId;
    }


    //setXxx

    public void setAutoSuggestionId(String autoSuggestionId) {
        this.autoSuggestionId = autoSuggestionId;
    }



    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEndUserId(String endUserId) {
        this.endUserId = endUserId;
    }

    //toString

    @Override
    public String toString() {
        return "AutoSuggestion{" +
                "autoSuggestionId=" + autoSuggestionId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
