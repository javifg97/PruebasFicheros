package Ficheros;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class InformacionFichero {
	public static void main(String args[]) throws IOException {
		if (args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				File f = new File("Prueba.txt");
				System.out.println("Nombre: " + f.getName());
				System.out.println("Camino: " + f.getPath());
				System.out.println("Ruta absoluta : " + f.getAbsolutePath());
				System.out.println("Ruta absoluta canonica: " + f.getCanonicalPath());
				System.out.println("Modificado: " + new Date(f.lastModified()));
				if (f.exists()) {
					System.out.print("Fichero existente ");
					System.out.print((f.canRead() ? "y se puede Leer" : ""));
					System.out.print((f.canWrite() ? "se puede Escribir" : ""));
					System.out.println(".");
					System.out.println("La longitud del fichero son " + f.length() + " bytes");
				} else
					System.out.println("El fichero no existe.");
			}
		} else
			System.out.println("Debe indicar un fichero.");
	}

}
