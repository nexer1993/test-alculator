package by.nexer.calculator;

import java.util.Map;

public class Calculate {

    public static String getResultCalculate(String[] input) throws Exception {
        boolean isNumRome = false;
        int numRome1 = 0;
        int numRome2 = 0;
        int res = 0;
        int number1 = 0;
        int number2 = 0;
        String resultat = "";

        for (Map.Entry<String, Integer> entry : RomaNum.romeNumbers.entrySet()) {
            String key = entry.getKey();
            if(key.equals(input[0])){
                numRome1 = entry.getValue();
                isNumRome = true;
            }
            if(key.equals(input[2])){
                numRome2 = entry.getValue();
                isNumRome = true;
            }
        }

        if(isNumRome){
             number1 = numRome1;
             number2 = numRome2;
        }else{
             number1 = Integer.parseInt(input[0]);
             number2 = Integer.parseInt(input[2]);
        }

        String mathActions = input[1];

        switch (mathActions){
            case("+") : res = number1 + number2;
                break;
            case("-") : res = number1 - number2;
                break;
            case("*") : res = number1 * number2;
                break;
            case("/") : res = number1 / number2;
                break;
        }
        if(isNumRome ){
            if(res < 1){
                throw new Exception("the Roman number can only be positive");
            }
            for (Map.Entry<String, Integer> entry : RomaNum.romeNumbers.entrySet()) {
                if(entry.getValue() == res){
                    resultat = entry.getKey();
                }
            }
        }else{
            resultat = String.valueOf(res);
        }

        return resultat;
    }
}
