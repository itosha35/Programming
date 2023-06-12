public class new3 {
    public static void main(String[] args) {
        int[] array = { 3,2,4,3,3,1,5,3,3 };
        int value = 3;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 3){
                counter += 1;
            }
        }
        for (int i = 0; i < array.length - counter; i++) {
            if (array[i] == value) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j+1];
                }
                array[array.length -1] = value;
                i--;
            }
        }
        System.out.println(Arrays.toString(array));
    }
} {
    
}
