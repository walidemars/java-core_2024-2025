package MyPack.Glava12.Perechislenia;

// Усовершенствованная версия программы принятия решений из главы 9
// В этой версии для представления возможных ответов используется перечисление,
// а не переменные экземпляра

import java.util.Random;

// Перечисление возможных ответов
enum Answer {
    NO, YES, MAYBE, LATER, SOON, NEVER
}

class Question {
    Random rand = new Random();
    Answer ask() {
        int prob = (int) (100 * rand.nextDouble());

        if (prob < 15)
            return Answer.MAYBE; //%15
        else if (prob < 30)
            return Answer.NO; //15%
        else if (prob < 60)
            return Answer.YES; // 30%
        else if (prob < 75)
            return Answer.LATER; // 15%
        else if (prob < 98)
            return Answer.SOON; // 13%
        else
            return Answer.NEVER; // 2%
    }
}

class AskMe_9glava {
    static void answer(Answer result) {
        switch (result) {
            case NO:
                System.out.println("Нет");
                break;
            case YES:
                System.out.println("Да");
                break;
            case MAYBE:
                System.out.println("Возмоно");
                break;
            case LATER:
                System.out.println("Позднее");
                break;
            case SOON:
                System.out.println("Вскоре");
                break;
            case NEVER:
                System.out.println("Никогда");
                break;
        }
    }

    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}
