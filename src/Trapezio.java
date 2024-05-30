
import java.util.Scanner;

public class Trapezio implements Calcular {

    @Override
    public void calcularArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base maior:");
        double baseMaior = scanner.nextDouble();
        
        System.out.println("Digite a base menor");
        double baseMenor = scanner.nextDouble();
        
        System.out.println("Digite a altura");
        double altura = scanner.nextDouble();
        
        double area = ((baseMaior + baseMenor) * altura) / 2;
        
        System.out.println("A area do trapezio eh: " + String.format("%.2f", area));
    }
    
}
