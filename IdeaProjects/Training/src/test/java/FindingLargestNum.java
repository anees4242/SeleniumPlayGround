public class FindingLargestNum {

    static void largestNumber(Integer[] num){
        int max = num[0];

        System.out.println("Length of the Array is " + num.length);

        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];

            }

        }

        System.out.println("Largest Number in the Arrays is "+max);


    }
    public static void main(String[] args) {


     //   int num[] = {10, 21, 31, 54, 61, 100};

        largestNumber(new Integer[]{12,31,15,100});


    }
}
