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
}