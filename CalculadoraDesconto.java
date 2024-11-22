import java.util.Scanner;

public class CalculadoraDesconto {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);  //Ler dados do teclado
               
        System.out.println("Digite o valor do produto aqui : R$"); //Valor do produto
        float produto = sc.nextFloat();

        System.out.println("Quantos % em desconto ? "); //Porcentagem de desconto
        int desconto = sc.nextInt();
       
        float calculo = produto * (desconto / 100.0f);

        float valorfinal = produto - calculo;
        
        System.out.printf ("O seu produto com %d%% de desconto, você tera que pagar apenas R$ %.2f%n", desconto, valorfinal);
                
        sc.close();
    }

}