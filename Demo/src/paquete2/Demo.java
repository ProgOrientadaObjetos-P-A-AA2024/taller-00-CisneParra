/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.Mensaje;
import paquete3.Informacion;

/**
 *
 * @author reroes
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.printf("%scon %d\n",Mensaje.obtenerMensaje()
                ,Informacion.obtenerHabitantes());
        // Despues de importar los paquetes con sus respectivas clases procedí
        // a llamar a las funciones correspondientes formando el mensaje que 
        // nos pide la orden imprimiendo en el proceso con un printf.
        
    }
    
}
