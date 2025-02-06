package com.pnnq.bmiapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class PrimaryController {
    @FXML private TextField txtHeight;
    @FXML private TextField txtWeight;
    @FXML private Label lblKetQua;
    
    public void tinhCanNang(ActionEvent Evt){
        double h =Double.parseDouble(this.txtHeight.getText());
        double w = Double.parseDouble(this.txtWeight.getText());
        double bmi = w/Math.pow(h, 2);
        String result;
        if(bmi<18.5){
            result = "Gầy";
            this.lblKetQua.setTextFill(Color.RED);            
        }
        else if(bmi<25){
            result = "Bình Thường";
            this.lblKetQua.setTextFill(Color.GREEN);
        }
        else{
            result= "Béo Phì";
            this.lblKetQua.setTextFill(Color.YELLOW);
        }
        
        this.lblKetQua.setText(result);
    }
}
