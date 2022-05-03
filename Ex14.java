import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("De acordo com a equação de 2 grau");
        System.out.print("a*(x^2) + bx + c = 0");
        System.out.print("Digite o valor de a:");
        int a = entrada.nextInt();
        System.out.print("Digite o valor de b");
        int b = entrada.nextInt();
        System.out.print("Digite o valor de c:");
        int c = entrada.nextInt();

        int delta = (b*b)-4*a*c;

        if(delta > 0){
            System.out.print("Não existe raizesreais.");
        }else if (delta == 0){
            double raiz = Math.sqrt(delta);
            double resultado = (-b + raiz)/(2*a);
            System.out.print("Raizes são iguais");
            System.out.print("X1 é " + resultado);
            System.out.print("X2 é " + resultado);
        }else{
            double raiz = Math.sqrt(delta);
            double resultado1 = (-b + raiz)/(2*a);
            double resultado2 = (-b - raiz)/(2*a);
            System.out.print("");
            System.out.print("X1 é " + resultado1);
            System.out.print("X2 é " + resultado2);


            
        }   

        }
    }
    
