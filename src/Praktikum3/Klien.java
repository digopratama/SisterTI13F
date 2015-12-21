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
import java.net.*;
import java.io.*;

/**
 *
 * @author digopratama
 */
public class Klien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //buka koneksi port server
        Socket s1=new Socket("192.168.43.2",6666);
        //baca input
        DataInputStream dis=new DataInputStream(s1.getInputStream());
        String at=new String(dis.readUTF());
        System.out.println(at);
        //Putus koneksi saat keluar
        dis.close();
        s1.close();
    }
    
}
