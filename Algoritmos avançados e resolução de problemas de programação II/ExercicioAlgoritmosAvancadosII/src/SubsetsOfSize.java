import java.util.ArrayList;
import java.util.List;
public class SubsetsOfSize {
    public static void main(String[] args) {
        int[] S = {1, 2, 3, 4};
        int n = 3;
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(S, n, 0, new ArrayList<>(), result);
        System.out.println(result);
    }

    public static void generateSubsets(int[] S, int n, int start, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == n) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < S.length; i++) {
            current.add(S[i]);
            generateSubsets(S, n, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}

//1.
//Função generateSubsets: Esta função é responsável por gerar todos os subconjuntos de tamanho ( n ).
//Parâmetros:
//S: O conjunto de elementos únicos.
//n: O tamanho dos subconjuntos desejados.
//start: O índice inicial para evitar repetição de elementos.
//current: O subconjunto atual sendo construído.
//result: A lista de todos os subconjuntos gerados.
//Condição de Parada: Quando o tamanho do subconjunto atual (current.size()) é igual a ( n ), adicionamos uma cópia do subconjunto atual à lista de resultados (result).
//Loop e Backtracking: Iteramos sobre os elementos do conjunto ( S ) a partir do índice start. Adicionamos o elemento atual ao subconjunto (current), chamamos recursivamente a função para o próximo índice, e depois removemos o último elemento adicionado para explorar outras possibilidades.
