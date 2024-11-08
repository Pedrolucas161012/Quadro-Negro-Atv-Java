public class QuadroNegro {
    private Quadrado quadrado;
    private Retangulo retangulo;
    private Circunferencia circunferencia;
    private Triangulo triangulo;
    public void limpaQuadro ( ) {
    }
    public void criaQuadrado ( double l) {
    quadrado = new Quadrado(l);
    }
    public void criaRetangulo ( double c, double a) {
    retangulo = new Retangulo(c, a);
    }
    public void criaCircunferencia ( double r) {
    circunferencia = new Circunferencia(r);
    }
    public void criaTriangulo ( double b, double a) {
    triangulo = new Triangulo(b, a);
    }

public void mostraAreaObjetos ( ) {

    System.out.println("Quadrado. Área: " + quadrado.getArea());
    System.out.println("Retângulo. Área: " + retangulo.getArea());
    System.out.println("Triângulo. Área: " + triangulo.getArea());
    System.out.println("Circunferência. Área: " + circunferencia.getArea());
    }

public void mostraPerimetoObjetos ( ) {

    System.out.println("\nQuadrado. Perimetro: " + quadrado.getPerimetro());
    System.out.println("Retângulo. Perimetro: " + retangulo.getPerimetro());
    System.out.println("Triângulo. Perimetro: " + triangulo.getPerimetro());
    System.out.println("Circunferência. Perimetro: " + circunferencia.getPerimetro());
    }
    
public void mostraCorObjetos ( ) {
    System.out.println("\nQuadrado. Cor: " + quadrado.getCor());
    System.out.println("Retângulo. Cor: " + retangulo.getCor());
    System.out.println("Triângulo. Cor: " + triangulo.getCor());
    System.out.println("Circunferência. Cor: " + circunferencia.getCor());
}

    public static void main ( String args[]) {
    
    QuadroNegro quadroNegro = new QuadroNegro();

    quadroNegro.criaQuadrado(10);
    quadroNegro.criaRetangulo(50.5,20.4);
    quadroNegro.criaTriangulo(6.7,5.5);
    quadroNegro.criaCircunferencia(10);
    
    quadroNegro.quadrado.setColor("Lilás");
    quadroNegro.retangulo.setColor("Roxo");
    quadroNegro.triangulo.setColor("Iluminate");
    quadroNegro.circunferencia.setColor("Azul");
    
    quadroNegro.mostraAreaObjetos();
    quadroNegro.mostraPerimetoObjetos();
    quadroNegro.mostraCorObjetos();
    }
}