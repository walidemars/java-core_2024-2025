package lr13;

public class Example6 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("error");
        } catch (ArithmeticException e){
            System.out.println("1");
        } catch (RuntimeException e) {
            System.out.println("2");
        } catch (Exception e){ // Исправлено, RuntimeException перехватывает раньше Exception
            System.out.println("3");
        }
        System.out.println("4");
    }
}
