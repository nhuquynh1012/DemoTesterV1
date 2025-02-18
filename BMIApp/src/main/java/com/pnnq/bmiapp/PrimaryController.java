package com.pnnq.bmiapp;

import com.pnnq.service.bmiservice;
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
        double b = bmiservice.tinhBmi(h, w);
        String result;
        if(b==1){
            result = "Gầy";
            this.lblKetQua.setTextFill(Color.RED);            
        }
        else if(b==2){
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
