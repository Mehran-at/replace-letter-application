// Develop the following code:
//      a. Define the replaceAll action that receives a string and two letters. It will replace the first letter with the second letter every time it appears in the string. Then it returns this modified string.
//      b. Define a string.
//      c. Write a code that replaces every occurrence of the letter e with the letter o and says the new string.
//  Available actions: getTextDocument()

// Text example: “There was a terrible noise”
// Text replacement: “Thoro was a torriblo noiso”

public class ReplaceLetterApplication {
    public static void main(String[] args) {
        Text text = new Text();
        String textContent = "Java String replace(char old, char new) method";
        System.out.println(text.replaceAll(textContent ,"e", "o"));
    }
}
