public class new {
   
//Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.

    public static void main(String[] args) {
        int[] arr = new int[] {1,1,1,1,0,1,1,1,1,1,0,1,1};
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]== 1) {
                count+=1;
            }
            else {
                if (count>max) {
                    max=count;
                }
            count=0;
            }
        }
        System.out.printf("Максимальное количество подряд идущих 1, %d" ,max);
    }
}
