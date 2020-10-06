package atividade02;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
       Ordem ordemDecrescente = new Ordem();
       Ordem ordemCrescente = new Ordem();
       Ordem recebeNumeros = new Ordem();
       Ordem maiorNumero = new Ordem();
       
       recebeNumeros.recebeNumeros();
       
       ordemDecrescente.numeroUm = recebeNumeros.numeroUm;
       ordemDecrescente.numeroDois = recebeNumeros.numeroDois;
       ordemDecrescente.numeroTres = recebeNumeros.numeroTres;
       
       ordemCrescente.numeroUm = recebeNumeros.numeroUm;
       ordemCrescente.numeroDois = recebeNumeros.numeroDois;
       ordemCrescente.numeroTres = recebeNumeros.numeroTres;
       
       maiorNumero.numeroUm = recebeNumeros.numeroUm;
       maiorNumero.numeroDois = recebeNumeros.numeroDois;
       maiorNumero.numeroTres = recebeNumeros.numeroTres;
       
       ordemDecrescente.ordemDecrescente();
       ordemCrescente.ordemCrescente();
       maiorNumero.maiorNumero();
    }    
}
