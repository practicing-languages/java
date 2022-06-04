package com.company;

import javax.security.auth.callback.LanguageCallback;
import java.awt.*;
import java.lang.module.ResolutionException;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        //EXIBIR IDIOMA DO SISTEMA
        Locale lingua = Locale.getDefault();
        System.out.println("A lingua do sistema é");
        System.out.println(lingua.toString());


        //EXIBIR DATA E HORA DO SISTEMA
        Date data = new Date();
        System.out.println("A hora do sistema é");
        System.out.println(data.toString());


        //EXIBIR A RESOLUÇÃO DO SISTEMA
         Toolkit tol = Toolkit.getDefaultToolkit ();
         Dimension dim = tol.getScreenSize();
         System.out.println("A resolução da sua máquina é: " +dim.width + " x " +dim.height);

    }
}
