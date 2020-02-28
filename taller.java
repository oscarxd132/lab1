
/*Laboratorio 1
Oscar Bejarano*/
import java.util.Scanner;
import java.io.IOException;

public class taller {

    public static void main(String args[]) throws InterruptedException {

        Scanner lector = new Scanner(System.in);
        boolean bucle = true;
        int menu = 1;
        int seleccion;
        String c1 = "", c2 = "", c3 = "";
        int largoC1, largoC2, largoC3;
        int caracterU;
        double num1 = 0, num2 = 0, num3 = 0;
        double division = 0, residuo = 0;
        int entero1 = 0, entero2 = 0;
        int largoA = 0;
        int[] arrayNum1 = new int[largoA];
        int[] arrayNum2 = new int[largoA];
        int[] arrayNum3 = new int[largoA];
        boolean arrayCreado = false;

        // genero un ciclo con el menu
        while (bucle) {
            System.out.println("desea ver el menu? \nSi=1   No=0");
            menu = lector.nextInt();
            limpiar();
            if (menu == 1) {
                System.out.println("Seleccione una de las siguientes opciones digitando el numero que le corresponde: \n"
                        + "1. Ingresar tres cadenas de caracteres\n" + "2. Desplegar la longitud de cada una de las cadenas\n"
                        + "3. Concatenar las tres cadenas y mostrar en pantalla\n"
                        + "4. Mostrar en pantalla el carácter ubicado en una posición de la cadena según el usuario ingrese. Mostrar los tres caracteres de cada una de las tres cadenas. En caso que no sea una posición válida, informele al usuario.\n"
                        + "5. Ingresar dos números reales mayores a cero\n" + "6. Mostrar la división  de ambos números\n"
                        + "7. Mostrar la división y el residuo de la parte entera de ambos números\n"
                        + "8. Ingresar tres arreglos de números enteros, cuya longitud para cada uno sea escogido por el usuario\n"
                        + "9. Desplegar en pantalla los tres arreglos ingresados. Sea creativo en el diseño de despliegue.\n"
                        + "10. Indique el valor promedio de los valores ingresados al arreglo, utilizando uno de los tres arreglos ingresados por el usuario en el quinto punto (El usuario decide cuál).\n"
                        + "11. Indique el mayor valor de los valores ingresados al arreglo, utilizando uno de los tres arreglos ingresados por el usuario en el quinto punto (El usuario decide cuál).\n"
                        + "12. Generar un nuevo arreglo con la operación indicada  (suma, resta o multiplicación), utilizando dos de los tres arreglos ingresados por el usuario en el quinto punto. El usuario decide cuáles.\n"
                        + "13. Generar un nuevo arreglo con la unión de los tres arreglos ingresados por el usuario en el punto quinto (con elementos repetidos)\n"
                        + "14. Generar un nuevo arreglo con la unión de los tres arreglos ingresados por el usuario en el punto quinto (sin elementos repetidos)\n"
                        + "15. Generar un nuevo arreglo con la intercepción de los tres arreglos ingresados por el usuario en el punto quinto (elementos repetidos)\n"
                        + "16. Girar n posiciones, los valores del arreglo, utilizando uno de los tres arreglos ingresados por el usuario en el quinto punto (El usuario decide cuál).\n"
                        + "17. Ordene de menor a mayor los valores del arreglo, utilizando uno de los tres arreglos ingresados por el usuario en el quinto punto (El usuario decide cuál) y a través del método llamado burbuja.\n"
                        + "Digite el numero a continuacion: ");
                seleccion = lector.nextInt();
                switch (seleccion) {
                    case 1:
                        limpiar();
                        lector.nextLine();
                        System.out.print("digite la primer cadena de texto: \n");
                        c1 = lector.nextLine();
                        System.out.print("digite la segunda cadena de texto: \n");
                        c2 = lector.nextLine();
                        System.out.print("digite la tercera cadena de texto: \n");
                        c3 = lector.nextLine();
                        System.out.println("Cadenas guardadas");
                        break;
                    case 2:
                        limpiar();
                        if (!c1.equals("") && !c2.equals("") && !c3.equals("") && c1 != null && c2 != null && c3 != null) {
                            largoC1 = c1.length();
                            largoC2 = c2.length();
                            largoC3 = c3.length();
                            System.out.println("El largo de la primer cadena es " + largoC1);
                            System.out.println("El largo de la segunda cadena es " + largoC2);
                            System.out.println("El largo de la tercer cadena es " + largoC3);
                        } else {
                            System.out.println("Primero debe de guardar las cadenas, seleccione el punto 1 primero");
                        }
                        break;
                    case 3:
                        limpiar();
                        if ((c1.equals("") || c2.equals("") || c3.equals(""))) {
                            System.out.println("Primero debe de guardar las cadenas, seleccione el punto 1 primero");
                        } else {
                            System.out.println("el resultado de concatenar las tres cadenas es:");
                            System.out.println(c1 + " " + c2 + " " + c3);
                        }
                        break;
                    case 4:
                        limpiar();
                        if ((c1.equals("") || c2.equals("") || c3.equals(""))) {
                            System.out.println("Primero debe de guardar las cadenas, seleccione el punto 1 primero");
                        } else {
                            System.out.println("Digite la posición del caracter que desea ver de cada una de las cadenas (contando desde el numero 0)");
                            caracterU = lector.nextInt();
                            if (caracterU > c1.length() || caracterU > c2.length() || caracterU > c3.length()) {
                                System.out.println("La posicion digitada supera la cantidad de caracteres de una de las cadenas, por favor digite un valor valido");
                            } else {
                                System.out.println("el caracter de la posicion numero " + caracterU + " de la primer cadena es: " + c1.charAt(caracterU));
                                System.out.println("el caracter de la posicion numero " + caracterU + " de la segunda cadena es: " + c2.charAt(caracterU));
                                System.out.println("el caracter de la posicion numero " + caracterU + " de la tercer cadena es: " + c3.charAt(caracterU));
                            }

                        }
                        break;
                    case 5:
                        limpiar();
                        lector.nextLine();
                        System.out.print("digite el primer numero real mayor a cero: \n");
                        num1 = lector.nextDouble();
                        if (num1 <= 0) {
                            System.out.println("numero digitado invalido, por favor intente de nuevo");
                            num1 = 0;
                        } else {
                            System.out.print("digite el segundo numero real mayor a cero: \n");
                            num2 = lector.nextDouble();
                            if (num2 <= 0) {
                                System.out.println("numero digitado invalido, por favor intente de nuevo");
                                num2 = 0;
                            } else {
                                System.out.println("numeros guardados");
                            }

                        }

                        break;

                    case 6:
                        limpiar();
                        if (num1 == 0 || num2 == 0) {
                            System.out.println("Primero debe de guardar los numeros, seleccione el punto 5 primero");
                        } else {
                            System.out.println("El resultado de la division de ambos numeros es de:");
                            division = num1 / num2;
                            System.out.println(division);
                        }
                        break;

                    case 7:
                        limpiar();
                        if (num1 == 0 || num2 == 0) {
                            System.out.println("Primero debe de guardar los numeros, seleccione el punto 5 primero");
                        } else {
                            System.out.println("El resultado de la division de la parte entera de ambos numeros es de:");
                            entero1 = (int) num1;
                            entero2 = (int) num2;
                            division = entero1 / entero2;
                            System.out.println(division);
                            System.out.println("El residuo de la division de la parte entera de ambos numeros es de:");
                            residuo = entero1 % entero2;
                            System.out.println(residuo);
                        }
                        break;

                    case 8:
                        limpiar();
                        System.out.println("digite el valor del largo de los arreglos");
                        largoA = lector.nextInt();
                        arrayNum1 = new int[largoA];
                        arrayNum2 = new int[largoA];
                        arrayNum3 = new int[largoA];
                        for (int i = 0; i < largoA; i++) {
                            System.out.println("digite el valor de la ´posicion " + i + " del primer arreglo");
                            arrayNum1[i] = lector.nextInt();
                        }
                        for (int i = 0; i < largoA; i++) {
                            System.out.println("digite el valor de la ´posicion " + i + " del segundo arreglo");
                            arrayNum2[i] = lector.nextInt();
                        }
                        for (int i = 0; i < largoA; i++) {
                            System.out.println("digite el valor de la ´posicion " + i + " del tercer arreglo");
                            arrayNum3[i] = lector.nextInt();
                        }
                        arrayCreado = true;
                        break;

                    case 9:
                        limpiar();
                        if (arrayCreado) {
                            for (int i = 0; i < largoA + largoA + 18; i++) {
                                System.out.print("*");
                                Thread.sleep(100);
                            }
                            System.out.println("*");
                            System.out.print("*  Primer array: ");
                            for (int i = 0; i < largoA; i++) {
                                System.out.print(arrayNum1[i] + " ");
                                Thread.sleep(100);
                            }
                            System.out.println("  *");
                            System.out.print("*  segundo array: ");
                            for (int i = 0; i < largoA; i++) {
                                System.out.print(arrayNum2[i] + " ");
                                Thread.sleep(100);
                            }
                            System.out.println(" *");
                            System.out.print("*  tercer array: ");
                            for (int i = 0; i < largoA; i++) {
                                System.out.print(arrayNum3[i] + " ");
                                Thread.sleep(100);
                            }
                            System.out.println("  *");
                            for (int i = 0; i < largoA + 19 + largoA; i++) {
                                System.out.print("*");
                                Thread.sleep(100);
                            }
                            System.out.println("*");
                        } else {
                            System.out.println("error, debe primero crear los arreglos en el punto 8");
                        }
                        break;
                    case 10:
                        limpiar();
                        if (arrayCreado) {
                            int seleccionA = 0;
                            int promedioA = 0;
                            System.out.println("digite el numero de que arreglo desea ultilizar (Arreglo 1 = 1  Arreglo 2 = 2   Arreglo 3= 3)");
                            seleccionA = lector.nextInt();
                            switch (seleccionA) {
                                case 1:
                                    for (int i = 0; i < largoA; i++) {
                                        promedioA = arrayNum1[i] + promedioA;
                                    }
                                    promedioA = promedioA / largoA;
                                    System.out.println("El promedio de los numeros del arreglo es de " + promedioA);
                                    break;

                                case 2:
                                    for (int i = 0; i < largoA; i++) {
                                        promedioA = arrayNum2[i] + promedioA;
                                    }
                                    promedioA = promedioA / largoA;
                                    System.out.println("El promedio de los numeros del arreglo es de " + promedioA);
                                    break;

                                case 3:
                                    for (int i = 0; i < largoA; i++) {
                                        promedioA = arrayNum1[i] + promedioA;
                                    }
                                    promedioA = promedioA / largoA;
                                    System.out.println("El promedio de los numeros del arreglo es de " + promedioA);
                                    break;
                            }
                        } else {
                            System.out.println("error, debe primero crear los arreglos en el punto 8");
                        }
                        break;
                    case 11:
                        limpiar();
                        if (arrayCreado) {
                            int seleccionA = 0;
                            int mayorNumA = 0;
                            System.out.println("digite el numero de que arreglo desea ultilizar (Arreglo 1 = 1  Arreglo 2 = 2   Arreglo 3= 3)");
                            seleccionA = lector.nextInt();
                            switch (seleccionA) {
                                case 1:
                                    mayorNumA = arrayNum1[0];
                                    for (int i = 0; i < largoA; i++) {
                                        if (arrayNum1[i] > mayorNumA) {
                                            mayorNumA = arrayNum1[i];
                                        }
                                    }

                                    System.out.println("El numero de mayor valor del arreglo es de " + mayorNumA);
                                    break;

                                case 2:
                                    mayorNumA = arrayNum2[0];
                                    for (int i = 0; i < largoA; i++) {
                                        if (arrayNum2[i] > mayorNumA) {
                                            mayorNumA = arrayNum2[i];
                                        }
                                    }

                                    System.out.println("El numero de mayor valor del arreglo es de " + mayorNumA);
                                    break;

                                case 3:
                                    mayorNumA = arrayNum3[0];
                                    for (int i = 0; i < largoA; i++) {
                                        if (arrayNum3[i] > mayorNumA) {
                                            mayorNumA = arrayNum3[i];
                                        }
                                    }

                                    System.out.println("El numero de mayor valor del arreglo es de " + mayorNumA);
                                    break;
                            }
                        } else {
                            System.out.println("error, debe primero crear los arreglos en el punto 8");
                        }
                        break;
                    case 12:
                        limpiar();
                        if (arrayCreado) {
                            int seleccionA = 0;
                            int mayorNumA = 0;
                            System.out.println("digite el numero de que arreglo desea ultilizar (Arreglo 1 = 1  Arreglo 2 = 2   Arreglo 3= 3)");
                            seleccionA = lector.nextInt();
                            switch (seleccionA) {
                                case 1:
                                    mayorNumA = arrayNum1[0];
                                    for (int i = 0; i < largoA; i++) {
                                        if (arrayNum1[i] > mayorNumA) {
                                            mayorNumA = arrayNum1[i];
                                        }
                                    }

                                    System.out.println("El numero de mayor valor del arreglo es de " + mayorNumA);
                                    break;

                                case 2:
                                    mayorNumA = arrayNum2[0];
                                    for (int i = 0; i < largoA; i++) {
                                        if (arrayNum2[i] > mayorNumA) {
                                            mayorNumA = arrayNum2[i];
                                        }
                                    }

                                    System.out.println("El numero de mayor valor del arreglo es de " + mayorNumA);
                                    break;

                                case 3:
                                    mayorNumA = arrayNum3[0];
                                    for (int i = 0; i < largoA; i++) {
                                        if (arrayNum3[i] > mayorNumA) {
                                            mayorNumA = arrayNum3[i];
                                        }
                                    }

                                    System.out.println("El numero de mayor valor del arreglo es de " + mayorNumA);
                                    break;
                            }
                        } else {
                            System.out.println("error, debe primero crear los arreglos en el punto 8");
                        }
                        break;
                    case 13:

                        break;
                    case 14:

                        break;
                    case 15:

                        break;
                    case 16:

                        break;
                    case 17:

                        break;
                }
            } else {
                System.exit(0);
            }

        }
    }

    public static void limpiar() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
