package QuickSort;
import java.util.Random;

public class UtilizandoComINT {
    public static void main(String[] args) {
        Random random = new Random();

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            int number = random.nextInt(101);
            vetor[i] = number;
        }

        ordenaQuickSortInt(vetor, 0, 9);

        imprimirVetor(vetor);
    }

    public static void ordenaQuickSortInt(int vetor[], int baixo, int alto) {
        int P, B, A;
        int Pivo;

        B = baixo;
        A = alto;
        Pivo = vetor[baixo];

        while (baixo < alto) {
            while ((vetor[alto] >= Pivo) && (baixo < alto)) {
                alto--;
            }
            if (baixo != alto) {
                vetor[baixo] = vetor[alto];
                baixo++;
            }
            while ((vetor[baixo] <= Pivo) && (baixo < alto)) {
                baixo++;
            }
            if (baixo != alto) {
                vetor[alto] = vetor[baixo];
                alto--;
            }
        }

        vetor[baixo] = Pivo;
        P = baixo;
        baixo = B;
        alto = A;

        if (baixo < P) ordenaQuickSortInt(vetor, baixo, P - 1);
        if (alto > P) ordenaQuickSortInt(vetor, P + 1, alto);
    }

    public static void imprimirVetor(int vetor[]) {
        for (int element : vetor) {
            System.out.print(element + " ");
        }
    }
}