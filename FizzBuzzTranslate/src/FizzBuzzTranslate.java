public class FizzBuzzTranslate {
    public static String translate(int number) {
        String result ="";
        String checkString = "false";

        String[] checkNumber = Integer.toString(number).split("");


        for (int i = 0; i < checkNumber.length; i++) {
            if (checkNumber[i].equals("3")) {
                checkString = "Fizz";
                for (int j = 0; j < checkNumber.length; j++) {
                    if (checkNumber[j].equals("5")) {
                        checkString = "FizzBuzz";
                        break;
                    }
                }
            }
            else if (checkNumber[i].equals("5")) {
                checkString = "Buzz";
                for (int j = 0; j < checkNumber.length; j++) {
                    if (checkNumber[j].equals("3")) {
                        checkString = "FizzBuzz";
                        break;
                    }
                }
            }
        }




        result = checkString;

        if (checkString.equals("false") || checkString.equals("Fizz") || checkString.equals("Buzz")) {
            if ((number%3 ==0 && number%5 ==0 && checkString.equals("Fizz")) || (number%3 ==0 && number%5 ==0 && checkString.equals("Buzz")) ) {
                result = "FizzBuzz";
            } else if(number%3 == 0 && checkString.equals("false")) {
                result = "Fizz";
            } else if (number%5== 0 && checkString.equals("false")) {
                result = "Buzz";
            } else if (checkString.equals("false")){
                result="";
                for (int k = 0; k<checkNumber.length; k++) {
                    switch (checkNumber[k]) {
                        case "0":
                            result += "zero ";
                            break;
                        case "1":
                            result += "one ";
                            break;
                        case "2":
                            result += "two ";
                            break;
                        case "3":
                            result += "three ";
                            break;
                        case "4":
                            result += "four ";
                            break;
                        case "5":
                            result += "five ";
                            break;
                        case "6":
                            result += "six ";
                            break;
                        case "7":
                            result += "seven ";
                            break;
                        case "8":
                            result += "eight ";
                            break;
                        case "9":
                            result += "nine ";
                            break;
                    }
                }
            }
        }


        return result;
    }
}
