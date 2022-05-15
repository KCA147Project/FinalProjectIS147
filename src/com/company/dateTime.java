import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dateTime {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();
}
