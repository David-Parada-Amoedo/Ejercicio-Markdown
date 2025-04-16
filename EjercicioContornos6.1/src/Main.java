public class Main {
    public static void main(String[] args) {
        // Crear objetos de cada clase
        Figura circulo = new Circulo(5.0);
        Figura rectangulo = new Rectangulo(4.0, 6.0);
        Figura triangulo = new Triangulo(3.0, 7.0);

        // Imprimir el área de cada figura
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
    }
}
