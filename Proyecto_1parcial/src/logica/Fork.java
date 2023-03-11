/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author angel
 */

public class Fork {
      private int valor = 1;

    public Fork() {
        valor = 1;
    }

    synchronized void decrease() {
        while (valor <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        valor--;
    }

    synchronized void increase() {
        valor++;
        notify();
    }

    public int Valor() {
        return valor;
    }
}

