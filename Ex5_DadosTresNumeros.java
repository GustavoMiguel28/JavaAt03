import java.util.Scanner;

/*5. Escreva um programa que lê três inteiros a partir do teclado e imprime a soma, a média, o produto, o menor e o
maior desses números.*/

public class Ex5_DadosTresNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira três número: ");

        int numero_1 = sc.nextInt();
        int numero_2 = sc.nextInt();
        int numero_3 = sc.nextInt();

        //Soma
        int soma = numero_1 + numero_2 + numero_3;

        //Média
        double media = soma / 3;

        //Produto
        int produto = numero_1 * numero_2 * numero_3;

        //Menor
        int menor;
        if ((numero_1 < numero_2) && (numero_1 < numero_3)) {
            menor = numero_1;
        } else if ((numero_2 < numero_1) && (numero_2 < numero_3)) {
            menor = numero_2;
        } else {
            menor = numero_3;
        }

        //Maior
        int maior;
        if ((numero_1 > numero_2) && (numero_1 > numero_3)) {
            maior = numero_1;
        } else if ((numero_2 > numero_1) && (numero_2 > numero_3)) {
            maior = numero_2;
        } else {
            maior = numero_3;
        }

        System.out.println("Soma = " + soma);
        System.out.println("Média = " + media);
        System.out.println("Produto = " + produto);
        System.out.println("Menor = " + menor);
        System.out.println("Maior = " + maior);

        sc.close();
    }
}