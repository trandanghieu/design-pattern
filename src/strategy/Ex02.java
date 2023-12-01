package strategy;

public class Ex02 {
    //Bài toán tìm số lượng phần tử trong mảng  chia hết cho 2 3 5 ...
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5,6,7,8,9};

        Condittion c1 = x -> x%2 ==0;
        Condittion c2 = x -> x%2 !=0;
        Condittion c3 = x -> x%3 ==0;

        System.out.println(count(arrays,c1));
        System.out.println(count(arrays,c2));
        System.out.println(count(arrays,c3));
    }
    private static int count(int[] array, Condittion con) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (con.condition(array[i])) {
                count++;
            }
        }
        return count;
    }


}
