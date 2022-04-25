import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2018, 11, 12);
        LocalDate endDate = LocalDate.of(2018, 11, 20);
        System.out.println();
        System.out.println(endDate);
        startDate = startDate.minusDays(1);
        while (startDate.isBefore(endDate)) {
            startDate = startDate.plusDays(1);
            if (startDate.getDayOfWeek().getValue() <= 5) {
                DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd MMMM EEEE yyyy");
                String temp = startDate.format(dateFormat);
                System.out.println(temp);
            }
        }

    }
}




