import java.util.Scanner;
public class Quadrado implements Calcular {
    
    @Override
    public void calcularArea(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o lado do quadrado:");
        double lado = scanner.nextDouble();
        
        double area = lado * lado;
        System.out.println("A area do quadrado eh: " + String.format("%.2f", area));
    }
}
