/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras_geometricas;

/**
 *
 * @author LENOVO
 */
public class TrianguloRectangulo {
    
    public static double Semiperimetro(double ladoa, double ladob, double ladoc){
        return (ladoa + ladob + ladoc  )/2;
    }
    
    public static double area (double ladoa, double ladob, double ladoc, double semiperimetro){
        return Math.sqrt(semiperimetro * (semiperimetro - ladoa) * (semiperimetro - ladob) * (semiperimetro - ladoc));
    }
    
    public static double perimetro (double ladoa, double ladob, double ladoc){
        return ladoa + ladob + ladoc;
    }
    
   
    
}
