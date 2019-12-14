package co.com.prueba.qvision.util;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class ObtenerArchivo {
    public String getRutaArchivo() {
        String downloadPath = System.getProperty("user.home") + "\\downloads";
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return (name.matches("IN[0-9]+(\\s\\([0-9]+\\))*(\\.pdf)"));
            }
        };
        File files[] = new File(downloadPath).listFiles(filter);
        Arrays.sort(files, (archivo1, archivo2) -> Long.compare(archivo1.lastModified(), archivo2.lastModified()));
        return files[files.length - 1].getAbsolutePath();
    }
}
