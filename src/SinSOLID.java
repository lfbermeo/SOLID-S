import java.util.ArrayList;
import java.util.List;

public class SinSOLID {
    public static void main(String[] args) {
        // write your code here
        Lista lista = new Lista();
        //Añadiendo articulos
        lista.listaCompras.add("zapatos");
        lista.listaCompras.add("blusas");
        lista.listaCompras.add("camisas");
        lista.listaCompras.add("vestidos");

        //Imprimir lista de compras
        for (String articulo : lista.listaCompras
        ) {
            System.out.println(articulo);
        }

    }

    static class Lista {
        List<String> listaCompras;

        Lista() {
            this.listaCompras = new ArrayList<>();
        }
    }
}
