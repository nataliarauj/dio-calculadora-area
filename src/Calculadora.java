public class Calculadora {
    public static void main(String[] args) {
        Calcular circulo = new Circulo();
        Calcular trapezio = new Trapezio();
        Calcular retangulo = new Retangulo();
        Calcular losango = new Losango();
        Calcular quadrado = new Quadrado();
        Calcular triangulo = new Triangulo();
        
        System.out.println("-=-=-=-= CIRCULO -=-=-=-=");
        circulo.calcularArea();
        
        System.out.println("-=-=-=-= TRAPEZIO -=-=-=-=");
        trapezio.calcularArea();
        
        System.out.println("-=-=-=-= RETANGULO -=-=-=-=");
        retangulo.calcularArea();
        
        System.out.println("-=-=-=-= LOSANGO -=-=-=-=");
        losango.calcularArea();
        
        System.out.println("-=-=-=-= QUADRADO -=-=-=-=");
        quadrado.calcularArea();
        
        System.out.println("-=-=-=-= TRIANGULO -=-=-=-=");
        triangulo.calcularArea();
               
    }
}
