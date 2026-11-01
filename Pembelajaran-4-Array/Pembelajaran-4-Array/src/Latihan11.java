import java.util.ArrayList;
import javax.swing.JOptionPane;

// Soal 2: ArrayList multidimensi, matrix A dan B ordo 2x2
public class Latihan11 {
    static ArrayList<ArrayList<Integer>> isiMatrix(String nama) {
        ArrayList<ArrayList<Integer>> m = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 2; i++) {
            ArrayList<Integer> baris = new ArrayList<Integer>();
            for (int j = 0; j < 2; j++) {
                baris.add(Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Masukan nilai Matrix " + nama + "[" + i + "][" + j + "]:",
                        "Input Matrix " + nama, JOptionPane.QUESTION_MESSAGE)));
            }
            m.add(baris);
        }
        return m;
    }

    static String teks(String nama, ArrayList<ArrayList<Integer>> m) {
        String s = "Matrix " + nama + "\n";
        for (ArrayList<Integer> baris : m) {
            for (int v : baris) s += v + "   ";
            s += "\n";
        }
        return s;
    }

    public static void main(String[] args) {
        // Contoh isian: A = [1 3; 9 5], B = [4 5; 3 6]
        ArrayList<ArrayList<Integer>> a = isiMatrix("A");
        ArrayList<ArrayList<Integer>> b = isiMatrix("B");
        JOptionPane.showMessageDialog(null, teks("A", a) + "\n" + teks("B", b),
                "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}
