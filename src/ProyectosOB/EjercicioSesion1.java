package ProyectosOB;

public class EjercicioSesion1 {

    public static void main(String[] args) {

        // 1.1 enteros
        byte variable1 = 4;
        short variable2 = 10;
        int variable3 = 30;  // Normalmente trabajamos con int o long
        long variable4 = 100;

        // 1.2 decimales
        float variable5 = 5.5f;
        double variable6 = 10.10d;

        // booleano
        boolean variable7 = true;
        variable7 = false;


        // texto
        char variable9 = 'a';
        String variable10 = "Lorem ipsum dolor sit amet....";

        System.out.println("Vamos a ver los tipos de datos basicos con los que popdemos trabajar en " +
                "Java. Principalmente hablaremos de datos numericos, booleanos y de texto.\n \nDentro de los numericos " +
                "podemos hablar de enteros o decimales: \n" +
                "· Numericos:\n" +
                "   Pueden ser de tipo entero o decimal:\n" +
                "   · Enteros:\n" +
                "    - byte: " + variable1 +"\n" +  //Estan ordenados de menor a mayor capacidad, siendo int y long -
                "    - short: " + variable2 +"\n" + //- los más usados
                "    - int: " + variable3 +"\n" +
                "    - long: " + variable4 +"\n" +
                "   · Decimales:\n" +
                "    - float: " + variable5 +"\n" +
                "    - double " + variable6 +"\n\n" +
                "El siguiente tipo de dato son los booleans, los cuales pueden contener un valor true o false: \n" +
                "    - boolean variableX = true \n    - boolean variableY = false \n Veamos algun ejemplo \n" +
                "    - ¿Te gusta madrugar?");
                 if (variable7==true){   // siempre va a ser false porque no damos opción al usuario para contestar
                    System.out.println("    - Me gusta madrugar");}
                 else {
                     System.out.println("    - Seamos realistas, a nadie le gusta madrugar");
                       }

        System.out.println("\n Por ultimo tenemos las variables que contienen texto, que son char y String. En la mayoria" +
                "de supuestos utilizaremos String:\n" +
                "   - char: " + variable9 + "\n" +
                "   - String: " + variable10
        );

    }
}
