public class Main {
    public static void main(String[] args) {
        int finalBalance = 1000000;
        double currentBalance = 5000;
        int payment = 1000;
        int years = 0;
        double interestRate = 0.28;
       while (currentBalance < finalBalance){
            currentBalance += payment;
            currentBalance = currentBalance + currentBalance * interestRate;
            years ++;
           System.out.println("Years " + years+ " - " + currentBalance);
       }
    }
}