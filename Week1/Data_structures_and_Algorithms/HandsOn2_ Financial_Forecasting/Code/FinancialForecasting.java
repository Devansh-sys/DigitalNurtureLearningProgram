import java.util.HashMap;
import java.util.Map;

public class FinancialForecasting {


    public static double calculateFutureValue(double currentValue, double growthRate, int periods) {

        if (periods == 0) {
            return currentValue;
        }


        double nextValue = currentValue * (1 + growthRate);
        return calculateFutureValue(nextValue, growthRate, periods - 1);
    }


    public static double calculateFutureValueMemoized(double initialValue, double growthRate, int periods, Map<Integer, Double> memo) {

        if (memo.containsKey(periods)) {
            return memo.get(periods);
        }


        if (periods == 0) {
            return initialValue;
        }


        double futureValue = calculateFutureValueMemoized(initialValue, growthRate, periods - 1, memo) * (1 + growthRate);


        memo.put(periods, futureValue);
        return futureValue;
    }


    public static void main(String[] args) {
        double initialPrincipal = 1000.0;
        double annualGrowthRate = 0.05;
        int numberOfYears = 10;


        double futureValue = calculateFutureValue(initialPrincipal, annualGrowthRate, numberOfYears);
        System.out.println("--- Standard Recursion ---");
        System.out.printf("Future value after %d years: $%.2f%n%n", numberOfYears, futureValue);

       
        Map<Integer, Double> memo = new HashMap<>();
        double futureValueMemo = calculateFutureValueMemoized(initialPrincipal, annualGrowthRate, numberOfYears, memo);
        System.out.println("--- Optimized with Memoization ---");
        System.out.printf("Future value after %d years: $%.2f%n", numberOfYears, futureValueMemo);
    }
}
