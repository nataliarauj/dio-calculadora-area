import java.util.Scanner;
public class Triangulo implements Calcular {
    
    @Override
    public void calcularArea(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a base: ");
        double base = scanner.nextDouble();
        
        System.out.println("Digite a altura:");
        double altura = scanner.nextDouble();
        
        double area = (base * altura) / 2;
        System.out.println("A area do triangulo eh: " + String.format("%.2f", area));
    }
}
