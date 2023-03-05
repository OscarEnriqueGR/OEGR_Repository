import java.util.Scanner;

public class Calculador_Estado_Corporal_Según_Peso_Altura {
    
    public static void main (String [] args) {
       Scanner entrada = new Scanner (System.in);
       System.out.println ("Insertar Peso en Kilogramos");
       double p = entrada.nextDouble();
       System.out.println ("Insertar Altura en Metros");
       double a = entrada.nextDouble();
       double imc = p/(a*a);
        if (imc <= 15){
            System.out.println("Muy Delgado");
        }
        else if (15<imc && imc<=19){
            System.out.println("Estas Delgado");
        }
        else if (19<imc && imc<=24.9){
            System.out.println("Estas Normal");
        }
        else{
            System.out.println("Estas Gordo");
        }
    }
}