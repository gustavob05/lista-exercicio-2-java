import java.util.Scanner;

public class Exercicio3 {
public static void main(String[] args) {
double num1, num2, num3, valor1 , valor2 , delta;
Scanner scanner = new Scanner(System.in);

System.out.println("\nPrograma de resolução  de equação de 2 grau");

System.out.println("\nDigite o valor de a: ");
num1 = scanner.nextDouble();
System.out.println("\nDigite o valor de b: ");
num2 = scanner.nextDouble();
System.out.println("\nDigite o valor de c: ");
num3 = scanner.nextDouble();
 
delta = (Math.pow(num2,2) - (4 * num1 * num3));
valor1 = ( (num2 *(-1)) + delta / ( 2*num1 ));
valor2 =  ( (num2 *(-1)) - delta / ( 2*num1 ));

if((num1 == 0) && (num2 == 0) && (num3 != 0)){
System.out.println("\nCoeficientes informados incorretamente");
}
else if((num1 == 0) && (num2 != 0)){
System.out.printf("\nEssa é uma equação de primeiro grau e seu resultado é: %.2f ",  num2 / (-num3));
}
else if((delta < 0)){
System.out.println("\nEssa equação não possui raizes reais");
}
else if((delta == 0)){
    System.out.println("\nEssa equação possui dois valores positivos.");
    System.out.println("\nvalor 1: " + (valor1)) ;
    System.out.println("\nValor 2: " + (valor2));
}
else{
System.out.println("Esta equação possui duas raízes reais diferentes. ");
System.out.printf("\nO valor positivo é: %.2f", (valor1));
System.out.printf("\nO valor negativo é: %.2f", (valor2));
}


scanner.close();

}
}