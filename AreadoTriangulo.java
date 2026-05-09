import java.util.Scanner;

public class AreadoTriangulo{
public static void main(String[] args){
    Scanner ler = new Scanner(System.in);

    System.out.print("Digite a base do triangulo: ");
    int B = ler.nextInt();

    System.out.print("Digite a altura do triangulo: ");
    int H = ler.nextInt();

    int resultado = B*H/2;

    System.out.println("Resultado" + resultado);
}
}