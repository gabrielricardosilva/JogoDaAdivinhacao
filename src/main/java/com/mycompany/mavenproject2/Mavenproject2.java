
package com.mycompany.mavenproject2;
import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;


public class Mavenproject2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        out.print("Digite um numero de 1 a 10:");
        
        int numeroEntrada = teclado.nextInt();
        int numeroAleatorio = new Random().
                nextInt(10) + 1;
        if(numeroEntrada == numeroAleatorio){
            out.println("**********");
            out.println("Voce vence.*");
            out.println("**********");
        }else {
            out.println("Voce perde");
            out.println("A numero aleatorio era :");
            out.println(numeroAleatorio + ".");
        }
        
        out.println("Obrigado por jogar.");
    }
}
