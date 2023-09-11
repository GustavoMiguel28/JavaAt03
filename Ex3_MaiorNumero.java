import java.util.Scanner;

/*3. Escreva um programa que faz a leitura de 2 números inteiros. Caso o primeiro seja maior do que o segundo, o
programa imprime “primeiro maior do que o segundo”. Caso contrário, o programa imprime “segundo maior do que o
primeiro”.*/

public class Ex3_MaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero_1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero_2 = sc.nextInt();

        if (numero_1 > numero_2) {
            System.out.println("Primeiro maior do que o segundo!");
        } else if (numero_2 > numero_1) {
            System.out.println("Segundo maior do que o primeiro!");
        }

        sc.close();
    }
}