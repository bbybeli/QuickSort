import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuickSort {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[] leerArregloDesdeArchivo(String nombre) {
        return new files().fileToIntArray(nombre);
    }

    public static void quickSort(int[] arr, int ini, int fin) {
        if (ini < fin) {
            int piv = particionar(arr, ini, fin);

            System.out.println("Después de particionar con pivote " + arr[piv] + ":");
            imprimirArreglo(arr);

            quickSort(arr, ini, piv - 1);
            quickSort(arr, piv + 1, fin);
        }
    }

    public static int particionar(int[] arr, int ini, int fin) {
        int piv = arr[fin];
        int i = ini - 1;

        System.out.println("\nParticionando de " + ini + " a " + fin + " (pivote = " + piv + ")");

        for (int j = ini; j < fin; j++) {
            if (arr[j] <= piv) {
                i++;
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }

        int t = arr[i + 1];
        arr[i + 1] = arr[fin];
        arr[fin] = t;

        return i + 1;
    }

    public static void imprimirArreglo(int[] arr) {
        for (int n : arr) System.out.print(n + " ");
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        System.out.println("=== QUICK SORT ===\n");

        System.out.print("Nombre del archivo: ");
        String archivo = br.readLine();

        int[] arr = leerArregloDesdeArchivo(archivo);

        if (arr == null || arr.length == 0) {
            System.out.println("Error: No se pudieron leer datos.");
            return;
        }

        System.out.println("\nArreglo original:");
        imprimirArreglo(arr);

        System.out.println("\nOrdenando...");
        quickSort(arr, 0, arr.length - 1);

        System.out.println("\nArreglo final ordenado:");
        imprimirArreglo(arr);
    }
}
