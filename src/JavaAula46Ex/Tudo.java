package JavaAula46Ex;

import java.util.Scanner;

public class Tudo {

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        Scanner scanfStr = new Scanner(System.in);
        int figura;
        int tamanho = 0;
        int quantos;
        int opcao;
        do {
            System.out.println("Quantas figura geometricas");
            quantos = scanf.nextInt();
        } while (quantos < 0 || quantos > 100);

        FiguraGeometrica[] fg = new FiguraGeometrica[quantos];
        for (int i = 1; i <= quantos; i++) {
            do {
                System.out.println("(2)Figura2D ou (3)Figura 3D");
                figura = scanf.nextInt();
            } while (figura == 2 && figura == 3);

            if (figura == 2) {
                do {
                    System.out.println("(1)Circulo,(2)Quadrado ,(3)Triangulo, (4)");
                    opcao = scanf.nextInt();
                    switch (opcao) {
                        case 1:
                            System.out.println("Raio e Cor");
                            fg[tamanho++] = new Circulo(scanf.nextInt(), scanfStr.nextLine());
                            break;
                        case 2:
                        case 3:
                        case 4:
                            for (i = 0; i < quantos; i++) {
                                System.out.printf("[%3d]", (i + 1));
                                if (fg[i] instanceof Circulo) {
                                    System.out.println("[Circulo]");
                                }
                                System.out.println(fg[i]);
                            }
                        break;
                        default:
                            System.out.println("opcao invalida");
                            opcao = 1;
                            break;

                    }
                } while (opcao < 1 || opcao > 3);
            }
        }

    }

}
