/* 
Дан массив nums = [3,2,4,3,3,1,5,3,3] и число val = 3. 
Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

[2 4 1 5 3 3 3 3 3]
*/

import java.util.Arrays;

public class new2 {
   
        public static void main(String[] args) {
            int[] array = { 3, 2, 4, 3, 3, 1, 5, 3, 3 };
            for (int j = 0; j < array.length-1; j++) {
                for (int i = 0; i < array.length-j-1; i++) {
                    if (array[i]==3){
                        if (array[i+1]!=3){
                            int temp = array[i];
                            array[i]=array[i+1];
                            array[i+1]=temp;
                        }
                    }
                }
            }
           System.out.println(Arrays.toString(array));
            for (int i = 0; i < array.length; i++) {
                System.out.printf("%d", array[i]);
            }     
        }
    }

