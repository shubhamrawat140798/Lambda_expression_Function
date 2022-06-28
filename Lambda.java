import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;

import java.util.function.Function;

public class Lambda {
    public static void main(String[] args) {
    
        Function<List<String>, List<String>> listFunction = strings -> new ArrayList(new HashSet(strings));

        List<String> resList = listFunction.apply(Arrays.asList("java scala java kotlin".split(" ")));
        System.out.println(resList);

    }
    
}
