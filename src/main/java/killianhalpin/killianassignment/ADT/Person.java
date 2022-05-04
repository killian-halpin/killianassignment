package killianhalpin.killianassignment.ADT;

public class Person {
    public int pps;
    public String name;
    public String dob;
    public String continfo;
    public String accessability;
    public String eircode;
    public String addressLine1;
    public String addressLine2;


    public Person(int pps, String name, String dob, String continfo, String accessability, String eircode, String addressLine1, String addressLine2) {
        this.pps = pps;
        this.name = name;
        this.dob = dob;
        this.continfo = continfo;
        this.accessability = accessability;
        this.eircode = eircode;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
    }

    public Person() {
        this.pps = 0;
        this.name = "";
        this.dob = "";
        this.continfo = "";
        this. accessability = "";
        this. eircode = "";
        this.addressLine1 ="";
        this.addressLine2 = "";
    }
public void updateperson(int pps, String name, String dob, String continfo, String accessability, String eircode, String addressLine1, String addressLine2) {
        this.pps = 0;
        this.name = "";
        this.dob = "";
        this.continfo = "";
        this. accessability = "";
        this. eircode = "";
        this.addressLine1 ="";
        this.addressLine2 = "";
    }

    public int getPps() {
        return pps;
    }

    public void setPps(int pps) {
        this.pps = pps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getContinfo() {
        return continfo;
    }

    public void setContinfo(String continfo) {
        this.continfo = continfo;
    }

    public String getAccessability() {
        return accessability;
    }

    public void setAccessability(String accessability) {
        this.accessability = accessability;
    }

    public String getEircode() {
        return eircode;
    }

    public void setEircode(String eircode) {
        this.eircode = eircode;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pps=" + pps +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", continfo='" + continfo + '\'' +
                ", accessability='" + accessability + '\'' +
                '}';
    }
}
