import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List l1 = new List();

        System.out.println("Digite os elementos da lista:");
        for(int i = 1; i < 6; i++){
            l1.insere(i, sc.nextInt());
        }

        System.out.printf("Imprimindo lista de tamanho %d: %n", l1.getTam());
        for(int i = 1; i < 6; i++){

            System.out.println(l1.elemento(i));
        }

        System.out.println("Removendo primeiro e ultimo elemento... ");
        l1.remove(1);
        l1.remove(5);

        System.out.printf("Imprimindo lista: %n");
        for(int i = 1; i < l1.getTam(); i++){

            System.out.println(l1.elemento(i));
        }


        sc.close();
    }
}
