package com.galileo.calculadora;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField txtOperador1;

    @FXML
    private TextField txtOperador2;

    @FXML
    private ComboBox<String> cmbOpciones;

    @FXML
    private Label lblResultado;

    @FXML
    public void initialize(){
        cmbOpciones.getItems().addAll(
          "Suma", "Resta", "Multiplicación", "División"
        );
    }

    @FXML
    private void calcular(){
        try {
            double num1 = Double.parseDouble(txtOperador1.getText());

            double num2 = Double.parseDouble(txtOperador2.getText());

            double resultado = 0;

            String operacion = cmbOpciones.getValue();

            switch (operacion){
                case "Suma":
                    resultado = num1 + num2;
                    break;
                case "Resta":
                    resultado = num1 - num2;
                    break;
                case "Multiplicación":
                    resultado = num1 * num2;
                    break;
                case "División":
                    if(num2 == 0){
                        lblResultado.setText("No puede dividir dentro de 0");
                        return;
                    }else {
                        resultado = num1 / num2;
                    }
                    break;
            }

            lblResultado.setText(String.format("%.2f", resultado));

        }catch (NumberFormatException e){
            lblResultado.setText("Ingrese números válidos");
        }
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Calculadora");
    }
}
