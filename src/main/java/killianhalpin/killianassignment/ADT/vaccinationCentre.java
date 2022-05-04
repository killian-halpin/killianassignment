package killianhalpin.killianassignment.ADT;

import killianhalpin.killianassignment.DataStructure.linkedListKillian;

public class vaccinationCentre {
    public String name;
    public String eir;
    public String address1;
    public String address2;
    public String getAddress3;
    public int spaces;


    public vaccinationCentre(String name, String eir, String address1, String address2, String getAddress3, int spaces) {
        this.name = name;
        this.eir = eir;
        this.address1 = address1;
        this.address2 = address2;
        this.getAddress3 = getAddress3;
        this.spaces = spaces;
    }

    public vaccinationCentre() {
        this.name = "";
        this.eir="";
        this.address1="";
        this.address2="";
        this.getAddress3="";
        this.spaces=0;
    }
public void updatecentre(String name, String eir, String address1, String address2, String getAddress3, int spaces) {
        this.name = name;
        this.eir = eir;
        this.address1 = address1;
        this.address2 = address2;
        this.getAddress3 = getAddress3;
        this.spaces = spaces;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEir() {
        return eir;
    }

    public void setEir(String eir) {
        this.eir = eir;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getGetAddress3() {
        return getAddress3;
    }

    public void setGetAddress3(String getAddress3) {
        this.getAddress3 = getAddress3;
    }

    public int getSpaces() {
        return spaces;
    }

    public void setSpaces(int spaces) {
        this.spaces = spaces;
    }

    @Override
    public String toString() {
        return "vaccinationCentre{" +
                "name='" + name + '\'' +
                ", eir='" + eir + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", getAddress3='" + getAddress3 + '\'' +
                ", spaces=" + spaces +
                '}';
    }


}
