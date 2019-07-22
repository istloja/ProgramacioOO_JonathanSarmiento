package mostrar_archivos;

import java.io.File;

public class ArchivosVideos {

    public static void main(String[] args) {
        File carpeta = new File("E:\\TODODOODODODOD\\NEW\\Nueva carpeta (8)");
        File[] archivos = carpeta.listFiles();
        for (int i = 0; i < archivos.length; i++) {
            System.out.println(archivos[i]);
        }
    }
}