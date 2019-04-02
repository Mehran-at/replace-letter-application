public class ReplaceLetterApplication {
    public static void main(String[] args) {
        Text text = new Text();
        String textContent = "Java String replace(char old, char new) method example";
        System.out.println(text.replaceAll(textContent ,"a", "b"));
    }
}
