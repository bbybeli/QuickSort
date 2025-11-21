import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class files {

    private File getFile(String fileName) {
        return new File("C:\\archivos\\" + fileName);
    }

    // Cuenta líneas del archivo
    public int countFileLines(String fileName) {
        File file = getFile(fileName);
        int numLines = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (br.readLine() != null) numLines++;
        } catch (IOException e) {
            System.out.println("Error al contar líneas: " + e);
        }
        return numLines;
    }

    // Convierte archivo en arreglo de enteros
    public int[] fileToIntArray(String fileName) {
        int t = countFileLines(fileName);
        if (t == 0) return null;

        int[] array = new int[t];
        File file = getFile(fileName);
        int i = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                array[i++] = Integer.parseInt(linea.trim());
            }
        } catch (IOException e) {
            System.out.println("Error leyendo archivo: " + e);
        } catch (NumberFormatException e) {
            System.out.println("Error: se esperaban números.");
            return null;
        }
        return array;
    }

    // Convierte archivo en arreglo de strings
    public String[] fileToStringArray(String fileName) {
        int t = countFileLines(fileName);
        if (t == 0) return null;

        String[] array = new String[t];
        File file = getFile(fileName);
        int i = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                array[i++] = linea.trim();
            }
        } catch (IOException e) {
            System.out.println("Error leyendo archivo: " + e);
        }
        return array;
    }
}
