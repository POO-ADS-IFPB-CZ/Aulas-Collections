import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Pessoa> conjunto = new HashSet<>();

        conjunto.add(new Pessoa("222.222.222-02", "Maria"));
        conjunto.add(new Pessoa("333.333.333-03", "Pedro"));
        conjunto.add(new Pessoa("111.111.111-01", "João"));

        //Não pode ter repetição - Retorna false.
        conjunto.add(new Pessoa("111.111.111-01", "João"));

        System.out.println(conjunto.contains(
                new Pessoa("111.111.111-01", "João")));

    }
}