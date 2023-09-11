import java.util.Scanner;

/*7. Faça um programa que lê um valor real, representando o valor de uma peça de roupa. A seguir, o programa deve ler
um inteiro (0, 1 ou 2) os quais representam as seguintes opções:
0 – Compra à vista
1 – Compra parcelada no cartão
2 – Crediário
Na opção 0, o programa deve calcular quanto custa a peça de roupa com 10% de desconto.
Na opção 1, o programa deve perguntar ao usuário quantas parcelas deseja utilizar e exibir o valor da parcela.
Na opção 2, o usuário pagará juros de 10% sobre o valor total. O programa deve ler o número de parcelas
desejado e exibir o valor de cada parcela, que é calculado sobre o valor com juros.
Caso o usuário digite alguma opção diferente de 0, 1 ou 2, o programa deve informar “opção inválida” e
terminar.*/

public class Ex7_CompraRoupa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da Roupa: ");
        double valor = sc.nextDouble();

        System.out.println("Digite o número da opção desejada:");
        System.out.println("0 Compra à vista");
        System.out.println("1 Compra parcelada no cartão");
        System.out.println("2 Crediário");

        int opcao = sc.nextInt();

        double valor_parcela;
        int parcelas;

        switch (opcao) {
            
            case 0:
                valor_parcela = valor * 0.9;
                System.out.println("Valor final: R$" + String.format("%.2f", valor_parcela));
                break;
            
            case 1:
                System.out.print("Em quantas parcelas? ");
                parcelas = sc.nextInt();
                valor_parcela = valor / parcelas;
                System.out.println("Valor final: " + parcelas + " X R$" + String.format("%.2f", valor_parcela));
                break;

            case 2:
                valor = valor * 1.1;
                System.out.print("Em quantas parcelas? ");
                parcelas = sc.nextInt();
                valor_parcela = valor / parcelas;
                System.out.println("Valor final: " + parcelas + " X R$" + String.format("%.2f", valor_parcela));
                break;
            
            default:
                System.out.println("Opção inválida!");
                break;
        }

        sc.close();
    }
}