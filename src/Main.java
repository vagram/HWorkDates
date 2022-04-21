import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static LocalDate date1;
    public static LocalDate date2;
    public static String temp;
    public static String startDate;
    public static String weekEnds;

    public static void main(String[] args) {
        enterDates();
        date1 = date();
        date2 = date();
        weekDays();
    }
    public static void enterDates() {
        System.out.println("Введите даты: ");
    }
    public static LocalDate date() {
        startDate = new Scanner(System.in).nextLine();
        return LocalDate.parse(startDate);

    }
    public static void weekDays() {
        while (date1.isBefore(date2)) {
            if (date1.getDayOfWeek().getValue() <= 5) {
                DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd MMMM EEEE yyyy");
                temp = date1.format(dateFormat);
                print();
            }else if (date1.getDayOfWeek().getValue() > 5 && date1.getDayOfWeek().getValue() <=7){
                DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd MMMM EEEE yyyy");
                weekEnds = date1.format(dateFormat);
                System.out.println("\u001B[31m" + weekEnds);
            }
            date1 = date1.plusDays(1);
        }
    }

    public static void print() {
        System.out.println("\u001B[0m" + temp);

    }
}




