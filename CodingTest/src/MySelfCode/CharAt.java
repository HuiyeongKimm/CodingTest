package MySelfCode;

public class CharAt {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("4177252841");
        System.out.println(str + ", type = " + str.getClass().getName());
        System.out.println(str.charAt(0)); // 반환 : 4
        System.out.println(str.charAt(1)); // 반환 : 1
        System.out.println(str.charAt(0) + '0'); // 반환 : 100
        System.out.println(str.charAt(1) + '0'); // 반환 : 97
        System.out.println(str.charAt(0) - '0'); // 반환 : 4
        System.out.println(str.charAt(1) - '0'); // 반환 : 1
    }
}
