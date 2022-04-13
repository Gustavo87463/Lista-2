import java.util.Scanner;

public class Exercício_08 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");

        int idade = entrada.nextInt();

        if(idade >= 4 && idade <= 7){
            System.out.println("A classificaçãodo narrador é Infantil A");
        }else if(idade >= 8 && idade<= 10){
            System.out.println("A classificação do narrador é Infantil B");
        }else if(idade >= 11 && idade <= 13){
            System.out.println("A classificação do narrador é Juvenil A");
        }else if(idade >= 14 && idade <=17 ){
            System.out.println("A classificação do narrador é Juvenil B");
        }else{
            System.out.println("A classificação do narrador é Sênior");
        }
        
        entrada.close();
    }
}
