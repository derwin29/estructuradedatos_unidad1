/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuradatos_unidad1;
import java.util.Scanner;

/**
 *
 * @author DERWIN
 */
public class ej_5 {

    static Object[][] lenguajes = new Object[5][8];

    public static void main(String[] args) {
        lenguajes[0] = new Object[]{"NOMBRE", "AÑO", "AUTOR", "DETALLES", "FRAMEWORKS"};

        infoLenguajes();

        boolean info[] = {true, false, true, true, false};
        mostrarInfoLenguajes(info);
        
               System.out.println("Datos ingresados correctamente.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de un lenguaje:");
        String nombreLenguaje = scanner.nextLine();

        boolean encontrado = verificarLenguaje(nombreLenguaje);
        System.out.println("El lenguaje " + nombreLenguaje + " está en la matriz: " + encontrado);

        int[] coordenadas = coordenadasLenguaje(nombreLenguaje);
        if (coordenadas != null) {
            System.out.println("El lenguaje " + nombreLenguaje + " se encuentra en la fila " + coordenadas[0] +
                    " y columna " + coordenadas[1]);
        } else {
            System.out.println("El lenguaje " + nombreLenguaje + " no se encuentra en la matriz.");
        }

        System.out.println("Ingrese el número de fila para obtener el registro completo:");
        int fila = scanner.nextInt();
        try {
            Object[] registro = obtenerRegistro(fila);
            System.out.println("Registro completo de la fila " + fila + ":");
            for (Object dato : registro) {
                System.out.print(dato + " ");
            }
            System.out.println();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Ingrese el número de columna para obtener los datos:");
        int columna = scanner.nextInt();
        try {
            Object[] datosColumna = obtenerColumna(columna);
            System.out.println("Datos de la columna " + columna + ":");
            for (Object dato : datosColumna) {
                System.out.println(dato);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Ingrese las coordenadas (fila y columna) para obtener el valor y el registro:");
        int filaCoord = scanner.nextInt();
        int columnaCoord = scanner.nextInt();
        try {
            Object[] valorRegistro = obtenerValorRegistro(filaCoord, columnaCoord);
            System.out.println("Valor en las coordenadas (" + filaCoord + ", " + columnaCoord + "): " + valorRegistro[0]);
            System.out.println("Registro completo en las coordenadas (" + filaCoord + ", " + columnaCoord + "):");
            for (Object dato : (Object[]) valorRegistro[1]) {
                System.out.print(dato + " ");
            }
            System.out.println();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        
        
    }

    public static void infoLenguajes() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < lenguajes.length; i++) {
            System.out.println("Ingrese los datos del lenguaje en la fila " + (i + 1) + ":");
            for (int j = 0; j < lenguajes[i].length; j++) {
                lenguajes[i][j] = scanner.nextLine();
            }
        }
    }

    public static boolean verificarLenguaje(String nombreLenguaje) {
        for (Object[] fila : lenguajes) {
            if (fila[0].equals(nombreLenguaje)) {
                return true;
            }
        }
        return false;
    }

    public static int[] coordenadasLenguaje(String nombreLenguaje) {
        for (int i = 0; i < lenguajes.length; i++) {
            if (lenguajes[i][0].equals(nombreLenguaje)) {
                return new int[]{i, 0};
            }
        }
        return null;
    }

    public static Object[] obtenerRegistro(int fila) {
        if (fila < 1 || fila >= lenguajes.length) {
            throw new IllegalArgumentException("La fila está errada.");
        }
        return lenguajes[fila];
    }

    public static Object[] obtenerColumna(int columna) {
        if (columna < 0 || columna >= lenguajes[0].length) {
            throw new IllegalArgumentException("La columna está errada.");
        }
        Object[] datosColumna = new Object[lenguajes.length];
        for (int i = 0; i < lenguajes.length; i++) {
            datosColumna[i] = lenguajes[i][columna];
        }
        return datosColumna;
    }

    public static Object[] obtenerValorRegistro(int fila, int columna) {
        if (fila < 1 || fila >= lenguajes.length || columna < 0 || columna >= lenguajes[0].length) {
            throw new IllegalArgumentException("Las coordenadas están erradas.");
        }
        return new Object[]{lenguajes[fila][columna], lenguajes[fila]};
    }

    public static void mostrarInfoLenguajes(boolean[] info) {
        for (int i = 1; i < lenguajes.length; i++) {
            if (info[0]) {
                System.out.print(lenguajes[i][0] + " ");
            }
            if (info[1]) {
                System.out.print(lenguajes[i][2] + " ");
            }
            if (info[2]) {
                System.out.print(lenguajes[i][4] + " ");
            }
            System.out.println();
        }
    }
}