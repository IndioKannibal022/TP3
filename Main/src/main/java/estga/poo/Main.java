package estga.poo;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Double> numeros = new ArrayList<>();

        for (int i = 0; i < 25; i++) {
            numeros.add(Math.random());
        }

        calcularMedia();
    }
}