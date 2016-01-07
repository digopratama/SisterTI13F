/*
 * Copyright (C) 2016 Digo Pratama <digopratama@digo.my.id>
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
package Praktikum6;
import java.net.*;
import java.io.*;

/**
 *
 * @author Digo Pratama <digopratama@digo.my.id>
 */
public class ClientBasic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            //Socket sk = new Socket("127.0.0.1",1236);
            Socket sk = new Socket("localhost",1236); // ip server
            BufferedReader in = new BufferedReader(new InputStreamReader(sk.getInputStream()));
            String put="";
            while(true) {
                if((put = in.readLine()) !=null){
                    System.out.println(put);
                }
            }
        } catch(IOException e){
            //e.printStackTrace();
        }
    }
    
}
