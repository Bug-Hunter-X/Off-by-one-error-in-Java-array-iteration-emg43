public class MyClass {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i <= array.length; i++) { //Error: accessing index out of bounds
            System.out.println(array[i]);
        }
    }
}