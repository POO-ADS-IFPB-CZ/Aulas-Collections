import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();

        //CREATE
        pessoas.add(new Pessoa("111.111.111-01", "João"));
        pessoas.add(new Pessoa("222.222.222-02", "Maria"));
        pessoas.add(0, new Pessoa("333.333.333-03", "Pedro"));
        pessoas.add(3, new Pessoa("444.444.444-04", "Ana"));

        //DELETE
//        pessoas.remove(0);
//        pessoas.remove(new Pessoa("111.111.111-01", "João"));

        //UPDATE
        pessoas.set(0, new Pessoa("555.555.555-05", "José"));

        //READ
        System.out.println(pessoas);

        //Retornando de um índice específico
        for(int i=0; i<pessoas.size(); i++){
            System.out.println(pessoas.get(i));
        }

        //Usando o for aprimorado
        for(Pessoa p : pessoas){
            System.out.println(p);
        }

    }
}