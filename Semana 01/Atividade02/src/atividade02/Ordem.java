package atividade02;

import java.util.Scanner;

public class Ordem {
    
   int numeroUm;
   int numeroDois;
   int numeroTres;
  
   void recebeNumeros(){
       
       Scanner input = new Scanner(System.in);
       
       System.out.print("Informe o primeiro numero: ");
       this.numeroUm = input.nextInt();
       System.out.print("Informe o segundo numero: ");
       this.numeroDois = input.nextInt();
       System.out.print("Informe o terceiro numero: ");
       this.numeroTres = input.nextInt();
   }
   
   void ordemDecrescente(){
       if(numeroUm > numeroDois && numeroUm > numeroTres){
           if(numeroDois >= numeroTres){
               System.out.println("" + numeroUm + " " + numeroDois + " " + numeroTres);
           } else {
               System.out.println("" + numeroUm + " " + numeroTres + " " + numeroDois);
           }
        } else if(numeroDois > numeroUm && numeroDois > numeroTres){
            if(numeroUm >= numeroTres){
                System.out.println("" + numeroDois + " " + numeroUm + " " + numeroTres);
            } else {
                System.out.println("" + numeroDois + " " + numeroTres + " " + numeroUm);
            }
        } else if(numeroTres > numeroUm && numeroTres > numeroDois){
            if(numeroUm >= numeroDois){
                System.out.println("" + numeroTres + " " + numeroUm + " " + numeroDois);
            } else {
                System.out.println("" + numeroTres + " " + numeroDois + " " +  numeroUm);
            }
        } else {
            System.out.println("Os numeros são iguais!!");
        }
   }

   void ordemCrescente(){
       if(numeroUm < numeroDois && numeroUm < numeroTres){
           if(numeroDois <= numeroTres){
               System.out.println("" + numeroUm + " " + numeroDois + " " + numeroTres);
           } else {
               System.out.println("" + numeroUm + " " + numeroTres + " " + numeroDois);
           }
        } else if(numeroDois < numeroUm && numeroDois < numeroTres){
            if(numeroUm <= numeroTres){
                System.out.println("" + numeroDois + " " + numeroUm + " " + numeroTres);
            } else {
                System.out.println("" + numeroDois + " " + numeroTres + " " + numeroUm);
            }
        } else if(numeroTres < numeroUm && numeroTres < numeroDois){
            if(numeroUm <= numeroDois){
                System.out.println("" + numeroTres + " " + numeroUm + " " + numeroDois);
            } else {
                System.out.println("" + numeroTres + " " + numeroDois + " " + numeroUm);
            }
        } else {
            System.out.println("Os numeros são iguais!!");
        }
   }
   
   void maiorNumero(){
       if(numeroUm > numeroDois && numeroUm > numeroTres)
           System.out.println("O maior numero é: " + numeroUm);
       else if(numeroDois > numeroUm && numeroDois > numeroTres)
           System.out.println("O maior numero é: " + numeroDois);
       else if(numeroTres > numeroUm && numeroTres > numeroDois)
           System.out.println("O maior numero é: " + numeroTres);
   }
}
