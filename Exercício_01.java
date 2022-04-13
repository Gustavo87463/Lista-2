import java.util.Scanner;

public class Exercício_01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Diga o nome do produto: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o modelo do produto: ");
        String modelo = entrada.nextLine();

        System.out.print("Digite o tamanho do produto: ");
        float tamanho = entrada.nextFloat();

        System.out.print("DIgite o preço do produto: ");
        double preco = entrada.nextDouble();

        System.out.println("Digite a quantide do produto: ");
        int quantidade = entrada.nextInt();

        System.out.print("O nome do Produto é " + nome);
        System.out.print("O modelo do produto é " + modelo);
        System.out.print("O tamanho do produto é " + tamanho);
        System.out.print("O preço do produto é " + preco);
        System.out.print("A quantidade dO produto é " + quantidade);
 

        
        
        entrada.close();
    }
    
}
