package fit;

public class Types {

    public static void testar() {
        System.out.println("Iniciando trabalho com variaveis...");
        String nome = "Emilio Murta Resende";
        int idade = 32;
        double peso = 88.3;
        Integer idadeOuNulo = null;

        if (idade % 2 != 0) idadeOuNulo = 16;

        System.out.printf("Imprimindo %s %d %.2f %d %n", nome, idade, peso, idadeOuNulo);
    }

}
