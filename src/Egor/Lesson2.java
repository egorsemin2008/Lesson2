/**
 *	Java 1. Homework 2
 *	@author Egor
 *  @version 28.03.2022
 */

package egor;

import javax.swing.*;

public class Lesson_2 {

    public static void main(String[] args) {
        System.out.println(within10and20(10, 3));
        ispositiveornegative(-10);
        System.out.println(neGative(10));
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

                System.out.println(i);
            }
        }
    }

