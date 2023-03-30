import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void listeyiBastir(LinkedList<String> gidilecekYer) {
        ListIterator<String> iterator= gidilecekYer.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public static void SiraliEkle(LinkedList<String> gidilecekYer,String yeni){
        ListIterator<String> iterator= gidilecekYer.listIterator();
        while(iterator.hasNext()){
           int karsilastir=iterator.next().compareTo(yeni);
           if(karsilastir==0){
               System.out.println("Listede bu eleman mevcut");
               return;
           }
           else if (karsilastir<0) {
           // Yeni değer iterator.next() ten daha büyük ilerliyor
           }
           else if (karsilastir>0) {
               iterator.previous();
               iterator.add(yeni);
               return;
           }
        }
        iterator.add(yeni);
    }

    public static void main(String[] args) {
        LinkedList<String> gidilecekYer=new LinkedList<>();
        SiraliEkle(gidilecekYer,"Postane");
        SiraliEkle(gidilecekYer,"Market");
        SiraliEkle(gidilecekYer,"Ev");
        listeyiBastir(gidilecekYer);
       /* gidilecekYer.add("Postane");
        gidilecekYer.add("Market");
        gidilecekYer.add("Okul");
        gidilecekYer.add("Kütüphane");
        gidilecekYer.add("Spor Salonu");
        gidilecekYer.add("Ev");
        listeyiBastir(gidilecekYer);
        System.out.println("----------------------");
        gidilecekYer.add(4,"AVM");
        listeyiBastir(gidilecekYer);
        gidilecekYer.remove(3);
        listeyiBastir(gidilecekYer);*/

    }
}