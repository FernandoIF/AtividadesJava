package atividade03;

import java.util.Scanner;

public class Numeros {
   
    int fibonacci(int numeroFibo){
       return (numeroFibo < 2) ? numeroFibo : fibonacci(numeroFibo - 1) + fibonacci(numeroFibo - 2); 
    } 
    
    void imprimeFibonacci(){
       for(int i = 0; i < 50; i++){
          System.out.println("("+ i +")" + fibonacci(i));
        }
    }
    
    void Piramide(){
        
        int numeroRecebido;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe um numero: ");
        numeroRecebido = input.nextInt();
        
        for(int i = 0; i <= numeroRecebido; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" " + i);
            }
            System.out.println("\n");
        }
    }
}
