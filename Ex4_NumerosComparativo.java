import java.util.Scanner;

/*4. Escreva um programa que pede para o usuário inserir dois números, obtém os números do usuário e então imprime
o maior número seguido pelas palavras “é o maior”. Se os números forem iguais, imprime a mensagem “Estes
números são iguais”.*/

public class Ex4_NumerosComparativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        double numero_1 = sc.nextDouble();

        System.out.print("Insira o segundo número: ");
        double numero_2 = sc.nextDouble();

        if (numero_1 > numero_2) {
            System.out.println(numero_1 + " é o maior.");
        } else if (numero_2 > numero_1) {
            System.out.println(numero_2 + " é o maior.");
        } else {
            System.out.println("Estes números são iguais.");
        }

        sc.close();
    }
}