package praktek02;
public class Square {
    double Sisi;
    
    void cetakifo(){
        System.out.println("===========");
        System.out.println("Sisi+ "+Sisi);
        System.out.println("===========");
    }
       double hitungLuas(){
           double Luas;
           Luas=Sisi*Sisi;
           return Luas;
       }
       void cetakLuas(){
           System.out.println("Luas Persegi adalan :"+hitungLuas());
       }
}
