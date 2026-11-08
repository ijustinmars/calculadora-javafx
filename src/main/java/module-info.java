module com.galileo.calculadora {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.galileo.calculadora to javafx.fxml;
    exports com.galileo.calculadora;
}