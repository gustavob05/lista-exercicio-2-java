import java.util.Scanner;
import java.util.Random;

public class Exercicio6 {
  
  public static void main(String[] args) {
    int num1, num2;
  Scanner scanner = new Scanner(System.in);
  System.out.println("\nInforme o primeiro número: ");
  num1 = scanner.nextInt();
  System.out.println("\nInforme o segundo número: ");
  num2 = scanner.nextInt();
  Random gerador = new Random();

  if (num1 > num2){
    System.out.println("\nO maior número é: " + num1);
    System.out.println("\nO menor número é: " + num2);
    int aleatorio = gerador.nextInt(num2, num1);
    System.out.println("\nO número aleatório gerado é: " + aleatorio);
    if (aleatorio % 2 == 0){
      System.out.println("\nO número gerado é par!");
    }
    else {
      System.out.println("\nO múmero gerado é ímpar!");
    }
    }
  else if (num1 < num2){
    System.out.println("\nO maior número é: " + num2);
    System.out.println("\nO menor número é: " + num1);
    int aleatorio = gerador.nextInt(num1, num2);
    System.out.println("\nO número aleatório gerado é: " + aleatorio);
    if (aleatorio % 2 == 0){
      System.out.println("\nO número gerado é par!");
    }
    else {
      System.out.println("\nO múmero gerado é ímpar!");
    }
    } 
  else 
    System.out.println("\nOs números informados são iguais!");
    scanner.close();
    }  
    
  }
  