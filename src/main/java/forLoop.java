public class forLoop {
    public static void main(String... args){
        int arr[] = {5, 1, 4, 2, 3};
        int i = 0;
        for (;;) {
            if (i >= arr.length){
                break;
            }
            System.out.println("arr[" + i + "] = " +  arr[i]);
            ++i;
        }
        System.out.println("Loop existed with index: " + i);

    }
}
