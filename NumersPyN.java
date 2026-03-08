import java.util.Scanner;
import java.util.InputMismatchException;
public class NumersPyN{
    public static void main(String[] args) {
        Scanner e = new Scanner (System.in);
        try{
            System.out.println("Ingresa un numero: ");
            double num = e.nextDouble();
            if (num > 0){
                System.out.println("ES POSITIVO");
            }else if(num < 0){
                System.out.println("ES NEGATIVO");
                }else{
                System.out.println("ES IGUAL A CERO");
                }
            }catch(InputMismatchException ex){
                System.out.println("TIPO INCORRECTO" + ex);
            }finally{
                e.close();
            }
        }
        }