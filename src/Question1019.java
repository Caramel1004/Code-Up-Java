import java.util.*;
import java.text.*;

public class Question1019 {

	public static void main(String[] args) {

		// 1. 문자열 형태로 날짜 입력
		Scanner input = new Scanner(System.in);

		String date = input.next();

		// 2. SimpleDateFormat클래스
		String pattern = "yyyy.mm.dd";

		SimpleDateFormat sdf = new SimpleDateFormat(pattern);

		// 3. 문자열을 날짜Date 인스턴스로 변환
		try {
			Date sdf_date = sdf.parse(date);
			System.out.println(sdf.format(sdf_date));
		} catch (ParseException e) {
			System.out.println("yyyy.mm.dd형태로 입력 하시 길 바랍니다.");
		}
	}

}
