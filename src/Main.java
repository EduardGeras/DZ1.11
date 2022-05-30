public class Main {
    private static Employee[] list = new Employee[10];
    public static void main(String[] args) {

        list[0] = new Employee("Иванов Иван Иванович", 5, 76_000);
        list[1] = new Employee("Петров Пётр Петрович", 4, 98_000);
        list[2] = new Employee("Сидоров Сидор Сидорович", 3, 102_000);
        list[3] = new Employee("Иванова Дарья Ивановна", 2, 72_000);
        list[4] = new Employee("Петрова Екатерина Викторовна", 1, 88_000);
        list[5] = new Employee("Сидорова Марина Петровна", 5, 93_000);
        list[6] = new Employee("Козлова Людмила Юрьевна", 4, 83_000);
        list[7] = new Employee("Козлов Дмитрий Юрьевич", 3, 100_000);
        list[8] = new Employee("Сухов Виктор Викторович", 2, 85_000);
        list[9] = new Employee("Сухова Анастасия Михайловна", 1, 99_000);

        lists();
        expenses();
        minWage();
        maxWage();
        averageSalary();
        staff();
        index(10);
        maxSalaryOfTheDepartment(2);
        minSalaryOfTheDepartment(2);
        departmentCosts(2);
        averageSalaryInTheDepartment(2);
        indexingTheDepartment(12, 2);
        departmentList(2);
        salaryLevel(95_000);

    }

    private static void lists() {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    private static void expenses() {
        double summa = 0;
        for (int i = 0; i < list.length; i++) {
            summa += list[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц равна " + summa);
    }

    private static void minWage() {
        double salary = list[0].getSalary();
        for (int i = 0; i < list.length - 1; i++) {
            if (salary > list[i + 1].getSalary()) {
                salary = list[i + 1].getSalary();
            }
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i].getSalary() <= salary) {
                System.out.println("Минимальную зарплату получает " + list[i].getName());
            }
        }
    }

    private static void maxWage() {
        double salary = list[0].getSalary();
        for (int i = 0; i < list.length - 1; i++) {
            if (salary < list[i + 1].getSalary()) {
                salary = list[i + 1].getSalary();
            }
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i].getSalary() >= salary) {
                System.out.println("Максимальную зарплату получает " + list[i].getName());
            }
        }
    }

    private static void averageSalary() {
        double summa = 0;
        for (int i = 0; i < list.length; i++) {
            summa += list[i].getSalary();
        }
        System.out.println("Средняя зарплата в месяц равна " + summa / list.length);
    }

    private static void staff() {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getName());
        }
    }

    private static void index (int a) {
        for (int i = 0; i < list.length; i++) {
            double newSalary = list[i].getSalary() / 100 * a + list[i].getSalary();
            System.out.println("Проиндексировать зарплату на " + a + " процентов у сотрудника " + list[i].getName() + ". Новая зарплата равна " + newSalary);
        }
    }

    private static void maxSalaryOfTheDepartment (int departament) {
        double salary = list[0].getSalary();
        for (int i = 0; i < list.length; i++) {
            if (list[i].getDepartment() == departament && salary < list[i].getSalary()) {
                    salary = list[i].getSalary();
            }
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i].getDepartment() == departament) {
                if (list[i].getSalary() >= salary) {
                    System.out.println("Максимальную зарплату в отделе получает " + list[i].getName());
                }
            }
        }
    }
    private static void minSalaryOfTheDepartment (int departament) {
        double salary = list[0].getSalary();
        for (int i = 0; i < list.length; i++) {
            if (list[i].getDepartment() == departament && salary > list[i].getSalary()) {
                    salary = list[i].getSalary();
            }
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i].getDepartment() == departament) {
                if (list[i].getSalary() <= salary) {
                    System.out.println("Минимальную зарплату в отделе получает " + list[i].getName());
                }
            }
        }
    }

    private static void departmentCosts (int departament) {
        double summa = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getDepartment() == departament) {
                summa = summa + list[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплату по отделу равна " + summa + " рублей.");
    }

    private static void averageSalaryInTheDepartment (int departament) {
        double summa = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getDepartment() == departament) {
                summa = summa + list[i].getSalary();
            }
        }
        System.out.println("Средняя зарплата отдела в месяц равна " + summa / 2 + " рублей.");
    }

    private static void indexingTheDepartment(double index, int departament) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getDepartment() == departament) {
                double newSalary = list[i].getSalary() / 100 * index + list[i].getSalary();
                System.out.println("Проиндексировать зарплату на " + index + " процентов у сотрудника отдела " + list[i].getName() + ". Новая зарплата равна " + newSalary);
            }
        }
    }

    private static void departmentList(int departament) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getDepartment() == departament) {
                System.out.println("Сотрудник отдела " + list[i].getName() + " с зарплатой " + list[i].getSalary());
            }
        }
    }

    private static void salaryLevel(double a) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getSalary() < a) {
                System.out.println(list[i] + " Получает меньше " + a + " рублей.");
            }
            if (list[i].getSalary() >= a) {
                System.out.println(list[i] + " Получает больше " + a + " рублей.");
            }
        }
    }
}