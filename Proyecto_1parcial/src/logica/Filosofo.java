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
import java.util.Random;


/**
 *
 * @author angel
 */
public class Filosofo  extends Thread{
    private int number;
    private Fork forkLeft;
    private Fork forkRight;
    private JLabel pensar, eat,con,show1,show2,show3,eat2;
    
    public Filosofo(Fork izq, Fork der, int num, JLabel pensar, JLabel eat, JLabel con, JLabel S1, JLabel S2, JLabel S3,JLabel eatf) {
        forkLeft = izq;
        forkRight = der;
        this.number = num;
        this.pensar = pensar;
        this.eat = eat;
        this.eat2 = eatf;
        this.con = con;
        this.show1 = S1;
        this.show2 = S2;
        this.show3 = S3;
        
        
    }

    public void run() 
    {
    
      boolean estado = true;
      /*  for (int i = 1; i <= 3; i++) {   
                 if ( i == 3){
            i = 1;
          }
              this.estaso("rigth fork OK");
        //    ten.setVisible(true);
             try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
             ex.printStackTrace();
            }
          //   ten.setVisible(false);
                this.estaso("rigth fork OK");
             try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
             ex.printStackTrace();
            }
            
         
                 this.estaso("left fork OK");
             try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
             ex.printStackTrace();
        }
        }*/
      
      while(estado = true) 
      {
      
       synchronized(forkLeft){  
           synchronized(this.forkRight){  
               eat();
            } 
        }
        thinking();
      }
      
    }
    
    
    public void eat()
    {
        
          forkRight.increase();
         this.estado("eating");
            contador ();
            eat.setVisible(true);
            eat2.setVisible(true);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
             ex.printStackTrace();
            }
             eat.setVisible(false);
              eat2.setVisible(false);
    
    }
    
    public void thinking() 
    {
       
        
             forkRight.increase();
             pensar.setVisible(true);
             this.estado("thinking");
             try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
             ex.printStackTrace();
            }
            
              pensar.setVisible(false);
    
    }
    
     public void estado (String x) 
     {
         String aux1 = show3.getText();
         String aux2 = show2.getText();
          
        show3.setText(x);
        show2.setText(aux1);
        show1.setText(aux2);
        
     }
     
     
     public void contador () 
     {
 
      String aux;
      int  contar = 0;
    
      contar = Integer.parseInt(con.getText());
      contar = contar +1;
      aux =Integer.toString(contar);
      
      con.setText(aux);
      
     }
     
}
