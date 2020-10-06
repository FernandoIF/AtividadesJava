package atividade01;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Operacoes soma = new Operacoes();
        Operacoes subtracao = new Operacoes();
        Operacoes multiplicacao = new Operacoes();
        Operacoes divisao = new Operacoes();
        Operacoes numeroEscolhido = new Operacoes();
        Operacoes menuCalculadora = new Operacoes();
       
        int operacaoEscolhida;
        int novaOperacao = 0;
        
        menuCalculadora.menuCalculadora();
        operacaoEscolhida = input.nextInt();
        
        do {
            
            numeroEscolhido.numeroEscolhido();
            
            switch(operacaoEscolhida){
                case 1: 
                    soma.numeroUm = numeroEscolhido.numeroUm;
                    soma.numeroDois = numeroEscolhido.numeroDois;

                    System.out.println("Resultado: " + soma.soma(soma.numeroUm, soma.numeroDois));
                break;
                
                case 2: 
                    subtracao.numeroUm = numeroEscolhido.numeroUm;
                    subtracao.numeroDois = numeroEscolhido.numeroDois;

                    System.out.println("Resultado: " + subtracao.subtracao(subtracao.numeroUm, subtracao.numeroDois));
                break;

                case 3:
                    multiplicacao.numeroUm = numeroEscolhido.numeroUm;
                    multiplicacao.numeroDois = numeroEscolhido.numeroDois;

                    System.out.println("Resultado: " + multiplicacao.multiplicacao(multiplicacao.numeroUm, multiplicacao.numeroDois));
                break;
                
                case 4:
                    divisao.numeroUm = numeroEscolhido.numeroUm;
                    divisao.numeroDois = numeroEscolhido.numeroDois;

                    System.out.println("Resultado: " + divisao.divisao(divisao.numeroUm, divisao.numeroDois));
                break;
                
                default:
                    System.out.println("Opcao Invalida!");
            
            }
            
            System.out.println("Deseja realizar uma nova operacao?");
            System.out.println("1 - SIM");
            System.out.println("2 - NAO");
            novaOperacao = input.nextInt();            
            
            if(novaOperacao == 1){
              menuCalculadora.menuCalculadora();
              operacaoEscolhida = input.nextInt();
            } else {
                    break;
            }
        }while(operacaoEscolhida > 0 && operacaoEscolhida <= 4);
    }
} 

