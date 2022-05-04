package killianhalpin.killianassignment.ADT;

public class vaccinationAppointment {
    public String date;
    public String vacctype;
    public String batch;
    public String docdets;
    public int patid;

    public vaccinationAppointment(String date, String vacctype, String batch, String docdets, int patid) {
        this.date = date;
        this.vacctype = vacctype;
        this.batch = batch;
        this.docdets = docdets;
        this.patid = patid;
    }

    public vaccinationAppointment() {
        this.date = "";
        this.vacctype = "";
        this.batch = "";
        this.docdets = "";
        this.patid = 0;
    }
public void updateAppointment(String date, String vacctype, String batch, String docdets, int patid) {
        this.date = date;
        this.vacctype = vacctype;
        this.batch = batch;
        this.docdets = docdets;
        this.patid = patid;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVacctype() {
        return vacctype;
    }

    public void setVacctype(String vacctype) {
        this.vacctype = vacctype;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getDocdets() {
        return docdets;
    }

    public void setDocdets(String docdets) {
        this.docdets = docdets;
    }

    public int getPatid() {
        return patid;
    }

    public void setPatid(int patid) {
        this.patid = patid;
    }

    @Override
    public String toString() {
        return "vaccinationAppointment{" +
                "date='" + date + '\'' +
                ", vacctype='" + vacctype + '\'' +
                ", batch=" + batch +
                ", docdets='" + docdets + '\'' +
                ", patid=" + patid +
                '}';
    }
}
