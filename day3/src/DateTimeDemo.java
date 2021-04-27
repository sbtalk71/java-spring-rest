import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTimeDemo {

	public static void main(String[] args) {
		LocalDateTime dt= LocalDateTime.of(2021,Month.DECEMBER,30,20,21);
		System.out.println(LocalDateTime.now(ZoneId.of("America/Chicago")));
		System.out.println(dt);

	}

}
