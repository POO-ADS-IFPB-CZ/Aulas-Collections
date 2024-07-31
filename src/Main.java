import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("Ana");

        System.out.println(Collections.frequency(nomes, "João"));
        Collections.shuffle(nomes);
        System.out.println(nomes);
        Collections.sort(nomes);
        System.out.println(nomes);
//        Collections.fill(nomes, "Teste");
//        System.out.println(nomes);

        System.out.println(Collections.min(nomes));
        System.out.println(Collections.max(nomes));

    }
}