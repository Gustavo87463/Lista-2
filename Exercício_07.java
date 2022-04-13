import java.util.Scanner;

public class Exercício_07 { 

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor de um produto: ");
        float produto = entrada.nextInt();

        System.out.print("Digite para onde o produto vai (MG/RJ/SP/MS)");
        String estado = entrada.next(); 

        switch (estado){
            case "MG":
                double produto_final_MG = produto+7/100;
                System.out.println("Preço do produto no estado de MG é de :" + produto_final_MG);
                break;
        
            case "RJ":
                double produto_final_RJ = produto+15/100;  
                System.out.println("Preço do produto no estado de RJ é de :" + produto_final_RJ);
                break;
        
            case "SP":
                double produto_final_SP = produto+12/100;
                System.out.println("Preço do produto no estado de SP é de :" + produto_final_SP);
                break;
        
            case "MS":
                double produto_final_MS = produto+8/100;
                System.out.println("Preço do produto no estado de MS é de :" + produto_final_MS);
                break;
            }
        entrada.close();
    }
}    