import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        double n1 = 0d;
        double n2 = 0d;
        double result = 0d;
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        n1 = scan.nextDouble();

        System.out.println("Informe a operacao: + - / * ");
        String operacao = scan.next();

        System.out.println("Informe o segundo numero: ");
        n2 = scan.nextDouble();

        switch (operacao){
            case "+":
                result = n1 + n2;
                System.out.println(String.format("A soma entre %.2f e %.2f eh: %.2f", n1 , n2 , result));
                break;
            case "-":
                result = n1 - n2;
                System.out.println(String.format("A subtracao entre %.2f e %.2f eh: %.2f", n1 , n2 , result));
                break;
            case "/":
                result = n1 / n2;
                System.out.println(String.format("A divisao entre %.2f e %.2f eh: %.2f", n1 , n2 , result));
                break;
            case "*":
                result = n1 * n2;
                System.out.println(String.format("A multiplicacao entre %.2f e %.2f eh: %.2f", n1 , n2 , result));
                break;
            default:
                throw new NullPointerException("Operacao nao corresponde");
        }
    }
}
