import java.util.scanner;
import java.util.stack;

public class StacknQueueProject1 {
    String item;
    int no;
    int price;
    int qty;
    int subtotal;

    public StacknQueueProject1(String item, int price, int qty) {
        this.item = item;
        this.price = price;
        this.qty = qty;
        this.subtotal = price * qty;
    }

        public StacknQueueProject1 (int no, String item, int price, int qty) {
            this.no = no;
            this.item = item;
            this.price = price;
            this.qty = qty;
            this.subtotal=price*qty;
        }

            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                String answer;
                int no = 1;
                Stack<StackknQueueProject1> items = new Stack<>();
            
                do{
                    System.out.println("\n==========MENU========== \n1. Add Item \n2. Show Current Item \n3. Show All Items \n4. Remove Last Item \n5. Done \n ========================");
                    System.out.print("Enter your choice (from 1-5): ");
                    answer = input.nextLine();
                    System.out.println("========================");
                    
                    switch (
                        answer
                    ) {
                        case "1":
                            System.out.print("Enter item name: ");
                            String itemName = input.nextLine();
                            System.out.print("Enter item price: ");
                            int itemPrice = input.nextInt();
                            System.out.print("Enter item quantity: ");
                            int itemQty = input.nextInt();
                            input.nextLine(); 
                            
                            items.push(new StacknQueueProject1(no++, itemName, itemPrice, itemQty));
                            System.out.println("Item added successfully!");
                            break;

                            case "2":
                            if (!Task.empty()) {
                                StacknQueueProject1 top = Task.peek();
                                System.out.println("Top item: " + top.item = " (Qty: " = top.qty + ")");
                                } else {
                                    System.out.println("Queue is empty!");
                                }
                                break;

                                case "3":
                                if (!Task.empty()) {
                                    System.out.println(__________________________________________________________________");
                                    System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "No", "Item", "Price", "Qty", "Subtotal");
                                    System.out.println("__________________________________________________________________");
                                    int total = 0;
                                    for (StacknQueueProject1 i : Task) {
                                        System.out.printf("%-10d %-10s %-10d %-10d %-10d\n", i.no, i.item, i.price, i.qty, i.subtotal);
                                        total += i.subtotal;
                                    }
                                    System.out.println("__________________________________________________________________");
                                    System.out.printf("Total: %d\n", total);
                                }
                                    break;

                                case "4";
                                    if (!Task.empty()) {
                                        StacknQueueProject1 removed = Task.pop();
                                        System.out.println("Removed item: " + removed.item);
                                    } else {
                                        System.out.println("Queue is empty!");
                                    }
                                        break;

                                        case "5":
                                         System.out.println("Exiting program...");
                                         break;
                                         
                                         default:
                                         System.out.println("Invalid choice! Please enter a number from 1 to 5.");
                                         break;
                                }

                                } while (!answer.equals("5"));
                                 input.close();
                            }
                    )
                }