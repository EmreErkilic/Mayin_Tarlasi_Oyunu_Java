
package mayıntarlası;

import java.util.Random;
import java.util.Scanner;

public class MayınTarlası {
    
    public static void main(String[] args) {
        
        Random rnd= new Random();
        Scanner scan=new Scanner(System.in);
        int mayinSayisi;
        System.out.print("Lütfen oyunun satır büyüklüğünü giriniz: ");
        int satirBoyut=scan.nextInt();
        System.out.print("Lütfen oyunun sütun büyüklüğünü giriniz: ");
        int sutunBoyut=scan.nextInt();
        for (int i = 0; i < satirBoyut; i++) 
        {
            for (int j = 0; j < sutunBoyut; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.print("Lütfen 20 ile 80 arasında olacak şekilde oyunun zorluk derecesini giriniz: ");
        int zorluk=scan.nextInt();
        int[][] mayinTarlasi=new int[satirBoyut][sutunBoyut];
        int sayac =0;
        switch(zorluk)
        {
            case 20:
                mayinSayisi=satirBoyut*sutunBoyut/8;
                for (int i = 0; i < satirBoyut; i++)
                {
                    for (int j = 0; j < sutunBoyut; j++)
                    {
                        if (sayac<=mayinSayisi)
                        {
                            mayinTarlasi[i][j]=rnd.nextInt(2);
                            if (mayinTarlasi[i][j]==1) 
                            {
                                sayac++;
                            }
                        }
                        else
                        {
                            mayinTarlasi[i][j]=0;
                        }
                    }
                }
                System.out.println("Mayınlar yerleştirildi");
                System.out.println("Oyun başlasın...");
                break;
                
            case 40:
                mayinSayisi=satirBoyut*sutunBoyut/6;
                for (int i = 0; i < satirBoyut; i++) 
                {
                    for (int j = 0; j < sutunBoyut; j++) 
                    {
                        if (sayac<=mayinSayisi)
                        {
                            mayinTarlasi[i][j]=rnd.nextInt(2);
                            if (mayinTarlasi[i][j]==1) 
                            {
                                sayac++;
                            }
                        }
                        else
                        {
                            mayinTarlasi[i][j]=0;
                        }
                    }
                }
                System.out.println("Mayınlar yerleştirildi");
                System.out.println("Oyun başlasın...");
                break;
                
            case 60:
                mayinSayisi = satirBoyut * sutunBoyut / 4;
                for (int i = 0; i < satirBoyut; i++)
                {
                    for (int j = 0; j < sutunBoyut; j++)
                    {
                        if (sayac <= mayinSayisi)
                        {
                            mayinTarlasi[i][j] = rnd.nextInt(2);
                            if (mayinTarlasi[i][j] == 1)
                            {
                                sayac++;
                            }
                        }
                        else
                        {
                            mayinTarlasi[i][j] = 0;
                        }
                    }
                }
                System.out.println("Mayınlar yerleştirildi");
                System.out.println("Oyun başlasın...");
                break;
                
            case 80:
                mayinSayisi = satirBoyut * sutunBoyut / 2;
                for (int i = 0; i < satirBoyut; i++)
                {
                    for (int j = 0; j < sutunBoyut; j++)
                    {
                        if (sayac <= mayinSayisi)
                        {
                            mayinTarlasi[i][j] = rnd.nextInt(2);
                            if (mayinTarlasi[i][j] == 1)
                            {
                                sayac++;
                            }
                        }
                        else
                        {
                            mayinTarlasi[i][j] = 0;
                        }
                    }
                }
                System.out.println("Mayınlar yerleştirildi");
                System.out.println("Oyun başlasın...");
                System.out.println();
                break;
                
                
        }
        boolean kontrol=false;
        String[][] dizi= new String[satirBoyut][sutunBoyut];
        for (int i = 0; i < satirBoyut; i++) 
        {
            for (int j = 0; j < sutunBoyut; j++) 
            {
                dizi[i][j]="*";
            }
        }
        int puan=0;
        while (true) 
        {   
            System.out.print("Lütfen oyunun satır değerini giriniz: ");
            int satir=scan.nextInt();
            System.out.print("Lütfen oyunun sütun değerini giriniz: ");
            int sutun=scan.nextInt();
            
            for (int i = 0; i < satirBoyut; i++) 
            {
                for (int j = 0; j < sutunBoyut; j++) 
                {
                    if (mayinTarlasi[satir][sutun]==0)
                    {
                         dizi[satir][sutun]="0";
                        
                         
                    }
                    else if (mayinTarlasi[satir][sutun]==1)
                    {
                        dizi[satir][sutun]="1";
                        kontrol=true;
                    }
                    System.out.print(dizi[i][j]);
                }
                System.out.println();
            }
            if (dizi[satir][sutun]=="0") {
                puan+=5;
            }
            if (kontrol==true) 
            {
                System.out.println("Oyun bitti..!");
                System.out.println("Puanınız: "+puan);
                break;
            }
        }
        
    }
    
}
