import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double conversorM = SistemaConversiones.convertirMetros();
        System.out.println("El valor en centimetros es: " + conversorM);

        double conversorK = SistemaConversiones.convertirKilogramos();
        double resultadolibras = Math.round(conversorK * 100.0) / 100.0;
        System.out.println("El valor en Librass es: " + resultadolibras);

        double conversorGrados = SistemaConversiones.convertirCelsius();
        double resultadoGrados= Math.round(conversorGrados * 100.0) / 100.0;
        System.out.println("El valor en Fahrenheit es: " + resultadoGrados);

        Calculadora.menu();

        System.out.println("Reporte de estudiante");

        System.out.print("Nombre del estudiante: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese el usuario: ");
        String usuario = sc.nextLine();

        System.out.println("Ingrese su primera nota: ");
        double n1 = sc.nextDouble();

        System.out.println("Ingrese su segunda nota: ");
        double n2 = sc.nextDouble();

        System.out.println("Ingrese su tercera nota: ");
        double n3 = sc.nextDouble();

        double promedio = SistemaCalificaciones.obtenerPromedio(n1, n2, n3);
        String letra = SistemaCalificaciones.letraCalificacion(promedio);
        String estado = SistemaCalificaciones.estadoEstudiante(promedio);

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        }
    }
