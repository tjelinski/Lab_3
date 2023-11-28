import java.util.Arrays;
import java.util.Collections;

public class tets {

    public static void main(String[] args) {
        Integer[] array = {1, 4, 9, 16, 25};
        System.out.println("Array before reverse : " + Arrays.toString(array));

        reverse(array);
        System.out.println("Array after reverse : " + Arrays.toString(array));
    }
    //method that reverses an array
    static void reverse(Integer[] array) {
        Collections.reverse(Arrays.asList(array));
    }
}
