
import java.util.ArrayList;
import java.util.List;

public class foreach {
	
	public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        list.forEach(item -> {
            System.out.println(item);
        });
    }


}
