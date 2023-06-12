import java.util.Arrays;

public class new4
{public static void main(String[] args) {
        int[] array = new int[] {0,2,4,0,0,1,5,0,3};
        int val = 3;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != val) {
                array[counter] = array[i];
                array[i] = val;
                counter += 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }    
}    

