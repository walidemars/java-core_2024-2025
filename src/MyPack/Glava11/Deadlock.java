package MyPack.Glava11;

class A {
    synchronized void foo (B b) {
        String name = Thread.currentThread().getName();

        System.out.println(name + " вошел в метод A.foo()");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Класс А прерван");
        }
        System.out.println(name + " пытается вызвать метод B.last()");
        b.last();
    }

    synchronized void last() {
        System.out.println("В методе A.last()");
    }
}

class B {
    synchronized void bar (A a) {
        String name = Thread.currentThread().getName();

        System.out.println(name + " вошел в метод B.bar()");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Класс B прерван");
        }
        System.out.println(name + " пытается вызвать метод A.last()");
        a.last();
    }

    synchronized void last() {
        System.out.println("В методе A.last()");
    }
}

class Deadlock implements Runnable {
    A a = new A();
    B b = new B();

    Deadlock(){
        Thread.currentThread().setName("Главный поток");
        Thread t = new Thread(this, "Соперничающий поток");
        t.start();

        a.foo(b); // полуяить блокировку для объекта а в данном потоке исполнения
        System.out.println("Назад в главный поток");
    }

    public void run() {
        b.bar(a); // полуяить блокировку для объекта b в другом потоке исполнения
        System.out.println("Назад в другой поток");
    }

    public static void main(String[] args) {
        new Deadlock();
    }

}
