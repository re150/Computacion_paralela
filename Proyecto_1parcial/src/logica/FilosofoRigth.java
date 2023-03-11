/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author angel
 */
public class FilosofoRigth  extends Thread{
    private int number;
    private Fork forkLeft;
    private Fork forkRight;
    private JLabel pensar, eat,ten,show1,show2,show3 ;
    
    public FilosofoRigth(Fork izq, Fork der, int num, JLabel pensar, JLabel eat, JLabel ten, JLabel S1, JLabel S2, JLabel S3) {
        forkLeft = izq;
        forkRight = der;
        this.number = num;
        this.pensar = pensar;
        this.eat = eat;
        this.ten = ten;
         this.show1 = S1;
        this.show2 = S2;
        this.show3 = S3;
        
        
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
                
     
              this.estaso("rigth fork OK");
        //    ten.setVisible(true);
             try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
             ex.printStackTrace();
            }
          //   ten.setVisible(false);

            
              this.estaso("eating");
            eat.setVisible(true);
             try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
             ex.printStackTrace();            
           }
             eat.setVisible(false);
             
             
               forkRight.increase();
           // ten.setVisible(true);
                this.estaso("rigth fork OK");
             try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
             ex.printStackTrace();
          //   ten.setVisible(false);
            }
            
           //   ten.setVisible(true);
                 this.estaso("left fork OK");
             try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
             ex.printStackTrace();
            }
           // ten.setVisible(false);
            
            
             pensar.setVisible(true);
             this.estaso("thinking");
             try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
             ex.printStackTrace();
            }
            
              pensar.setVisible(false);
            
            
            

        }
    }
    
     public void estaso (String x) 
     {
         String aux1 = show3.getText();
         String aux2 = show2.getText();
          
        show3.setText(x);
        show2.setText(aux2);
        show1.setText(aux1);
        
     }
     
}
