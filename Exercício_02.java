import java.util.Scanner;

public class Exercício_02 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Digite um número: ");
        double numero1 = entrada.nextDouble();
        
        System.out.print("Digite um operador: ");
        char operacao = entrada.next().charAt(0);

        System.out.print("Digite um número: ");
        double numero2 = entrada.nextDouble();

        switch (operacao) {
            case '+':
                System.out.println(numero1+numero2);
                break;
            case '-':
                System.out.println(numero1-numero2);
                break;
            case '*':
                System.out.println(numero1*numero2);
                break;
            default:
                System.out.println(numero1/numero2);
                break;
        }
        entrada.close();

    }
}