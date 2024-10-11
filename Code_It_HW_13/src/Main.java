/*
Создайте класс ArithmeticCalculator, который будет выполнять арифметические операции над числами.
1.Реализуйте конструктор с двумя параметрами-числами, который сохраняет переданные числа в свойствах класса.
2.Реализуйте метод calculate, на вход которого передаётся одна из арифметических операций (объект класса Operation — смотрите следующий пункт задания),
  которую нужно произвести с двумя числами, переданными в конструктор при создании объекта.
3.Создайте Enum Operation с тремя значениями: ADD, SUBTRACT, MULTIPLY.
  Эти значения будут соответствовать арифметическим операциям — сложению, вычитанию и умножению.
*/

import Calculator.ArithmeticCalculator;
import Calculator.Operation;

public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(5, 2);
        arithmeticCalculator.calculate(Operation.ADD);
        arithmeticCalculator.calculate(Operation.MULTYPLY);
        arithmeticCalculator.calculate(Operation.SUBTRACT);
    }
}
