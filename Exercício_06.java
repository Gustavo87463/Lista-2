import java.util.Scanner;

public class Exercício_06 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("DIgite seu sexo: ");
        char sexo = entrada.next().charAt(0);

        System.out.print("DIgite sua altura: ");
        double altura = entrada.nextInt();

        double homem = (72.2 * altura) - 58;
        double mulher = (62.1 * altura) - 44.7;

        switch (sexo) {
            case 'M':
                System.out.print("O seu peso ideal é " + mulher);
                break;
            case 'H':
                System.out.print("O seu peso ideal é " + homem);
                break;
            default:
        }

        entrada.close();
        }
    }

    

