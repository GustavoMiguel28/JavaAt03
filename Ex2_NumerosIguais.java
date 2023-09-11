import java.util.Scanner;

/*2. Escreva um programa que faz a leitura de dois números reais e verifica se eles são iguais. Se forem, o programa
deve mostrar uma mensagem ao usuário informando-o disso. Caso contrário, o programa somente termina.*/

public class Ex2_NumerosIguais {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero_1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero_2 = sc.nextDouble();

        if (numero_1 == numero_2) {
            System.out.println("Os números são iguais!");
        }

        sc.close();

    }
}