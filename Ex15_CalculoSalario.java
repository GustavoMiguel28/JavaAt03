import java.util.Scanner;

/*15. Faça um programa que lê os seguintes dados:
- valor/hora (é um número real positivo)
- horas trabalhadas (é um inteiro)
- imposto (um real entre 0 e 1, inclusive)
- comissão (é um real positivo)
Seu programa deve calcular e exibir para o usuário os seguintes valores:
Salário bruto, que é igual ao valor/hora multiplicado pelo número de horas trabalhadas.
Salário líquido, que é igual ao salário bruto menos o imposto mais a comissão. Note que a comissão somente
entrará nos cálculos caso o número de horas trabalhadas seja pelo menos 120.*/

public class Ex15_CalculoSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Lê os dados do usuário    
        System.out.print("Informe o valor por hora: R$");
        double valor_por_hora = sc.nextDouble();

        System.out.print("Informe o número de horas trabalhadas: ");
        int horas_trabalhadas = sc.nextInt();

        System.out.print("Informe o imposto: ");
        double imposto = sc.nextDouble();

        System.out.print("Informe a comissão: ");
        double comissao = sc.nextDouble();

        //Calculando valores
        double salario_bruto = valor_por_hora * horas_trabalhadas;
        System.out.println("Salário bruto: R$" + salario_bruto);

        double salario_liquido;

        if (horas_trabalhadas >= 120) {
            salario_liquido = salario_bruto - (salario_bruto * imposto) + comissao;
            System.out.println("Salário líquido: R$" + salario_liquido);
        } else {
            salario_liquido = salario_bruto - (salario_bruto * imposto);
            System.out.println("Salário líquido: R$" + salario_liquido);
        }

        sc.close();
    }
}