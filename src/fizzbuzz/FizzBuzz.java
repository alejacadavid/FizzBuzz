package fizzbuzz;

public class FizzBuzz {

    public static final int THREE = 3;
    public static final int FIVE = 5;
    public static final int MAX_VALUE = 100;
    
    public static void main(String args[]) {
        for(int i = 1; i <= MAX_VALUE; i++){
            calculate(i);
            System.out.print(",");
        }
    }
    
    public static String calculate(int number) {
        StringBuilder result = new StringBuilder("");
        if(number%THREE == 0)
            result.append("Fizz");
        
        if(number%FIVE == 0)
            result.append("Buzz");
        
        if(number%THREE == 0 || number%FIVE == 0){
            System.out.print(result.toString());
        }else{
            result.append(Integer.toString(number));
            System.out.print(number);
        }
        return result.toString();
    }
}
