import java.util.Scanner;
public class TugasArrayKu {
    public static void main(String[] args) {
       Scanner masuk=new Scanner(System.in);
       Sepatu [] arraySpt=new Sepatu[1];
       for(int z=0; z<arraySpt.length; z++) {
           
           System.out.println("Masukan Data Sepatu :"+(z+1));
           System.out.print("Merk : ");
           String Merk=masuk.next();
           System.out.print("Harga : ");
           double Harga=masuk.nextDouble();
           System.out.print("Warna : ");
           String Warna=masuk.next();
           System.out.print("Ukuran : ");
           int Ukuran=masuk.nextInt();
           Sepatu sepatu = new Sepatu();
           sepatu.setMerk(Merk);
           sepatu.setHarga(Harga);
           sepatu.setWarna(Warna);
           sepatu.setUkuran(Ukuran);
           arraySpt[z] = sepatu;
       }
       for(int z=0; z<arraySpt.length; z++){
           System.out.println("Tampilan Data Sepatu "+(z+1));
           System.out.println("Merk Sepatu : "+arraySpt[z].getMerk());
           System.out.println("Harga Sepatu : "+arraySpt[z].getHarga());
           System.out.println("Warna sepatu : "+arraySpt[z].getWarna());
           System.out.println("Ukuran Sepatu : "+arraySpt[z].getUkuran());
           
       }
    }
    }
    
        class Sepatu{
            private String Merk;
            private double Harga;
            private String Warna;
            private int Ukuran;

        public Sepatu(){
        }
           

        public String getMerk() {
            return Merk;
        }

        public void setMerk(String Merk) {
            this.Merk = Merk;
        }

        public double getHarga() {
            return Harga;
        }

        public void setHarga(double Harga) {
            this.Harga = Harga;
        }

        public String getWarna() {
            return Warna;
        }

        public void setWarna(String Warna) {
            this.Warna = Warna;
        }

        public int getUkuran() {
            return Ukuran;
        }

        public void setUkuran(int Ukuran) {
            this.Ukuran = Ukuran;
        }
        }
        