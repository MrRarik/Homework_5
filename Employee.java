// Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
public class Employee {

    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;
// Конструктор класса должен заполнять эти поля при создании объекта;
    Employee(String name, String position, String email, String phone, int salary, int age) {
        setName(name);
        setPosition(position);
        setEmail(email);
        setPhone(phone);
        setSalary(salary);
        setAge(age);
    }
    // Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
    public String toString() {
            return "Name: " + getName() + " " +
                    " Postion: " + getPosition() + " " +
                    " Email: " + getEmail() + " " +
                    " Phone: " + getPhone() + " " +
                    " Salary: " + getSalary() + " " +
                    " Age: " + getAge();
    }
     String getName() {
        return name;
    }

     void setName(String name) {
        if (name != null)
        this.name = name;
    }

     String getPosition() {
        return position;
    }

     void setPosition(String position) {
        if (position != null)
        this.position = position;
    }

     String getEmail() {
        return email;
    }

     void setEmail(String email) {
        if (email != null)
        this.email = email;
    }

     String getPhone() {
        return phone;
    }

     void setPhone(String phone) {
        if (phone != null)
        this.phone = phone;
    }

     int getSalary() {
        return salary;
    }

     void setSalary(int salary) {
            this.salary = salary;
    }

     int getAge() {
        return age;
    }

     void setAge(int age) {
        this.age = age;
    }
    void getInfo() {
        System.out.println(this);
    }
}
