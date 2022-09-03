

public class Main {
    public static void main(String[] args) {
        System.out.println("PRIMERA PARTE");
        int resultado;
        resultado = suma(1,2,3);
        System.out.printf("La suma es de: %d\n", resultado);
        System.out.println("------------------------------");
        System.out.println("SEGUNDA PARTE");
        Coche coche = new Coche();
        coche.incrementarNPuertas();
        System.out.printf("El numero de puertas que tiene el coche es de: %d", coche.numeroPuertas);


    }

    public static int suma(int a, int b, int c){
        return a+b+c;
    }
}