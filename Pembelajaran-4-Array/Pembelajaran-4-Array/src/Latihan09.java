import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan09 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Masukan jumlah array:", "Input", JOptionPane.QUESTION_MESSAGE));
        ArrayList<Integer> nilai = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            nilai.add(Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Masukan angka:", "Data array ke-" + i, JOptionPane.QUESTION_MESSAGE)));
        }

        int max = nilai.get(0), min = nilai.get(0);
        String hasil = "";
        for (int i = 0; i < nilai.size(); i++) {
            hasil += "x[" + i + "]=" + nilai.get(i) + "\n";
            if (nilai.get(i) > max) max = nilai.get(i);
            if (nilai.get(i) < min) min = nilai.get(i);
        }
        hasil += "Nilai terbesar adalah " + max + "\n";
        hasil += "Nilai terkecil adalah " + min;

        JOptionPane.showMessageDialog(null, hasil, "Output Array", JOptionPane.INFORMATION_MESSAGE);
    }
}
