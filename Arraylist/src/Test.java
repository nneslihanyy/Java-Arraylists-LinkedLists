import java.util.Scanner;

public class Test
{
    private static Sarkicilar sarkicilar=new Sarkicilar();
    private static  Scanner scanner=new Scanner(System.in);
    public static void islemleri_bastir(){
        System.out.println("\t 0-İşlemler Tekrardan Görüntülenir");
        System.out.println("\t 1-Şarkıcılar görüntülenir");
        System.out.println("\t 2-Şarkıcı Ekleme");
        System.out.println("\t 3-Şarkıcı Güncelle");
        System.out.println("\t 4-Şarkıcı Silme");
        System.out.println("\t 5-Şarkıcı Ara");
        System.out.println("\t 6-Uygulamadan Çıkış Yapılır");

    }
    public static void goruntule(){
        sarkicilar.sarkicilariBastir();
    }
    public static void sarkiciEkle(){
        System.out.println("Eklemek istediğiniz şarkıcının ismi");
        String isim=scanner.nextLine();
        sarkicilar.sarkiciEkle(isim);
    }
    public static void sarkiciGuncelle(){
        System.out.println("Hangi indexteki şarkıcı güncellensin?");
        int index=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Şarkıcı ismini giriniz:");
        String yeniIsım=scanner.nextLine();
        sarkicilar.sarkiciGuncelle(yeniIsım,(index-1));
    }
    public static void sarkiciSil(){
        System.out.println("Hangi indexteki şarkıcı silinsin");
        int index2=scanner.nextInt();
        sarkicilar.sarkiciSil(index2-1);
    }
    public static void sarkiciAra(){
        System.out.println("Hangi şarkıcı aransın:");
        String aranacakSarkici=scanner.nextLine();
        sarkicilar.sarkiciAra(aranacakSarkici);
    }
    public static void main(String[] args) {
        System.out.println("Şarkıcı uygulamasına hoş geldiniz");
        islemleri_bastir();
        boolean cikis=false;
        int islem;
        while (!cikis){
            System.out.println("İşlemi Seçiniz:");
            islem=scanner.nextInt();
            scanner.nextLine();
            switch (islem){
                case 0:
                    islemleri_bastir();
                break;
                case 1: goruntule();
                break;
                case 2: sarkiciEkle();
                break;
                case 3: sarkiciGuncelle();
                break;
                case 4: sarkiciSil();
                break;
                case 5: sarkiciAra();
                break;
                case 6: cikis=true;
                    System.out.println("Uygulamadan Çıkılıyor");
                    break;
            }
        }
    }
}
