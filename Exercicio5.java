import java.util.Scanner;

public class Exercicio5 {
public static void main(String[] args) {
double num1, num2;
String operador;
Scanner scanner = new Scanner(System.in);

System.out.println("\n Operador com dois numeros.");

System.out.println("\nDigite o primeiro numero: ");
num1 = scanner.nextDouble();
System.out.println("\nDigite o segundo numero: ");
num2 = scanner.nextDouble();
System.out.println("\nDigite o operador(+, -, /, *, ^): ");
operador = scanner.next();

switch (operador){

case "+":
System.out.printf("A soma dos nuneros é: %.2f", num1 + num2);
break;

case "-":
System.out.printf("A subtração dos nuneros é: %.2f", num1 - num2);
break;

case "*":
System.out.printf("A multiplicação dos nuneros é: %.2f", num1 * num2);
break;

case "/":
System.out.printf("A divisão dos nuneros é: %.2f", num1 / num2);
break;

case "^":
System.out.printf("A elevação dos nuneros é: %.2f", Math.pow(num1, num2));
break;

default:
System.out.println("Operador invalido");

}
scanner.close();
}
}
