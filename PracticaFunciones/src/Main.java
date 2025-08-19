//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double conversorM = SistemaConversiones.convertirMetros();
        System.out.println("El valor en centimetros es: " + conversorM);

        double conversorK = SistemaConversiones.convertirKilogramos();
        double resultadolibras = Math.round(conversorK * 100.0) / 100.0;
        System.out.println("El valor en Librass es: " + resultadolibras);

        double conversorGrados = SistemaConversiones.convertirCelsius();
        double resultadoGrados= Math.round(conversorGrados * 100.0) / 100.0;
        System.out.println("El valor en Fahrenheit es: " + resultadoGrados);


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        }
    }
