import java.util.Scanner;

public class SistemaConversiones {

    public static double convertirMetros()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el valor del metro que desea convertir: ");
        double metros = sc.nextDouble();
        double centimetros = metros * 100;


        return centimetros;
    }

    public static double convertirKilogramos()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el valor de los kilogramos que desea convertir: ");
        double kilogramo= sc.nextDouble();
        double libra = kilogramo * 2.20462;


        return libra;
    }

    public static double convertirCelsius()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el valor de la temperatura en grados Celsius que desea convertir: ");
        double celsius= sc.nextDouble();
        double fahrenheit = celsius * 9/5 + 32;


        return fahrenheit;
    }
}
