public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задание 1");
        String lastName = "Ivanov";
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника: " + fullName);
    }

    public static void task2() {
        System.out.println("Задание 2");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        fullName = fullName.toUpperCase();
        System.out.println("Ф.И.О. сотрудника: " + fullName);
    }

    public static void task3() {
        System.out.println("Задание 3");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println("Ф.И.О. сотрудника: " + fullName);
    }

    public static void task5() {
        System.out.println("Задание 5. Повышенная сложность!");
        String fullName = "Ivanov Ivan Ivanovich";
        int last = fullName.indexOf(" ");
        int first = fullName.indexOf(" ", last + 1);
        int middle = fullName.lastIndexOf(" ");
        String lastName = fullName.substring(0,last);
        String firstName = fullName.substring(last,first);
        String middleName = fullName.substring(first);
        System.out.print("Фамилия: " + lastName + "\nИмя:" + firstName + "\nОтчество: " + middleName);
        System.out.println();
    }

    public static void task6() {
        System.out.println("Задание 6. Повышенная сложность!");
        String fullName = "ivanov ivan ivanovich";
        String[] name = fullName.split (" ");
        String lastName = name[0] + " ";
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
        String firstName = name[1] + " ";
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        String middleName = name[2];
        middleName = middleName.substring(0, 1).toUpperCase() + middleName.substring(1).toLowerCase();
        fullName = lastName + firstName + middleName;
        System.out.println(fullName);
    }

    public static void task7() {
        System.out.println("Задание 7. Повышенная сложность!");
        String one = "135";
        String two = "246";
        StringBuilder three = new StringBuilder(one + two);
        three.insert(1, 2);
        three.insert(3, 4);
        three.delete(5, 7);
        System.out.println(three);
    }

    public static void task8() {
        System.out.println("Задание 8. Повышенная сложность");
        String s = "aabccddefgghiijjkk";
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (c[i] == c[j]) {
                    System.out.print(c[j] + " ");
                }
            }
        }
    }
}