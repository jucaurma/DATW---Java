package EjemplosdeClase;

import java.io.IOException;

public class PruebaArchivo {
    public static void main(String[] args) {
        // Ruta del archivo que se va a gestionar
        String rutaArchivo = "archivoPrueba.txt";
        
        // Crear una instancia del GestorArchivoTexto
        GestorArchivoTexto gestor = new GestorArchivoTexto(rutaArchivo);
        System.out.println(gestor.rutaArchivo);
        
        try {
            // Verificar si el archivo existe
            if (gestor.verificarExistenciaArchivo()) {
                System.out.println("El archivo ya existe.");
            } else {
                System.out.println("El archivo no existe.");
                // Crear el archivo si no existe
                gestor.crearArchivo();
            }
            
            // Escribir texto en el archivo
            gestor.escribirTexto("Hola, este es un texto de prueba.");
            gestor.escribirTexto("Esta es la segunda línea del archivo.");

            // Leer el contenido del archivo
            String contenido = gestor.leerTexto();
            System.out.println("Contenido del archivo:");
            System.out.println(contenido);
            
            // Borrar el archivo
            if (gestor.borrarArchivo()) {
                System.out.println("El archivo ha sido borrado exitosamente.");
            } else {
                System.out.println("No se pudo borrar el archivo.");
            }
            
        } catch (IOException e) {
            System.err.println("Ocurrió un error: " + e.getMessage());
        }
    }
}
