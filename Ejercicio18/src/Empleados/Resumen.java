/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

/**
 *
 * @author LENOVO
 */
public class Resumen {
    public static double Salario_bruto(double Horas, double Valor_horas){
        double Salario_b;
        Salario_b = Horas * Valor_horas;
        return Salario_b;
    }
    public static double Retencion_fuente(double Salario_bruto, double Porcentaje_retencion){
        double Retencion;
        Retencion = (Salario_bruto * Porcentaje_retencion)/100 ;
        return Retencion;
    }
    public static double Salario_neto(double Salario_b, double Retencion){
        double Salario;
        Salario = Salario_b - Retencion ;
        return Salario;
    }
}
    
