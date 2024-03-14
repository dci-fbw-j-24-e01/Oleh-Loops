public class LoopWile {

    public static void main(String[] args) {
        int counter = 1;
        int counter1 = 1;
        while (counter <= 5){
            System.out.print(counter + ",");
           counter += 1;
        }
        System.out.println("\n");

        System.out.println("========");
        while (counter1 < 100 ){
            if (counter1 % 2 == 0){

//                System.out.println(counter1);
            }
            counter1 += 1;
        }
        System.out.println("END!");
    }
}
