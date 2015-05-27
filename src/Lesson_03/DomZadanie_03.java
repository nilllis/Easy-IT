package Lesson_03;

//        »»»»»»»»Домашнее задание«««««««<
//
//        Предусмотреть утилитный класс для работы со строками StringUtils.
//        В классе предусмотреть методы:
//
//        1) div
//        public void div(String number1, String number2){..............}
//
//        2) findWord
//        public void findWord(String text, String word){..............}
//
//        Метод ищет все вхождения слова word в строке text, заменяет все вхождения слова word на слово drow.
//        Метод выводит на экран новую измененную сторку.
//        Пример входящей строки: “Vertical Text In Word. Making text vertical in word isn’t easy if you don’t know where to look. There is no simple way of getting Word (word) to display vertically aligned text, but there is a sneaky way.”
//        Parameters:
//        text - исходный текст
//        word - искомое слово
//
//        3) findNumbers
//        public void findNumbers(String text){..............}
//
//        Находит в тексте все double числа и выводит их на экран. Если чисел не обнаружено в тексте необходимо вывести сообщение: "Not found"
//        Parameters:
//        text - исходный текст

/**
 * Created by пк on 13.05.2015.
 */
public class DomZadanie_03 {

    public static void main(String[] args) {

        StringUtils dz03 = new StringUtils();

        //Выводит на экран результат деления number1 на number2 в строке.
        //Пример входящей строки: “FGhj256rtyu t100..ee”
        String a1 = "FGhj256rtyut100..ee";
        System.out.println(dz03.div(a1) + '\n');


        //ищет все вхождения слова word в строке text, заменяет все вхождения одного слова на другое слово.
        String text = "Vertical Text 55 In Word. Making text vertical in word isn’t easy if you don’t know where to look." +
                " There is no simple way of getting Word (word) to display vertically aligned text, but there is a sneaky way.";
        String word = "t";
        String wordPaste = "***";
        dz03.findWord(text, word, wordPaste);


        //Находит в тексте все double числа и выводит их на экран.
        //Если чисел не обнаружено в тексте необходимо вывести сообщение: "Not found"
        System.out.println("\nDoubles: ");
        String str = text.trim();
        dz03.findNumbers(str);


    }

}

