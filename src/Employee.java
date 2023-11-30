public abstract class Employee {

    //region Поля
    protected String firstName;
    protected String lastName;
    protected int age;
    protected String vocation;
    protected Double salary;
    //endregion

    //region Конструкторы
    public Employee(String firstName, String lastName, int age, String vocation, Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if(age < 18) {
            throw new RuntimeException("Некорректный возраст сотрудника.");
        }
        this.age = age;
        this.vocation = vocation;
        this.salary = salary;
    }
    //endregion

    //region Свойства
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age < 18) {
            throw new RuntimeException("Некорректный возраст сотрудника.");
        }
        this.age = age;
    }

    public String getVocation() {
        return vocation;
    }
    public void setVocation(String vocation) {
        this.vocation = vocation;
    }

    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    //endregion

    //region Методы

    /**
     * Абстрактный метод начисления зарплаты
     * @return
     */
    public abstract Double calculateSalary();

    /**
     * метод вывода информации
     */
    public void printDisplayInfo() {
        System.out.printf("%s %s %d %s %f", firstName, lastName, age, vocation, salary);
    }
    //endregion
}
