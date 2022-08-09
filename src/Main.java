import static java.lang.Character.getName;

public class Main {
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Молчанов Александр Максимович", 1, 45000);
        employees[1] = new Employee("Соколов Даниил Тимофеевич", 1, 48000);
        employees[2] = new Employee("Самойлова Полина Ивановна", 2, 52000);
        employees[3] = new Employee("Попова Лилия Давидовна", 2, 55000);
        employees[4] = new Employee("Федоров Андрей Адамович", 3, 32000);
        employees[5] = new Employee("Павлов Владимир Фёдорович", 3, 16000);
        employees[6] = new Employee("Нечаев Владислав Андреевич", 4, 58000);
        employees[7] = new Employee("Москвин Денис Евгеньевич", 4, 93000);
        employees[8] = new Employee("Аксенова Ксения Егоровна", 5, 17000);
        employees[9] = new Employee("Лебедев Георгий Романович", 5, 10000);
        System.out.println(employees[0]);
        System.out.println(employees[1]);
        System.out.println(employees[2]);
        System.out.println(employees[3]);
        System.out.println(employees[4]);
        System.out.println(employees[5]);
        System.out.println(employees[6]);
        System.out.println(employees[7]);
        System.out.println(employees[8]);
        System.out.println(employees[9]);


        int[] array = new int[10];
        java.util.Random random = new java.util.Random();

        int min = 10000, max = 93000;
        double sum=0;
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100000) + 100000;
            if (min > array[i]) min = array[i];
            if (max < array[i]) max = array[i];}
        for (int i = 0; i < array.length; i ++) {
            array[i] = (int) (Math.random() * 100_000) + 100_000;
            sum += array[i];
        }
        System.out.println("Сумма трат на зарплаты: " + sum + " рублей. ");
        System.out.println("Минимальная зарлата: " + min + " рублей." );
        System.out.println("Максимальная зарплата: "   + max + " рублей. ");
        System.out.println("Средняя сумма зарплат: " + sum / 10 + " рублей. ");
    }

    }






