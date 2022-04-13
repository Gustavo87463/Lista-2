import java.util.Scanner;

public class Exercício_03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero1 = entrada.nextInt();

        System.out.print("DIgite um número: ");
        int numero2 = entrada.nextInt();

        if(numero1>numero2){
            System.out.print("O maior número é " + numero1);
        }else if(numero2>numero1){
            System.out.print("O maior número é " + numero2);
        }else if(numero1==numero2){
            System.out.print("Os números são iguais.");
        }
        entrada.close();
    }
    
}
