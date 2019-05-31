/*
 * Copyright (C) 2019 WipCamp11.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package XI.Project;

import java.util.Scanner;

/**
 *
 * @author WipCamp11
 */
public class Stock {

    public static void main(String[] args) {
        int limit = 10;
        int Item = 5;
        int I;
        int J;
        int Menu;
        System.out.println("1.Add Item");
        System.out.println("2.Remove Item");
        System.out.println("3.Check Item");
        Scanner sc = new Scanner(System.in);

        System.out.print("เลือกข้อที่ต้องการ : ");

        Menu = sc.nextInt();

        if (Menu == 1) {
            if (Item < limit) {
                System.out.print("Enter Amount:");
                I = sc.nextInt();

                if (Item + I > limit) {
                    System.out.println("Overload");
                } else {
                    Item = Item + I;
                    System.out.printf("%d", Item);

                }
            }
            } else if (Menu == 2) {
                if (Item > 0) {
                    System.out.print("Enter Amount:");
                    J = sc.nextInt();
                    if (J > Item) {
                        System.out.println("ไอเทมมีไม่พอให้ลบ");
                    } else {
                        Item = Item - J;
                        System.out.printf("%d", Item);
                    }

                } else {
                    System.out.println("Out of Item");

                }
            } else if (Menu == 3) {
                System.out.println("Item = " + Item);
                System.out.println("Limit = " + limit);
            } else {
                System.out.println("No choice");
            }
        
    }
}
