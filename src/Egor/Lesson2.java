package Egor;
public class Lesson2 {

    public static void main(String[] args) {
        System.out.println(within10and20(10, 3));
        ispositiveornegative(-10);
        neGative(5);
        print();
    }

    static boolean within10and20(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    static void ispositiveornegative(int a) {
        if (a < 0) {
            System.out.println("Число отрицательное.");
        } else {
            System.out.println("Число положительное.");
        }
    }

    static boolean neGative(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    static void print() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print('1');
            }
            System.out.println();
            }
        }


    }










