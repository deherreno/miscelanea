package co.edu.sena;

public class ejercicios {
    static double areatriangulo(double dato1, double dato2) {
        double dato3 = (dato1 * dato2) / 2;
        return dato3;
    }

    static double sumanumeros(double dato1, double dato2) {
        double dato3 = dato1 + dato2;
        return dato3;
    }

    static double numerocuadrado(double dato1) {
        double dato2 = dato1 * dato1;
        return dato2;
    }

    static double eurodolar(double dato1, double dato2) {
        double dato3 = dato1 * dato2;
        return dato3;
    }

    static double[] areaperimetrocuadrado(double dato1) {
        double dato2 = dato1 * dato1;
        double dato3 = dato1 * 4;
        double[] resultados = { dato2, dato3 };
        return resultados;
    }

    static double[] radioalturacilindro(double dato1, double dato2) {
        double dato3 = 2 * Math.PI * dato1 * (dato1 + dato2);
        double dato4 = Math.PI * Math.pow(dato1, 2) * dato2;
        double[] resultados1 = { dato3, dato4 };
        return resultados1;
    }

    static double[] longitudareacirculo(double dato1) {
        double dato2 = 2 * Math.PI * dato1;
        double dato3 = Math.PI * Math.pow(dato1, 2);
        double[] resultados2 = { dato2, dato3 };
        return resultados2;
    }

    static double promedionotas(double dato1, double dato2, double dato3) {
        double dato4 = (dato1 + dato2 + dato3) / 3;
        return dato4;
    }

    static String positivonegativo(double dato1) {
        String Dato2;
        if (dato1 < 0) {
            Dato2 = "El número es negativo";
        } else if (dato1 > 0) {
            Dato2 = "El número es positivo";
        } else {
            Dato2 = "El número es neutro";
        }
        return Dato2;
    }

    public static double[] mayormenor(double dato1, double dato2) {
        double[] resultado = new double[2];
        if (dato1 > dato2) {
            resultado[0] = dato1;
            resultado[1] = dato2;
        } else if (dato1 < dato2) {
            resultado[0] = dato2;
            resultado[1] = dato1;
        }
        return resultado;
    }

    public static double[] mayormenortresnumeros(double dato1, double dato2, double dato3) {
        double[] resultados3 = new double[2];

        if (dato1 >= dato2 && dato1 >= dato3) {
            resultados3[0] = dato1;
        } else if (dato2 >= dato1 && dato2 >= dato3) {
            resultados3[0] = dato2;
        } else {
            resultados3[0] = dato3;
        }

        if (dato1 <= dato2 && dato1 <= dato3) {
            resultados3[1] = dato1;
        } else if (dato2 <= dato1 && dato2 <= dato3) {
            resultados3[1] = dato2;
        } else {
            resultados3[1] = dato3;
        }
        return resultados3;
    }

    public static double sumarorestar(double dato1, double dato2) {
        double dato3;
        if (dato1 < dato2) {
            dato3 = dato1 + dato2;
        } else {
            dato3 = dato1 - dato2;
        }
        return dato3;
    }

    public static String cociente(double dato1, double dato2) {
        if (dato2 == 0) {
            return "La división por cero no está definida";
        } else {
            double cociente = dato1 / dato2;
            return "El cociente entre " + dato1 + " y " + dato2 + " es: " + cociente;
        }
    }

    public static double sumaromultiplicar(double dato1, double dato2) {
        double dato3;
        if (dato1 < 0 || dato2 < 0) {
            dato3 = dato1 + dato2;
        } else {
            dato3 = dato1 * dato2;
        }
        return dato3;
    }

    public static void determinarBisiesto(double dato1) {
        if (dato1 % 4 == 0) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }
}
