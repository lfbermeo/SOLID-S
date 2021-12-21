import me.grupo1.clases.ListaCompras;

public class ConSOLID {
    public static void main(String[] args) {
        ListaCompras listaCompras = new ListaCompras();

        listaCompras.addArticulo("sueter");
        listaCompras.addArticulo("zapatos");
        listaCompras.addArticulo("camisas");
        listaCompras.addArticulo("vestidos");

        System.out.println(listaCompras);
    }
}
