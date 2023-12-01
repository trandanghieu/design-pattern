package strategy;

public class Ex01 {
    // Bài toán cộng trừ nhân chia hai số
    public static void main(String[] args) {
        Functional f1 = (a,b)->  a+b;
        Functional f2 = (a,b)->  a-b;
        Functional f3 = (a,b)->  a*b;
        Functional f4 = (a,b)->  a/b;
        System.out.println(calculate(140,5,f1));
        System.out.println(calculate(140,5,f2));
        System.out.println(calculate(140,5,f3));
        System.out.println(calculate(140,5,f4));
    }
    //Strategy Pattern
    private static int calculate(int a, int b, Functional functional){
        return functional.func(a,b);
    }
}
