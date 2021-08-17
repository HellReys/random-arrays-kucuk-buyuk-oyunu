
import java.util.Random;

public class Array {
   public static void main(String[] args) {
   int sayilar[]= new int[5];
    for(int i=0;i<sayilar.length;i++){
        Random random = new Random();
          int a = random.nextInt(1000);
            sayilar[i] = a;
                
        
    }
       for(int k:sayilar){
           System.out.println("Değerler"+k);
       }
       int enkucuk;
       int enbuyuk;
       enkucuk=sayilar[0];
       enbuyuk=sayilar[0];
            for(int i=1;i<sayilar.length;i++){
                if(sayilar[1]<enkucuk){
                    enkucuk=sayilar[i];
                }
                if(sayilar[i]>enbuyuk){
                    enbuyuk=sayilar[i];
                }
                
            }
       System.out.println("5 sayi arasından en küçük sayı:"+enkucuk);
       System.out.println("5 sayı arasından en büyük sayı:"+enbuyuk);
       
    }   
    
}
