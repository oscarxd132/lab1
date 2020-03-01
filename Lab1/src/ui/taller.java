
/*Laboratorio 1
Oscar Bejarano*/
import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;

/**
 * This class contains the code of lab1
 *
 * @author oscar andres bejarano castro
 */
public class taller {

    public static String[] arrayResult;
    public static int[] arrayNum1;
    public static int[] arrayNum2;
    public static int[] arrayNum3;
    public static int largoA = 0;
    public static int[] arrayTemp16;
    public static int[] arrayTemp17;
    public static int[] arrayTemp10;

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
                            for (int i = 0; i < largoA + largoA + 19; i++) {
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
                    //////////////////////////////////////////////////////////////////////////////
                    case 10:
                        limpiar();
                        arrayTemp10 = new int[largoA];
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
                                    System.arraycopy(arrayNum1, 0, arrayTemp10, 0, largoA);
                                    //double g=promedio();
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
                            int seleccionO = 0;
                            int mayorNumA = 0;
                            int[] arrayTemp = new int[largoA];
                            int[] arrayTemp2 = new int[largoA];
                            int[] arrayResult = new int[largoA];
                            System.out.println("digite el numero de que arreglo desea ultilizar primero (Arreglo 1 = 1  Arreglo 2 = 2   Arreglo 3 = 3)");
                            seleccionA = lector.nextInt();
                            switch (seleccionA) {
                                case 1:
                                    for (int i = 0; i < largoA; i++) {
                                        arrayTemp[i] = arrayNum1[i];
                                    }
                                    break;

                                case 2:
                                    for (int i = 0; i < largoA; i++) {
                                        arrayTemp[i] = arrayNum2[i];
                                    }
                                    break;

                                case 3:
                                    for (int i = 0; i < largoA; i++) {
                                        arrayTemp[i] = arrayNum3[i];
                                    }
                                    break;
                            }
                            System.out.println("digite el numero de que arreglo desea ultilizar de segundo (Arreglo 1 = 1  Arreglo 2 = 2   Arreglo 3 = 3)");
                            seleccionA = lector.nextInt();
                            switch (seleccionA) {
                                case 1:
                                    for (int i = 0; i < largoA; i++) {
                                        arrayTemp2[i] = arrayNum1[i];
                                    }
                                    break;

                                case 2:
                                    for (int i = 0; i < largoA; i++) {
                                        arrayTemp2[i] = arrayNum2[i];
                                    }
                                    break;

                                case 3:
                                    for (int i = 0; i < largoA; i++) {
                                        arrayTemp2[i] = arrayNum3[i];
                                    }
                                    break;
                            }
                            System.out.println("digite el numero de que operacion desea ultilizar (suma = 1  resta = 2   multiplicacion = 3)");
                            seleccionO = lector.nextInt();
                            switch (seleccionA) {
                                case 1:
                                    for (int i = 0; i < largoA; i++) {
                                        arrayResult[i] = arrayTemp[i] + arrayTemp2[i];
                                    }
                                    break;

                                case 2:
                                    for (int i = 0; i < largoA; i++) {
                                        arrayResult[i] = arrayTemp[i] - arrayTemp2[i];
                                    }
                                    break;

                                case 3:
                                    for (int i = 0; i < largoA; i++) {
                                        arrayResult[i] = arrayTemp[i] * arrayTemp2[i];
                                    }
                                    break;
                            }
                            System.out.println("El arreglo resultante de la operacion de las dos cadenas es: ");
                            for (int i = 0; i < largoA; i++) {
                                System.out.print(arrayResult[i] + " ");
                            }
                        } else {
                            System.out.println("error, debe primero crear los arreglos en el punto 8");
                        }
                        break;
                    case 13:

                        if (arrayCreado) {
                            int[] arrayTemp = new int[largoA * 3];
                            for (int i = 0; i < largoA; i++) {
                                arrayTemp[i] = arrayNum1[i];
                            }
                            int k = 0;
                            for (int i = largoA; i < largoA * 2; i++) {
                                arrayTemp[i] = arrayNum2[k];
                                k++;
                            }
                            k = 0;
                            for (int i = largoA * 2; i < largoA * 3; i++) {
                                arrayTemp[i] = arrayNum3[k];
                                k++;
                            }
                            for (int i = 0; i < largoA * 3; i++) {
                                System.out.print(arrayTemp[i] + " ");
                            }
                        } else {
                            System.out.println("error, debe primero crear los arreglos en el punto 8");
                        }
                        break;
                    case 14:
                        arrayResult = new String[largoA * 3];
                        limpiar();
                        if (arrayCreado) {
                            unirArray();
                            noRepetir();
                            for (int i = 0; i <= largoA - 1; i++) {
                                if (arrayResult[i] != "") {
                                    System.out.println(arrayResult[i]);
                                }
                            }
                        } else {
                            System.out.println("error, debe primero crear los arreglos en el punto 8");
                        }
                        break;
                    case 15:
                        arrayResult = new String[largoA * 3];
                        limpiar();
                        if (arrayCreado) {
                            unirArray();
                            siRepetir();
                            for (int i = 0; i <= largoA - 1; i++) {
                                if (arrayResult[i] != "") {
                                    System.out.println(arrayResult[i]);
                                }
                            }
                        } else {
                            System.out.println("error, debe primero crear los arreglos en el punto 8");
                        }
                        break;
                    case 16:
                        limpiar();
                        arrayTemp16 = new int[largoA];
                        int n = 0;
                        if (arrayCreado) {
                            int seleccionA = 0;
                            System.out.println("digite el numero de que arreglo desea ultilizar (Arreglo 1 = 1  Arreglo 2 = 2   Arreglo 3= 3)");
                            seleccionA = lector.nextInt();
                            System.out.println("digite el numero de espacios que desea rotar");
                            n = lector.nextInt();
                            switch (seleccionA) {
                                case 1:
                                    System.arraycopy(arrayNum1, 0, arrayTemp16, 0, largoA);
                                    int arrayTemp162[] = rotarArray(n);
                                    System.out.print("el resultado de girar " + n + " posiciones el arreglo es de: ");
                                    for (int i = 0; i < largoA; i++) {
                                        System.out.print(arrayTemp162[i] + " ");
                                    }
                                    System.out.println("");
                                    break;

                                case 2:
                                    System.arraycopy(arrayNum2, 0, arrayTemp16, 0, largoA);
                                    int arrayTemp163[] = rotarArray(n);
                                    System.out.print("el resultado de girar " + n + " posiciones el arreglo es de: ");
                                    for (int i = 0; i < largoA; i++) {
                                        System.out.print(arrayTemp163[i] + " ");
                                    }
                                    System.out.println("");
                                    break;

                                case 3:
                                    System.arraycopy(arrayNum3, 0, arrayTemp16, 0, largoA);
                                    int arrayTemp161[] = rotarArray(n);
                                    System.out.print("el resultado de girar " + n + " posiciones el arreglo es de: ");
                                    for (int i = 0; i < largoA; i++) {
                                        System.out.print(arrayTemp161[i] + " ");
                                    }
                                    System.out.println("");
                                    break;
                            }
                        } else {
                            System.out.println("error, debe primero crear los arreglos en el punto 8");
                        }
                        break;
                    case 17:
                        limpiar();
                        arrayTemp17 = new int[largoA];
                        if (arrayCreado) {
                            int seleccionA = 0;
                            System.out.println("digite el numero de que arreglo desea ultilizar (Arreglo 1 = 1  Arreglo 2 = 2   Arreglo 3= 3)");
                            seleccionA = lector.nextInt();
                            switch (seleccionA) {
                                case 1:
                                    System.arraycopy(arrayNum1, 0, arrayTemp17, 0, largoA);
                                    int arrayTemp172[] = ordenar();
                                    System.out.print("el resultado de ordenar el arreglo es: ");
                                    for (int i = 0; i < largoA; i++) {
                                        System.out.print(arrayTemp172[i] + " ");
                                    }
                                    System.out.println("");
                                    break;

                                case 2:
                                    System.arraycopy(arrayNum2, 0, arrayTemp17, 0, largoA);
                                    int arrayTemp173[] = ordenar();
                                    System.out.print("el resultado de ordenar el arreglo es: ");
                                    for (int i = 0; i < largoA; i++) {
                                        System.out.print(arrayTemp173[i] + " ");
                                    }
                                    System.out.println("");
                                    break;

                                case 3:
                                    System.arraycopy(arrayNum3, 0, arrayTemp17, 0, largoA);
                                    int arrayTemp171[] = ordenar();
                                    System.out.print("el resultado de ordenar el arreglo es: ");
                                    for (int i = 0; i < largoA; i++) {
                                        System.out.print(arrayTemp171[i] + " ");
                                    }
                                    System.out.println("");
                                    break;
                            }
                        } else {
                            System.out.println("error, debe primero crear los arreglos en el punto 8");
                        }
                        break;
                }
            } else {
                System.exit(0);
            }

        }
    }

    /**
     * this method orders an array, with the "bubble" method
     * <b>pre:</b> The array is already initialized (is not null).<br>
     * <b>post:</b> The array values ??have been ordered, from lowest to highest
     * value.<br>
     *
     * @param array array!= null
     * @return the orderly array.
     */
    public static int[] ordenar() {
        int intercambio;
        for (int i = 0; i < arrayTemp17.length - 1; i++) {
            for (int j = 0; j < arrayTemp17.length - 1; j++) {
                if (arrayTemp17[j] > arrayTemp17[j + 1]) {
                    intercambio = arrayTemp17[j];
                    arrayTemp17[j] = arrayTemp17[j + 1];
                    arrayTemp17[j + 1] = intercambio;

                }
            }
        }

        return arrayTemp17;
    }

    /**
     * this method orders an array moving "n" position the values
     * <b>pre:</b> The array is already initialized (is not null).<br>
     * <b>post:</b> The array values ??have been ordered runed "n"
     * positions.<br>
     *
     * @param array array!= null
     * @return
     */
    public static int[] rotarArray(int a) {
        int ultimo = arrayTemp16[arrayTemp16.length - 1];
        for (int i = 0; i < a; i++) {
            ultimo = arrayTemp16[arrayTemp16.length - 1];
            for (int j = arrayTemp16.length - 2; j >= 0; j--) {
                arrayTemp16[j + 1] = arrayTemp16[j];
            }
            arrayTemp16[0] = ultimo;
        }
        return arrayTemp16;

    }

    /* public static double promedio() {
        double promedioA = 0;
        for (int i = 0; i < largoA; i++) {
            promedioA = arrayTemp10[i] + promedioA;
        }
        promedioA = promedioA / largoA;
        return promedioA;
    }*/
    /**
     * this method create an array of the union of 3 arrays
     * <b>pre:</b> The arrays is already initialized (is not null).<br>
     * <b>post:</b> The array that contains the values of the 3 arrays.<br>
     *
     * @param array array!= null
     * @return
     */
    public static void unirArray() {
        for (int i = 0; i < largoA; i++) {
            arrayResult[i] = Integer.toString(arrayNum1[i]);
        }
        for (int i = 0; i < largoA; i++) {
            arrayResult[i + largoA] = Integer.toString(arrayNum2[i]);
        }
        for (int i = 0; i < largoA; i++) {
            arrayResult[i + largoA] = Integer.toString(arrayNum3[i]);
        }
    }

    /**
     * this method create an array of the union of 2 arrays, without repeated
     * values
     * <b>pre:</b> The arrays is already initialized (is not null).<br>
     * <b>post:</b> The array that contains the values of the 2 arrays, without
     * repeated values.<br>
     *
     * @param array array!= null
     * @return
     */
    public static void noRepetir() {
        for (int i = 0; i < arrayResult.length; i++) {
            for (int j = 0; j < arrayResult.length - 1; j++) {
                if (i != j) {
                    if (arrayResult[i].equals(arrayResult[j])) {
                        // eliminamos su valor
                        arrayResult[i] = "";
                    }
                }
            }
        }
    }

    /**
     * this method create an array of the union of 2 arrays, with repeated
     * values
     * <b>pre:</b> The arrays is already initialized (is not null).<br>
     * <b>post:</b> The array that contains the values of the 2 arrays, with
     * repeated values.<br>
     *
     * @param array array!= null
     * @return
     */
    public static void siRepetir() {
        for (int i = 0; i < arrayResult.length; i++) {
            for (int j = 0; j < arrayResult.length - 1; j++) {
                if (i != j) {
                    if (arrayResult[i] != (arrayResult[j])) {
                        // eliminamos su valor
                        arrayResult[i] = "";
                    }
                }
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
