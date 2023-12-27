import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<Integer>(); // Создаем LinkedList и добавляем в него числа
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        while (numbers.size() > 1) { // Выполняем цикл пока размер списка больше 1
            int first = numbers.removeFirst();
            int second = numbers.removeFirst(); // Удаляем первые два числа из списка
            int sum = first + second;
            numbers.addLast(sum); // Складываем числа и добавляем результат в конец списка
        }
        System.out.println("Результат: " + numbers.getFirst()); // Выводим результат
    }
}
