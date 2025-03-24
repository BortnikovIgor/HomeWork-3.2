public class Main {
    public static void main(String[] args) {
        // Создаем массив из 5 сотрудников
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов Иван", "Инженер", "ivanov@mail.com", "123456789", 50000, 45);
        employees[1] = new Employee("Петров Петр", "Менеджер", "petrov@mail.com", "987654321", 60000, 38);
        employees[2] = new Employee("Сидоров Сидор", "Разработчик", "sidorov@mail.com", "112233445", 70000, 41);
        employees[3] = new Employee("Козлов Константин", "Аналитик", "kozlov@mail.com", "998877665", 55000, 35);
        employees[4] = new Employee("Смирнова Анна", "Директор", "smirnova@mail.com", "556677889", 80000, 50);

        // Вывод информации о сотрудниках старше 40 лет
        System.out.println("Сотрудники старше 40 лет:");
        for (Employee emp : employees) {
            if (emp.getAge() > 40) {
                emp.printInfo();
            }
        }
    }
}

// Класс Сотрудник
class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    // Конструктор, заполняющий все поля
    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    // Метод для получения возраста (для проверки условия в main)
    public int getAge() {
        return age;
    }

    // Метод для красивого вывода информации о сотруднике
    public void printInfo() {
        System.out.println("Сотрудник: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println("-----------------------------");
    }
}
