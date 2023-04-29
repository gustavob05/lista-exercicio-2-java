import java.util.Scanner;

public class Exercicio4 {
public static void main(String[] args) {
double r = 3.141592;
double raio;
int denifir1;
Scanner scanner = new Scanner(System.in);

System.out.println("\nPrograma que imprime o perímetro do círculo, área do círculo e o volume da esfera.");

System.out.println("\nDigite \n1: calcular e imprimir o perímetro do círculo. \n2: calcular e imprimir a área do círculo. \n3: calcular e imprimir o volume da esfera: ");
denifir1 = scanner.nextInt();
 
 if ((denifir1 == 1)){
System.out.println("\nCalcular e imprimir o perímetro do círculo.");
System.out.println("Digite o raio:");
raio = scanner.nextDouble();
double perimetro = 2 * r * raio;
System.out.println("\nO perimetro é: " + perimetro);
}

 else if ((denifir1 == 2)){
System.out.println("\nCalcular e imprimir a área do círculo");
System.out.println("Digite o raio:");
raio = scanner.nextDouble();
double area = (raio * raio) * r;
System.out.println("O valor da area é: " + area);
}
 else if ((denifir1 == 3)){
System.out.println("\nCalcular e imprimir o volume da esfera.");
System.out.println("Digite o raio:");
raio = scanner.nextDouble();

double volume = (4 * r * (raio * raio * raio)) / 3 ;
System.out.println("O valor da volume é: " + volume);
}

else
System.out.println("Numero invalido");

scanner.close();

}
}