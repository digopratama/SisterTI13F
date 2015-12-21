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
import java.io.*;
import java.net.*;

/**
 *
 * @author digopratama
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        try{
            System.out.println("Server Aktif");
            ServerSocket s=new ServerSocket(6666);
            Socket s1=s.accept();
            DataOutputStream dos=new DataOutputStream(s1.getOutputStream());
            //Kirim sebuah sting
            dos.writeUTF("Selamat...\nAnda Berhasil Terkoneksi");
            //tutup koneksi, tapi bukan pada socket server
            dos.close();
            s1.close();
        }
        catch (IOException e){
            System.out.println("Server Tidak Aktif");
            System.out.println(e);
        }
    }
    
}
