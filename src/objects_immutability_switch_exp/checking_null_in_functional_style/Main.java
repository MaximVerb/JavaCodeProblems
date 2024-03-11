package objects_immutability_switch_exp.checking_null_in_functional_style;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, null, 3, 4, 5, null);
        System.out.println(evenNumbers(numbers));


    }


    public static List<Integer> evenNumbers(List<Integer> numbers) {
        if (Objects.isNull(numbers)) {
            return Collections.EMPTY_LIST;
        }

        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer numb : numbers) {
            if (Objects.nonNull(numb) && numb % 2 == 0) {
                newList.add(numb);
            }
        }
        return newList;
    }

    //conclusion, the functional style code should rely on these two methods whenever
    // the null checks are needed, while in the imperative code, it is a matter of preference.


}
