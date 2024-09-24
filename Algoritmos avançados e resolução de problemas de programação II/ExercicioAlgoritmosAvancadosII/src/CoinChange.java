import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class CoinChange {
    public static void main(String[] args) {
        int amount = 44; // Quantia para dar o troco
        List<Integer> coins = Arrays.asList(50, 25, 10, 5, 1); // Valores das moedas disponíveis
        List<Integer> result = getChange(amount, coins);
        System.out.println("Moedas usadas: " + result);
    }

    public static List<Integer> getChange(int amount, List<Integer> coins) {
        List<Integer> result = new ArrayList<>();
        for (int coin : coins) {
            while (amount >= coin) {
                amount -= coin;
                result.add(coin);
            }
        }
        return result;
    }
}

//Função getChange: Esta função calcula o troco usando o menor número possível de moedas.
//Parâmetros:
//amount: A quantia de dinheiro para dar o troco.
//coins: A lista de valores das moedas disponíveis, ordenadas de maior para menor.
//Retorno: Uma lista de moedas usadas para dar o troco.
//Algoritmo Guloso: O algoritmo tenta usar a maior moeda possível enquanto a quantia restante (amount) for maior ou igual ao valor da moeda. Subtrai o valor da moeda da quantia e adiciona a moeda à lista de resultados (result). Repete esse processo até que a quantia seja zero.