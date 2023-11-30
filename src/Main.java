import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         * При создании экземпляра типа <Worker> зарплата - фиксированная, вводится при создании экземпляра.
         */
        Worker worker1 = Worker.create("Ivan", "Ivanov", 38, "builder", 100_000.0);
        Worker worker2 = Worker.create("Peter", "Petrov", 48, "fireman", 150_000.0);
        Worker worker3 = Worker.create("Sergey", "Sergeev", 26, "mechanic", 90_000.0);
        /**
         * При создании экземпляра типа <FreeLancer> зарплата - тарифная ставка, вводится при создании экземпляра
         *      и вычисляется по формуле (20.8 * 8 * тарифная ставка).
         */
        FreeLancer freeLancer1 = FreeLancer.create("Anna", "Ivanova", 35, "seller", 500.0);
        FreeLancer freeLancer2 = FreeLancer.create("Vasily", "Vasiliev", 25, "driver", 450.0);

        /**
         * Список работников и вывод на экран
         */
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(freeLancer1);
        employees.add(freeLancer2);

        for (Employee employee:employees) {
            employee.printDisplayInfo();
        }
    }
}