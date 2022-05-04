package killianhalpin.killianassignment.DataStructure;

import killianhalpin.killianassignment.ADT.vaccinationCentre;

public class VaccinationNode {
    vaccinationCentre contents;
    VaccinationNode next;

    public vaccinationCentre getContents() {
        return contents;
    }

    public void setContents(vaccinationCentre contents) {
        this.contents = contents;
    }

    public VaccinationNode getNext() {
        return next;
    }

    public void setNext(VaccinationNode next) {
        this.next = next;
    }

    public VaccinationNode() {
        this.contents = null;
        this.next = null;
    }

}
