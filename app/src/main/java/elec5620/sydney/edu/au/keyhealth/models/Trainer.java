package elec5620.sydney.edu.au.keyhealth.models;

import java.util.ArrayList;

public class Trainer extends User {
    //Variables
    private ArrayList<Certification> certifications;


    //Constructor
    public Trainer(){}

    public Trainer(String userId, String email, String password, String name,
                   ArrayList<Request> requests, ArrayList<Certification> certifications) {
        super(userId, email, password, name, requests);
        this.certifications = certifications;
    }

    //getXxx
    public ArrayList<Certification> getCertifications() {
        return certifications;
    }

    //setXxx
    public void setCertifications(ArrayList<Certification> certifications) {
        this.certifications = certifications;
    }

    //toString

    @Override
    public String toString() {
        return "Trainer{" +
                "certifications=" + certifications +
                '}';
    }
}

