import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static LocalDate date1;
    public static LocalDate date2;
    public static final DateTimeFormatter dataFormat = DateTimeFormatter.ofPattern("dd MMMM EEEE yyyy");

    public static void main(String[] args) {
        date1 = enterDate();
        date2 = enterDate();
        weekDays();
    }

    public static LocalDate enterDate() {
        System.out.println("Введите дату:");
        return LocalDate.parse(new Scanner(System.in).nextLine());
    }

    public static void weekDays() {
        while (date1.isBefore(date2) || date1.equals(date2)) {
            if (date1.getDayOfWeek().getValue() <= 5) {
                print(date1.format(dataFormat));
            } else {
                printWeekEnds(date1.format(dataFormat));
            }
            date1 = date1.plusDays(1);
        }

    }

    public static void print(String temp) {
        System.out.println("\u001B[0m" + temp);
    }

    public static void printWeekEnds(String temp) {
        System.out.println("\u001B[31m" + temp);
    }
}




