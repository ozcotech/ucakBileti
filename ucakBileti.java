import java.util.Scanner;
public class ucakBileti {

  public static void main(String[] args) {

    double tutar, ucret = 0.10;
    int mesafe, yas, yolculukTipi;
    //yolculuk tip 1 = tek yön
    //yolculuk tip 2 = gidiş-geliş
    

    Scanner veri = new Scanner(System.in);
    System.out.println("Yolculuk Tipi 1 = Tek Yön");
    System.out.println("Yolculuk Tipi 2 = Gidiş - Geliş");

    System.out.print("Yolculuk Tipi Seçiniz: ");
    yolculukTipi = veri.nextInt();

    System.out.print("Mesafenizi Giriniz: ");
    mesafe = veri.nextInt();

    System.out.print("Yaşınızı Giriniz: ");
    yas = veri.nextInt();


    if ((mesafe > 0) && (yas > 0) && ((yolculukTipi == 1) || (yolculukTipi == 2))){

      System.out.println("Ücret Hesaplanıyor..");

     tutar = (mesafe * ucret);
      if (yas < 12){
      tutar -= (tutar * 50) / 100;

      switch (yolculukTipi) {
        case 2:
          System.out.println("Tutar: " + ((tutar -= (tutar * 20) / 100) * 2) + "TL"); 
          break;
      
        default:
          System.out.println("Tutar: " + tutar + "TL"); 
          break;
        }
      }
      else if ((yas >= 12) && (yas <= 24)){
      tutar -= (tutar * 10) / 100;

      switch (yolculukTipi) {
        case 2:
          System.out.println("Tutar: " + ((tutar -= (tutar * 20) / 100) * 2) + "TL"); 
          break;
      
        default:
          System.out.println("Tutar: " + tutar + "TL"); 
          break;
        }

      }
      else if (yas > 65){
      tutar -= (tutar * 30) / 100;

      switch (yolculukTipi) {
        case 2:
          System.out.println("Tutar: " + ((tutar -= (tutar * 20) / 100) * 2) + "TL"); 
          break;
      
        default:
          System.out.println("Tutar: " + tutar + "TL"); 
          break;
        }


      }


        else {
          System.out.println("Tutar: " + tutar + "TL"); 
        }

            
      }
      else{
        System.out.println("Hatalı Veri Girdiniz..");
      }

    veri.close();
  }
}