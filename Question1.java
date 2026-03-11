        import java.util.Scanner;

        public class Question1 {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter age queue:  ");
                String input = scanner.nextLine();
                String[] array = input.split(" ");
                System.out.println("Queue: " + input);

                int ages[] = new int[array.length];
                for (int i = 0; i < array.length; i++) {
                    ages[i] = Integer.parseInt(array[i]);
                }
                Queue queue = new Queue(ages.length);
                for(int age : ages) {
                    queue.add(age);
                }

                Queue lulus = new Queue(ages.length);
                Queue tidaklulus = new Queue(ages.length);

                while (queue.size > 0) {
                int age = queue.remove();
                if (age >= 28 && age <= 118) {
                    lulus.add(age);
                } else {
                    tidaklulus.add(age);
                }
            }
            lulus.print();
            tidaklulus.print();
            }
        }

        class Queue{
                public int[] items;
                public int size;

                public Queue(int capacity) {
                    items = new int[capacity];
                    size = 0;
                }

                public void add(int item) {
                    items[size] = item;
                    size++;
                }
                public int remove() {
                    int item = items[0];
                    for (int i = 1; i < size; i++) {
                        items[i - 1] = items[i];
                    }
                    size--;
                    return item;
                }
                public void print() {
                System.out.print("[");
                for (int i = 0; i < size; i++) {
                    System.out.print(items[i]);
                    if (i < size - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println("]");
            }
            }
