/**
 * level 1, lesson 5
 * @author Maluy Yaroslav
 * @version data 14.06.19
 */
class Homework_5 {
// Создать массив из 5 сотрудников
    public static void main(String[] args) {
        Employee[] arr = new Employee[5];
        arr[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        arr[1] = new Employee("Alexander Chester", "Programmer", "alexander@mailbox.com", "890021024", 40000, 27);
        arr[2] = new Employee("Audrey Smith", "Builder", "audrey@mailbox.com", "890021024", 25000, 41);
        arr[3] = new Employee("James Allford", "Doctor", "james@mailbox.com", "890181845", 50000, 39);
        arr[4] = new Employee("Scott Bush",   "Teacher", "scott@mailbox.com", "891710552", 20000, 44);
       // С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        for (Employee pers : arr) {
            if (40 < pers.getAge()) {
                pers.getInfo();
            }
        }
    }
}