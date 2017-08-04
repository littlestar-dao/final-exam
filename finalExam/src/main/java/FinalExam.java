public class FinalExam {
    private boolean flag = false;
    boolean resultTrue = false;
    long reduceInput = 0;
    long count = 0;

    public long getResult(long input) {
        reduceInput = input;
        if (isSorted(reduceInput)) {
            if (count == 0) {
                return input;
            }else{
                return reduceInput;
            }
        }
        return reduceInput;
    }

    public boolean isSorted(long input) {
        boolean flagS = false;
        String stringInput = input + "";
        long inputLength = stringInput.length();
        if (stringInput.length() == 1) {
            return true;
        } else {
            count++;
            for (int digit = 1; digit < inputLength; digit++) {
                if (Character.getNumericValue(stringInput.charAt(digit - 1)) < stringInput.charAt(digit)) {
                    flagS =true;
                }else{
                    reduceInput -= 1;
                    isSorted(reduceInput);
                }
            }
            reduceInput -= 1;
            return flagS;
        }
    }
}
