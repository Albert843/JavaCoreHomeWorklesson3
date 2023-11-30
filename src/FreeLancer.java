public class FreeLancer extends Employee{

    //region Поля
    private Double freeSalary;
    //endregion

    //region Конструкторы
    public FreeLancer(String firstName, String lastName, int age, String vocation, Double salary) {
        super(firstName, lastName, age, vocation, salary);
    }
    //endregion

    //region Методы

    /**
     *  Метод начисления зарплаты по тарифной ставке
     * @return
     */
    @Override
    public Double calculateSalary() {
        freeSalary = super.salary;
        Double monthFreeStalerSalary = 20.8 * 8 * freeSalary;
        return monthFreeStalerSalary;
    }

    /**
     * Метод создания экземпляра FreeLancer
     * @param firstName
     * @param lastName
     * @param age
     * @param vocation
     * @param freeSalary
     * @return
     */
    public static FreeLancer create(String firstName, String lastName, int age, String vocation, Double freeSalary) {
        if(firstName == null || firstName.length() < 3) {
            throw new RuntimeException("Некорректное имя сотрудника.");
        }
        if(lastName == null || lastName.length() < 3) {
            throw new RuntimeException("Некорректная фамилия сотрудника.");
        }
        if(age < 18) {
            throw new RuntimeException("Некорректный возраст сотрудника.");
        }
        return new FreeLancer(firstName, lastName, age, vocation, freeSalary);
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
