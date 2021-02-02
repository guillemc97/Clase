public class main {
    public static void main(String[] args) {

        System.out.println("Ex1");
        ex1(30, 15);

        System.out.println("\nEx2");
        ex2(10, 5.50, 'a');

        System.out.println("\nEx3");
        ex3(10, 8, 5.5, 3.3);

        System.out.println("\nEx4");
        ex4(4);

        System.out.println("\nEx5");
        ex5(1,2,3,4);
    }

    /*
        1 - Declara dos variables numéricas (con el valor que desees), muestra por consola la suma,
        resta, multiplicación, división y módulo (resto de la división).
     */
    private static void ex1(int n1, int n2){

        int suma = n1 + n2;
        int resta = n1 - n2;
        int multipicacion = n1 + n2;
        int division = n1 / n2;
        int modulo = n1 % n2;

        System.out.println("Suma: "+suma);
        System.out.println("resta: "+resta);
        System.out.println("multipicacion: "+multipicacion);
        System.out.println("división: "+division);
        System.out.println("modulo: "+modulo);
    }

    /*
        2 - Escribe un programa Java que realice lo siguiente: declarar una variable N de tipo int,
        una variable A de tipo double y una variable C de tipo char y asigna a cada una un valor.
        A continuación muestra por pantalla:
        • El valor de cada variable.
        • La suma de N + A
        • La diferencia de A - N
        • El valor numérico correspondiente al carácter que contiene la variable C.
        Si por ejemplo le hemos dado a N el valor 5, a A el valor 4.56 y a C el valor ‘a’, se debe
        mostrar por pantalla:
        • Variable N = 5
        • Variable A = 4.56
        • Variable C = a
        • 5 + 4.56 = 9.559999999999999
        • 4.56 - 5 = -0.4400000000000004
        • Valor numérico del carácter a = 97
     */
    private static void ex2(int n, double a, char c){
        System.out.println("Variable N = "+n);
        System.out.println("Variable A = "+a);
        System.out.println("Variable C = "+c);

        double suma = n + a;
        System.out.println("La suma de N ("+n+") + A ("+a+"): "+suma);

        double resta = a - n;
        System.out.println("La diferencia de A ("+a+") - N ("+n+"): "+resta);

        System.out.println("Valor numérico del carácter a = "+(int)c);
    }

    /*
        3 - Escribe un programa Java que realice lo siguiente: declarar dos variables X e Y de tipo int,
        dos variables N y M de tipo double y asigna a cada una un valor. A continuación muestra por
        pantalla:
        • El valor de cada variable.
        • La suma X + Y
        • La diferencia X – Y
        • El producto X * Y
        • El cociente X / Y
        • El resto X % Y

        • La suma N + M
        • La diferencia N – M
        • El producto N * M
        • El cociente N / M
        • El resto N % M

        • La suma X + N
        • El cociente Y / M
        • El resto Y % M

        • El doble de cada variable
        • La suma de todas las variables
        • El producto de todas las variables
     */
    private static void ex3(int x, int y, double n, double m){
        double suma = x + y;
        System.out.println("La suma: "+suma);

        double resta = x - y;
        System.out.println("La diferencia: "+resta);

        double mult = x * y;
        System.out.println("El producto: "+mult);

        double div = x / y;
        System.out.println("El cociente: "+div);

        double modulo = x % y;
        System.out.println("El resto: "+modulo);


        suma = n + m;
        System.out.println("La suma: "+suma);

        resta = n - m;
        System.out.println("La diferencia: "+resta);

        mult = n * m;
        System.out.println("El producto: "+mult);

        div = n / m;
        System.out.println("El cociente: "+div);

        modulo = n % m;
        System.out.println("El resto: "+modulo);

        suma = x + n;
        System.out.println("La suma: "+suma);

        div = y / m;
        System.out.println("El cociente: "+div);

        modulo = y % m;
        System.out.println("El resto: "+modulo);

        double doble1 = x * 2;
        double doble2 = y * 2;
        double doble3 = n * 2;
        double doble4 = m * 2;
        System.out.println("El doble de cada variable: x: "+doble1+" y: "+doble2+" n: "+doble3+" m: "+doble4);

        suma = x + y + n + m;
        System.out.println("La suma de todas las variables: "+suma);

        mult = x * y * n * m;
        System.out.println("La suma de todas las variables: "+mult);

    }

    /*
        4 - Escribe un programa Java que declare una variable entera N y asígnale un valor. A
        continuación escribe las instrucciones que realicen los siguientes:
        • Incrementar N en 77.
        • Decrementarla en 3.
        • Duplicar su valor.
     */
    private static void ex4(int n){
        int incrementar = n + 77;
        System.out.println("Incrementar: "+incrementar);

        int decremental = n - 3;
        System.out.println("Decrementarla: "+decremental);

        int duplicar = n * 2;
        System.out.println("Duplicar: "+duplicar);
    }

    /*
        5 - Programa java que declare cuatro variables enteras A, B, C y D y
        asígnale un valor a cada una. A continuación realiza las instrucciones
        necesarias para que:
        • B tome el valor de C
        • C tome el valor de A
        • A tome el valor de D
        • D tome el valor de B
     */
    private static void ex5(int A, int B, int C, int D){

        B = C;
        System.out.println("B ("+B+") tome el valor de C ("+C+")");
        C = A;
        System.out.println("C ("+C+") tome el valor de A ("+A+")");
        A = D;
        System.out.println("A ("+A+") tome el valor de D ("+D+")");
        D = B;
        System.out.println("D ("+D+") tome el valor de B ("+B+")");
    }
}


