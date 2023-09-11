import java.util.Scanner;

/*1. Escreva um programa que faz a leitura de um número inteiro e um número real. Caso o número inteiro seja menor
do que o número real, o programa deve imprimir uma mensagem dizendo isso ao usuário. Caso contrário, o programa
somente termina.*/

public class Ex1_NumeroInteiroReal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numeroInteiro = sc.nextInt();

        System.out.print("Digite um número real: ");
        double numeroReal = sc.nextDouble();

        if (numeroInteiro < numeroReal) {
            System.out.println("O número inteiro é menor do que o número real.");
        }

        sc.close();
    }
}