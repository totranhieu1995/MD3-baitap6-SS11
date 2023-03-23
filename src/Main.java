import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi bạn muốn kiểm tra ");
        String string = scanner.nextLine();
        check(string);
    }
    public static void check(String string){
        Stack<Character> stack = new Stack<>();
        int count=0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i)==')'){
                stack.push(string.charAt(i));
            }else if (string.charAt(i)=='(' && stack.isEmpty()){

                break;
            }else {
                stack.push(string.charAt(i));
            }
        }
            for (int i = 0; i < stack.size(); i++) {
                if (stack.peek() == ')'){
                    count++;
                }
            }
            if (count *2 ==stack.size()){
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
        }

