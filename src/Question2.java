
public class Question2 {

    public static void main(String[] args){

//        Dado um vetor de inteiros n e um inteiro qualquer x.
//        Construa um algoritmo que determine o número de elementos pares do vetor que tem uma diferença igual ao valor de x.

        int[] vetor = {1, 6, 12, 7, 8};
        int variacao = 5;

        int contador = 0;
        int i = 0;
        int j = 0;

        while (i < (vetor.length-1)){
            if (j == vetor.length){
                j = 0;
                i++;
            }

            int numero = vetor[i];
            int compara = vetor[j];

            if (numero - compara == variacao){
                contador++;
            }
            j++;
        }
        System.out.println(contador);
    }
}
