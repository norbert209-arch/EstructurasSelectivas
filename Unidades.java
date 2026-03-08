import java.util.Scanner;
import java.util.InputMismatchException;
public class Unidades {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        try{
            double total;
            System.out.println("1.Centimetros");
            System.out.println("2.Milimetros");
            System.out.println("3.Kilometros");
            System.out.println("4.Pulgadas");
            System.out.println("5.Pies");
            System.out.println("Escoje una de las opciones: ");
            int opcion = e.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el valor");
                    int valor1 = e.nextInt();
                    total = valor1 / 100;
                    System.out.println("El valor en Centimetros es: "+ total);
                    break;
                case 2:
                    System.out.println("Ingresa el valor");
                    int valor2 = e.nextInt();
                    total = valor2 / 1000;
                    System.out.println("El valor en Milimetros es: "+ total);

                    break;
                case 3:
                    System.out.println("Ingresa el valor");
                    int valor3 = e.nextInt();
                    total = valor3 * 1000;
                    System.out.println("El valor en Kilometros es: "+ total);
                    break;
                case 4:
                    System.out.println("Ingresa el valor");
                    int valor4 = e.nextInt();
                    total = valor4 * 0.0254;
                    System.out.println("El valor en Pulgadas es: "+ total);
                    break;
                case 5:
                    System.out.println("Ingresa el valor");
                    int valor5 = e.nextInt();
                    total = valor5 / 0.3048;
                    System.out.println("El valor en Pies es: "+ total);
                    break;
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
