/*
Создайте класс Computer со свойствами-компонентами. Для каждого такого свойства создайте классы с перечисленными полями (имена классов и полей,
а также типы полей придумайте самостоятельно).

1.    Процессор:
·  	частота, (создать разные енамы)
·  	количество ядер, (так же через энамы)
·  	производитель,(так же через энамы)
·  	вес.
2.    Оперативная память:
·  	тип, (так же через энамы)
·  	объём,
·  	вес.
3.    Жесткий диск:
·  	тип — HDD, SSD, (так же через энамы)
·  	объём памяти,
·  	вес.
4.    Экран:
·  	диагональ,
·  	тип (IPS, TN, VA), (так же через энамы)
·  	вес.
5.    Клавиатура:
·  	тип, (так же через энамы)
·  	наличие подсветки, (так же через энамы)
·  	вес.
4. В классе Computer также создайте неизменяемые текстовые поля vendor (производитель) и name (название) и реализуйте следующие методы:
·      Метод расчета общей массы компьютера, возвращающий суммарный вес всех его компонентов.
·      Геттеры и сеттеры для всех компонентов компьютера.
·      Метод toString, возвращающий в удобочитаемом формате всю информацию о компьютере и его компонентах.

 */

import Computer.Computer;
import Computer.Hard.HardDisc;
import Computer.Hard.HardDiscType;
import Computer.Keyboard.Backlight;
import Computer.Keyboard.Keyboard;
import Computer.Keyboard.KeyboardType;
import Computer.Memory.Memory;
import Computer.Memory.MemoryType;
import Computer.Monitor.Monitor;
import Computer.Monitor.MonitorType;
import Computer.Processor.CoreCount;
import Computer.Processor.Frequency;
import Computer.Processor.Manufacturer;
import Computer.Processor.Processor;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor(Frequency.THREE_THOUSAND, CoreCount.FOUR, Manufacturer.SNAPDRAGON, 50);
        Memory memory = new Memory(MemoryType.DDR5, 32, 50);
        HardDisc hardDisc = new HardDisc(HardDiscType.SSD, 1000, 600);
        Monitor monitor = new Monitor(MonitorType.OLED, 32, 10000);
        Keyboard keyboard = new Keyboard(KeyboardType.WIRED, Backlight.YES, 700);


        Computer computer = new Computer(processor, memory, hardDisc, monitor, keyboard, "INTEL", "ASUS");
//        System.out.println(computer);
        System.out.println(computer.getWeight());
    }
}
