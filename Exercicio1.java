import java.util.Scanner;

public class Exercicio1 {
public static void main(String[] args) {
double num1, num2,num3, media;
Scanner scanner = new Scanner(System.in);

System.out.println("\nDigite o primeiro numero: ");
num1 = scanner.nextDouble();
System.out.println("\nDigite o segundo numero: ");
num2 = scanner.nextDouble();
System.out.println("\nDigite o terceiro numero: ");
num3 = scanner.nextDouble();

media = (num1+num2+num3) / 3;

if((num1 > num2) && (num1 > num3) && (num2 > num3))
System.out.println("\nO numero maior é: " + num1 + "\nE o menor numero é: " + num3);

else if((num1 < num2) && (num1 < num3) && (num2 < num3))
System.out.println("\nO numero maior: " + num3 + "\nE o menor numero é: " + num1);

else if((num1 < num2) && (num1 < num3) && (num2 > num3))
System.out.println("\nO numero maior: " + num2 + "\nE o menor numero é: " + num1);

else if((num1 > num2) && (num1 > num3) && (num2 < num3))
System.out.println("\nO numero maior é: " + num1 + "\nE o menor numero é: " + num2);

else if((num2 > num1) && (num2 > num3) && (num1 > num3))
System.out.println("\nO numero maior é: " + num2 + "\nE o menor numero é: " + num3);

else if((num2 < num1) && (num2 < num3) && (num1 < num3))
System.out.println("\nO numero maior: " + num3 + "\nE o menor numero é: " + num2);

else if((num2 < num1) && (num2 < num3) && (num1 > num3))
System.out.println("\nO numero maior: " + num1 + "\nE o menor numero é: " + num2);

else if((num2 > num1) && (num2 > num3) && (num3 < num1))
System.out.println("\nO numero maior é: " + num2 + "\nE o menor numero é: " + num1);


else if((num3 > num1) && (num3 > num2) && (num1 > num2))
System.out.println("\nO numero maior é: " + num3 + "\nE o menor numero é: " + num2);

else if((num3 < num1) && (num3 < num2) && (num1 < num2))
System.out.println("\nO numero maior: " + num2 + "\nE o menor numero é: " + num3);

else if((num3 < num1) && (num3 < num2) && (num1 > num2))
System.out.println("\nO numero maior: " + num1 + "\nE o menor numero é: " + num1);

else if((num3 > num1) && (num3 > num2) && (num1 < num2))
System.out.println("\nO numero maior é: " + num3 + "\nE o menor numero é: " + num1);


else
System.out.println("\nNumeros invalidos");

System.out.println("\nA media é: " + media);
scanner.close();
}

}
