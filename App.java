
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int opcao;
        int tamanho;

        Scanner teclado = new Scanner(System.in);

        System.out.println("MENU");
        System.out.println();

        System.out.println("Digite 1 para - Retângulo");
        System.out.println("Digite 2 para - Diagonal Superior Esquerda");
        System.out.println("Digite 3 para - Diagonal Superior Direita");
        System.out.println("Digite 4 para - Diagonal Inferior Esquerda");
        System.out.println("Digite 5 para - Diagonal Inferior Direita");

        System.out.println();

        System.out.print("Escolha uma opção: ");
        opcao = teclado.nextInt();

        System.out.print("Digite o tamanho: ");
        tamanho = teclado.nextInt();

        if (opcao == 1) {

            for (int linha = 0; linha < tamanho; linha++) {

                for (int coluna = 0; coluna < tamanho; coluna++) {

                    System.out.print("*");

                }

                System.out.println();

            }

        } else if (opcao == 2) {

            for (int linha = 0; linha < tamanho; linha++) {

                for (int coluna = 0; coluna <= linha; coluna++) {

                    System.out.print("*");

                }

                System.out.println();

            }

        } else if (opcao == 3) {

            for (int linha = 0; linha < tamanho; linha++) {

                for (int espaco = 0; espaco < tamanho - linha - 1; espaco++) {

                    System.out.print(" ");

                }

                for (int coluna = 0; coluna <= linha; coluna++) {

                    System.out.print("*");

                }

                System.out.println();

            }

        } else if (opcao == 4) {

            for (int linha = tamanho; linha > 0; linha--) {

                for (int coluna = 0; coluna < linha; coluna++) {

                    System.out.print("*");

                }

                System.out.println();

            }

        } else if (opcao == 5) {

            for (int linha = 0; linha < tamanho; linha++) {

                for (int espaco = 0; espaco < linha; espaco++) {

                    System.out.print(" ");

                }
                for (int coluna = 0; coluna < tamanho - linha; coluna++) {

                    System.out.print("*");

                }

                System.out.println();

            }

        } else {

            System.out.println("Opção inválida!");

        }

        teclado.close();

    }

}
