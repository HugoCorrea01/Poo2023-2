import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        cli1(scanner); // algoritmo com dois loops aninhados
        cli2(scanner); // algoritmo sem loops aninhados

        scanner.close();
    }

    public static double soma(double n1, double n2) {
        return n1 + n2;
    }

    public static double subtracao(double n1, double n2) {
        return n1 - n2;
    }

    public static double multiplicacao(double n1, double n2) {
        return n1 * n2;
    }

    public static double divisao(double n1, double n2) {
        return n1 / n2;
    }

    public static void cli1(Scanner scanner) {
        double num;
        double resultado;
        String msg1, msg2, msg3, msg4, opcao, operacao;

        msg1 = "\nInforme um valor: ";
        msg2 = "\nDigite a operacão desejada (soma, sub, mult, div): ";
        msg3 = "\nDigite um novo número: ";
        msg4 = "\nDeseja (1) limpar memória, (2) inserir nova operacão ou (3) sair? ";
        opcao = "2";

        while (true) {
            resultado = 0;
            System.out.println("Resultado: " + resultado);

            System.out.print(msg1);
            resultado = scanner.nextDouble();

            while (true) {
                System.out.print(msg2);
                operacao = scanner.next();

                if (!operacao.equals("soma") && !operacao.equals("sub") && !operacao.equals("mult") && !operacao.equals("div")) {
                    System.out.println("\nOperacão inválida!");
                    continue;
                }

                System.out.print(msg3);
                num = scanner.nextDouble();

                switch (operacao) {
                    case "soma":
                        resultado = soma(resultado, num);
                        break;
                    case "sub":
                        resultado = subtracao(resultado, num);
                        break;
                    case "mult":
                        resultado = multiplicacao(resultado, num);
                        break;
                    case "div":
                        resultado = divisao(resultado, num);
                        break;
                }

                System.out.println("Resultado: " + resultado);

                System.out.print(msg4);
                opcao = scanner.next();

                if (!opcao.equals("2")) {
                    break;
                }
            }

            if (!opcao.equals("1")) {
                break;
            }
        }
    }

    // solucão com apenas um loop
    public static void cli2(Scanner scanner) {
        double num;
        double resultado = 0;
        String msg1, msg2, msg3, msg4, opcao, operacao;

        msg1 = "\nInforme um valor: ";
        msg2 = "\nDigite a operacão desejada (soma, sub, mult, div): ";
        msg3 = "\nDigite um novo número: ";
        msg4 = "\nDeseja (1) limpar memória, (2) inserir nova operacão ou (3) sair? ";
        opcao = "1";

        while (true) {
            System.out.println("Resultado: " + resultado);

            if (opcao.equals("1")) {
                resultado = 0;

                System.out.print(msg1);
                resultado = scanner.nextDouble();
            }

            System.out.print(msg2);
            operacao = scanner.next();

            if (!operacao.equals("soma") && !operacao.equals("sub") && !operacao.equals("mult") && !operacao.equals("div")) {
                System.out.println("\nOperacão inválida!");
                opcao = "2";
                continue;
            }

            System.out.print(msg3);
            num = scanner.nextDouble();

            switch (operacao) {
                case "soma":
                    resultado = soma(resultado, num);
                    break;
                case "sub":
                    resultado = subtracao(resultado, num);
                    break;
                case "mult":
                    resultado = multiplicacao(resultado, num);
                    break;
                case "div":
                    resultado = divisao(resultado, num);
                    break;
            }

            System.out.println("Resultado: " + resultado);

            System.out.print(msg4);
            opcao = scanner.next();

            if (opcao.equals("1")) {
                resultado = 0;
            } else if (!opcao.equals("1") && !opcao.equals("2")) {
                break;
            }
        }
    }
}
