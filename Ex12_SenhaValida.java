import java.util.Scanner;

/*12. Escreva um programa que verifica se um dado número inteiro de quatro dígitos é uma senha válida. Para ser
considerado como uma senha válida, um número tem que ter as seguintes características:
- O primeiro dígito da esquerda para a direita tem que ser 8 ou 5
- O quarto dígito da esquerda para a direita tem que ser 5 ou 1
- A soma do segundo com o terceiro dígitos tem que ser 3 caso o quarto dígito seja 5 e 0 caso ele seja 1
Por exemplo, o número 8125 é uma senha válida pois começa com 8, termina com 5 e a soma dos dois dígitos do
meio é 3.*/

public class Ex12_SenhaValida {

    public static boolean verificacao_1(int senha) {
        String primeiro_digito = Integer.toString(senha).substring(0,1);

        if ((primeiro_digito.equals("8")) || (primeiro_digito.equals("5"))) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean verificacao_2(int senha) {
        String ultimo_digito = Integer.toString(senha).substring(3, 4);

        if ((ultimo_digito.equals("5")) || (ultimo_digito.equals("1"))) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean verificacao_3(int senha) {
        String ultimo_digito = Integer.toString(senha).substring(3, 4);

        String segundo_digito = Integer.toString(senha).substring(1, 2);
        String terceiro_digito = Integer.toString(senha).substring(2, 3);

        if ((ultimo_digito.equals("5")) && (Integer.parseInt(segundo_digito) + Integer.parseInt(terceiro_digito) == 3)) {
            return true;
        } else if ((ultimo_digito.equals("1")) && (Integer.parseInt(segundo_digito) + Integer.parseInt(terceiro_digito) == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a senha desejada: ");
        int senha = sc.nextInt();

        if ((verificacao_1(senha) == true) && (verificacao_2(senha) == true) && (verificacao_3(senha) == true)) {
            System.out.println("Senha correta!");
        } else {
            System.out.println("Senha incorreta!");
        }

        sc.close();
    }
}