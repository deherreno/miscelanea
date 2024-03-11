package co.edu.sena;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dato1, dato2, dato3, dato4;
        String Dato1, Dato2, Dato3, Dato4;
        int optionmenu;

        do {
            System.out.println("----- MENÚ PRINCIPAL -----");
            System.out.println("1. Operadores");
            System.out.println("2. Condicionales");
            System.out.println("3. Ciclos");
            System.out.println("4. Arreglos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            optionmenu = scanner.nextInt();

            switch (optionmenu) {
                case 1:
                    // Submenú de operadores
                    int opcionOperadores;
                    do {
                        System.out.println("----- SUBMENÚ DE OPERADORES -----");
                        System.out.println("1. Área de un triangulo");
                        System.out.println("2. Suma de números");
                        System.out.println("3. numero al cuadrado");
                        System.out.println("4. euro a dolar");
                        System.out.println("5. area y perimetro de un cuadrado");
                        System.out.println("6. area y volumen de un cilindro");
                        System.out.println("7. longitud de una circunferencia y area de");
                        System.out.println("8. promedio de 3 notas");
                        System.out.println("9. Volver al menú principal");
                        System.out.print("Seleccione una opción: ");
                        opcionOperadores = scanner.nextInt();

                        switch (opcionOperadores) {
                            case 1:
                                System.out.println("Ingrese la base del triangulo: ");
                                dato1 = scanner.nextDouble();
                                System.out.println("Ingrese la altura del triangulo: ");
                                dato2 = scanner.nextDouble();
                                dato3 = ejercicios.areatriangulo(dato1, dato2);
                                System.out.println("El área del  es: " + dato3);
                                break;
                            case 2:
                                System.out.println("Ingrese el primer numero ");
                                dato1 = scanner.nextDouble();
                                System.out.println("Ingrese el segundo numero ");
                                dato2 = scanner.nextDouble();
                                dato3 = ejercicios.sumanumeros(dato1, dato2);
                                System.out.println("la suma de los 2 numeros es: " + dato3);
                                break;
                            case 3:
                                System.out.println("Ingrese el primer numero ");
                                dato1 = scanner.nextDouble();
                                dato2 = ejercicios.numerocuadrado(dato1);
                                System.out.println("el resultado de " + dato1 + " al cuadrado es de: " + dato2);
                                break;
                            case 4:
                                System.out.println("Ingrese los euros que desea convertir a dolar :");
                                dato1 = scanner.nextDouble();
                                System.out.println("Ingrese el precio del dolar :");
                                dato2 = scanner.nextDouble();
                                dato3 = ejercicios.eurodolar(dato1, dato2);
                                System.out.println("la conversion a dolar es de :" + dato3);
                                break;
                            case 5:
                                System.out.println("Ingrese el lado de un cuadrado ");
                                dato1 = scanner.nextDouble();
                                double[] resultados = ejercicios.areaperimetrocuadrado(dato1);
                                System.out.println("el area del cuadrado es: " + resultados[0] + " y el perimetro es "
                                        + resultados[1]);
                                break;
                            case 6:
                                System.out.println("Ingrese la radio del cilindro:");
                                dato1 = scanner.nextDouble();
                                System.out.println("Ingrese la altura del cilindro:");
                                dato2 = scanner.nextDouble();
                                double[] resultados1 = ejercicios.radioalturacilindro(dato1, dato2);
                                System.out.println("el area del cilindro es: " + resultados1[0] + " y el volumen es "
                                        + resultados1[1]);
                                break;
                            case 7:
                                System.out.println("Ingrese el radio");
                                dato1 = scanner.nextDouble();
                                double[] resultados2 = ejercicios.longitudareacirculo(dato1);
                                System.out.println("La longitud de circunferencia es de: " + resultados2[0]
                                        + " y el area del circulo es " + resultados2[1]);
                                break;
                            case 8:
                                System.out.println("ingrese su primer nota:");
                                dato1 = scanner.nextDouble();
                                System.out.println("ingrese su segunda  nota:");
                                dato2 = scanner.nextDouble();
                                System.out.println("ingrese su tercer nota:");
                                dato3 = scanner.nextDouble();
                                dato4 = ejercicios.promedionotas(dato1, dato2, dato3);
                                System.out.println("la conversion a dolar es de :" + dato4);
                                break;
                            default:
                                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                        }
                    } while (opcionOperadores != 9);
                    break;
                case 2:
                    // Submenú de condicionales
                    int opcionCondicionales;
                    do {
                        System.out.println("----- SUBMENÚ DE CONDICIONALES -----");
                        System.out.println("1. positivo o negativo");
                        System.out.println("2. mayor y menor");
                        System.out.println("3. mayor y menor de 3 numeros");
                        System.out.println("4. sumar o restar");
                        System.out.println("5. cociente de 2 numeros");
                        System.out.println("6. suma o multiplicacion");
                        System.out.println("7. año bisiesto o no");
                        System.out.println("8. Volver al menú principal");
                        System.out.print("Seleccione una opción: ");
                        opcionCondicionales = scanner.nextInt();

                        switch (opcionCondicionales) {
                            case 1:
                                System.out.println("Ingrese el numero ");
                                dato1 = scanner.nextDouble();
                                Dato2 = ejercicios.positivonegativo(dato1);
                                System.out.println(Dato2);
                                break;
                            case 2:
                                System.out.println("Ingrese el primer número:");
                                dato1 = scanner.nextDouble();
                                System.out.println("Ingrese el segundo número:");
                                dato2 = scanner.nextDouble();
                                double[] resultado = ejercicios.mayormenor(dato1, dato2);
                                dato3 = resultado[0];
                                dato4 = resultado[1];
                                System.out.println("El número mayor es: " + dato3 + "y el número menor es: " + dato4);
                                break;
                            case 3:
                                System.out.println("Ingrese el primer número:");
                                dato1 = scanner.nextDouble();
                                System.out.println("Ingrese el segundo número:");
                                dato2 = scanner.nextDouble();
                                System.out.println("Ingrese el tercer número:");
                                dato3 = scanner.nextDouble();
                                double[] resultados = ejercicios.mayormenortresnumeros(dato1, dato2, dato3);
                                System.out.println("El número mayor es: " + resultados[0] + "y el número menor es: "
                                        + resultados[1]);
                                break;
                            case 4:
                                System.out.println("Ingrese el primer número:");
                                dato1 = scanner.nextDouble();
                                System.out.println("Ingrese el segundo número:");
                                dato2 = scanner.nextDouble();
                                dato3 = ejercicios.sumarorestar(dato1, dato2);
                                System.out.println("El resultado es: " + dato3);
                                break;
                            case 5:
                                System.out.println("Ingrese el primer número:");
                                dato1 = scanner.nextDouble();
                                System.out.println("Ingrese el segundo número:");
                                dato2 = scanner.nextDouble();
                                System.out.println(ejercicios.cociente(dato1, dato2));
                                break;
                            case 6:
                                System.out.println("Ingrese el primer número:");
                                dato1 = scanner.nextDouble();
                                System.out.println("Ingrese el segundo número:");
                                dato2 = scanner.nextDouble();
                                dato3 = ejercicios.sumaromultiplicar(dato1, dato2);
                                System.out.println("El resultado de la operación es: " + dato3);
                                break;
                            case 7:
                                System.out.println("Ingrese el año:");
                                dato1 = scanner.nextDouble();
                                ejercicios.determinarBisiesto(dato1);
                                break;
                            case 8:
                                System.out.println("Volviendo al menú principal...");
                                break;
                            default:
                                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                        }
                    } while (opcionCondicionales != 8);
                    break;
                case 3:
                    System.out.println("Ciclos");
                    break;
                case 4:
                    System.out.println("Arreglos");
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        } while (optionmenu != 5);

        scanner.close();
    }
}
