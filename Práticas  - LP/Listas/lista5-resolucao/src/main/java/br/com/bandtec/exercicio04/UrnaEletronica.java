package br.com.bandtec.exercicio04;

class UrnaEletronica {
    private String nomeCandidato;
    private Integer votos;
    private static Boolean status = true;
    private static Integer numeroVoto = 0;


    public UrnaEletronica(String nome) {
        this.nomeCandidato = nome;
        this.votos = 0;
    }

    public void registrarVoto(UrnaEletronica urnaEletronica) {
        if (status == true) {
            if (numeroVoto == 0) {
                System.out.println("Começou a eleição:");
            }
            numeroVoto++;
            this.setVotos(this.getVotos() + 1);
            System.out.println(String.format("Candidato %s recebeu 1 voto, totalizando: %d", this.getNomeCandidato(), this.getVotos()));
            System.out.println(String.format("Total de votos: %d", numeroVoto));
        } else {
            System.out.println("Eleição encerrada, novos votos não serão computados");
        }
    }

    public static void encerrarEleicao(UrnaEletronica candidato1, UrnaEletronica candidato2) {
        UrnaEletronica.setStatus(false);
        System.out.println("\nEleição encerrada!");
        System.out.println("------------------------------------------");

        if ((candidato1.getVotos() > candidato2.getVotos())) {
            System.out.println(String.format("Total de votos: %d\n" +
                    "Resultado: Canditado %s venceu!", numeroVoto, candidato1.getNomeCandidato()));
        } else if (candidato2.getVotos() > candidato1.getVotos()) {
            System.out.println(String.format("Total de votos: %d\n" +
                    "Resultado: Canditado %s venceu!", numeroVoto, candidato2.getNomeCandidato()));
        } else {
            System.out.println("Houve um empate!");
        }
    }

    public Integer getVotos() {
        return votos;
    }

    public void setVotos(Integer votos) {
        this.votos = votos;
    }

    public String getNomeCandidato() {
        return nomeCandidato;
    }


    public static void setStatus(Boolean status) {
        UrnaEletronica.status = status;
    }
}