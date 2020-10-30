package objectstring;

public class ObjectString {
    public static void main(String[] args) {
        char[]cArr = {'a', 'b', 'c', 'd'};
        String s1 = new String(cArr);
        System.out.println(s1);
        String s2 = "My new string";
        String s3 = "My new string";
        System.out.println(s2.charAt(1));
        System.out.println(s2.equals(s3));
        System.out.println(s2.startsWith("My"));
        System.out.println(s2.endsWith("ng"));
        System.out.println(s2.indexOf("ew"));
        System.out.println(s2.indexOf("no exists"));
        System.out.println(s2.lastIndexOf("n"));//ищет последнее вхождение буквы
        System.out.println(s2.length());
        System.out.println(s2.replace('M', '3'));
        System.out.println(s2.substring(4));
        System.out.println(s2.substring(5,8));//begin from 5 to 7 included
        System.out.println(s3.toLowerCase());
        System.out.println(s3.toUpperCase());
        String userData = "    ddddddd@     ddd";
        System.out.println(userData.trim());
    }
}
