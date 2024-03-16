package MergeSort;

public class UtilizandoComINT {
    public static void main(String[] args) {
        
    }

    public static void mergeSort(int vetor[]) {
        if (vetor.length > 1) {
            int t1 = vetor.length / 2;
            int t2 = vetor.length - 1;
            int v1[] = new int[t1];
            int v2[] = new int[t2];

            for (int i = 0; i < t1; i++) {
                v1[i] = vetor[i];
            }
            for (int i = t1; i < (t1 + t2); i++) {
                v2[i - t1] = vetor[i];
            }

            mergeSort(v1);
            mergeSort(v2);
            merge(vetor, v1, v2);
        }
    }

    public static void merge(int w[], int w1[], int w2[]) {
        int i = 0, j = 0, k = 0;

        while (w1.length != j && w2.length != k) {
            if (w1[j] >= w2[k]) {
                w[i] = w1[j];
            }
        }
    }
}
