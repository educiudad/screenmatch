import java.util.Scanner;

public class Treino {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro numero ");
        int num1 = input.nextInt();
        System.out.println("Digite o segundo numero ");
        int num2 = input.nextInt();

        int somaDoNumero = num1 + num2;
        int multiplicacaoDoNumero = num1 * num2;
        double divisaoDoNumero = num1 / num2;
        int subtracaoDoNumero = num1 - num2;

        System.out.println("a soma dos dois é: " + somaDoNumero);
        System.out.println("a multiplicacao dos dois numeros é: " + multiplicacaoDoNumero);
        System.out.println("a divisao dos dois numeros é: " + divisaoDoNumero);
        System.out.println("a subtracao dos dois numeros é : " + subtracaoDoNumero);
    }
}


class Par {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite um numero");
        int num1 = input.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("par");
        } else {
            System.out.println("impar");
        }
    }
}

class Maior {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite um numero");
        int num1 = input.nextInt();
        System.out.println("digite o segundo numero:");
        int num2 = input.nextInt();
        if (num1 > num2) {
            System.out.println("o primeiro numero é maior que o segundo");
        } else if (num1 < num2) {
            System.out.println("o segunod numero é maior que o primeiro");
        } else {
            System.out.println("eles sao iguais");
        }

    }
}

class Media {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite a primeira nota ");
        int nota1 = input.nextInt();
        System.out.println("digite a segunda nota ");
        int nota2 = input.nextInt();
        System.out.println("digite a terceira nota");
        int nota3 = input.nextInt();
        double Media = (nota1 + nota2 + nota3) / 3;
        if (Media >= 7) {
            System.out.println("o aluno foi aprovado");

        } else {
            System.out.println("o aluno foi reprovado");
        }
    }
}


class Contador {
    static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("contador " + i);
        }


    }
}

class ContadorInverso {
    static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            System.out.println("contador " + i);
        }
    }
}

class tabuada {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite um numero");
        int num1 = input.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(num1 * i);
        }
    }
}

class Contador2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite um numero");
        int numero = input.nextInt();
        int contador = 0;
        int soma = 0;

        while (numero != 0) {
         soma += numero;
         contador++;

            numero = input.nextInt();
        }

        System.out.println("vc digitou: " + contador);
        System.out.println("vc soma: " + soma);
    }
}