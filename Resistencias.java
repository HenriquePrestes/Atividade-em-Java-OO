import java.util.Scanner;

public class Resistencias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos valores das resistências
        System.out.print("Valor da primeira resistência: ");
        double r1 = scanner.nextDouble();

        System.out.print("Valor da segunda resistência: ");
        double r2 = scanner.nextDouble();

        System.out.print("Valor da terceira resistência: ");
        double r3 = scanner.nextDouble();

        System.out.print("Valor da quarta resistência: ");
        double r4 = scanner.nextDouble();

        // Cálculo da resistência equivalente em série
        double resistenciaEquivalente = r1 + r2 + r3 + r4;

        // Determinar a maior resistência
        double maiorResistencia = r1;
        if (r2 > maiorResistencia) maiorResistencia = r2;
        if (r3 > maiorResistencia) maiorResistencia = r3;
        if (r4 > maiorResistencia) maiorResistencia = r4;

        // Determinar a menor resistência
        double menorResistencia = r1;
        if (r2 < menorResistencia) menorResistencia = r2;
        if (r3 < menorResistencia) menorResistencia = r3;
        if (r4 < menorResistencia) menorResistencia = r4;

        // Exibição dos resultados
        System.out.println("Resistência equivalente: " + resistenciaEquivalente + " ohms");
        System.out.println("Maior resistência: " + maiorResistencia + " ohms");
        System.out.println("Menor resistência: " + menorResistencia + " ohms");

        scanner.close();
    }
}
