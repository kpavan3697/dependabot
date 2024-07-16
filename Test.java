import org.apache.commons.lang3.StringUtils;
public class Test {
    public static void main(String[] args) {
        String str = "Testing";
        boolean isEmpty = StringUtils.isEmpty(str);
        System.out.println("Is empty: " + isEmpty);
    }
}
