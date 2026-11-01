import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;

// Soal 5: output Latihan03 diurutkan Ascending berdasarkan Nama Lengkap
public class Latihan14 {
    public static void main(String[] args) {
        String[] field = {"Nama Lengkap", "Alamat", "No Telp"};
        int jumlahData = 3;

        ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < jumlahData; i++) {
            ArrayList<String> baris = new ArrayList<String>();
            for (int j = 0; j < field.length; j++) {
                baris.add(JOptionPane.showInputDialog(null,
                        "Masukan " + field[j] + ":", "Data ke-" + (i + 1),
                        JOptionPane.QUESTION_MESSAGE));
            }
            data.add(baris);
        }

        // Urutkan ascending berdasarkan kolom 0 (Nama Lengkap)
        Collections.sort(data, new Comparator<ArrayList<String>>() {
            public int compare(ArrayList<String> x, ArrayList<String> y) {
                return x.get(0).compareToIgnoreCase(y.get(0));
            }
        });

        String hasil = "";
        for (ArrayList<String> baris : data) {
            for (int j = 0; j < field.length; j++) {
                hasil += field[j] + ": " + baris.get(j) + "\n";
            }
            hasil += "\n";
        }
        JOptionPane.showMessageDialog(null, hasil, "Data Terurut (Ascending)",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
