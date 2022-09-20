public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String whitespace = " ";
        String fullName = firstName+whitespace+middleName+whitespace+lastName;
        System.out.println("ФИО сотрудника — "+fullName);
        System.out.println("Задание 2");
        String result = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+result);

        System.out.println("Задание 3");
        String bfirstName = "Семён";
        String bmiddleName = "Семёнович";
        String blastName = "Иванов";
        bfirstName = bfirstName.replace("ё", "е");
        bmiddleName=bmiddleName.replace("ё", "е");
        String bwhitespace = " ";
        String bfullName = bfirstName+bwhitespace+bmiddleName+bwhitespace+blastName;
        System.out.println("ФИО сотрудника — "+bfullName);
    }
}