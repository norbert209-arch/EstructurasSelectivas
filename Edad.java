import java.util.Scanner;
import java.util.InputMismatchException;
public class Edad {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        try{
            System.out.println("Ingresa tu edad: ");
        int Edad = e.nextInt();
        if (Edad < 18){
            System.out.println("ERES MENOR DE EDAD");
        }else if(Edad <= 18 && Edad >= 64){
            System.out.println("ERES UN ADULTO");
        }else if(Edad >= 65){
            System.out.println("ERES UN ADULTO MAYOR");
        }
    }catch(InputMismatchException ex){
        System.out.println("TIPO INCORRECTO" + ex);
    }finally{
        e.close();
    }
    }
}
