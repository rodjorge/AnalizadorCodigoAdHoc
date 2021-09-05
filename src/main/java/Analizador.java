import java.io.*;
import java.util.Arrays;
import java.util.Hashtable;

public class Analizador {

    private int cantidadPalabras;
    private int cantidadPalabrasDistintas;
    private final File archivo;
    private final Hashtable<String, Integer> tablaPalabras = new Hashtable<String, Integer>();

    public Analizador(File archivo)
    {
        this.cantidadPalabras = 0;
        this.cantidadPalabrasDistintas = 0;
        this.archivo = archivo;
    }

    public void analizarCodigo()
    {
        try(BufferedReader br = new BufferedReader(new FileReader(archivo)))
        {
            String linea;
            while((linea = br.readLine()) != null)
            {
                String[] palabras = linea.split("\\W");
                Arrays.stream(palabras)
                        .map(String::toLowerCase)
                        .filter(palabra -> palabra.length()>0)
                        .forEach(this::incrementarOAgregar);
            }
            cantidadPalabrasDistintas = tablaPalabras.size();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void incrementarOAgregar(String palabra)
    {
        cantidadPalabras++;
        if(tablaPalabras.contains(palabra))
        {
            tablaPalabras.put(palabra, tablaPalabras.get(palabra)+1);
            return;
        }
        tablaPalabras.put(palabra, 1);
    }

    public int getCantidadPalabras() {
        return cantidadPalabras;
    }

    public int getCantidadPalabrasDistintas(){
        return cantidadPalabrasDistintas;
    }

    public String tablaPalabras()
    {
        StringBuilder sb = new StringBuilder();
        for(String palabra : tablaPalabras.keySet())
        {
            sb.append(palabra);
            sb.append(" - ");
        }

        return sb.substring(0, sb.length()-3);
    }
}
