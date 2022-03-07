import java.util.Arrays;

import static java.util.Arrays.sort;

public class Question1 {

    public static void main(String[] args){

//        Dada uma lista de números com um número ímpar de elementos, desenvolva um algoritmo que encontre a mediana.

        int[] numeros = {13, 9, 1, 5, 23, 10, 11};
        sort(numeros);
        int meio = numeros.length / 2;
        System.out.println(numeros[meio]);
    }
}
