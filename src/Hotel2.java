
import java.util.Scanner;

public class Hotel2 {
    public static void main(String[] args) throws Exception {
        double nightCost = 0;
        double nightNormal = 90;
        double nightDeluxe = 120;
        double nightDeluxePlus = 150;


        double fiveDays = 0.1;
        double tenDays = 0.15;
        double fifteenDays = 0.2;

        double total;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Good day, (not) dear (not) guest!");
        System.out.println("One night in Normal room is worth 90 squats, in Deluxe room: 120, in Deluxe suites: 150 and in the closet that opens to Narnia.. \nAnd breakfast + 10. If you wish \n" +
                "For long stays there are discounts: 5 days - 10%, 10 days - 15%, more than 15 days - 20%");
        System.out.println("How many days do you want to stay at the hotel?");


        int days = scanner.nextInt();
        System.out.println("Do you want to order breakfasts in the morning? Yes or no");
        String plusBreakfast = scanner.next();

        System.out.println("Which type of room they would like?  Normal room: 1, Deluxe room: 2 and Deluxe suites: 3. Or closet: 4 ;) ");
        int room = scanner.nextInt();

            if(room == 1){
                nightCost = nightNormal;
            } else if (room == 2) {
                nightCost = nightDeluxe;
            } else if(room == 3) {
                nightCost = nightDeluxePlus;
            } else if (room == 4){
                System.out.println("I'm sorry. This country doesn't exist. I've already called in special doctors. They will definitely help you )))");

                return;


            }
            if (plusBreakfast.equals("yes" )){
                if (days >= 5 && days < 10){
                    double discount =  nightCost * tenDays;
                    nightCost = nightCost - discount;
                } else {
                    double discount = nightCost * fifteenDays;
                    nightCost = nightCost - discount;
                }
                double breakfast = 10;
                total = days * (nightCost + breakfast);

                System.out.println("Okay. For " + days + " days + breakfasts... That'll be " + total + " squats");

            } else {
                if (days >= 5 && days < 10){
                    double discount = nightCost * fiveDays;
                    nightCost = nightCost - discount;
                } else if (days >=10 && days < 15) {
                    double discount =nightCost * tenDays;
                    nightCost= nightCost - discount;
                } else {
                    double discount =  nightCost * fifteenDays;
                    nightCost =  nightCost - discount;
                }

                total = days * nightCost;
                System.out.println("Okay. For " + days + " days without breakfast... That'll be " + total + " squats" );

            }
        }
}


