
package com.mycompany.exemplo.aluno;


public class App {
    
    public static void main(String[] args) {
        
        Aluno rafael = new Aluno();
        rafael.nome = "Rafael da Silva Coelho";
        rafael.ra = "01211113";
        rafael.nota1 = 6.7;
        rafael.nota2 = 9.0;
        rafael.media = (rafael.nota1 + rafael.nota2) / 2;
        rafael.qtdFalta = 0;
        
        rafael.vizulizarNotas();
        rafael.vizualizarFaltas();
    }
}
