package by.nexer.calculator;

import java.util.HashMap;
import java.util.Map;

public class Validate {

    public static String[] validateString(String input) throws Exception {
        String[] arrayInputText = input.split(" ");
        if(arrayInputText.length != 3 && input.length() != 5){
            throw new Exception("The data" + input +  " does not meet the condition. Example: a + b");
        }else{
            boolean isTwoNubRoman = valideteRoman(arrayInputText);
            if(isTwoNubRoman){
                return arrayInputText;
            }

            int number1 = Integer.parseInt(arrayInputText[0]);
            int number2 = Integer.parseInt(arrayInputText[2]);
            String mathActions = arrayInputText[1];

            if(number1 < 1 || number1 > 10  ){
                throw new Exception("The numbers: "+ number1 +" must be from 1 to 10");
            }
            if(number2 < 1 || number2 > 10  ){
                throw new Exception("The numbers: "+ number2 +" must be from 1 to 10");
            }
            if (!mathActions.equals("+") && !mathActions.equals("-") && !mathActions.equals("*") && !mathActions.equals("/")){
                throw new Exception("Not a lying mathActions: "+ mathActions +". Acceptable values: + - * / ");
            }
            return arrayInputText;
        }
    }
    public static boolean valideteRoman(String[] arrayInputText){
        boolean isNum1Rome = false;
        boolean isNum2Rome = false;

        for (Map.Entry<String, Integer> entry : RomaNum.romeNumbers.entrySet()) {
            String key = entry.getKey();
            if(key.equals(arrayInputText[0])){
                isNum1Rome = true;
            }
            if(key.equals(arrayInputText[2])){
                isNum2Rome = true;
            }
        }
        if(isNum1Rome && isNum2Rome){
            return true;
        }else{
            return false;
        }
    }
}
