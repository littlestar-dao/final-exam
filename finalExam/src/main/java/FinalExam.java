public class FinalExam {
    private boolean flag = false;
    boolean resultTrue = false;
    long reduceInput = 0;
    long count = 0;

    public long getResult(long input) {
        reduceInput = input;
        if ((input / 10) <1) {
          return input;
        }
        return isSorted(input);
    }

    public long isSorted(long input) {
        String stringInput = input + "";
        long inputLength = stringInput.length();
        if (stringInput.length() == 1) {
            return input;
        } else {
            count++;
            for (int digit = 1; digit < inputLength; digit++) {
                if (Character.getNumericValue(stringInput.charAt(digit - 1)) < stringInput.charAt(digit)) {
                }else{
                    reduceInput -= 1;
                    isSorted(reduceInput);
                }
            }
            reduceInput -= 1;
            return reduceInput;
        }
    }
}
