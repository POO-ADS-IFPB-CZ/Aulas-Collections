import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("111.111.111-01", "João"));
        pessoas.add(new Pessoa("222.222.222-02", "Maria"));
        pessoas.add(0, new Pessoa("333.333.333-03", "Pedro"));
        pessoas.add(3, new Pessoa("444.444.444-04", "Ana"));

        System.out.println(pessoas);

    }
}