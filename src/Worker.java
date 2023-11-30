public class Worker extends Employee {

    //region Поля
    private Double workSalary;
    //endregion

    //region Конструкторы
    public Worker(String firstName, String lastName, int age, String vocation, Double salary) {
        super(firstName, lastName, age, vocation, salary);
    }
    //endregion

    //region Методы
    /**
     * Метод расчета зарплаты
     * @return
     */
    @Override
    public Double calculateSalary() {
        workSalary = super.salary;
        return workSalary;
    }

    /**
     * Метод создания экземпляра Worker
     * @param firstName
     * @param lastName
     * @param age
     * @param vocation
     * @param workSalary
     * @return
     */
    public static Worker create(String firstName, String lastName, int age, String vocation, Double workSalary) {
        if(firstName == null || firstName.length() < 3) {
            throw new RuntimeException("Некорректное имя сотрудника.");
        }
        if(lastName == null || lastName.length() < 3) {
            throw new RuntimeException("Некорректная фамилия сотрудника.");
        }
        if(age < 18) {
            throw new RuntimeException("Некорректный возраст сотрудника.");
        }
        return new Worker(firstName, lastName, age, vocation, workSalary);
    }

    /**
     * Метод вывода информации
     */
    @Override
    public void  printDisplayInfo() {
        System.out.printf("%s %s %d %s %.1f\n", firstName, lastName, age, vocation, calculateSalary());
    }
    //endregion
}