/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;
import paquete1.Mensaje;
import paquete3.Informacion;

/**
 *
 * @author reroes
 */
public class Demo002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String mensaje = Mensaje.obtenerMensaje();
        int habitantes = Informacion.obtenerHabitantes();
        String cadena = String.format("%scon %d\n", mensaje, habitantes);
        // Despues de llamar a las funciones procedo a guardarlas en una cadena
        // acumuladora para poder imprimir de mejor manera
        
        int r;
        System.out.println("Digite del 1 al 5 si desea el mensaje original");
        r = entrada.nextInt();
        // Pregunte al usuario para ingresar por teclado algun valor
        if (r <= 5 && r > 0) {
            // comparo las posibles respuestas del usuario
            System.out.printf("%s", cadena);
        } else {
            System.out.printf("%s", cadena.toUpperCase());
        }

    }

}
