package primero;
import java.util.Scanner;
public class ejemplo {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
         int num1,num2,sumar;
        System.out.println(“Difiteun un número: ”);
        num1= t.nextInt();
        System.out.println(“Ingrese Segundo número: ”);
        num2= t.nextInt();
        sumar=num1*num2; 
        System.out.println(“multiplicasion es:” +sumar);
    }
    
}