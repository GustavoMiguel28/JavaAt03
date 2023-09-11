import java.util.Scanner;

/*9. Escreva um programa que lê duas notas de um estudante, ambas sendo valores reais. O programa deve calcular a
média e exibir um texto para o usuário conforme a tabela a seguir:
média >= 9 - Parabéns, continue assim!
7 <= média < 9 - Aprovado.
6 <= média < 7 - Aprovado no limite, estude um pouco mais.
2 < = média < 6 - Não está aprovado mas ainda pode fazer a segunda época
média < 2 - Reprovado. Nos vemos semestre que vem.*/

public class Ex9_NotaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua primeira nota: ");
        double nota_1 = sc.nextDouble();

        System.out.print("Digite sua segunda nota: ");
        double nota_2 = sc.nextDouble();

        double media = (nota_1 + nota_2) / 2;

        if (media >= 9) {
            System.out.println(String.format("%.2f", media) + " Parabéns, continue assim!");
        } else if ((7 <= media) && (media < 9)) {
            System.out.println(String.format("%.2f", media) + " Aprovado.");
        } else if ((6 <= media) && (media < 7)) {
            System.out.println(String.format("%.2f", media) + " Aprovado no limite, estude um pouco mais.");
        } else if ((2 <= media) && (media < 6)) {
            System.out.println(String.format("%.2f", media) + " Não está aprovado mas ainda pode fazer a segunda época");
        } else if (media < 2) {
            System.out.println(String.format("%.2f", media) + " Reprovado. Nos vemos semestre que vem.");
        }

        sc.close();
    }
}
