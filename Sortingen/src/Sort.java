import java.util.ArrayList;
import java.util.Random;

public class Sort
{
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random(); // random number generator

        ArrayList<Integer> sorted_numbers = new ArrayList<>();
        int i=0;
        while(i<20) {
            numbers.add(rand.nextInt(100));
            i++;
        }

        for( int x:numbers){
            System.out.print(x+ ", " );

        }
        System.out.println("");
        while (numbers.size()>0) {
            for(int j = 0; j < numbers.size(); j++){
            int counter = numbers.size();

            for (int d = 0; d < numbers.size(); d++) {


                if (numbers.get(j) <= numbers.get(d)) {
                    counter--;


                }

            }
            if (counter ==0){
                sorted_numbers.add(numbers.get(j));
                numbers.remove(numbers.get(j));

            }
            }

        }

        for (int f: sorted_numbers){
            System.out.print(f + ",");
        }




    }
}

/*if (counter ==0){
                System.out.println(numbers.get(j )+ " is min ");

            }
            if (counter == numbers.size() ) {
                System.out.println(numbers.get(j )+ " is max ");

            }*/
// 2 times Repeated numbers give error this