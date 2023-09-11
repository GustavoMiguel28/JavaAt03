import java.util.Scanner;

/*11. Faça um programa que lê os seguintes dados:
- código de estado (um inteiro de 1 a 5)
- valor inicial de carga
Seu programa deve calcular qual o valor final de uma carga de acordo com as seguintes regras.
Caso o código de estado seja 2 ou 5 o valor final da carga é o valor inicial menos 12%.
Caso o código de estado seja 1, 3 ou 4, o valor final da carga é o valor inicial menos 15%.*/

public class Ex11_CargaEstado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Código do estado: ");
        int cod_estado = sc.nextInt();

        System.out.print("Valor inicial da carga: R$");
        double valor_inicial = sc.nextDouble();

        double valor_final;

        switch (cod_estado) {
            case 1:
                valor_final = valor_inicial - (valor_inicial * 0.15);
                System.out.print("Valor final: R$" + String.format("%.2f", valor_final));
                break;
            
            case 2:
                valor_final = valor_inicial - (valor_inicial * 0.12);
                System.out.print("Valor final: R$" + String.format("%.2f", valor_final));
                break;

            case 3:
                valor_final = valor_inicial - (valor_inicial * 0.15);
                System.out.print("Valor final: R$" + String.format("%.2f", valor_final));
                break;

            case 4:
                valor_final = valor_inicial - (valor_inicial * 0.15);
                System.out.print("Valor final: R$" + String.format("%.2f", valor_final));
                break;

            case 5:
                valor_final = valor_inicial - (valor_inicial * 0.12);
                System.out.print("Valor final: R$" + String.format("%.2f", valor_final));
                break;
        }

        sc.close();
    }
}
