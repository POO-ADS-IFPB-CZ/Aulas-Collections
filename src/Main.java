import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Queue<Pessoa> fila = new LinkedList<>();

        fila.offer(new Pessoa("111.111.111-01", "João"));
        fila.offer(new Pessoa("222.222.222-02", "Maria"));
        fila.offer(new Pessoa("333.333.333-03", "Pedro"));

        //Retorna mas não remove
        System.out.println("Próximo da fila"+fila.peek());

        System.out.println(fila.poll());

        System.out.println(fila);

    }
}