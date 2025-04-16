// Clase Figura
abstract class Figura {
    // Método abstracto para calcular el área
    public abstract double calcularArea();
}

// Clase Circulo que hereda de Figura
class Circulo extends Figura {
    private double radio;

    // Constructor que recibe el radio
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Implementación del método calcularArea
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

// Clase Rectangulo que hereda de Figura
class Rectangulo extends Figura {
    private double base;
    private double altura;

    // Constructor que recibe la base y la altura
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Implementación del método calcularArea
    @Override
    public double calcularArea() {
        return base * altura;
    }
}

// Clase Triangulo que hereda de Figura
class Triangulo extends Figura {
    private double base;
    private double altura;

    // Constructor que recibe la base y la altura
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Implementación del método calcularArea
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}