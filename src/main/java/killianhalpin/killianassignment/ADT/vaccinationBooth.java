package killianhalpin.killianassignment.ADT;

public class vaccinationBooth {
    public String id;
    public int floor;
    public String access;

    public vaccinationBooth(String id, int floor, String access) {
        this.id = id;
        this.floor = floor;
        this.access = access;
    }

    public vaccinationBooth() {
        this.id = "";
        this.floor = 0;
        this.access = "";
    }
public void updatebooth(String id, int floor, String access) {
        this.id = id;
        this.floor = floor;
        this.access = access;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    @Override
    public String toString() {
        return "vaccinationBooth{" +
                "id='" + id + '\'' +
                ", floor=" + floor +
                ", access='" + access + '\'' +
                '}';
    }
}


