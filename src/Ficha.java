import java.time.LocalDateTime;
import java.util.Random;

public class Ficha {

    private final int numero;
    private final LocalDateTime dataEHora;

    public Ficha(){
        //TODO: Atualizar para usar UUID
        Random random = new Random();
        numero = random.nextInt();
        dataEHora = LocalDateTime.now();
    }

    public int getNumero() {
        return numero;
    }

    public LocalDateTime getDataEHora() {
        return dataEHora;
    }

    @Override
    public String toString() {
        return "Ficha{" +
                "numero=" + numero +
                ", dataEHora=" + dataEHora +
                '}';
    }
}
