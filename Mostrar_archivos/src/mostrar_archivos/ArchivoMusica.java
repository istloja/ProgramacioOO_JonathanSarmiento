/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mostrar_archivos;

import java.io.File;

public class ArchivoMusica {

    public static void main(String[] args) {
        File carpeta = new File("E:\\Descargas\\Music");
        File[] archivos = carpeta.listFiles();
        for (int i = 0; i < archivos.length; i++) {
            System.out.println(archivos[i]);
        }
    }
}
