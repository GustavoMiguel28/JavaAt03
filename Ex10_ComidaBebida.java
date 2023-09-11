import java.util.Scanner;

/*10. Escreva um programa que oferece para o usuário as seguintes opções:
1 – Misto quente R$5,50
2 – Salada Chinesa R$10,20
3 – Suco de Laranja R$4,00
4 – Suco de Manga R$3,50
Se o usuário digitar qualquer número diferente de 1, 2, 3 ou 4, o seu programa deve exibir uma mensagem de erro e
terminar. Caso contrário, se o usuário escolher alguma bebida, o programa deve exibir “tenha um excelente drink, vai
lhe custar” seguido do valor da bebida. Se o usuário escolher alguma comida, o programa deve exibir “bom apetite,
vai lhe custar” seguido do valor da comida.*/

public class Ex10_ComidaBebida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Realize seu pedido!");
        System.out.println("1 Misto quente R$5,50");
        System.out.println("2 Salada Chinesa R$10,20");
        System.out.println("3 Suco de Laranja R$4,00");
        System.out.println("4 Suco de Manga R$3,50");
        int num_pedido = sc.nextInt();

        switch (num_pedido) {
            case 1:
                System.out.print("Bom apetite, vai lhe custar R$5,50.");
                break;
            
            case 2:
                System.out.print("Bom apetite, vai lhe custar R$10,20.");
                break;
            
            case 3:
                System.out.print("tenha um excelente drink, vai lhe custar R$4,00");
                break;

            case 4:
                System.out.print("tenha um excelente drink, vai lhe custar R$3,50");
                break;

            default:
                System.out.print("Valor inválido, insira algum número entre 1 e 4.");
                break;
        }

        sc.close();
    }
}
