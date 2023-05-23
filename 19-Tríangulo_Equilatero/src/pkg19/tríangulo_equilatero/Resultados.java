
package pkg19.tríangulo_equilatero;


public class Resultados {
    public static double Perimetro(double Lado){
        double perimetro;
        perimetro = Lado * 3;
        return perimetro;
    }
    public static double Altura(double Lado){
        double altura;
        altura = (Lado * Math.sqrt(3))/2;
        return altura;
    }
    public static double Area(double Lado, double Altura){
        double area;
         area = (Lado * Altura) / 2;
        return area;
    }
}
