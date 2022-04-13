import java.util.Scanner;

public class Exercício_05 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("DIgite um número: ");
        double numero = entrada.nextDouble();

        double numero_quadrado = numero * numero;
        double raiz = Math.sqrt(numero);

        

        if(numero>0){
            System.out.println("O numero ao quadrado é "+ numero_quadrado);
            System.out.print("A raiz do número é " + raiz);
        }else{
            System.out.print("O número não é positivo");
        }
        
        entrada.close();
    }
    
}
