import java.util.Scanner;
import java.util.InputMismatchException;
public class OperacionesAritmeticas {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        try{
            int suma,resta;
            double multiplicacion, division;
        System.out.println("1.SUMA");
        System.out.println("2.RESTA");
        System.out.println("3.MULTIPLICACION");
        System.out.println("4.DIVISION");
        System.out.println("Escoje una opcion: ");
        int opcion = e.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingresa el primer numero: ");
                int num1 = e.nextInt();
                System.out.println("Ingresa el segundo numero: ");
                int num2 = e.nextInt();
                suma = num1 + num2;
                System.out.println("El resultado de la suma es: "+suma);
                break;
            case 2:
                 System.out.println("Ingresa el primer numero: ");
                int num3 = e.nextInt();
                System.out.println("Ingresa el segundo numero: ");
                int num4 = e.nextInt();
                resta = num3 - num4;
                System.out.println("El resultado de la resta es: "+resta);
                break;
            case 3:
                 System.out.println("Ingresa el primer numero: ");
                int num5 = e.nextInt();
                System.out.println("Ingresa el segundo numero: ");
                int num6 = e.nextInt();
                multiplicacion = num5 * num6;
                System.out.println("El resultado de la multiplicacion es: "+multiplicacion);
                break;
            case 4:
                 System.out.println("Ingresa el primer numero: ");
                int num7 = e.nextInt();
                System.out.println("Ingresa el segundo numero: ");
                int num8 = e.nextInt();
                division = num7 / num8;
                System.out.println("El resultado de la division es: "+division);
            default:
                break;
        }
    }catch(InputMismatchException ex){
        System.out.println("TIPO INCORRECTO");
    }finally{
        e.close();
    }
}
}
