
abstract public class ObjetoGeometrico {
   
    protected double area;
    protected double perimetro;
    protected String cor;

    public abstract double getArea();
    public abstract double getPerimetro();


    public String getCor(){
        return cor;
    }
    public void setColor(String c){
        cor = c;
    }

}