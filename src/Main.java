public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Цадкин", "Мирослав", "Викторович", 1, 100000);
        employee[1] = new Employee("Ласынов", "Тимур", "Ильгизович", 2, 200000);
        employee[2] = new Employee("Симаков", "Дмитрий", "Александрович", 3, 140000);
        employee[3] = new Employee("Коростылев", "Сергей", "Святославович", 4, 210000);
        employee[4] = new Employee("Иванов", "Евгений", "Валерьевич", 5, 80000);
        employee[5] = new Employee("Штефан", "Виктор", "Викторович", 3, 90000);
        employee[6] = new Employee("Параничев", "Александр", "Витальевич", 4, 65000);
        employee[7] = new Employee("Полякова", "Римма", "Степановна", 5, 24000);
        employee[8] = new Employee("Ильин", "Евгений", "Николаевич", 3, 132500);
        employee[9] = new Employee("Попко", "Антон", "Игоревич", 4, 55250);


        toStringForAll(employee);
        System.out.println();
        costAmount(employee);
        System.out.println();
        minSalary(employee);
        System.out.println();
        maxSalary(employee);
        System.out.println();
        averageSalary(employee);
        System.out.println();
        fullName(employee);
    }

    public static void toStringForAll(Employee[] b) {
        System.out.println("Cписок всех сотрудников со всеми имеющимися по ним данными:");
        for (Employee employee : b) {
            System.out.println(employee.toString());
        }
    }

    public static int costAmount(Employee[] a) {
        int sum = 0;

        for (Employee employee : a) {
            sum += employee.getSalary();

        }
        System.out.println("Cумма затрат на зарплаты в месяц " + sum);
        return sum;
    }
    public static void minSalary(Employee[] c) {
        int b = 0;
        int min = Integer.MAX_VALUE;
        for (Employee employee : c) {
            if (min > employee.getSalary()) {
                min = employee.getSalary();
                b= employee.getId();
            }
        }
        System.out.println(c[b-1].getName()+" "+c[b-1].getSurname()+" получает минимальную зарплату  "+min);

    }

    public static void maxSalary(Employee[] d) {
        int max = Integer.MIN_VALUE;
        int a=0;
        for (Employee employee : d) {
            if (max < employee.getSalary()) {
                max = employee.getSalary();
                a= employee.getId();
            }
        }
        System.out.println(d[a-1].getName() +" "+d[a-1].getSurname()+" получает максимальную зарплату  "+max);

    }

    public static void averageSalary(Employee[] e) {

        System.out.println("Cреднее значение зарплат "+ costAmount(e) / e.length);

    }

    public static void fullName(Employee[] f) {
        System.out.println("Ф. И. О. всех сотрудников:");
        for (Employee employee : f) {
            System.out.println(employee.getSurname() + " " +employee.getName()  + " " + employee.getPatronymic());
        }
    }
}



















