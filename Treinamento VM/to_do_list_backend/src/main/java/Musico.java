import java.util.Date;

public class Musico extends Pessoa {
    private String instrumento;

    public Musico(String tipoCabelo,
                  String nome,
                  String sobrenome,
                  Date dataNascimento,
                  String instrumento) {

        super(tipoCabelo, nome, sobrenome, dataNascimento);
        this.instrumento = instrumento;
    }


    @Override
    public String toString() {
        return "Musico{" +
                "instrumento='" + instrumento + '\'' +
                '}';
    }
}