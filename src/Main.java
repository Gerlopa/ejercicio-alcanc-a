import java.util.Scanner;
//Deivid Andres Real Franco
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int m20 = 0, m50 = 0, m100 = 0, m200 = 0, m500 = 0, ing = 0, sal=0,mon=0;
        do {
            System.out.println("Menú:");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Conteo del dinero");
            System.out.println("3. Romper alcancía");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Has elegido la Opción 1: Ingresar dinero");
                    System.out.println("¿De cuánto es la cantidad?");
                    System.out.println("1. Monedas de 20");
                    System.out.println("2. Monedas de 50");
                    System.out.println("3. Monedas de 100");
                    System.out.println("4. Monedas de 200");
                    System.out.println("5. Monedas de 500");
                    mon = scanner.nextInt();
                    System.out.println("¿Cuántas deseas ingresar?");
                    ing = scanner.nextInt();
                    switch (mon) {
                        case 1:
                            m20+=ing;
                            break;
                        case 2:
                            m50+=ing;
                            break;
                        case 3:
                            m100+=ing;
                            break;
                        case 4:
                            m200+=ing;
                            break;
                        case 5:
                            m500+=ing;
                            break;
                        default:
                            System.out.println("Opción de moneda no válida.");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Has elegido la Opción 2: Conteo del dinero");
                    System.out.println("La cantidad de monedas de 20 es: " + m20 + " que valen " + m20 * 20);
                    System.out.println("La cantidad de monedas de 50 es: " + m50 + " que valen " + m50 * 50);
                    System.out.println("La cantidad de monedas de 100 es: " + m100 + " que valen " + m100 * 100);
                    System.out.println("La cantidad de monedas de 200 es: " + m200 + " que valen " + m200 * 200);
                    System.out.println("La cantidad de monedas de 500 es: " + m500 + " que valen " + m500 * 500);
                    sal = m20*20+m50*50+m100*100+m200*200+m500*500;
                    System.out.println("El total es de " +sal+" pesos");
                    break;
                case 3:
                    System.out.println("Has elegido la Opción 3: Romper alcancía");
                    System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
                    System.out.println("░░▄█████░█████▄░▄████▄░▄█████░██░░██░░");
                    System.out.println("░░██░░░░░██░░██░██░░██░██░░░░░██░░██░░");
                    System.out.println("░░██░░░░░█████▀░██░░██░██░░░░░█████░░░");
                    System.out.println("░░██░░░░░██░░██░██████░██░░░░░██░░██░░");
                    System.out.println("░░▀█████░██░░██░██░░██░▀█████░██░░██░░");
                    System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
                    System.out.println("Se ha vaciado la alcancía.");
                    m20 = 0;
                    m50 = 0;
                    m100 = 0;
                    m200 = 0;
                    m500 = 0;
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción entre 1 y 4.");
            }
            System.out.println();
        } while (opcion != 4);
        scanner.close();
    }
}