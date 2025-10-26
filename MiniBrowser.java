import java.util.Scanner;
import java.util.Stack;

public class MiniBrowser {
    public static void main(String[] args) throws Exception {
        Scanner inputx = new Scanner(System.in);
        String answer = "1";
        Stack<String>urls = new Stack<>();
        
        System.out.println("\n1. Enter url \n2. Back to previous url \n3. show current url \n4, show the history of urls visited\n5. Exit the program");
        do {
            System.out.print("\nEnter your choice (1-5): ");
            answer = inputx.nextLine();
            if (answer.equals("1")) {
                System.out.print("Enter URL: ");
                String url = inputx.nextLine();
                urls.push(url);
            }else if (answer.equals("2")) {
                if (urls.size() > 1) {
                    urls.pop();
                    System.out.print("current url "+urls.peek());
                }else{
                    System.out.print("No way back to previous URL \n");
                }
            }else if (answer.equals("3")) {
                System.out.print(urls);
            }else if (answer.equals("4")) {
                System.out.print(urls);
            }
        }while(!answer.equals("5"));
        inputx.close();
    }
}