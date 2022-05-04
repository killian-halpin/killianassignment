
package killianhalpin.killianassignment;

        import com.thoughtworks.xstream.security.AnyTypePermission;
        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;


        import javafx.scene.control.Label;
        import javafx.scene.control.ListView;
        import javafx.scene.control.TextField;
        import killianhalpin.killianassignment.ADT.Person;
        import killianhalpin.killianassignment.ADT.vaccinationAppointment;
        import killianhalpin.killianassignment.ADT.vaccinationBooth;
        import killianhalpin.killianassignment.ADT.vaccinationCentre;

        import killianhalpin.killianassignment.DataStructure.VaccinationNode;
        import killianhalpin.killianassignment.DataStructure.linkedListKillian;


        import com.thoughtworks.xstream.XStream;
        import com.thoughtworks.xstream.io.xml.DomDriver;

        import java.io.*;

public class HelloController {
    vaccinationCentre vcholder= new vaccinationCentre();
    vaccinationAppointment appholder=new vaccinationAppointment();
    vaccinationBooth boothholder =new vaccinationBooth();
    Person personholder = new Person();

    public HelloController() {
    }

    public void initialize(){

       booths = new linkedListKillian<vaccinationBooth>();

        patients = new linkedListKillian<Person>();

        appointments = new linkedListKillian<>();

        centre = new linkedListKillian();

    }

    @FXML
    private TextField txtVC;

    @FXML
    private TextField txtpatientname;

    @FXML
    private TextField txtnumber;

    @FXML
    private TextField txtaddress1;

    @FXML
    private TextField txtaddress2;

    @FXML
    private TextField txtEircode;

    @FXML
   private TextField txtpatientpps;


    @FXML
    private TextField txtaccess;

    @FXML
    private TextField txtadd1;

    @FXML
    private TextField txtadd2;

    @FXML
    private TextField txtadd3;

    @FXML
    private TextField txtbatchnum;

    @FXML
    private TextField txtboothid;

    @FXML
    private TextField txtdate;

    @FXML
    private TextField txteir;

    @FXML
    private TextField txtfloor;

    @FXML
    private TextField txtparking;

    @FXML
    private TextField txtpatientID;

    @FXML
    private TextField txtvaccinator;

    @FXML
    private TextField txtvactype;

    @FXML
    private Label welcomeText;

    //@FXML
//    void onHelloButtonClick(ActionEvent event) {
//        System.out.println(txtVC.getText());
//        vaccinationCentre cahir = new vaccinationCentre(txtVC.getText(), "123", "somewhre", 100);
//        addvaccinationCentre(cahir);
//        printvc();
//    }

    public void addvaccinationCentre(vaccinationCentre vc) {
        VaccinationNode node = new VaccinationNode();
        node.setContents(vc);
        node.setNext(HelloApplication.headVC.getNext());
        HelloApplication.headVC.setNext(node);
    }

    public void printvc() {
        VaccinationNode temp = HelloApplication.headVC;
        while (temp != null) {
            System.out.println(temp.getContents());
            temp = temp.getNext();
        }
    }

    @FXML
    void addappoint(ActionEvent event) {

    }
private static linkedListKillian<vaccinationBooth> booths;





    void addbooth(vaccinationBooth booth) {
        booths.addElement(booth);
    }

private @FXML ListView<vaccinationBooth> boothListView;
    public void addBoothDetails(){

        vaccinationBooth booth = new vaccinationBooth(txtboothid.getText(), Integer.parseInt(txtfloor.getText()),txtaccess.getText());

        addbooth(booth);


       // boothListView.getItems().add(booth.toString());
        loadbooths();

    }

    public void loadbooths(){
        boothListView.getItems().clear();
        linkedListKillian.Node currentnode=booths.head;
        while (currentnode!= null){
            boothListView.getItems().add((vaccinationBooth) currentnode.getContents());
            currentnode=currentnode.next;
        }

    }
    @FXML
    void deleteappoint(ActionEvent event) {
        int itemtodelte=appointmentListView.getSelectionModel().getSelectedIndex();
        appointments.delete(itemtodelte);
        loadapp();
        save();
    }
    @FXML
    void chooseappointment(){
        appholder=appointmentListView.getSelectionModel().getSelectedItem();
        txtdate.setText(appholder.getDate());
        txtvactype.setText(appholder.getVacctype());
        txtbatchnum.setText(appholder.getBatch());
        txtvaccinator.setText(appholder.getDocdets());
        txtpatientpps.setText(""+appholder.getPatid());

    }

    @FXML
    void deletebooth(ActionEvent event) {
        int itemtodelte=boothListView.getSelectionModel().getSelectedIndex();
        booths.delete(itemtodelte);
        loadbooths();
        save();
    }
    @FXML
    void choosebooth(){
        boothholder=boothListView.getSelectionModel().getSelectedItem();
        txtboothid.setText(boothholder.getId());
        txtfloor.setText(""+boothholder.getFloor());
        txtaccess.setText(boothholder.getAccess());
    }

    @FXML
    void deletecentre(ActionEvent event) {
        int itemtodelte=vaccinationCentreListView.getSelectionModel().getSelectedIndex();
        centre.delete(itemtodelte);
        loadcentres();
        save();
    }
@FXML
void choosecentre(){
        vcholder=vaccinationCentreListView.getSelectionModel().getSelectedItem();
        txtVC.setText(vcholder.getName());
        txtadd1.setText(vcholder.getAddress1());
        txtadd2.setText(vcholder.getAddress2());
        txtadd3.setText(vcholder.getAddress3);
        txteir.setText(vcholder.getEir());
        txtparking.setText(vcholder.getEir());
}

    @FXML
    void deletepatient(ActionEvent event) {
        int itemtodelte=patientListView.getSelectionModel().getSelectedIndex();
        patients.delete(itemtodelte);
        loadpatient();
        save();
    }
    @FXML
    void choosePerson(){
        personholder=patientListView.getSelectionModel().getSelectedItem();
        txtpatientID.setText(""+personholder.getPps());
        txtpatientname.setText(personholder.getName());
        txtnumber.setText(personholder.getContinfo());
        txtEircode.setText(personholder.getEircode());
        dob.setText(personholder.getDob());
        txtaccess.setText(personholder.getAccessability());
        txtaddress1.setText(personholder.getAddressLine1());
        txtaddress2.setText(personholder.getAddressLine2());
    }


    @FXML
    void updateappoint(ActionEvent event) {
        appholder.updateAppointment(txtbatchnum.getText(),txtdate.getText(), txtvactype.getText(),txtvaccinator.getText(),Integer.parseInt(txtpatientpps.getText()));
        loadapp();
        save();
    }

    @FXML
    void updatebooth(ActionEvent event) {
        boothholder.updatebooth(txtboothid.getText(), Integer.parseInt(txtfloor.getText()),txtaccess.getText());
        loadbooths();
        save();
    }

    @FXML
    void updatecntre(ActionEvent event) {
        vcholder.updatecentre(txtVC.getText(),txtadd1.getText(),txtadd2.getText(), txtadd3.getText(), txteir.getText(),Integer.parseInt(txtparking.getText()));
        loadcentres();
        save();
    }
    @FXML
    void updatepatient(ActionEvent event) {
        personholder.updateperson(Integer.parseInt(txtpatientID.getText()), txtpatientname.getText(), dob.getText(), txtnumber.getText(), txtaccess.getText(), txtEircode.getText(), txtaddress1.getText(), txtaddress2.getText());
        loadpatient();
        save();

    }


    void addpatient(Person patient) {
        patients.addElement(patient);
    }

    private static linkedListKillian<Person> patients;
    private @FXML ListView<Person> patientListView;
    private @FXML TextField dob;
    public void addPatientDetails(){

        Person person = new Person(Integer.parseInt(txtpatientID.getText()),txtpatientname.getText(), dob.getText(),txtnumber.getText(),txtaccess.getText(),txtEircode.getText(),txtaddress1.getText(),txtaddress2.getText());

        addpatient(person);


        //patientListView.getItems().add(person.toString());
        loadpatient();
        save();
    }

    public void loadpatient(){
        patientListView.getItems().clear();
        linkedListKillian.Node currentnode=patients.head;
        while (currentnode!= null){
            patientListView.getItems().add((Person) currentnode.getContents());
            currentnode=currentnode.next;
        }

    }

private  static linkedListKillian appointments;
    void addAppointment(vaccinationAppointment appointment) {
        appointments.addElement(appointment);
    }

    private @FXML ListView<vaccinationAppointment> appointmentListView;

    public void addappointmentDetails(){

        vaccinationAppointment appointment = new vaccinationAppointment(txtbatchnum.getText(),txtdate.getText(), txtvactype.getText(),txtvaccinator.getText(),Integer.parseInt(txtpatientpps.getText()));

        addAppointment(appointment);


        //appointmentListView.getItems().add(appointment.toString());
        loadapp();
        save();
    }
    public void loadapp(){
        appointmentListView.getItems().clear();
        linkedListKillian.Node currentnode=appointments.head;
        while (currentnode!= null){
            appointmentListView.getItems().add((vaccinationAppointment)currentnode.getContents());
            currentnode=currentnode.next;
        }

    }

    private  static linkedListKillian centre;
    void addCentre(vaccinationCentre centres) {
        centre.addElement(centres);
        save();
        loadcentres();
    }

    private @FXML ListView<vaccinationCentre> vaccinationCentreListView;

    public void addCentreDetails(){

        vaccinationCentre centres = new vaccinationCentre(txtVC.getText(),txtadd1.getText(),txtadd2.getText(), txtadd3.getText(), txteir.getText(),Integer.parseInt(txtparking.getText()));

        addCentre(centres);

        //vaccinationCentreListView.getItems().add(centres.toString());
        loadcentres();

    }

public void loadcentres(){
        vaccinationCentreListView.getItems().clear();
        linkedListKillian.Node currentnode=centre.head;
        while (currentnode!= null){
            vaccinationCentreListView.getItems().add((vaccinationCentre) currentnode.getContents());
        currentnode=currentnode.next;
        }

}




    public void save()  {
        try{
        XStream xstream = new XStream(new DomDriver());
        xstream.addPermission(AnyTypePermission.ANY);
        ObjectOutputStream sav = xstream.createObjectOutputStream(new FileWriter("spongebob.xml"));
        sav.writeObject(booths);
        sav.close();

        sav = xstream.createObjectOutputStream(new FileWriter("spongebob2.xml"));
        sav.writeObject(patients);
        sav.close();

        sav = xstream.createObjectOutputStream(new FileWriter("spongebob3.xml"));
        sav.writeObject(appointments);
        sav.close();
        sav = xstream.createObjectOutputStream(new FileWriter("spongebob4.xml"));
        sav.writeObject(centre);
        sav.close();}
        catch(Exception e){
            System.out.println(e);
        }
    }


    public void load(ActionEvent event) throws IOException, ClassNotFoundException {
        XStream xstream = new XStream(new DomDriver());
        xstream.addPermission(AnyTypePermission.ANY);
        ObjectInputStream in = xstream.createObjectInputStream(new FileReader("spongebob.xml"));
        booths = (linkedListKillian<vaccinationBooth>) in.readObject();

        in=  xstream.createObjectInputStream(new FileReader("spongebob2.xml"));
        patients = (linkedListKillian<Person>) in.readObject();

        in=  xstream.createObjectInputStream(new FileReader("spongebob3.xml"));
        appointments = (linkedListKillian) in.readObject();

        in=  xstream.createObjectInputStream(new FileReader("spongebob4.xml"));
        centre = (linkedListKillian) in.readObject();

        //in=  xstream.createObjectInputStream(new FileReader("spongebob4.xml"));

        loadcentres();
        loadpatient();
        loadapp();
        loadbooths();
    }

    public void resetpatients(){
        patients.deleteList(); //backend
        patientListView.getItems().clear(); //front end
    }

    public void resetcenters(){
        centre.deleteList();
        vaccinationCentreListView.getItems().clear();

    }

    public void resetappouintment(){
        appointments.deleteList();
       appointmentListView.getItems().clear();

    }
    public void resetbooth(){
        booths.deleteList();
        boothListView.getItems().clear();

    }

    public void resetsystem(){ //attach to a button
        resetpatients();
        resetcenters();
        resetappouintment();
        resetbooth();


    }



}


