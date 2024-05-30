import java.util.Scanner;

public class Losango implements Calcular {

    @Override
    public void calcularArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a diagonal maior:");
        double diagonalMaior = scanner.nextDouble();
        
        System.out.println("Digite a diagonal menor");
        double diagonalMenor = scanner.nextDouble();
        
        double area = (diagonalMaior * diagonalMenor) / 2;
        System.out.println("A area do losango eh: " + String.format("%.2f", area));
    }
    
}
