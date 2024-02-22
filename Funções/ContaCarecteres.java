package Funções;
import java.util.*;
public class ContaCarecteres {
    public static void main(String[] args) {
        String texto = "Uma frase qualquer";
        char caracter = 'a';
        int contador = 0;

    for (int i = 0; i < texto.length(); i++) {
         if (texto.charAt(i) == caracter) {
            contador++;
         }
        }
       System.out.println("O caracter " + caracter + " aparece " + contador + "vezes");
    }
    }
    
