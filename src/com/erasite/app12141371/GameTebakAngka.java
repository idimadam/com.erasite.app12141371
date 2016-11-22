/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.erasite.app12141371;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * @author IDIMADAM
 */
public class GameTebakAngka {
    public static void main(String[] args) {
        ArrayList <String> Nama = new ArrayList<>();
        ArrayList <Integer> Skor = new ArrayList<>();
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Random angkaRandom = new Random();
        String cari;
        
        do{
            System.out.print("Masukkan 'Nama' anda atau tekan 'y' untuk keluar, kemudian tekan enter = ");
            cari=input1.nextLine();
            Nama.add(cari);
            int NilaiJalan = 0;
            int CekGameOver = 0;
            
            int akumulasi[]= new int[6];
            int NilaiPasJalan = 0;
            
            /* BEGIN */
            if(!("y").equals(cari)){  
               
                String nextLevel;
                int PilihanLevel=1;
                
                do{
                    int Cek, Angka, BatasTebak;
                    System.out.println("# Level " + PilihanLevel);
                    System.out.println("Selamat Datang " + cari);
                    int StarNilaiO=PilihanLevel-1;
                    BatasTebak=PilihanLevel*100;
                    System.out.println("Silahkan Tebak Antara 1 s/d " + BatasTebak);
                    System.out.println("Anda mempunyai kesempatan menebak 5 kali");
                    int AngkaAcak=angkaRandom.nextInt(BatasTebak);
                    
                    for(Cek =0;Cek<=5;Cek++){
                        if(Cek==5){
                            System.out.println("Game Over");
                            CekGameOver++;
                        }
                        else{  
                            System.out.print("Tebakan Anda ? ");
                            int Tebakan=input2.nextInt();
                            int Kurang=4-Cek;
                            if(Tebakan==AngkaAcak){
}