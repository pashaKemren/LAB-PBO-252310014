import java.util.ArrayList;
import javax.swing.JOptionPane;

// Soal 3: C = A * B (perkalian matrix) dengan ArrayList multidimensi
public class Latihan12 {
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
        ArrayList<ArrayList<Integer>> a = isiMatrix("A");
        ArrayList<ArrayList<Integer>> b = isiMatrix("B");

        ArrayList<ArrayList<Integer>> c = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 2; i++) {
            ArrayList<Integer> baris = new ArrayList<Integer>();
            for (int j = 0; j < 2; j++) {
                int jumlah = 0;
                for (int k = 0; k < 2; k++) {
                    jumlah += a.get(i).get(k) * b.get(k).get(j);
                }
                baris.add(jumlah);
            }
            c.add(baris);
        }

        JOptionPane.showMessageDialog(null,
                teks("A", a) + "\n" + teks("B", b) + "\n" + teks("C = A * B", c),
                "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}
