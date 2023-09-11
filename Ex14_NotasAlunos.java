import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*14. Escreva um programa que lê as notas de 10 alunos e calcula a média aritmética delas. Caso a média seja pelo
menos 6, o programa deve exibir a quantidade de alunos que tiveram nota maior do que 8. Caso contrário, o programa
deve exibir a quantidade de alunos que tiraram nota 0.*/

public class Ex14_NotasAlunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Double> lista_notas = new ArrayList<Double>();

        //Recebendo as notas
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite a " + i + "° nota: ");
            double nota = sc.nextDouble();

            lista_notas.add(nota);
        }

        //Calculando a média
        double soma_notas = 0;
        for (double nota: lista_notas) {
            soma_notas += nota;
        }

        double media = soma_notas / 10;
        
        if (media >= 6) {
            int notas_maior_que_8 = 0;
            for (double nota: lista_notas) {
                if (nota > 8) {
                    notas_maior_que_8 ++;
                }
            }

            System.out.println("Notas maiores que 8: " + notas_maior_que_8);
        } else {
            int notas_igual_a_0 = 0;
            for (double nota: lista_notas) {
                if (nota == 0) {
                    notas_igual_a_0 ++;
                }
            }
            System.out.println("Notas igual a 0: " + notas_igual_a_0);
        }

        sc.close();
    }
}