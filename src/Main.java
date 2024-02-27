import com.cyberking.annotations.NotNull;

import java.util.Arrays;

public class Main {

    public static int[] getSwappedArray(
            @NotNull(description = "input array") int[] array,
            @NotNull(description = "swap size from array[0] to size") int count) {
        int length = array.length;
        int[] arr = Arrays.copyOf(array, length);//getting copy of original array

        int swapSize = count;//for decrement
        int addSize = count;//for increment

        for (int i = 0; i < count; i++) {
            array[length - swapSize--] = arr[i];
        }
        for (int j = 0; j < length - count; j++) {
            array[j] = arr[addSize++];
        }


        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};//U can write any array(1 dimensional) with any length
        System.out.println(Arrays.toString(getSwappedArray(array, 2)));

//        Arrays.stream(getSwappedArray(array, 0)).forEach(System.out::println); //U can use stream for showing result


//        WithCollections.getSwappedArray(array, 2,4); //Swap one element of array with Collections
    }
}
//Output: [3,4,5,1,2]
