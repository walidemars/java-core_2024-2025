package lr13;

public class Example5 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("error");
        } catch (RuntimeException e){ // исправлено, было NullPointerException
            System.out.println("1");
        }
        System.out.println("2");
    }
}
