public class SistemaCalificaciones {
    // Sacar el promedio
    public static double obtenerPromedio(double n1, double n2, double n3){
        double suma = n1 + n2 + n3;
        double promedio = suma/3;
        return promedio;
    }
    //Promedio letra
    public static String letraCalificacion(double promedio){
        if (promedio >= 90){
            return "A";
        } else if (promedio >= 80) {
            return "B";
        } else if (promedio >= 70) {
            return "C";
        } else if (promedio >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    // Aprueba o no
    public static String estadoEstudiante(double promedio){
        if (promedio >= 70){
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
        return "Reprobado";
    }
}
