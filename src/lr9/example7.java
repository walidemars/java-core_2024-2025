package lr9;

public class example7 { // Главный класс
    public static void main(String[] args) {
        // добавление эл-ов с перемещением головы (наращивание с хвоста)
        Node head = null; // начальное значение ссылки на голову
        for(int i = 9; i >= 0; i--){
            head = new Node(i, head);
        }
        // вывод эл-ов на экран
        Node ref = head;
        while (ref != null){
            System.out.println(" " + ref.value);
            ref = ref.next;
        }
    }
}
