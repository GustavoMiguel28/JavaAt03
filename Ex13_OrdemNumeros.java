import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*Escreva um programa que lê três números inteiros diferentes e os exibe em ordrescente. Se o usuário digitar
números iguais, seu programa deve exibir uma mensagem de erro e terminar.*/

public class Ex13_OrdemNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> lista_numeros = new ArrayList<Integer>();

        //Recebendo os números inteiros
        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite o " + i + "° número inteiro: ");
            int numero = sc.nextInt();

            lista_numeros.add(numero);
        }
        
        //Verificando se existem valores iguais
        Set<Integer> conjunto = new HashSet<>(lista_numeros);
        int tamanho_conjunto = conjunto.size();

        if (tamanho_conjunto == 3) {
            Collections.sort(lista_numeros);

            for (int numero: lista_numeros) {
                System.out.println(numero);
            }

        } else {
            System.out.println("Erro! Números repetidos foram inseridos!");
        }

        sc.close();
    }
}