import java.util.Scanner;
class Golongan1{
    String nama;
    private long gaji_pokok,jamKerja;
    long tunjangan = 250000;
    public long JumlahJamKerja(){
        long jumlahjamkerja;
        jumlahjamkerja = jamKerja * 20;
        return jumlahjamkerja;
    }
    public long HitungKerjaLembur(){
        long jamLembur;
        jamLembur = (jamKerja * 20) - 173;
        return jamLembur;
    }
    public long GajiNormal(){
        gaji_pokok = (JumlahJamKerja() * 7000);
        return gaji_pokok;
    }
    public long GajiLembur(){
        long lembur;
        lembur = HitungKerjaLembur() * 20000;
        gaji_pokok = (JumlahJamKerja() * 7000) + lembur;
        return gaji_pokok;
    }
    public long penentu(){
        long a;
        a = JumlahJamKerja() - 173;
        return a;
    }
    public double TotalLembur(){
        double total;
        total = GajiLembur() + tunjangan;
        return total;
    }
    public double TotalNormal(){
        double total;
        total = GajiNormal() + tunjangan;
        return total;
    }
    public double PajakLembur(){
        double pajak;
        pajak = 0.05 * TotalLembur();
        return  pajak;
    }
    public double PajakNormal(){
        double pajak;
        pajak = 0.05 * TotalNormal();
        return  pajak;
    }
    void ShowData() {
        Scanner input = new Scanner(System.in);
        System.out.println("---------------------");
        System.out.println("     GOLONGAN I");
        System.out.println("---------------------");
        System.out.println("Masukkan Nama                   : ");
        nama = input.nextLine();
        System.out.println("Masukkan Jam Kerja Dalam Sehari : ");
        jamKerja = input.nextInt();
        input.nextLine();
        if (penentu() > 0) {
            System.out.println("\n------------------------------");
            System.out.println("            |HASIL| ");
            System.out.println("------------------------------");
            System.out.println("NAMA               : " + nama);
            System.out.println("Total Jam Kerja    : " + JumlahJamKerja() + " Jam");
            System.out.println("Kerja Lembur   : " + HitungKerjaLembur());
            System.out.println("GAJI               : Rp " + GajiLembur());
        }else{
            System.out.println("\n------------------------------");
            System.out.println("            |HASIL| ");
            System.out.println("------------------------------");
            System.out.println("NAMA               : " + nama);
            System.out.println("Total Jam Kerja    : " + JumlahJamKerja() + " Jam");
            if(HitungKerjaLembur() < 0){
                System.out.println("Kerja Lembur       : 0");
            }else if(HitungKerjaLembur() >= 0){
                System.out.println("Kerja Lembur   : " + HitungKerjaLembur());
            }
            System.out.println("GAJI               : Rp " + GajiNormal());
        }
    }


}
class Golongan2{
    String nama;
    private long gaji_pokok,jamKerja;
    long tunjangan = 300000;
    public long JumlahJamKerja(){
        long jumlahjamkerja;
        jumlahjamkerja = jamKerja * 20;
        return jumlahjamkerja;
    }
    public long HitungKerjaLembur(){
        long jamLembur;
        jamLembur = (jamKerja * 20) - 173;
        return jamLembur;
    }
    public long GajiNormal(){
        gaji_pokok = (JumlahJamKerja() * 8000);
        return gaji_pokok;
    }
    public long GajiLembur(){
        long lembur;
        lembur = HitungKerjaLembur() * 20000;
        gaji_pokok = (JumlahJamKerja() * 8000) + lembur;
        return gaji_pokok;
    }
    public long penentu(){
        long a;
        a = JumlahJamKerja() - 173;
        return a;
    }
    public double TotalLembur(){
        double total;
        total = GajiLembur() + tunjangan;
        return total;
    }
    public double TotalNormal(){
        double total;
        total = GajiNormal() + tunjangan;
        return total;
    }
    public double PajakLembur(){
        double pajak;
        pajak = 0.05 * TotalLembur();
        return  pajak;
    }
    public double PajakNormal(){
        double pajak;
        pajak = 0.05 * TotalNormal();
        return  pajak;
    }
    void ShowData() {
        Scanner input = new Scanner(System.in);
        System.out.println("---------------------");
        System.out.println("     GOLONGAN II");
        System.out.println("---------------------");
        System.out.println("Masukkan Nama                   : ");
        nama = input.nextLine();
        System.out.println("Masukkan Jam Kerja Dalam Sehari : ");
        jamKerja = input.nextInt();
        input.nextLine();
        if (penentu() > 0) {
            System.out.println("\n------------------------------");
            System.out.println("            |HASIL| ");
            System.out.println("------------------------------");
            System.out.println("NAMA               : " + nama);
            System.out.println("Total Jam Kerja    : " + JumlahJamKerja() + " Jam");
            System.out.println("Kerja Lembur       : " + HitungKerjaLembur());
            System.out.println("GAJI               : Rp " + GajiLembur());
        }else{
            System.out.println("\n------------------------------");
            System.out.println("            |HASIL| ");
            System.out.println("------------------------------");
            System.out.println("NAMA               : " + nama);
            System.out.println("Total Jam Kerja    : " + JumlahJamKerja() + " Jam");
            if(HitungKerjaLembur() < 0){
                System.out.println("Kerja Lembur       : 0");
            }else if(HitungKerjaLembur() >= 0){
                System.out.println("Kerja Lembur   : " + HitungKerjaLembur());
            }
            System.out.println("GAJI               : Rp " + GajiNormal());
        }
    }
}
class Golongan3{
    String nama;
    private long gaji_pokok,jamKerja;
    long tunjangan = 350000;
    public long JumlahJamKerja(){
        long jumlahjamkerja;
        jumlahjamkerja = jamKerja * 20;
        return jumlahjamkerja;
    }
    public long HitungKerjaLembur(){
        long jamLembur;
        jamLembur = (jamKerja * 20) - 173;
        return jamLembur;
    }
    public long GajiNormal(){
        gaji_pokok = (JumlahJamKerja() * 9000);
        return gaji_pokok;
    }
    public long GajiLembur(){
        long lembur;
        lembur = HitungKerjaLembur() * 20000;
        gaji_pokok = (JumlahJamKerja() * 9000) + lembur;
        return gaji_pokok;
    }
    public long penentu(){
        long a;
        a = JumlahJamKerja() - 173;
        return a;
    }
    public double TotalLembur(){
        double total;
        total = GajiLembur() + tunjangan;
        return total;
    }
    public double TotalNormal(){
        double total;
        total = GajiNormal() + tunjangan;
        return total;
    }
    public double PajakLembur(){
        double pajak;
        pajak = 0.05 * TotalLembur();
        return  pajak;
    }
    public double PajakNormal(){
        double pajak;
        pajak = 0.05 * TotalNormal();
        return  pajak;
    }
    void ShowData() {
        Scanner input = new Scanner(System.in);
        System.out.println("---------------------");
        System.out.println("     GOLONGAN III");
        System.out.println("---------------------");
        System.out.println("Masukkan Nama                   : ");
        nama = input.nextLine();
        System.out.println("Masukkan Jam Kerja Dalam Sehari : ");
        jamKerja = input.nextInt();
        input.nextLine();
        if (penentu() > 0) {
            System.out.println("\n------------------------------");
            System.out.println("            |HASIL| ");
            System.out.println("------------------------------");
            System.out.println("NAMA               : " + nama);
            System.out.println("Total Jam Kerja    : " + JumlahJamKerja() + " Jam");
            System.out.println("Kerja Lembur       : " + HitungKerjaLembur());
            System.out.println("GAJI               : Rp " + GajiLembur());
        }else{
            System.out.println("\n------------------------------");
            System.out.println("            |HASIL| ");
            System.out.println("------------------------------");
            System.out.println("NAMA               : " + nama);
            System.out.println("Total Jam Kerja    : " + JumlahJamKerja() + " Jam");
            if(HitungKerjaLembur() < 0){
                System.out.println("Kerja Lembur       : 0");
            }else if(HitungKerjaLembur() >= 0){
                System.out.println("Kerja Lembur   : " + HitungKerjaLembur());
            }
            System.out.println("GAJI               : Rp " + GajiNormal());
        }
    }
}
class Golongan4{
    String nama;
    private long gaji_pokok,jamKerja;
    long tunjangan = 400000;
    public long JumlahJamKerja(){
        long jumlahjamkerja;
        jumlahjamkerja = jamKerja * 20;
        return jumlahjamkerja;
    }
    public long HitungKerjaLembur(){
        long jamLembur;
        jamLembur = (jamKerja * 20) - 173;
        return jamLembur;
    }
    public long GajiNormal(){
        gaji_pokok = (JumlahJamKerja() * 10000);
        return gaji_pokok;
    }
    public long GajiLembur(){
        long lembur;
        lembur = HitungKerjaLembur() * 20000;
        gaji_pokok = (JumlahJamKerja() * 10000) + lembur;
        return gaji_pokok;
    }
    public long penentu(){
        long a;
        a = JumlahJamKerja() - 173;
        return a;
    }
    public double TotalLembur(){
        double total;
        total = GajiLembur() + tunjangan;
        return total;
    }
    public double TotalNormal(){
        double total;
        total = GajiNormal() + tunjangan;
        return total;
    }
    public double PajakLembur(){
        double pajak;
        pajak = 0.05 * TotalLembur();
        return  pajak;
    }
    public double PajakNormal(){
        double pajak;
        pajak = 0.05 * TotalNormal();
        return  pajak;
    }
    void ShowData() {
        Scanner input = new Scanner(System.in);
        System.out.println("---------------------");
        System.out.println("     GOLONGAN IV");
        System.out.println("---------------------");
        System.out.println("Masukkan Nama                   : ");
        nama = input.nextLine();
        System.out.println("Masukkan Jam Kerja Dalam Sehari : ");
        jamKerja = input.nextInt();
        input.nextLine();
        if (penentu() > 0) {
            System.out.println("\n------------------------------");
            System.out.println("            |HASIL| ");
            System.out.println("------------------------------");
            System.out.println("NAMA               : " + nama);
            System.out.println("Total Jam Kerja    : " + JumlahJamKerja() + " Jam");
            System.out.println("Kerja Lembur       : " + HitungKerjaLembur());
            System.out.println("GAJI               : Rp " + GajiLembur());
        }else{
            System.out.println("\n------------------------------");
            System.out.println("            |HASIL| ");
            System.out.println("------------------------------");
            System.out.println("NAMA               : " + nama);
            System.out.println("Total Jam Kerja    : " + JumlahJamKerja() + " Jam");
            if(HitungKerjaLembur() < 0){
                System.out.println("Kerja Lembur       : 0");
            }else if(HitungKerjaLembur() >= 0){
                System.out.println("Kerja Lembur   : " + HitungKerjaLembur());
            }
            System.out.println("GAJI               : Rp " + GajiNormal());
        }
    }
}
public class TugasMandri {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------");
        System.out.println("|Golongan I| ");
        System.out.println("Gaji = 7000/jam");
        System.out.println("Tunjangan = Rp 250.000");
        System.out.println("-----------------------------------------------");
        System.out.println("|Golongan II| ");
        System.out.println("Gaji = 8000/jam");
        System.out.println("Tunjangan = Rp 300.000");
        System.out.println("-----------------------------------------------");
        System.out.println("|Golongan III| ");
        System.out.println("Gaji = 9000/jam");
        System.out.println("Tunjangan = Rp 350.000");
        System.out.println("-----------------------------------------------");
        System.out.println("|Golongan IV| ");
        System.out.println("Gaji = 10000/jam");
        System.out.println("Tunjangan = Rp 400.000");
        System.out.println("-----------------------------------------------");
        System.out.println("Kerja Lembur = Rp 20.000/jam");
        System.out.println("Kerja Hari Senin-Jumat(20 hari dalam sebulan)");
        System.out.println("-----------------------------------------------");
        Golongan1 obj1 = new Golongan1();
        obj1.ShowData();
        Golongan2 obj2 = new Golongan2();
        obj2.ShowData();
        Golongan3 obj3 = new Golongan3();
        obj3.ShowData();
        Golongan4 obj4 = new Golongan4();
        obj4.ShowData();
        System.out.println("---------------------");
        System.out.println("    HASIL AKHIR");
        System.out.println("---------------------");
        System.out.println("\n---------------------");
        System.out.println("     GOLONGAN I");
        System.out.println("---------------------");
        if (obj1.penentu() >= 1 ) {
            System.out.println("---------------------------------------------");
            System.out.println("            |HASIL| ");
            System.out.println("---------------------------------------------");
            System.out.println("NAMA                                : "+obj1.nama);
            System.out.println("GAJI                                : Rp " + obj1.GajiLembur());
            System.out.println("Tunjangan                           : Rp "+obj1.tunjangan);
            System.out.println("Total                               : "+obj1.TotalLembur());
            System.out.println("Total Setelah Dipotong Pajak        : "+obj1.PajakLembur());
        }else{
            System.out.println("\n------------------------------");
            System.out.println("            |HASIL| ");
            System.out.println("------------------------------");
            System.out.println("NAMA                                : "+obj1.nama);
            System.out.println("GAJI                                : Rp " + obj1.GajiNormal());
            System.out.println("Tunjangan                           : Rp "+obj1.tunjangan);
            System.out.println("Total                               : "+obj1.TotalNormal());
            System.out.println("Total Setelah Dipotong Pajak        : "+obj1.PajakNormal());
        }

        System.out.println("\n---------------------");
        System.out.println("     GOLONGAN II");
        System.out.println("---------------------");

        if (obj2.penentu() >= 1 ) {
            System.out.println("---------------------------------------------");
            System.out.println("            |HASIL| ");
            System.out.println("---------------------------------------------");
            System.out.println("NAMA                                : "+obj2.nama);
            System.out.println("GAJI                                : Rp " + obj2.GajiLembur());
            System.out.println("Tunjangan                           : Rp "+obj2.tunjangan);
            System.out.println("Total                               : "+obj2.TotalLembur());
            System.out.println("Total Setelah Dipotong Pajak        : "+obj2.PajakLembur());
        }else{
            System.out.println("\n------------------------------");
            System.out.println("            |HASIL| ");
            System.out.println("------------------------------");
            System.out.println("NAMA                                : "+obj2.nama);
            System.out.println("GAJI                                : Rp " + obj2.GajiNormal());
            System.out.println("Tunjangan                           : Rp "+obj2.tunjangan);
            System.out.println("Total                               : "+obj2.TotalNormal());
            System.out.println("Total Setelah Dipotong Pajak        : "+obj2.PajakNormal());
        }

        System.out.println("\n---------------------");
        System.out.println("     GOLONGAN III");
        System.out.println("---------------------");

        if (obj3.penentu() >= 1 ) {
            System.out.println("---------------------------------------------");
            System.out.println("            |HASIL| ");
            System.out.println("---------------------------------------------");
            System.out.println("NAMA                                : "+obj3.nama);
            System.out.println("GAJI                                : Rp " + obj3.GajiLembur());
            System.out.println("Tunjangan                           : Rp "+obj3.tunjangan);
            System.out.println("Total                               : "+obj3.TotalLembur());
            System.out.println("Total Setelah Dipotong Pajak        : "+obj3.PajakLembur());
        }else{
            System.out.println("\n------------------------------");
            System.out.println("            |HASIL| ");
            System.out.println("------------------------------");
            System.out.println("NAMA                                : "+obj3.nama);
            System.out.println("GAJI                                : Rp " + obj3.GajiNormal());
            System.out.println("Tunjangan                           : Rp "+obj3.tunjangan);
            System.out.println("Total                               : "+obj3.TotalNormal());
            System.out.println("Total Setelah Dipotong Pajak        : "+obj3.PajakNormal());
        }

        System.out.println("\n---------------------");
        System.out.println("     GOLONGAN IV");
        System.out.println("---------------------");

        if (obj4.penentu() >= 1 ) {
            System.out.println("---------------------------------------------");
            System.out.println("            |HASIL| ");
            System.out.println("---------------------------------------------");
            System.out.println("NAMA                                : "+obj4.nama);
            System.out.println("GAJI                                : Rp " + obj4.GajiLembur());
            System.out.println("Tunjangan                           : Rp "+obj4.tunjangan);
            System.out.println("Total                               : "+obj4.TotalLembur());
            System.out.println("Total Setelah Dipotong Pajak        : "+obj4.PajakLembur());
        }else{
            System.out.println("\n------------------------------");
            System.out.println("            |HASIL| ");
            System.out.println("------------------------------");
            System.out.println("NAMA                                : "+obj4.nama);
            System.out.println("GAJI                                : Rp " + obj4.GajiNormal());
            System.out.println("Tunjangan                           : Rp "+obj4.tunjangan);
            System.out.println("Total                               : "+obj4.TotalNormal());
            System.out.println("Total Setelah Dipotong Pajak        : "+obj4.PajakNormal());
        }

    }
}
