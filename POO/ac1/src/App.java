class App {
    public static void main(String[] args) {
        media(8.0, 7.5, 8.5);
        exibeNums();
        System.out.println(ePrimo(7));
        System.out.println(ePrimo(45));
        diaSemana(3);
        diaSemana(9);
        System.out.println(eBissexto(1995));
        System.out.println(eBissexto(2000));
        System.out.println(eBissexto(2012));
        System.out.println(eBissexto(1900));
    }

    public static void media(double ap1, double ap2, double ac) {
        System.out.println("Média " + 0.4 * (ap1 + ap2) + 0.2 * ac);
    }

    public static void exibeNums() {
        for (int i = 150; i <= 200; i++) {
            System.out.println(i);
        }
    }

    public static boolean ePrimo(int num) {
        boolean primo = true;
        System.out.println("Análise de " + num);
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println(num + " é divisível por " + i);
                primo = false;
            }
        }

        return primo;
    }

    public static void diaSemana(int dia) {
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Valor inválido!");
        }
    }

    public static boolean eBissexto(int ano) {
        return ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0;
    }
}