package hw_3;

import hw_3.classes.TextEditor;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        String text1 = "Hello, user! How are you?";
        System.out.println(editor.addTextToEnd(text1, "Fine!"));
        System.out.println(editor.insertTextInPosition(text1, "dear", 6));
        System.out.println(editor.deleteSymbol(text1, '!'));
        System.out.println(editor.replaceFragment(text1, "user", "programmer"));
        System.out.println();

        String[] strings = new String[] {"Java", "JAVA", "C#", "Java"};

        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                System.out.println(strings[i].equals(strings[j]));
            }
        }

        System.out.println();

        System.out.println(strings[0].equalsIgnoreCase(strings[1]));

        System.out.println(strings[0] == strings[3]);

        String str = "JavaJava";

        System.out.println(str.substring(4) == strings[3]);

        str = null;

        System.out.println(str == strings[3]);

        System.out.println(str == null);
    }
}
