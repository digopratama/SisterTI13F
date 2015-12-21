/*
 * Copyright (C) 2015 digopratama
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package Praktikum3;

import java.util.Scanner;

/**
 *
 * @author digopratama
 */
public class Perkalian {
    public void Perkalian(){
     int a,b,c;
     
     Scanner board=new Scanner(System.in);
     
     System.out.println("Perkalian");
     System.out.print("Masukkan Bilangan pertama: ");
     a=board.nextInt();
     System.out.print("Masukkan Bilangan kedua: ");
     b=board.nextInt();
     
     //a=3;
     //b=4;
     
     c=a*b;
     System.out.println("Hasil Perkalian: "+c);
}
}