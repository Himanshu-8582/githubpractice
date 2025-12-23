public class StringBldr {
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuilder sb = new StringBuilder();

        for(int i = str.length() - 1; i >= 0; i--){
            sb.append(str.charAt(i));
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + sb.toString());
    }
}
