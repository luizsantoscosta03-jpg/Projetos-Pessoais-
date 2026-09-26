import java.util.Scanner;
public class calculadoraimc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso;
        String continuar;
        do {

            double altura;
            System.out.println("Digite seu peso (KG)");
            peso = sc.nextDouble();
            System.out.println("Digite sua altura");
            altura = sc.nextDouble();

            double imc = peso / (altura * altura);
            if (imc < 18.5) {
                System.out.println("Abaixo do peso");
            } else if (imc < 25) {
                System.out.println("Peso normal");
            } else if (imc < 30) {
                System.out.println("Sobrepeso");
            } else {
                System.out.println("Obesidade");
                System.out.println("Deseja calcular novamente (S/N)");
            }
            System.out.println("Deseja calcular novamente ?");
            continuar = sc.next();
        } while (continuar.equalsIgnoreCase("S"));
    }
}















