import java.util.Arrays;
import java.util.Random;

public class BuscaBinaria {

    public static void main(String[] args) {

        Random sorteio = new Random();
        int chave;
        long tempoIniSeq, tempoIniBi, tempofimseq, tempofimBi;

        int[] vetor = new int [100000];
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = sorteio.nextInt(200000);
        }

        chave = sorteio.nextInt(200000);

        tempoIniSeq = System.currentTimeMillis();
        buscaExaustiva(vetor, chave);
        tempofimseq = System.currentTimeMillis() - tempoIniSeq;

        tempoIniBi = System.currentTimeMillis();
        buscaBinaria(vetor, chave);
        tempofimBi = System.currentTimeMillis() - tempoIniBi;

        System.out.println("O tempo necessário para encontrar a chave na maneira exaustiva foi: " + tempofimseq);
        System.out.println("O tempo necessário para encontrar a chave na maneira binária foi: "+ tempofimBi);
    }

    
        public static void buscaExaustiva(int[] vetor, int chave) {

            Arrays.sort(vetor);
    
            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] == chave) {
                    break;
                }
            }
        }

        public static void buscaBinaria(int[] vetor, int chave) {

            int inicio = 0;
            int fim = vetor.length - 1;
            int meio;
    
            Arrays.sort(vetor);
    
            while (fim >= inicio) {
    
                meio = (inicio + fim) / 2;
    
                if (vetor[meio] < chave) {
                    inicio = meio + 1;
                } else if (vetor[meio] > chave) {
                    fim = meio - 1;
                } else {
                    break;
                }
            }
        }
    }







