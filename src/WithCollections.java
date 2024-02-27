import com.cyberking.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WithCollections {
    public static void getSwappedArray(
            @NotNull(description = "input array") int[] array,
            @NotNull(description = "get one element from this index swap to secondChangeableIndex ") int firstChangeableIndex,
            @NotNull(description = "get one element from this index swap to firstChangeableIndex ") int secondChangeableIndex) {

        List<Integer> list = new ArrayList<>();
        Arrays.stream(array).forEach(list::add);
        Collections.swap(list, firstChangeableIndex, secondChangeableIndex);

        System.out.println(list);
    }
}
