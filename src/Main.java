import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String  inputUser = input.nextLine();
        System.out.println(calc(inputUser));
    }
    public static String calc(String input){
        String [] inputUser = input.trim().split(" ");

        if(inputUser.length > 3) {
            throw new RuntimeException("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        } else if (inputUser.length < 3) {
            throw  new RuntimeException("строка не является математической операцией");
        }

        int result = 0;
        String totalResult = "";
        String operation = "";
        String operandFirst = inputUser[0];
        String operandSecond = inputUser[2];
        int numbFirst = 0;
        int numbSecond = 0;
        boolean isOperandFirstDigit = true;
        boolean isOperandSecondIDigit = true;


        if(inputUser[1].contains("/") || inputUser[1].contains("*") || inputUser[1].contains("+") || inputUser[1].contains("-")) {
            operation = inputUser[1];
        } else {
            throw new RuntimeException("формат математической операции не удовлетворяет заданию - два операнда и один оператор");
        }

        for (int i = 0; i < operandFirst.length() && isOperandFirstDigit; i++){
            if(!Character.isDigit(operandFirst.charAt(i))){
                isOperandFirstDigit = false;
            }
        }
        for (int i = 0; i < operandSecond.length() && isOperandSecondIDigit; i++){
            if(!Character.isDigit(operandSecond.charAt(i))){
                isOperandSecondIDigit = false;
            }
        }

        if(isOperandFirstDigit && isOperandSecondIDigit) {
            numbFirst = Integer.parseInt(operandFirst);
            numbSecond = Integer.parseInt(operandSecond);
            if (numbFirst < 1) {
                throw new RuntimeException("Принимаются числа только от 1 до 10 включительно");
            } else if (numbFirst > 10) {
                throw new RuntimeException("Принимаются числа только от 1 до 10 включительно");
            } else if (numbSecond < 1) {
                throw new RuntimeException("Принимаются числа только от 1 до 10 включительно");
            } else if (numbSecond > 10) {
                throw new RuntimeException("Принимаются числа только от 1 до 10 включительно");
            }
            if(numbFirst <= 10 && numbSecond <= 10) {
                switch (operation) {
                    case "+" : result = numbFirst + numbSecond;
                    break;
                    case "-" : result = numbFirst - numbSecond;
                        break;
                    case "*" : result = numbFirst * numbSecond;
                        break;
                    case "/" :
                        if(numbSecond != 0){
                            result = numbFirst / numbSecond;
                        } else {
                            throw new RuntimeException("на ноль делить нельзя");
                        }
                        break;
                }

            }
        } else {
            String rimDigit [] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};


            if(Arrays.asList(rimDigit).contains(operandFirst) && Arrays.asList(rimDigit).contains(operandSecond)) {
                String rimNumbs [] = {operandFirst, operandSecond};
                for (int i = 0; i < rimNumbs.length; i++) {
                    switch (rimNumbs[i]) {
                        case "I" : if(i == 0) {
                            numbFirst = 1;
                        } else {
                            numbSecond = 1;
                        }
                        break;
                        case "II" : if(i == 0) {
                            numbFirst = 2;
                        } else {
                            numbSecond = 2;
                        }
                            break;
                        case "III" : if(i == 0) {
                            numbFirst = 3;
                        } else {
                            numbSecond = 3;
                        }
                            break;
                        case "IV" : if(i == 0) {
                            numbFirst = 4;
                        } else {
                            numbSecond = 4;
                        }
                            break;
                        case "V" : if(i == 0) {
                            numbFirst = 5;
                        } else {
                            numbSecond = 5;
                        }
                            break;
                        case "VI" : if(i == 0) {
                            numbFirst = 6;
                        } else {
                            numbSecond = 6;
                        }
                            break;
                        case "VII" : if(i == 0) {
                            numbFirst = 7;
                        } else {
                            numbSecond = 7;
                        }
                            break;
                        case "VIII" : if(i == 0) {
                            numbFirst = 8;
                        } else {
                            numbSecond = 8;
                        }
                            break;
                        case "IX" : if(i == 0) {
                            numbFirst = 9;
                        } else {
                            numbSecond = 9;
                        }
                            break;
                        case "X" : if(i == 0) {
                            numbFirst = 10;
                        } else {
                            numbSecond = 10;
                        }
                            break;

                    }

                }



                switch (operation) {
                    case "+" : result = numbFirst + numbSecond;
                        break;
                    case "-" : if(numbFirst - numbSecond > 0) {
                        result = numbFirst - numbSecond;
                    } else {
                        throw new RuntimeException("В римской системе нет отрицательных чисел и нуля");
                    }
                        break;
                    case "*" : result = numbFirst * numbSecond;
                        break;
                    case "/" :
                            result = numbFirst / numbSecond;
                            break;
                }

            } else  {
                String rimDigits[] = {"XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                        "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                        "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                        "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                        "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                        "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                        "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                        "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                        "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
                };
                if(Arrays.asList(rimDigits).contains(operandFirst) && Arrays.asList(rimDigits).contains(operandSecond)) {
                    throw new RuntimeException("Принимаются числа только от 1 до 10 включительно");
                }

                    throw new RuntimeException("используются одновременно разные системы исчисления");

            }
        }

        if(isOperandFirstDigit && isOperandSecondIDigit) {
            totalResult = Integer.toString(result);
        } else {
            String rimDigits[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                    "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                    "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                    "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                    "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                    "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                    "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                    "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                    "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                    "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
            };
            totalResult = rimDigits[result - 1];
        }



        return totalResult;
    }
}

