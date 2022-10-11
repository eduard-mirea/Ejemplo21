import java.util.Scanner;
public class Ejemplo21 {
    public static void main(String[] args) {

        int numero;
        int positivos = 0;

        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce 10 numeros enteros: ");




        for (int i = 0; i < 10; i++){
            numero = inputValue.nextInt();
            if (numero >= 0){
                positivos++;
            }
        }
        inputValue.close();
        System.out.println("Ha introducido: " + positivos + " numeros positivos");
        System.out.println("Ha introducido: " + (10 - positivos) + " numeros negativos");
    }
}
