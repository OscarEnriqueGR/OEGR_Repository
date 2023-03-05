import java.util.Scanner;

public class Calculador_Estado_Corporal_Según_Peso {
    
    public static void main (String [] args) {
       Scanner entrada = new Scanner (System.in);
       System.out.println ("Insertar peso");
       int peso = entrada.nextInt();
        if (peso > 70){
            System.out.println("Estas Gordo");
        }
        else if (peso>60){
            System.out.println("Estas Normal");
        }
        else if (peso>50){
            System.out.println("Estas Delgado");
        }
        else{
            System.out.println("Estas Muy Delgado");
        }
    }
}