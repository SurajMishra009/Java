import java.sql.SQLOutput;
import java.util.Scanner;
public class Javaarray {

        public int maxArray(int[] array) {

            int max = 0;
            for(int i= 0; i<array.length; i++)
            {
                if(array[i]>max)
                {
                    max=array[i];
                }
            }

            return max;

    }

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int[] array = new int[n];


        for(int i=0;i<n;i++)
        {
            array[i] = sc.nextInt();
        }
        arryaJava obj = new arryaJava();
        System.out.println("Max of the array is " +obj.maxArray(array));

    }
}
