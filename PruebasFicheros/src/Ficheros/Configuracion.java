package Ficheros;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Configuracion {
	public static void main(String[] args) {
		int i;
		File config = new File("Prueba.txt");
		System.out.println(config.getAbsolutePath());
		if (config.exists()) {
			try {
				InputStream mifichero = new FileInputStream(config);
				i = mifichero.read();
				while (i != -1) {
					if (i == '\n')
						System.out.print("--Salto de línea--");
					System.out.print((char) i);
					i = mifichero.read();
				}
			} catch (IOException e) {
				System.out.print("Error de Entrada/Salida");
			}
		} else
			System.out.println("El fichero no existe");
	}
}
