package com.pnnq.bmiapp;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
<<<<<<< HEAD
        int a= 0;
        if(a<0){
                App.setRoot("secondary");
=======
        int a=0;
        if(a<0&&a%2==0){
        App.setRoot("secondary");
>>>>>>> main
        }
    }
}
