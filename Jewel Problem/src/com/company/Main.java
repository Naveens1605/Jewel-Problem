package com.company;

import java.util.Scanner;

public class Main {
        public static int numJewelsInStones(String J, String S) {
            int count = 0;
            for (int j = 0; j < J.length(); j++) {
                for (int i = 0; i < S.length(); i++)
                    if (S.charAt(i) == J.charAt(j))
                        count++;
            }
            return count;
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter List of Jewels : ");
            String J = sc.nextLine();
            System.out.println("Enter Total Number of Stones : ");
            String S = sc.nextLine();
            System.out.println("Number of Jewels Present in stone : " + numJewelsInStones(J,S));
        }
}
