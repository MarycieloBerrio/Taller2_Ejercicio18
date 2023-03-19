/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package taller2.ejercicio18;

import java.util.Scanner;

public class Ejercicio18 {
    
    public static void main(String[] args) {
        
        double horasTrabajadas, porcentajeRetencion, salarioBruto, retencion, salarioNeto, valorHora;
        String nombres, codigo;
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el código del empleado: ");
        codigo = leer.next();

        System.out.print("Ingrese los nombres del empleado: ");
        nombres = leer.next();

        System.out.print("Ingrese el número de horas trabajadas al mes: ");
        horasTrabajadas = leer.nextDouble();

        System.out.print("Ingrese el valor hora trabajada: ");
        valorHora = leer.nextDouble();

        System.out.print("Ingrese el porcentaje de retención en la fuente (%): ");
        porcentajeRetencion = leer.nextDouble();

        salarioBruto = horasTrabajadas * valorHora;
        retencion = salarioBruto * porcentajeRetencion / 100;
        salarioNeto = salarioBruto - retencion;

        System.out.println("Código del empleado: " + codigo);
        System.out.println("Nombres: " + nombres);
        System.out.println("Salario bruto: $" + salarioBruto);
        System.out.println("Retención en la fuente (" + porcentajeRetencion + "%) : " + retencion);
        System.out.println("Salario neto: $" + salarioNeto);
    }
}

