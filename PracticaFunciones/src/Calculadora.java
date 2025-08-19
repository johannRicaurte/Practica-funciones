import java.util.Scanner;

public class Calculadora {


    public static double suma(double num1, double num2)
    {
        return num1 + num2;
    }

    public static double resta(double num1, double num2)
    {
        return num1 - num2;
    }

    public static double multiplicacion(double num1, double num2)
    {
        return num1 * num2;
    }
    public static double division(double num1, double num2)
    {
        if (num2 == 0)
        {
            throw new ArithmeticException("Division by zero"); //Exepcion
        }
        return  num1 / num2;


    }
    public static double potencia(double num1, double num2)
    {
        if(num1 == 0)
        {
            throw new ArithmeticException("Potencia by zero"); //Exepcion
        } else if (num2 == 0) {
            return 1;
        } else {
            return Math.pow(num1, num2);
        }

    }
    public static double porcentaje(double num1, double num2)
    {

        return  (num1 * num2 / 100);

    }

    public static double raizCuadrada(double num) {
        if (num < 0) {
            throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo");
        }
        return Math.sqrt(num);
    }



    public static void menu()
    {
        Scanner sc = new Scanner(System.in);

        String menu =
                "╔════════════════════════════════════════╗\n" +
                        "║           CALCULADORA CIENTÍFICA       ║\n" +
                        "╠════════════════════════════════════════╣\n" +
                        "║ 1. Suma                                ║\n" +
                        "║ 2. Resta                               ║\n" +
                        "║ 3. Multiplicación                      ║\n" +
                        "║ 4. División                            ║\n" +
                        "║ 5. Potencia                            ║\n" +
                        "║ 6. Porcentaje                          ║\n" +
                        "║ 7. Raíz cuadrada                       ║\n" +
                        "║ 8. Salir                               ║\n" +
                        "╚════════════════════════════════════════╝\n" +
                        "Seleccione una opción: ";
        System.out.print(menu);
        Scanner sc2 = new Scanner(System.in);
        String respuesta = sc.nextLine();
        double num1;
        double num2;

        switch (respuesta)
        {
            case "1":
                System.out.println("Digite el numero1 de la suma ");
                num1 = sc.nextDouble();
                System.out.println("Digite el numero2 de la suma ");
                num2 = sc.nextDouble();
                System.out.println(suma(num1,num2));
                break;
            case "2":
                System.out.println("Digite el numero1 de la resta ");
                num1 = sc.nextDouble();
                System.out.println("Digite el numero2 de la resta ");
                num2 = sc.nextDouble();
                System.out.println(resta(num1,num2));
                break;
            case "3":
                System.out.println("Digite el multiplicando ");
                num1 = sc.nextDouble();
                System.out.println("Digite el multiplicador");
                num2 = sc.nextDouble();
                System.out.println(multiplicacion(num1,num2));
                break;
            case "4":
                System.out.println("Digite el dividendo ");
                num1 = sc.nextDouble();
                System.out.println("Digite el divisor");
                num2 = sc.nextDouble();
                System.out.println(division(num1,num2));
                break;
            case "5":
                System.out.println("Digite el numero de la base");
                num1 = sc.nextDouble();
                System.out.println("Digite el numero exponente ");
                num2 = sc.nextDouble();
                System.out.println(potencia(num1,num2));
                break;
            case "6":
                System.out.println("Digite el número:");
                num1 = sc.nextDouble();
                System.out.println("Digite el porcentaje a calcular:");
                num2 = sc.nextDouble();
                System.out.println(porcentaje(num1,num2));;
                break;
            case "7":
                System.out.println("Digite el número:");
                num1 = sc.nextDouble();
                System.out.println(raizCuadrada(num1));
                break;
            case "8":
                System.out.println("Saliendo del programa...");
                System.exit(0); // termina el programa
                break;
        }
    }



}
