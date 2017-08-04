public class FinalExam {


    public long getResult(long input){
        String stringInput = input+"";
        if(stringInput.length() == 1){
            return input;
        }
        else if(Character.getNumericValue(stringInput.charAt(0)) < stringInput.charAt(1)){

            return input-1;
        }else{
            return input;
        }
    }
}
