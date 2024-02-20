/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheresteinpapier.Scheresteinpapier;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author Gabriel Kanalga
 */
public class MainController implements Initializable {
    Random rnd = new Random();

  
   public Integer TheRakeValue = 0;
   public Integer OisonValue = 0;
   public Integer SmilusValue = 0;
   public Integer eHand1Value =0;
   public Integer eHand2Value =0;
   public Integer eHand3Value =0;
   public Integer Score =0;
   public Integer eScore =0;
   public int count =0;
   public Boolean hand1;
   public Boolean hand2;
   public Boolean hand3;
   public Boolean hand1use = false;
   public Boolean hand2use = false;
   public Boolean hand3use = false;
   
    
    @FXML
    private ImageView TheRake;
    @FXML
    private ImageView Smilus;
    @FXML
    private ImageView Oison;
    

    @FXML
    private Button btnShuffel;
    @FXML
    private ImageView eHand3;
    @FXML
    private ImageView eHand2;
    @FXML
    private ImageView eHand1;
    @FXML
    private Button btnTheRake;
    @FXML
    private Button btnSmilus;
    @FXML
    private Button btnOison;
    @FXML
    private Label lblScore;
    @FXML
    private Label lbleScore;
    @FXML
    private Label winTextR;
    @FXML
    private Label winTextS;
    @FXML
    private Label winTextO;
    @FXML
    private Button exit;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // TODO
    }    

    
    @FXML
    private void btnshuffel(ActionEvent event) throws FileNotFoundException {
        
           Integer TheRakeChose = rnd.nextInt(3) +1;
           Integer OisonChose = rnd.nextInt(3) +1;
           Integer SmilusChose = rnd.nextInt(3) +1;  
         enemiehand();
         btnOison.setDisable(false);
         btnTheRake.setDisable(false);
         btnSmilus.setDisable(false);
        switch(SmilusChose){
            case 1:
                FileInputStream aa = new FileInputStream("src/Bilder/Schere.png");
                Image aaa = new Image(aa);
                Smilus.setImage(aaa);
                SmilusValue =1;
                break;
          case 2:
                FileInputStream ab = new FileInputStream("src/Bilder/Stone.png");
                Image aab = new Image(ab);
                Smilus.setImage(aab);
                SmilusValue =2;
                break;
          case 3:
                FileInputStream ac = new FileInputStream("src/Bilder/Papier.jpg");
                Image aac = new Image(ac);
                Smilus.setImage(aac);
                SmilusValue = 3;
                break;
        }
         switch(OisonChose){
            case 1:
                FileInputStream aa = new FileInputStream("src/Bilder/Schere.png");
                Image aaa = new Image(aa);
                Oison.setImage(aaa);
                OisonValue = 1;
                break;
          case 2:
                FileInputStream ab = new FileInputStream("src/Bilder/Stone.png");
                Image aab = new Image(ab);
                Oison.setImage(aab);
                OisonValue = 2;
                break;
          case 3:
                FileInputStream ac = new FileInputStream("src/Bilder/Papier.jpg");
                Image aac = new Image(ac);
                Oison.setImage(aac);
                OisonValue = 3;
                break;
        }
         
          switch(TheRakeChose){
            case 1:
                FileInputStream aa = new FileInputStream("src/Bilder/Schere.png");
                Image bbb = new Image(aa);
                TheRake.setImage(bbb);
                TheRakeValue = 1 ;
                break;
          case 2:
                FileInputStream ab = new FileInputStream("src/Bilder/Stone.png");
                Image bbc = new Image(ab);
                TheRake.setImage(bbc);
                TheRakeValue = 2;
                break;
          case 3:
                FileInputStream ac = new FileInputStream("src/Bilder/Papier.jpg");
                Image bba= new Image(ac);
                TheRake.setImage(bba);
                TheRakeValue = 3;
                break;
                
        }
          btnShuffel.setVisible(false);
          winTextR.setText(" ");
        winTextO.setText(" ");
        winTextS.setText(" ");
    }
    public void enemiehand() throws FileNotFoundException{
        Integer eHand1chose = rnd.nextInt(3) +1;
        Integer eHand2chose = rnd.nextInt(3) +1;
        Integer eHand3chose = rnd.nextInt(3) +1;
        FileInputStream EH = new FileInputStream("src/Bilder/Hintergrund.png");
                Image cca= new Image(EH);
                eHand1.setImage(cca);
                eHand2.setImage(cca);
                eHand3.setImage(cca);
                eHand1Value =  eHand1chose;
                eHand2Value = eHand2chose;        
                eHand3Value = eHand3chose;    
    }
    
    
    public void drawhand1() throws FileNotFoundException{
          if(eHand1Value == 1 ){
            FileInputStream aa = new FileInputStream("src/Bilder/Schere.png");
                Image bbb = new Image(aa);
                eHand1.setImage(bbb);
        }
           if(eHand1Value == 2 ){
            FileInputStream aa = new FileInputStream("src/Bilder/Stone.png");
                Image bbb = new Image(aa);
                eHand1.setImage(bbb);
        }
             if(eHand1Value == 3 ){
            FileInputStream aa = new FileInputStream("src/Bilder/Papier.jpg");
                Image bbb = new Image(aa);
                eHand1.setImage(bbb);
        }
    }
    public void drawhand2() throws FileNotFoundException{
        if(eHand2Value == 1 ){
            FileInputStream aa = new FileInputStream("src/Bilder/Schere.png");
                Image bbb = new Image(aa);
                eHand2.setImage(bbb);
        }
          if(eHand2Value == 2 ){
            FileInputStream aa = new FileInputStream("src/Bilder/Stone.png");
                Image bbb = new Image(aa);
                eHand2.setImage(bbb);
        }
             if(eHand2Value == 3 ){
            FileInputStream aa = new FileInputStream("src/Bilder/Papier.jpg");
                Image bbb = new Image(aa);
                eHand2.setImage(bbb);
        }
        
    }
    public void drawhand3() throws FileNotFoundException{
             if(eHand3Value == 1 ){
            FileInputStream aa = new FileInputStream("src/Bilder/Schere.png");
                Image bbb = new Image(aa);
                eHand3.setImage(bbb);
        }        
           
           
          
            if(eHand3Value == 2 ){
            FileInputStream aa = new FileInputStream("src/Bilder/Stone.png");
                Image bbb = new Image(aa);
                eHand3.setImage(bbb);
        }
             
             
                 if(eHand3Value == 3 ){
            FileInputStream aa = new FileInputStream("src/Bilder/Papier.jpg");
                Image bbb = new Image(aa);
                eHand3.setImage(bbb);
        }
        
    }
     @FXML
    private void btnTheRake(ActionEvent event) throws FileNotFoundException {
        btnTheRake.setDisable(true);
        count++;
         Integer r = rnd.nextInt(3) + 1;
        switch(r){
            case 1:
                hand1 = true;
                hand2 = false;
                hand3 = false;
                break;
            case 2:
                 hand1 = false;
                hand2 = true;
                hand3 = false;
                break;
            case 3:
                 hand1 = false;
                hand2 = false;
                hand3 = true;
                break;
        }

        
        if(hand1use == true && hand2use == true &&  hand3use == false){
            hand1 = false;
            hand2 = false;
            hand3 = true;
        }
         if(hand3use == true && hand2use == true &&  hand1use == false){
            hand1 = true;
            hand2 = false;
            hand3 = false;
        }
          if(hand1use == true && hand3use == true && hand2use == false){
            hand1 = false;
            hand2 = true;
            hand3 = false;
        }
          if(hand2use == true && hand3use == false && hand1use == false && hand2 ==true){
            Integer hi = rnd.nextInt(2) +1;
            switch(hi){
                case 1:
                    hand3 = true;
                    hand2 = false;
                    hand1 = false;
                case 2:
                    hand1 = true;
                    hand2 = false;
                    hand3 = false;
                    }
          }
             if(hand1use == true && hand3use == false && hand2use == false && hand1 ==true){
            Integer hu = rnd.nextInt(2) +1;
            switch(hu){
                case 1:
                    hand3 = true;
                    hand2 = false;
                    hand1 = false;
                case 2:
                    hand2 = true;
                    hand1 = false;
                    hand3 = false;
                    }
             }
             if(hand3use == true && hand2use == false && hand1use == false && hand3 == true){
            Integer hk = rnd.nextInt(2) +1;
            switch(hk){
                case 1:
                    hand2 = true;
                    hand1 = false;
                    hand3 = false;
                case 2:
                    hand1 = true;
                    hand2 = false;
                    hand3 = false;
                    }
             }
        if(hand2 ==true ){
            hand2use = true;
            drawhand2();
        if(TheRakeValue == 1){     
            if(eHand2Value == 3  ){
                Score ++;
                lblScore.setText(" " + Score);
                winTextR.setText("Win");
            }else if(eHand2Value == 2){
                eScore ++;
                lbleScore.setText(" " + eScore);
                winTextR.setText("Lose");
            }else{
                winTextR.setText("Undecided");
            }
        }
        
         if(TheRakeValue == 2){
            if(eHand2Value == 1){
                Score ++;
                lblScore.setText(" " + Score);
                winTextR.setText("Win");
            }else if(eHand2Value == 3){
                eScore ++;
                lbleScore.setText(" " + eScore);
                winTextR.setText("Lose");
            }else{
                winTextR.setText("Undecided");
            }
         }  
             if(TheRakeValue == 3){
            if(eHand2Value == 2){
                Score ++;
                lblScore.setText(" " + Score);
                winTextR.setText("Win");
            }else if(eHand2Value == 1){
                eScore ++;
                lbleScore.setText(" " + eScore);
                winTextR.setText("Lose");
            }else{
                winTextR.setText("Undecided");
            }
        }
              }
        
        
        
        
        
        
        
        if(hand1 ==true ){
            hand1use = true;
            drawhand1();
        if(TheRakeValue == 1){     
            if(eHand1Value == 3  ){
                Score ++;
                lblScore.setText(" " + Score);
                winTextR.setText("Win");
            }else if(eHand1Value == 2){
                eScore ++;
                lbleScore.setText(" " + eScore);
                winTextR.setText("Lose");
            }else{
                winTextR.setText("Undecided");
            }
        }
        
         if(TheRakeValue == 2){
            if(eHand1Value == 1){
                Score ++;
                lblScore.setText(" " + Score);
                winTextR.setText("Win");
            }else if(eHand1Value == 3){
                eScore ++;
                lbleScore.setText(" " + eScore);
                winTextR.setText("Lose");
            }else{
                winTextR.setText("Undecided");
            }
         }  
             if(TheRakeValue == 3){
            if(eHand1Value == 2){
                Score ++;
                lblScore.setText(" " + Score);
                winTextR.setText("Win");
            }else if(eHand1Value == 1){
                eScore ++;
                lbleScore.setText(" " + eScore);
                winTextR.setText("Lose");
            }else{
                winTextR.setText("Undecided");
            }
        }
        }
        
        
        
        
        
        
        
          if(hand3 ==true ){
              hand3use = true;
              drawhand3();
        if(TheRakeValue == 1){     
            if(eHand3Value == 3  ){
                Score ++;
                lblScore.setText(" " + Score);
                winTextR.setText("Win");
            }else if(eHand3Value == 2){
                eScore ++;
                lbleScore.setText(" " + eScore);
                winTextR.setText("Lose");
            }else{
                winTextR.setText("Undecided");
            }
        }
        
         if(TheRakeValue == 2){
            if(eHand3Value == 1){
                Score ++;
                lblScore.setText(" " + Score);
                winTextR.setText("Win");
            }else if(eHand3Value == 3){
                eScore ++;
                lbleScore.setText(" " + eScore);
                winTextR.setText("Lose");
            }else{
                winTextR.setText("Undecided");
            }
         }  
             if(TheRakeValue == 3){
            if(eHand3Value == 2){
                Score ++;
                lblScore.setText(" " + Score);
                winTextR.setText("Win");
            }else if(eHand3Value == 1){
                eScore ++;
                lbleScore.setText(" " + eScore);
                winTextR.setText("Lose");
            }else{
                winTextR.setText("Undecided");
            }
        }
        }
     
             restart();
        }
        
        
    

    @FXML
    private void btnSmilus(ActionEvent event) throws FileNotFoundException {
        btnSmilus.setDisable(true);
        count++;
         Integer s = rnd.nextInt(3) + 1;
        switch(s){
            case 1:
                hand1 = true;
                hand2 = false;
                hand3 = false;
                break;
            case 2:
                 hand1 = false;
                hand2 = true;
                hand3 = false;
                break;
            case 3:
                 hand1 = false;
                hand2 = false;
                hand3 = true;
                break;
        }

      
          if(hand1use == true && hand2use == true && hand3use == false ){
            hand1 = false;
            hand2 = false;
            hand3 = true;
        }
         if(hand3use == true && hand2use == true && hand1use == false){
            hand1 = true;
            hand2 = false;
            hand3 = false;
        }
          if(hand1use == true && hand3use == true && hand2use == false){
            hand1 = false;
            hand2 = true;
            hand3 = false;
        }
          if(hand2use == true && hand3use == false && hand1use == false && hand2 ==true){
            Integer ri = rnd.nextInt(2) +1;
            switch(ri){
                case 1:
                    hand3 = true;
                    hand2 = false;
                    hand1 = false;
                case 2:
                    hand1 = true;
                    hand2 = false;
                    hand3 = false;
                    }
          }
             if(hand1use == true && hand3use == false && hand2use == false && hand1 ==true){
            Integer ru = rnd.nextInt(2) +1;
            switch(ru){
                case 1:
                    hand3 = true;
                    hand2 = false;
                    hand1 = false;
                case 2:
                    hand2 = true;
                    hand1 = false;
                    hand3 = false;
                    }
             }
             if(hand3use == true && hand2use == false && hand1use == false && hand3 ==true){
            Integer rk = rnd.nextInt(2) +1;
            switch(rk){
                case 1:
                    hand2 = true;
                    hand1 = false;
                    hand3 = false;
                case 2:
                    hand1 = true;
                    hand2 = false;
                    hand3 = false;
                    }
             }
        
        if(hand2 ==true && hand2use == false){
            drawhand2();
            hand2use = true;
        if(SmilusValue == 1){     
            if(eHand2Value == 3  ){
                Score ++;
                lblScore.setText(" " + Score);
                winTextS.setText("Win");
            }else if(eHand2Value == 2){
                eScore ++;
                lbleScore.setText(" " + eScore);
                winTextS.setText("Lose");
            }else{
                winTextS.setText("Undecided");
            }
        }
        
         if(SmilusValue == 2){
            if(eHand2Value == 1){
                Score ++;
                lblScore.setText(" " + Score);
                winTextS.setText("Win");
            }else if(eHand2Value == 3){
                eScore ++;
                lbleScore.setText(" " + eScore);
                winTextS.setText("Lose");
            }else{
                winTextS.setText("Undecided");
            }
         }  
             if(SmilusValue == 3){
            if(eHand2Value == 2){
                Score ++;
                lblScore.setText(" " + Score);
                winTextS.setText("Win");
            }else if(eHand2Value == 1){
                eScore ++;
                lbleScore.setText(" " + eScore);
                winTextS.setText("Lose");
            }else{
                winTextS.setText("Undecided");
            }
        }
              }
        
        
        
        
        
        
        
        if(hand1 ==true && hand1use == false){
            drawhand1();
            hand1use = true;
        if(SmilusValue == 1){     
            if(eHand1Value == 3  ){
                Score ++;
                lblScore.setText(" " + Score);
                winTextS.setText("Win");
            }else if(eHand1Value == 2){
                eScore ++;
                lbleScore.setText(" " + eScore);
                winTextS.setText("Lose");
            }else{
                winTextS.setText("Undecided");
            }
        }
        
         if(SmilusValue == 2){
            if(eHand1Value == 1){
                Score ++;
                lblScore.setText(" " + Score);
                winTextS.setText("Win");
            }else if(eHand1Value == 3){
                eScore ++;
                lbleScore.setText(" " + eScore);
                winTextS.setText("Lose");
            }else{
                winTextS.setText("Undecided");
            }
         }  
             if(SmilusValue == 3){
            if(eHand1Value == 2){
                Score ++;
                lblScore.setText(" " + Score);
                winTextS.setText("Win");
            }else if(eHand1Value == 1){
                eScore ++;
                lbleScore.setText(" " + eScore);
                winTextS.setText("Lose");
            }else{
                winTextS.setText("Undecided");
            }
        }
        }
        
        
        
        
        
        
        
          if(hand3 ==true && hand3use == false){
              drawhand3();
              hand3use = true;
        if(SmilusValue == 1){     
            if(eHand3Value == 3  ){
                Score ++;
                lblScore.setText(" " + Score);
                winTextS.setText("Win");
            }else if(eHand3Value == 2){
                eScore ++;
                lbleScore.setText(" " + eScore);
                winTextS.setText("Lose");
            }else{
                winTextS.setText("Undecided");
            }
        }
        
         if(SmilusValue == 2){
            if(eHand3Value == 1){
                Score ++;
                lblScore.setText(" " + Score);
                winTextS.setText("Win");
            }else if(eHand3Value == 3){
                eScore ++;
                lbleScore.setText(" " + eScore);
                winTextS.setText("Lose");
            }else{
                winTextS.setText("Undecided");
            }
         }  
             if(SmilusValue == 3){
            if(eHand3Value == 2){
                Score ++;
                lblScore.setText(" " + Score);
                winTextS.setText("Win");
            }else if(eHand3Value == 1){
                eScore ++;
                lbleScore.setText(" " + eScore);
                winTextS.setText("Lose");
            }else{
                winTextS.setText("Undecided");
            }
        }
        }
             
             restart();
        }
    

    @FXML
    private void btnOison(ActionEvent event) throws FileNotFoundException {
        btnOison.setDisable(true);
        Integer i = rnd.nextInt(3) + 1;
                count ++;
        switch(i){
            case 1:
                hand1 = true;
                hand2 = false;
                hand3 = false;
                break;
            case 2:
                 hand1 = false;
                hand2 = true;
                hand3 = false;
                break;
            case 3:
                 hand1 = false;
                hand2 = false;
                hand3 = true;
                break;
        }      
          if(hand1use == true && hand2use == true && hand3use == false) {
            hand1 = false;
            hand2 = false;
            hand3 = true;
        }
         if(hand3use == true && hand2use == true && hand1use == false){
            hand1 = true;
            hand2 = false;
            hand3 = false;
        }
          if(hand1use == true && hand3use == true && hand2use == false){
            hand1 = false;
            hand2 = true;
            hand3 = false;
        }
          
        if(hand2use == true && hand3use == false && hand1use == false && hand2 == true){
            Integer ji = rnd.nextInt(2) +1;
            switch(ji){
                case 1:
                    hand3 = true;
                    hand2 = false;
                    hand1 = false;
                case 2:
                    hand1 = true;
                    hand2 = false;
                    hand3 = false;
                    }
        }
             if(hand1use == true && hand3use == false && hand2use == false && hand1 ==true){
            Integer ju = rnd.nextInt(2) +1;
            switch(ju){
                case 1:
                    hand3 = true;
                    hand2 = false;
                    hand1 = false;
                case 2:
                    hand2 = true;
                    hand1 = false;
                    hand3 = false;
                    }
             }
             if(hand3use == true && hand2use == false && hand1use == false && hand3 ==true){
            Integer jk = rnd.nextInt(2) +1;
            switch(jk){
                case 1:
                    hand2 = true;
                    hand3 = false;
                    hand1 = false;
                case 2:
                    hand1 = true;
                    hand2 = false;
                    hand3 = false;
                    }
             }
        
            
        if(hand2 ==true && hand2use == false){
            hand2use =true;
            drawhand2();
        if(OisonValue == 1){     
            if(eHand2Value == 3  ){
                Score ++;
                lblScore.setText(" " + Score);
                winTextO.setText("Win");
            }else if(eHand2Value == 2){
                eScore ++;
                lbleScore.setText(" " + eScore);
                winTextO.setText("Lose");
            }else{
                winTextO.setText("Undecided");
            }
        }
        
         if(OisonValue == 2){
            if(eHand2Value == 1){
                Score ++;
                lblScore.setText(" " + Score);
                winTextO.setText("Win");
            }else if(eHand2Value == 3){
                eScore ++;
                lbleScore.setText(" " + eScore);
                winTextO.setText("Lose");
            }else{
                winTextO.setText("Undecided");
            }
         }  
             if(OisonValue == 3){
            if(eHand2Value == 2){
                Score ++;
                lblScore.setText(" " + Score);
                winTextO.setText("Win");
            }else if(eHand2Value == 1){
                eScore ++;
                lbleScore.setText(" " + eScore);
                winTextO.setText("Lose");
            }else{
                winTextO.setText("Undecided");
            }
        }
              }
        
        
        
        
        
        
        
        if(hand1 ==true && hand1use == false){
            hand1use =true;
            drawhand1();
        if(OisonValue == 1){     
            if(eHand1Value == 3  ){
                Score ++;
                lblScore.setText(" " + Score);
                winTextO.setText("Win");
            }else if(eHand1Value == 2){
                eScore ++;
                lbleScore.setText(" " + eScore);
                winTextO.setText("Lose");
            }else{
                winTextO.setText("Undecided");
            }
        }
        
         if(OisonValue == 2){
            if(eHand1Value == 1){
                Score ++;
                lblScore.setText(" " + Score);
                winTextO.setText("Win");
            }else if(eHand1Value == 3){
                eScore ++;
                lbleScore.setText(" " + eScore);
                winTextO.setText("Lose");
            }else{
                winTextO.setText("Undecided");
            }
         }  
             if(OisonValue == 3){
            if(eHand1Value == 2){
                Score ++;
                lblScore.setText(" " + Score);
                winTextO.setText("Win");
            }else if(eHand1Value == 1){
                eScore ++;
                lbleScore.setText(" " + eScore);
                winTextO.setText("Lose");
            }else{
                winTextO.setText("Undecided");
            }
        }
        }
        
        
        
        
        
        
        
          if(hand3 ==true && hand3use == false){
              hand3use =true;
              drawhand3();
        if(OisonValue == 1){     
            if(eHand3Value == 3  ){
                Score ++;
                lblScore.setText(" " + Score);
                winTextO.setText("Win");
            }else if(eHand3Value == 2){
                eScore ++;
                lbleScore.setText(" " + eScore);
                winTextO.setText("Lose");
            }else{
                winTextO.setText("Undecided");
            }
        }
        
         if(OisonValue == 2){
            if(eHand3Value == 1){
                Score ++;
                lblScore.setText(" " + Score);
                winTextO.setText("Win");
            }else if(eHand3Value == 3){
                eScore ++;
                lbleScore.setText(" " + eScore);
                winTextO.setText("Lose");
            }else{
                winTextO.setText("Undecided");
            }
         }  
             if(OisonValue == 3){
            if(eHand3Value == 2){
                Score ++;
                lblScore.setText(" " + Score);
                winTextO.setText("Win");
            }else if(eHand3Value == 1){
                eScore ++;
                lbleScore.setText(" " + eScore);
                winTextO.setText("Lose");
            }else{
                winTextO.setText("Undecided");
            }   
        }
        }
          
        
         restart();
    }
    public void restart(){
        if(count == 3){
            btnShuffel.setVisible(true);
            count = 0;
            hand1use = false;
            hand2use = false;
            hand3use = false;
            
        }
    }

    @FXML
    private void exit(ActionEvent event) {
        System.exit(0);
    }

   
}
