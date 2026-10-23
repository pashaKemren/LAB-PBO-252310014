import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Buku {
    public static void main(String[] args) {
        ArrayList<String> daftarBuku = new ArrayList<>();
        String pilih = "";

  while (!pilih.equals("4")) {
      pilih = JOptionPane.showInputDialog(
       "1. Masukan Buku\n" +

       "2. Hapus Buku\n" +

       "3. Output Seluruh Data Buku\n" +

       "4. Keluar\n\n" +

       "Masukkan pilihan:"
            );


    if (pilih == null || pilih.equals("4")) {
                break;
            }

    switch (pilih) {
         case "1":
           String judul = JOptionPane.showInputDialog("MASUKAN JUDUL BUKU");

              if (judul != null && !judul.trim().isEmpty()) {
                        daftarBuku.add(judul);
                        JOptionPane.showMessageDialog(null, "BUKU TERSIMPAN");
                    } else if (judul != null) {
                        JOptionPane.showMessageDialog(null, "DILARANG KOSONG");
                    }
                    break;

          case "2":
              if (daftarBuku.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "BUKU BELUM ADA");
                    } else {
                        String hapus = JOptionPane.showInputDialog(
                            "Daftar Buku:\n" + daftarBuku +
                            "\nMASUKANJUDUL BUKU:"
                        );

              if (hapus != null) {
                   if (daftarBuku.remove(hapus)) {
                                JOptionPane.showMessageDialog(null, "BUKU DIHAPUS");
                     } else {
                                JOptionPane.showMessageDialog(null, "BUKU TIDAK ADA");
                            }
                        }
                    }
                    break;

           case "3":
              if (daftarBuku.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "BUKU TIDAK ADA");
                    } else {
                        JOptionPane.showMessageDialog(
                            null, "Daftar Buku:\n" + String.join("\n", daftarBuku)
                        );
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "ERROR");
            }
        }

        JOptionPane.showMessageDialog(null, "SELESAI");
    }
}