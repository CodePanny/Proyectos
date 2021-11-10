package ProyectosOB;

import java.util.Scanner;

public class EjercicioSesion2 {

    public static void main(String[] args) {
        String bienvenida = bienvenida();
        System.out.println(bienvenida());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el precio sin IVA: ");
        double precioBase = scanner.nextDouble();
        double soloIva = precioBase * 0.21;
        System.out.println("El IVA de este artículo es " + (double)Math.round(soloIva * 100d) / 100d + "\n");

        double precioPagar = precioFinal(precioBase, soloIva);
        System.out.println("El total a pagar es " + (double)Math.round(precioPagar * 100d) / 100d);

    }

    static String bienvenida(){
        return "Hola, bienvenida/o a la calculadora de IVA. \n";
    }

     static double precioFinal(double precioBase, double soloIva){
        return precioBase + soloIva;
    }

}
