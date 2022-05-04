module killianhalpin.killianassignment {
    requires javafx.controls;
    requires javafx.fxml;

    requires xstream;



    opens killianhalpin.killianassignment to javafx.fxml , xstream;
    opens killianhalpin.killianassignment.ADT to javafx.fxml , xstream;
    opens killianhalpin.killianassignment.DataStructure to javafx.fxml , xstream;


    exports killianhalpin.killianassignment;
    exports killianhalpin.killianassignment.ADT;
    exports killianhalpin.killianassignment.DataStructure;


}