package com.mycompany.lista1q1;

import java.util.Scanner;
public class Lista1q1 {

    public static void main(String[] args) {
        int a, b;
         Scanner numero;
         numero = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        a = numero.nextInt();
        
        b = 2;
        
        if(a % b == 0){
            System.out.println("A é PAR!");
        }
        else{
            System.out.println("A é ÍMPAR");
        }
    }
}
