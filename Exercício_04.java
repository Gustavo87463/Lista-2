import java.util.Scanner;

public class Exercício_04 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do seu salário: ");
        double salario = entrada.nextDouble();

        System.out.print("Digite o valor da prestação de um emprestimo: ");
        double prestacao = entrada.nextDouble();

        double porcentagem = (salario * 20) /100;

        if(prestacao>porcentagem){
            System.out.print("Empréstimo não concedido");
        }else{
            System.out.print("Empréstimo concedido");
        }
        
        entrada.close();
    }
    
}
