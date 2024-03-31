import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];

        // read 10 names
        for(int i = 0; i < 10; i++) {
            //System.out.println("Digite o nome " + (i+1));
            nomes[i] = scanner.nextLine();
        }

        // print the third name
        System.out.println("Terceiro nome: " + nomes[2]);

        // print the seventh name
        System.out.println("Sétimo nome: " + nomes[6]);

        // print the ninth name
        System.out.println("Nono nome: " + nomes[8]);
    }
}