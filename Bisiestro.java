import java.util.Scanner;
import java.util.InputMismatchException;
public class Bisiestro {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        try{
        System.out.println("Ingresa el año: ");
        double año = e.nextDouble();
        if (año % 4 == 0 && año % 100 !=0){
            System.out.println("El año es bisiestro");
        }else if(año % 400 == 0){
            System.out.println("El año es bisiestro");
        }else{
            System.out.println("El año no es bisiestro");
        }

        }catch(InputMismatchException ex){
            System.out.println("TIPO INCORRECTO");
        }finally{
            e.close();
        }

    }
}
