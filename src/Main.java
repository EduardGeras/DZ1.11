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
}