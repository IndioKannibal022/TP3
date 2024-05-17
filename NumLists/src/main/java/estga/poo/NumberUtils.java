package estga.poo;
import java.util.Comparator;
import java.util.List;


public class NumberUtils {

    double calcularMedia(List<Double> numeros){
        double soma = 0;
        int count  = 0;

        for (Double n : numeros) {
            soma+=n;
            count++;
        }
        double media = soma/count;
        return media;
    }

    double calcularMediana(List<Double> numeros){
        ordenarLista(numeros,true);
        double mediana = 0;
        int meio = numeros.size()/2;

        if(numeros.size() % 2 == 0){
           double somaMeios = numeros.get(meio) + numeros.get(meio+1);
           mediana = somaMeios/2;;
        }else{
            mediana = numeros.get(meio);
        }
        return mediana;
    }

    double calcularModa(List<Double> numeros){
        ordenarLista(numeros,true);
        double numAtual = 0, moda = 0;
        
        for (Double n : numeros) {
            int index = numeros.indexOf(n);
            int lastIndex = numeros.lastIndexOf(n);
            int num = lastIndex-index+1;
            if (num > numAtual){
                numAtual = num;
                moda = n;
            }
        }
        return moda;
    }

    void ordenarLista(List<Double> numeros, boolean crescente){
        if (crescente == true){
            numeros.sort(Comparator.naturalOrder());
        }else {
            numeros.sort(Comparator.reverseOrder());
        }
    }
}
