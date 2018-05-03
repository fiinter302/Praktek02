package praktek02;
public class SquareAksi {
    public static void main(String[] args) {
        Square R1 = new Square();
        R1.Sisi = 7;
        
        R1.cetakifo();
        System.out.println("Luas Square+"+R1.hitungLuas());
        R1.cetakLuas();
        
        Square R2 = new Square();
        R2.cetakifo();
        
        Square R3 = new Square (50);
        R3.cetakifo();
    }
    
}
