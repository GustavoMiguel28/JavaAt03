import java.util.Scanner;

/*8. Escreva um programa que lê a altura e peso do usuário e calcula o seu IMC, índice de massa corpórea.
O programa deve exibir um texto para o usuário conforme a tabela abaixo:
Abaixo de 18,5 -> Abaixo do peso ideal.
Entre 18,5 e 24,9 -> Peso ideal, muito bem.
Entre 25,0 e 29,9 -> Sobrepeso, um regime leve pode ajudar.
Entre 30,0 e 34,9 -> Obesidade leve.
Entre 35,0 e 39,9 -> Obesidade moderada.
Acima de 40 -> Obesidade mórbida.*/

public class Ex8_IMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua altura (cm): ");
        double altura = sc.nextDouble();

        System.out.print("Digite seu peso (kg): ");
        double peso = sc.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println(String.format("%.2f", imc) + " Abaixo do peso ideal.");
        } else if ((imc >= 18.5) && (imc <= 24.9)) {
            System.out.println(String.format("%.2f", imc) + " Peso ideal, muito bem.");
        } else if ((imc >= 25) && (imc <= 29.9)) {
            System.out.println(String.format("%.2f", imc) + " Sobrepeso, um regime leve pode ajudar.");
        } else if ((imc >= 30) && (imc <= 34.9)) {
            System.out.println(String.format("%.2f", imc) + " Obesidade leve.");
        } else if ((imc >= 35) && (imc <= 39.9)) {
            System.out.println(String.format("%.2f", imc) + " Obesidade moderada.");
        } else if (imc > 40) {
            System.out.println(String.format("%.2f", imc) + " Obesidade mórbida.");
        } else {
            System.out.println(String.format("%.2f", imc) + " Valores inseridos inválidos");
        }

        sc.close();
    }
}