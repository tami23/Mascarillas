import java.util.Scanner;

import java.util.Random;

public class Mascarillas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Random aleatorio = new Random();

        //Variables    
        final int higienicas = 50 + aleatorio.nextInt(951), quirurgicas = 50 + aleatorio.nextInt(951),
                fpp2 = 50 + aleatorio.nextInt(951), fpp3 = 50 + aleatorio.nextInt(951);

        String opcion;

        String menu = "\n1.Ver el pedido más grande\n"
                + "2.Total de mascarillas pedidas\n"
                + "3.Ver el pedido más pequeño\n"
                + "4.Salir\n\n"
                + "Elige una opción del menu:\n";

        //Cabecera
        System.out.print("DISTRIBUIDORA de productos Sanitarios \"TU SALUD\"\n\n"
                + "Nº de mascarillas solicitadas por tipo\n\n");

        System.out.print(higienicas + " - Higiénicas\n" + quirurgicas
                + " - Quirúrgicas\n" + fpp2 + " - FPP2\n" + fpp3 + " - FPP3\n");

        //Bucle menú
        System.out.println(menu);

        opcion = teclado.next();

        while (opcion.equals("4") == false) {

            switch (opcion) {

                case "1":  //pedido mas grande

                    if (higienicas >= fpp3 && higienicas >= fpp2 && higienicas >= quirurgicas) {

                        System.out.println("\nEl pedido mas grande es de: " + higienicas + " mascarillas higiénicas");

                    }

                    if (quirurgicas >= fpp3 && quirurgicas >= fpp2 && quirurgicas >= higienicas) {

                        System.out.println("\nEl pedido mas grande es de: " + quirurgicas + " mascarillas quirúrgicas");

                    }

                    if (fpp2 >= fpp3 && fpp2 >= quirurgicas && fpp2 >= higienicas) {

                        System.out.println("\nEl pedido mas grande es de: " + fpp2 + " mascarillas FPP2");

                    }

                    if (fpp3 >= fpp2 && fpp3 >= quirurgicas && fpp3 >= higienicas) {

                        System.out.println("\nEl pedido mas grande es de: " + fpp3 + " mascarillas FPP3");

                    }

                    System.out.println(menu);

                    opcion = teclado.next();

                    break;

                case "2":  //suma de todas las mascarillas

                    System.out.println("\nEl pedido es de " + (higienicas + quirurgicas + fpp2 + fpp3) + " mascarillas en total");

                    System.out.println(menu);

                    opcion = teclado.next();

                    break;

                case "3":  //pedido mas pequeño

                    if ((higienicas <= quirurgicas) && (higienicas <= fpp2) && (higienicas <= fpp3)) {

                        System.out.println("\nEl pedido mas pequeño es de: " + higienicas + " mascarillas higiénicas");

                    }

                    if ((quirurgicas <= fpp3) && (quirurgicas <= fpp2) && (quirurgicas <= higienicas)) {

                        System.out.println("\nEl pedido mas pequeño es de: " + quirurgicas + " mascarillas quirúrgicas");

                    }

                    if ((fpp2 <= quirurgicas) && (fpp2 <= higienicas) && (fpp2 <= fpp3)) {

                        System.out.println("\nEl pedido mas pequeño es de: " + fpp2 + " mascarillas FPP2");

                    }

                    if ((fpp3 <= quirurgicas) && (fpp3 <= higienicas) && (fpp3 <= fpp2)) {

                        System.out.println("\nEl pedido mas pequeño es de: " + fpp3 + " mascarillas FPP3");

                    }

                    System.out.println(menu);

                    opcion = teclado.next();

                    break;

                default:

                    System.out.println("\nOpción incorrecta");

                    System.out.println(menu);

                    opcion = teclado.next();

            }

        }

        if ("4".equals(opcion)) {  //Cierra menú

            System.out.println("\n¡ADIOS!");

        }

    }

}
