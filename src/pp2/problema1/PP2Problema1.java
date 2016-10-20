/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema1;
import java.util.*;
/**
 *
 * @author Enano
 */
public class PP2Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        float year;
        //Resolucion
        year=getYear();
        print(calc (year), year);
    }
    public static float getYear()
    {
        Scanner in = new Scanner (System.in);
        System.out.println("**** Bienvenid@ ****");
        System.out.println("Ingrese el año que desea calcular: ");
        return in.nextFloat();
    }
    public static String calc (float y)
    {
        String result ="";
        if (y%4==0)                //Este grupo de "if's" verifica si el año NO es bisiesto.
        {
            if(y%100==0)         
            {
                if (y%400!=0)
                {
                    result=" no"; //Si el año no cae en ningún condicional que determine que No es un año bisiesto, se toma por sentado que lo es.
                }
            }
        }
        else
        {
            result=" no";
        }
        return result;
    }
    public static void print (String r, float y)
    {
        System.out.println("El año "+y+r+" "+"es año bisiesto"); //Se imprime
    }
}
