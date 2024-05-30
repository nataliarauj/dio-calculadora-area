import java.util.Scanner;

public class Circulo implements Calcular {

    @Override
    public void calcularArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o raio do circulo:");
        double raio = scanner.nextDouble();
        
        double area = 3.14 * (raio * raio);
        System.out.println("A area do circulo eh: " + String.format("%.3f ", area));
    }   
}