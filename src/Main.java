import java.util.*;

public class Main {
    public static void main(String[] args) {

        Fila fila = new Fila();

        fila.adicionar(new Ficha());
        fila.adicionar(new Ficha());
        fila.adicionar(new Ficha());
        fila.adicionar(new Ficha());
        fila.adicionar(new Ficha());

        System.out.println(fila.verProximo());

        System.out.println(fila.chamarProximo());
        System.out.println(fila.chamarProximo());
        System.out.println(fila.chamarProximo());

    }
}