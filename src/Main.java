import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static String startDate;
    public static LocalDate date1;
    public static LocalDate date2;
    public static String temp;
    public static final DateTimeFormatter dataFormat = DateTimeFormatter.ofPattern("dd MMMM EEEE yyyy");

    public static void main(String[] args) {
        enterDates();
        date1 = date();
        date2 = date();
        weekDays();
    }

    public static void enterDates() {
        System.out.println("Введите даты:");
    }

    public static LocalDate date() {
        startDate = new Scanner(System.in).nextLine();
        return LocalDate.parse(startDate);
    }

    public static void weekDays() {
        while (date1.isBefore(date2)) {
            if (date1.getDayOfWeek().getValue() <= 5) {
                temp = date1.format(dataFormat);
                print();
            } else {
                temp = date1.format(dataFormat);
                printWeekEnds();
            }
            date1 = date1.plusDays(1);
        }
        System.out.println("\u001B[31m" + date2.format(dataFormat));
    }

    public static void print() {
        System.out.println("\u001B[0m" + temp);
    }

    public static void printWeekEnds() {
        System.out.println("\u001B[31m" + temp);
    }
}




