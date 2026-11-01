import javax.swing.JOptionPane;

public class Latihan03 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Masukan jumlah array:", "Input", JOptionPane.QUESTION_MESSAGE));
        int[] nilai = new int[n];

        for (int i = 0; i < n; i++) {
            nilai[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Masukan angka:", "Data array ke-" + i, JOptionPane.QUESTION_MESSAGE));
        }

        String hasil = "";
        for (int i = 0; i < n; i++) {
            hasil += "x[" + i + "]=" + nilai[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, hasil, "Output Array", JOptionPane.INFORMATION_MESSAGE);
    }
}
