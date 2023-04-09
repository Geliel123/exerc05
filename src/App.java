import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        double metros;
        double centimetros;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a quantidade de metros: ");
        metros = teclado.nextDouble();

        // 100 centimetros equivale a 1 metro
        centimetros = metros * 100;

        System.out.println("Valor em Centimetros: " + centimetros);
    }
}
