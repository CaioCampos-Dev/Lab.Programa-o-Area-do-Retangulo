import java.util.Scanner;

public class AreadoRetangulo{
public static void main(String[] args){
    Scanner ler = new Scanner(System.in);

    System.out.print("Digite a base do retangulo: ");
    int B = ler.nextInt();

    System.out.print("Digite a altura do retangulo: ");
    int H = ler.nextInt();

    int resultado = B*H;

    System.out.println("Resultado" + resultado);
}
}
