package elec5620.sydney.edu.au.keyhealth.models;

public class Certification {
    //Variables
    private String certificationId;
    private String type;
    private String certificationPhoto;
    private int code;

    //Constructor
    public Certification(){}

    public Certification(String certificationId, String type, String certificationPhoto, int code) {
        this.certificationId = certificationId;
        this.type = type;
        this.certificationPhoto = certificationPhoto;
        this.code = code;
    }

    //getXxx
    public String getCertificationId() {
        return certificationId;
    }

    public String getType() {
        return type;
    }

    public String getCertificationPhoto() {
        return certificationPhoto;
    }

    public int getCode() {
        return code;
    }



    //setXxx
    public void setCertificationId(String certificationId) {
        this.certificationId = certificationId;
    }

    public void setType(String type) {
        this.type = type;
    }


    public void setCode(int code) {
        this.code = code;
    }

    public void setCertificationPhoto(String certificationPhoto) {
        this.certificationPhoto = certificationPhoto;
    }


    //toString

    @Override
    public String toString() {
        return "Certification{" +
                "certificationId=" + certificationId +
                ", type='" + type + '\'' +
                ", certificationPhoto='" + certificationPhoto + '\'' +
                ", code=" + code +
                '}';
    }
}
