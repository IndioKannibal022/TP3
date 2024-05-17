package estga.poo;
import java.util.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Double> numeros = new ArrayList<>();

        System.out.println("Lista aleatória de 25 valores:");
        for (int i = 0; i < 25; i++) {
            double n = 0 + (10 - 0) * rand.nextDouble(); //Cria os numeros aleatorios entre 0 e 10
            double roundedN = Math.round(n * 10.0) / 10.0;  // Arredonda a 1 casa decimal
            numeros.add(roundedN);
            System.out.print(roundedN+" ");
        }

        System.out.println("\n\nMédia dos números: "+ NumberUtils.calcularMedia(numeros));
        System.out.println("\nMediana dos números: "+ NumberUtils.calcularMediana(numeros));
        System.out.println("\nModa dos números: "+ NumberUtils.calcularModa(numeros));
        System.out.println("\nLista organizada por ordem crescente: ");
        NumberUtils.ordenarLista(numeros,true);
        for (Double n : numeros) {
            System.out.print(n+" ");
        }

        System.out.print("\n"); // Espaço para melhor visibilidade

        System.out.println("\nLista organizada por ordem decrecrescente: ");
        NumberUtils.ordenarLista(numeros,false);
        for (Double n : numeros) {
            System.out.print(n+" ");
        }
    }
}