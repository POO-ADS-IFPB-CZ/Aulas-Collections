import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    private Queue<Ficha> fila;

    public Fila(){
        fila = new LinkedList<>();
    }

    public boolean adicionar(Ficha ficha){
        return fila.offer(ficha);
    }

    public Ficha verProximo(){
        return fila.peek();
    }

    public Ficha chamarProximo(){
        return fila.poll();
    }

}