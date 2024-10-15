import java.util.List;


public class ElektronikShop {

    public int minimaleTastatur(List<Integer> pricerray){
        return pricerray.stream().min(Integer::compareTo).get();
    }


    public int maximalePrice(List<Integer> pricerray1, List<Integer> pricerray2){
        return Math.max(pricerray1.stream().max(Integer::compareTo).get(), pricerray2.stream().max(Integer::compareTo).get());
    }

    public int affordableTastatur(List<Integer> pricerray1, int budget){
        int Max = -1;
        for(int i = 0; i < pricerray1.size(); i++){
            if(pricerray1.get(i) <= budget && pricerray1.get(i) > Max){
                Max = pricerray1.get(i);
            }
        }
        return Max;
    }

    public int affordablePair(List<Integer> priceTastatur,List<Integer> priceUSB, int budget){
        priceTastatur.sort(Integer::compareTo);
        priceUSB.sort(Integer::compareTo);
        int maxSum = -1;
        int i = 0;
        int j = priceUSB.size() - 1;

        while (i < priceTastatur.size() && j >= 0) {
            int currentSum = priceTastatur.get(i) + priceUSB.get(j);
            if (currentSum <= budget) {
                maxSum = Math.max(maxSum, currentSum);
                i++;
            } else {
                j--;
            }
        }
        return maxSum;
    }

}
