package com.devanessacarvalho;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class TelaInicialController {
    @FXML
    private Button play;

    @FXML
    private void play() throws IOException{
        App.setRoot("secondary");
    }

}



