package ProyectosOB;

public class EjercicioSesion3 {

    public static void main(String[] args) {
        String saltoLinea = "\n";
        String[] nombreEmpleado = {"Juan", "Luis", "Emilio", "Amaia", "Rosario", "Raquel"};

        for(int i = 0; i < nombreEmpleado.length; i++) {

            System.out.println(i + " " + nombreEmpleado[i] );

        }
        System.out.println(saltoLinea + "A día de hoy la empresa cuenta con un total de " + nombreEmpleado.length + " empleados.");
    }
}
