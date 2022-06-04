import java.util.Date;

public class Pessoa {
    private String tipoCabelo;
    private String nome;
    private String sobrenome;
    private Date dataNascimento;

    public Pessoa(String tipoCabelo,
                  String nome,
                  String sobrenome,
                  Date dataNascimento) {
        this.tipoCabelo = tipoCabelo;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
    }

    public Pessoa() {
    }

    public String getTipoCabelo() {
        return tipoCabelo;
    }

    public void setTipoCabelo(String tipoCabelo) {
        this.tipoCabelo = tipoCabelo;
    }
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "tipoCabelo='" + tipoCabelo + '\'' +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }


}
