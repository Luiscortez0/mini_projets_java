import java.util.Scanner;
public class menuproblemas{
    public static void main(String[] args){
        boolean continuar = true;
        while(continuar){
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n\n1 = Conversor de unidades");
            System.out.println("2 = Generador de tablas de multiplicar");
            System.out.println("3 = Calculadora de factorial");
            System.out.println("4 = Contador de digitos");
            System.out.println("5 = Calculadora de fibonacci");
            System.out.println("0 = Salir");
            System.out.println("\nescribe la opcion deseada:");
            int op = scanner.nextInt();
            switch (op) {
                case 0://salir
                    scanner.close();
                    continuar = false;
                break;
                case 1://conversor de unidades
                    System.out.println("\n------Conversor de unidades------");
                    System.out.println("ingresa el valor a convertir: ");
                    double unidad = scanner.nextDouble();
                    System.out.println("\nopciones:");
                    System.out.println("1 = C->F");
                    System.out.println("2 = F->C");
                    System.out.println("\nescribe la opcion deseada: ");
                    int conver = scanner.nextInt(); 
                    conversor(unidad,conver);
                break;
                case 2://generador de tablas de multiplicar
                    System.out.println("\n------Generador de tablas de multiplicar------");
                    System.out.println("ingresa el valor a utilizar: ");
                    int numtabla = scanner.nextInt();
                    System.out.println("largo de tabla deseado: ");
                    int longtabla = scanner.nextInt(); 
                    tablas(numtabla,longtabla);
                break;
                case 3://calculadora de factorial
                    System.out.println("\n------Calculadora de factorial------");
                    System.out.println("ingresa el valor a utilizar: ");
                    int numfac = scanner.nextInt();
                    if(numfac>=0){
                        calfactorial(numfac);
                    }else{
                        System.out.println("error: numero negativo");
                    }
                break;
                case 4://contador de digitos
                    System.out.println("\n------Contador de digitos------");
                    System.out.println("ingresa el valor a utilizar: ");
                    int numdigito = scanner.nextInt();
                    contadordig(numdigito);
                break;
                case 5://calculadora de fibonacci
                    System.out.println("\n------Calculadora de fibonacci------");
                    System.out.println("cuantos valores necesitas?  ");
                    int N = scanner.nextInt();
                    if (N <= 0) {
                        System.out.println("\nError: el número debe ser positivo.");
                    } else {
                        System.out.println("\nLos primeros " + N + " números de la secuencia son:");
                        for (int i = 0; i < N; i++) {
                        System.out.print(Fibonacci(i) + ", ");
                        }
                    }
                break;
                default://opcion erronea
                    System.out.println("error: opcion invalida");
                break;
            } 
        }
    }

public static void conversor(double unidad, int conver){
    double resultado=0;
    switch(conver){
        case 1:
            resultado = (unidad*1.8)+32;
            System.out.println(unidad + " celsius, son: " + resultado + " fahrenheit");
        break;
        case 2:
            resultado = (unidad-32)*0.555555555555555555;
            System.out.println(unidad + " fahrenheit, son: " + resultado + " celsius");
        break;
        default:
            System.out.println("opcion invalida");
        break;
    }
}

public static void tablas(int numtabla, int longtabla){
    System.out.println("\n");
    for(int i=1; i<=longtabla; i++){
        System.out.println(numtabla + " * " + i + " = " + numtabla*i);
    }
}

public static void calfactorial(int numfac){
    System.out.println("\n");
    int resultado = numfac;
    for(int i=numfac-1; i>=1; i--){
        resultado= resultado*i;
    }
    System.out.println("el factorial de " + numfac + " es: " + resultado);
}

public static void contadordig(int numdigito){
    System.out.println("\n");
    int contador = 0, num=numdigito;
    if(num==0){
        System.out.println("El numero " + numdigito + " tiene: 1 digitos");
    }else{
    while (num != 0) {
        contador++;
        num = num / 10;
    }
    System.out.println("El numero " + numdigito + " tiene: " + contador + " digitos");
    }
}

public static int Fibonacci(int n) {
    if (n <= 1) {
        return n;
    } else {
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}
}