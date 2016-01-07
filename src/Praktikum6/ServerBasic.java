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
import static Praktikum6.server.sc;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class server extends Thread{
    static Socket sc = null;
    int angka = 0;
    server(Socket a, int angka) {
        this.angka = angka;
        this.sc=a;
    }
    @Override
    public void run(){
        //System.out.println("client connect "+sc.getInetAddress()+", on port "+x
        try{
            PrintWriter out = new PrintWriter(sc.getOutputStream(),true);
            out.println("Selamat Datang Client ke : "+angka);
            out.println("Anda berhasil terkoneksi ke Server");
        } catch (IOException ex){
            Logger.getLogger(server.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}

/**
 *
 * @author Digo Pratama <digopratama@digo.my.id>
 */
public class ServerBasic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(1236);
        InetAddress ia = InetAddress.getLocalHost();
        System.out.println("IP Server : "+ia.getHostAddress());
        System.out.println("CN Server : "+ia.getHostName());
        System.out.println("----------------------------------------");
        boolean oke = true;
        int urut = 1;
        while(oke){
            new server(ss.accept(),urut).run();
            System.out.println("Client ke : "+urut+" Masuk");
            System.out.println("Client connect "+sc.getInetAddress()+", on Port "+sc.getPort());
            System.out.println("CN :"+sc.getInetAddress().getHostName());
            urut++;
        }
    }
    
}


