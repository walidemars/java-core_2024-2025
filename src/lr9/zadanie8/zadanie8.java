package lr9.zadanie8;

import lr9.Node;

public class zadanie8 {

    private Node head;

    // Метод ввода с головы
    public void createHead(int[] data) {
        for (int i = data.length - 1; i >= 0; i--) {
            head = new Node(data[i], head);
        }
    }

    // Метод ввода с хвоста
    public void createTail(int[] data) {
        if(data.length == 0) return;
        head = new Node(data[0], null);
        Node ref = head;
        for (int i = 1; i < data.length; i++) {
            ref.next = new Node(data[i], null);
            ref = ref.next;
        }
    }

    // Вывод списка
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node ref = head;
        while(ref != null) {
            sb.append(ref.value).append(" ");
            ref = ref.next;
        }
        //sb.append("null");
        return sb.toString();
    }

    // Добавление элемента в начало
    public void AddFirst(int data) {
        head = new Node(data, head);
    }

    // Добавление элемента в конец
    public void AddLast(int data) {
        Node newNode = new Node(data, null);
        if(head == null) {
            head = newNode;
            return;
        }
        Node ref = head;
        while(ref.next != null) {
            ref = ref.next;
        }
        ref.next = newNode;
    }

    // Вставка элемента по индексу (начиная с 0)
    public void Insert(int index, int data) {
        if(index == 0) {
            AddFirst(data);
            return;
        }
        Node ref = head;
        for (int i = 0; i < index - 1 && ref != null; i++) {
            ref = ref.next;
        }
        if(ref != null) {
            ref.next = new Node(data, ref.next);
        }
    }

    // Удаление первого элемента
    public void RemoveFirst() {
        if(head != null) {
            head = head.next;
        }
    }

    // Удаление последнего элемента
    public void RemoveLast() {
        if(head == null) return;
        if(head.next == null) {
            head = null;
            return;
        }
        Node ref = head;
        while(ref.next.next != null) {
            ref = ref.next;
        }
        ref.next = null;
    }

    // Удаление элемента по индексу (начиная с 0)
    public void Remove(int index) {
        if(index == 0) {
            RemoveFirst();
            return;
        }
        Node ref = head;
        for (int i = 0; i < index - 1 && ref != null; i++) {
            ref = ref.next;
        }
        if(ref != null && ref.next != null) {
            ref.next = ref.next.next;
        }
    }

    // Рекурсивные методы
    // Рекурсивный ввод с головы
    public void CreateHeadRec(int[] data) {
        head = CreateHeadRecHelper(data, 0);
    }
    private Node CreateHeadRecHelper(int[] data, int index) {
        if(index >= data.length) return null;
        return new Node(data[index], CreateHeadRecHelper(data, index + 1));
    }

    // Рекурсивный вывод списка
    public String toStringRec() {
        return toStringRecHelper(head);
    }
    private String toStringRecHelper(Node node) {
        if(node == null) return null;
        return node.value + " " + toStringRecHelper(node.next);
    }
}
