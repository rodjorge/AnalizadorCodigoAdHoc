import java.io.File;

public class Main {

    public static void main(String[] args) {
        File vis = new File("./src/main/resources/vis.txt");

        Analizador analizadorVis = new Analizador(vis);

        analizadorVis.analizarCodigo();

        System.out.println("Palabras Vis: "+analizadorVis.getCantidadPalabras());
        System.out.println("Palabras Distintas Vis: "+analizadorVis.getCantidadPalabrasDistintas());
        System.out.println("Palabras en tabla: "+analizadorVis.tablaPalabras());


        File d3 = new File("./src/main/resources/D3.txt");

        Analizador analizadorD3 = new Analizador(d3);

        analizadorD3.analizarCodigo();

        System.out.println("========================================================================");
        System.out.println("Palabras D3: "+analizadorD3.getCantidadPalabras());
        System.out.println("Palabras Distintas D3: "+analizadorD3.getCantidadPalabrasDistintas());
        System.out.println("Palabras en tabla: "+analizadorD3.tablaPalabras());

        File go = new File("./src/main/resources/GoJS.txt");

        Analizador analizadorGo = new Analizador(go);

        analizadorGo.analizarCodigo();

        System.out.println("========================================================================");
        System.out.println("Palabras GoJS: "+analizadorGo.getCantidadPalabras());
        System.out.println("Palabras Distintas GoJS: "+analizadorGo.getCantidadPalabrasDistintas());
        System.out.println("Palabras en tabla: "+analizadorGo.tablaPalabras());


        File cyto = new File("./src/main/resources/Cytoscape.txt");

        Analizador analizadorCyto = new Analizador(cyto);

        analizadorCyto.analizarCodigo();

        System.out.println("========================================================================");
        System.out.println("Palabras en cytoscape: "+analizadorCyto.getCantidadPalabras());
        System.out.println("Palabras Distintas en cytoscape: "+analizadorCyto.getCantidadPalabrasDistintas());
        System.out.println("Palabras en tabla: "+analizadorCyto.tablaPalabras());


    }
}
