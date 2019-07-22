/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mostrar_archivos;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ArchivosEscritorio {

    public static void main(String[] args) {
        //MOSTRAR LOS ARCHIVOS DEL ESCRITORIO
        File carpeta = new File("C:\\Users\\dell\\Desktop");
        String[] archivos = carpeta.list();
        for (int i = 0; i < archivos.length; i++) {
            System.out.println(archivos[i]);
        }
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        System.out.println("Por favor ingrese un numero del 1 al 5:");
        try {
            numero = entrada.nextInt();
        } catch (Exception e) {
            System.out.println("Se ha generado la ecepcion: " + e);
        }
        
        if (numero > 0) {
            System.out.println("Es mayor a cero:" + numero);
        } else {
            System.out.println("No es mayor a cero: " + numero);
        }
        try {
            int resultado = numero / 0;
        } catch (Exception e) {
            System.out.println("No se puede dividir para cero ");
        }
    }
}
