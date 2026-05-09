import java.util.Scanner;

public class AreadoCirculo{
public static void main(String[] args){
    Scanner ler = new Scanner(System.in);

    double Z = 3.14;

    System.out.print("Digite o raio do circulo: ");
    int R = ler.nextInt();

    double resultado = Z*(R*R);

    System.out.println("Resultado" + resultado);
}
}