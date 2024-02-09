package hw_3.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class TextEditor {

    Scanner scanner = new Scanner(System.in);
    public String addTextToEnd(String text, String wordForAppend) {
        return text + wordForAppend;
    }

    public String insertTextInPosition(String text, String wordForAppend, int position) {
        return text.substring(0, position) + wordForAppend + text.substring(position);
    }

    public String deleteSymbol(String text, Character charToDelete) {
        return text.replaceAll(String.valueOf(charToDelete), "");
    }

    public String replaceFragment(String text, String oldFragment, String newFragment) {
        return text.replaceAll(oldFragment, newFragment);
    }

    private String readLine() {
        return scanner.nextLine();
    }

    private void printLine(String line) {
        System.out.println(line);
    }

    public void readAndReverse() {
        String text = readLine();
        char[] charArr = text.toCharArray();
        StringBuilder strBuilder = new StringBuilder();
        for (int i = text.length() - 1; i != -1; i--) {
            strBuilder.append(charArr[i]);
        }
        printLine(strBuilder.toString());
    }

    public void readAndDeleteSpaces() {
        String text = readLine();
        char[] charArr = text.toCharArray();
        StringBuilder strBuilder = new StringBuilder();
        for (char c : charArr) {
            if (c != ' ') {
                strBuilder.append(c);
            }
        }
        printLine(strBuilder.toString());
    }

    public void readAndDeleteLowerCase() {
        String text = readLine();
        char[] charArr = text.toCharArray();
        StringBuilder strBuilder = new StringBuilder();
        for (char c : charArr) {
            if (c >= 65 && c <= 90) {
                strBuilder.append(c);
            }
        }
        printLine(strBuilder.toString());
    }

    public void toUpperCaseOnlyEvens() {
        String text = readLine();
        char[] charArr = text.toCharArray();
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 1; i < charArr.length; i += 2) {
                strBuilder.append(charArr[i]);
        }
        printLine(strBuilder.toString().toUpperCase());
    }

    public void readAndSignEmptyStrings(int numOfStrings) {
        List<String> strings = new ArrayList<>();
        int i = 1;
        while (i <= numOfStrings) {
            String a;
            strings.add(Objects.equals(a = readLine(), "") ? "Empty string" : a);
            i++;
        }
        i = 1;
        while (i <= numOfStrings) {
            printLine(strings.get(i - 1));
            i++;
        }
    }
}
