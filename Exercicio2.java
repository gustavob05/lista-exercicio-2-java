import java.util.Scanner; 
public class Exercicio2{
    public static void main(String[] args){
    double vlcom, vlpa, vlTroco;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o valor da compra: ");
     vlcom = scanner.nextInt();

    System.out.println("Informe o valor pago: ");
     vlpa = scanner.nextInt();
    
    if (vlpa < vlcom){
    System.out.println("O valor pago é insficiente!");
    }
    else if (vlpa == vlcom){
        System.out.printf("\nPagamento aprovado! Seu troco é de: R$ 0.00");
    }
    else { 
        vlTroco = vlpa - vlcom;
        double nota50 = Math.floor(vlTroco/50);
        double nota20 = Math.floor((vlTroco - ((50 * nota50)))/20);
        double nota10 = Math.floor((vlTroco - ((20 * nota20) + (50 * nota50)))/10);
        double nota5 = Math.floor((vlTroco - ((10 * nota10) + (20 * nota20) + (50 * nota50)))/5);
        double nota2 = Math.floor((vlTroco - ((5 * nota5) + (10 * nota10) + (20 * nota20) + (50 * nota50)))/2);
        double moeda = Math.floor(vlTroco - ((50 * nota50) + (20 * nota20) + (10 * nota10) + (5 * nota5) + (2 * nota2)));
        System.out.printf("\nPagameto aprovado! Seu troco será de: ");
        System.out.printf("\nCédulas de R$50: %.0f ", (nota50));
        System.out.printf("\nCédulas de R$20: %.0f ", (nota20));
        System.out.printf("\nCédulas de R$10: %.0f ", (nota10));
        System.out.printf("\nCédulas de R$5: %.0f ", (nota5));
        System.out.printf("\nCédulas de R$2: %.0f ", (nota2));
        System.out.printf("\nMoedas de R$1: %.0f ", (moeda));
        System.out.printf("\nTotal: R$ %.0f %n", ((nota50 * 50) + (nota20 * 20) + (nota10 * 10) + (nota5 * 5) + (nota2 * 2) + moeda));
    }
     scanner.close();
    }
}