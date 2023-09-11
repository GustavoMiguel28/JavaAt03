import java.util.Scanner;

/*6. Escreva um programa que lê dois valores reais. O primeiro valor é o saldo de uma conta bancária e o segundo é um
valor que o usuário deseja sacar desta conta. Caso seja possível efetuar o saque (ou seja, o saldo não fique negativo), o
programa deve mostrar o saldo remanescente. Caso contrário, deve informar o usuário que não foi possível realizar o
saque.*/

public class Ex6_ContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o saldo atual da sua conta: ");
        double saldo = sc.nextDouble();

        System.out.print("Insira o valor que deseja sacar: ");
        double saque = sc.nextDouble();

        if (saldo >= saque) {
            saldo = saldo - saque;

            System.out.print("Saldo remanescent: R$" + String.format("%.2f", saldo));
        } else {
            System.out.print("Saque recusado!");
        }

        sc.close();
    }
}