public class Main {

    public static void main(String[] args) {

        Rectangulo rectangulo = new Rectangulo(3,5);
        System.out.println("Area del rectangulo: " + rectangulo.calcularArea());

        Triangulo triangulo = new Triangulo(7,10);
        System.out.println("Area del triangulo: " + triangulo.calcularArea());

    }
}
