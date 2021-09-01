import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class DateTester{

	public static void main(String[] args) {

        Map<Integer, String> myMap = new LinkedHashMap<>();

        myMap.put(0, "Java");

        myMap.put(1, "Programmer");

        myMap.put(3, "Mock");

        myMap.putIfAbsent(3, "Certification");

        System.out.println(myMap.values());

}

}