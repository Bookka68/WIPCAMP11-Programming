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
package exercise;

import java.util.Scanner;

/**
 *
 * @author WipCamp11
 */
public class Test1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Name = "Book";
        int x = 10;
        
        System.out.print("Enter y : ");
        int y = sc.nextInt();
        
        if (x >= y) {
            int z = x - y;
            System.out.println("x - y = " + (z));
            System.out.println("Name = " + Name);
        } else {
            int z = x + y;
            System.out.printf("x + y = %d " , (z));
            System.out.printf("Name = %s", Name);
        }

    }

}
