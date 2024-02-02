package technicalTasks.codeSimulator.classes;

public class Algorithms {

    public int factorial(int n) {
        int answer = 1;
        for (int i = n; i != 1; i--) {
            answer *= i;
        }
        return answer;
    }

    public boolean isPrimal(int n) {
        for (int i = 2; i != n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int linearSearch(int[] arr, int key) {
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr [j + 1]) {
                    int buff = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = buff;
                }
            }
        }
    }

    public int fibonacci(int n) {
        int f = 0;
        int s = 1;
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            for (int i = 3; i < n; i++) {
                int buff = s;
                s = f + s;
                f = buff;
            }
        }
        return s + f;
    }

    public void swap(int[] arr) {
        arr[0] = arr[0] + arr[1];
        arr[1] = arr[1] - arr[0];
        arr[1] = -arr[1];
        arr[0] = arr[0] - arr[1];
    }

    public void matrix() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                if (result > 9 && result < 100) {
                    System.out.print(" " + result + " ");
                } else if (result < 10) {
                    System.out.print("  " + result + " ");
                } else {
                    System.out.print("" + result + " ");
                }
            }
            System.out.println();
        }
    }

    public boolean uniqueCharacters(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean equals(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if(str1.charAt(i) != str2.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
    }


}
