import java.util.ArrayList;
import javax.swing.JOptionPane;

// Soal 4: ArrayList multidimensi berisi Nama Lengkap, Alamat, No Telp (input via JOptionPane)
public class Latihan13 {
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

        String hasil = "";
        for (ArrayList<String> baris : data) {
            for (int j = 0; j < field.length; j++) {
                hasil += field[j] + ": " + baris.get(j) + "\n";
            }
            hasil += "\n";
        }
        JOptionPane.showMessageDialog(null, hasil, "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}
