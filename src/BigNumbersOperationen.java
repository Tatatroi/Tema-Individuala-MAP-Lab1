import java.util.ArrayList;
import java.util.List;

public class BigNumbersOperationen {

    private void adunareUnitati(List<Integer> celMic, List<Integer> celMare, List<Integer> temp){
        int carry = 0;
        for(int i = celMic.size() - 1; i >= 0; i--) {
            if (celMare.get(i) + celMic.get(i) + carry > 9) {
                temp.add((celMare.get(i) + celMic.get(i) + carry) % 10);
                carry = 1;
            } else {
                temp.add(celMare.get(i) + celMic.get(i) + carry);
                carry = 0;
            }
        }
        for(int i = celMare.size() - celMic.size() - 1; i >= 0; i--){
            if(celMare.get(1) + carry > 9){
                temp.add((celMare.get(1) + carry) % 10);
                carry = 1;
            }
            else{
                temp.add(celMare.get(i));
            }
        }
        if(carry == 1)temp.add(1);
    }

    private void scadereUnitati(List<Integer> celMic, List<Integer> celMare, List<Integer> temp){
        int borrow = 0;
        int diff;

        for (int i = celMare.size() - 1, j = celMic.size() - 1; i >= 0; i--, j--) {
            int cifraMare = celMare.get(i) - borrow;
            int cifraMica;

            if (j >= 0) {
                cifraMica = celMic.get(j);
            } else {
                cifraMica = 0;
            }

            if (cifraMare < cifraMica) {
                cifraMare += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }

            diff = cifraMare - cifraMica;
            temp.add(diff);
        }
    }

    public List<Integer> summeGrossZahlen(List<Integer> arr1, List<Integer> arr2) {
        List<Integer> temp = new ArrayList<Integer>();
        if(arr1.size() > arr2.size()){
            adunareUnitati(arr1, arr2, temp);
        }else{
            adunareUnitati(arr2, arr1, temp);
        }
        return temp.reversed();
    }

    public List<Integer> diferenzZahlen(List<Integer> arr1, List<Integer> arr2) {
        List<Integer> temp = new ArrayList<Integer>();

        if (arr1.size() > arr2.size() || (arr1.size() == arr2.size() && arr1.get(0) > arr2.get(0))) {
            scadereUnitati(arr2, arr1, temp);
        } else {
            scadereUnitati(arr1, arr2, temp);
        }
        return temp.reversed();
    }

    public List<Integer> multiplikationGrosseZahlen(List<Integer> arr1, int multiplier) {
        List<Integer> temp = new ArrayList<Integer>();
        int carry = 0;

        for (int i = arr1.size() - 1; i >= 0; i--) {
            int product = arr1.get(i) * multiplier + carry;
            temp.add(product % 10);
            carry = product / 10;
        }

        while (carry > 0) {
            temp.add(carry % 10);
            carry /= 10;
        }
        return temp.reversed();
    }

    public List<Integer> divisionGrosseZahlen(List<Integer> arr1, int faktor) {
        int carry = 0;
        List<Integer> temp = new ArrayList<Integer>();
        for(int i = 0; i < arr1.size(); i++) {
            int current = carry * 10 + arr1.get(i);
            temp.add(current / faktor);
            carry = current % faktor;
        }
        return temp;
    }

}
