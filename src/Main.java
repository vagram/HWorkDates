import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static LocalDate date1;
    public static LocalDate date2;
    public static String temp;

    public static void main(String[] args) {
        enterDates();
        weekDays();
    }

    public static void enterDates() {
        System.out.println("Введите даты: ");
        String startDate = new Scanner(System.in).nextLine();
        String endDate = new Scanner(System.in).nextLine();
        date1 = LocalDate.parse(startDate.formatted());
        date2 = LocalDate.parse(endDate.formatted());
    }

    public static void weekDays() {
        while (date1.isBefore(date2)) {
            if (date1.getDayOfWeek().getValue() <= 5) {
                DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd MMMM EEEE yyyy");
                temp = date1.format(dateFormat);
                print();
            }
            date1 = date1.plusDays(1);
        }
    }

    public static void print() {
        System.out.println(temp);
    }
}




