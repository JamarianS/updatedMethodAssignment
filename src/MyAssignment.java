import java.util.Scanner;
/**
 * class: MyAssignment
 * @author: Jah St.Aimee
 * @date: March 28, 2023
 * @version: 1.0
 * @course: ITEC 2140 - 05 Spring 2023
 * description:  The program should get a string name, e.g. "Susan", return a message of the form "Happy Birthday Susan!".
 */
public class MyAssignment {
    private Scanner input;

    public static void main(String[] args) {
        MyAssignment instance = new MyAssignment();
        System.out.println(instance.birthdayName("Jah"));
        System.out.println(instance.sumDigits(5678));
        System.out.println(instance.missingFront("123456"));
        System.out.println(instance.reverseDoubleChar("Chicken"));
        System.out.println(instance.swapEnds("Hello There"));
        System.out.println(instance.everyOther("Codingbat"));
        System.out.println(instance.luckySum(5,13,4));
        System.out.println(instance.powerOfTwo(10));
        System.out.println(instance.hasPalindrome("Racecar"));


    }

    public String birthdayName(String name ) {
      return("Happy Birthday " + name + "!");
    }

    public String missingFront(String str) {
        String result = "";
        result = result + str.substring(3);
        return result;
    }

    public String reverseDoubleChar(String word) {
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            result = result + word.charAt(i) + word.charAt(i);
        }
        return result;
    }

    public String swapEnds(String str) {
        String result = "";
        String first;
        String last;
        String mid;
        if (str.length() > 1) {
            first = str.substring(0, 1);
            last = str.substring(str.length() - 1);
            mid = str.substring(1, str.length() - 1);
             result = result + last + mid + first;
        }
        return  result ;
    }

    public String everyOther(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result = result + str.charAt(i);
        }
        return result;
    }

    public int sumDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            return sum;
        }
    }

    public int luckySum(int a, int b, int c) {
        if (a == 13) {
            return 0;
        } else if (b == 13) {
            return a;
        } else if (c == 13) {
            return a + b;
        } else {
            return a + b + c;
        }
    }

    public boolean powerOfTwo(int n) {
        if (n == 0) {
            return false;
        } else {
            do {
                if (n == 1) {
                    return true;
                } else if (n % 2 != 0) {
                    return false;
                }
                n /= 2;
            } while (true);
        }
    }

    public boolean hasPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        for (int i = 0; i < str.length(); i++) {
            int left = i - 1;
            int right = i + 1;
            while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
                return true;
            }

            left = i;
            right = i + 1;
            while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
                return true;
            }
        }
        return false;
    }
}


