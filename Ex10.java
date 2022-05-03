import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro valor inteiro: ");
        int x = entrada.nextInt();
        System.out.print("Digite o segundo valor inteiro: ");
        int y = entrada.nextInt();
        System.out.print("Digite o terceiro valor inteiro: ");
        int z = entrada.nextInt();

        System.out.print("Escolha a formula da médida: ");
        System.out.print("' Média Geometrica ");
        System.out.print("2 Media Ponderada ");
        System.out.print("3 - Media Aritmética");
        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                int resultado1 = x * y * z;
                System.out.print(resultado1);
                break;
            case 2:
                int resultado2 = (x+2*y+3*z)/6;
                System.out.print(resultado2);
                break;
            case 3:
                int resultado3 = (x+y+z)/3;
                System.out.print(resultado3);
                break;     

                

        }

    }
}

