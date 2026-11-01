import javax.swing.JOptionPane;

public class Latihan07 {
    public static void main(String[] args) {
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] c = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Masukan nilai Matrix A[" + i + "][" + j + "]:", "Input Matrix A",
                        JOptionPane.QUESTION_MESSAGE));
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Masukan nilai Matrix B[" + i + "][" + j + "]:", "Input Matrix B",
                        JOptionPane.QUESTION_MESSAGE));
            }
        }

        String npm = JOptionPane.showInputDialog(null, "Masukan NPM Anda:", "Input NPM",
                JOptionPane.QUESTION_MESSAGE);
        int digitTerakhir = Character.getNumericValue(npm.charAt(npm.length() - 1));
        boolean ganjil = digitTerakhir % 2 != 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = ganjil ? a[i][j] + b[i][j] : a[i][j] - b[i][j];
            }
        }

        String hasil = "NPM " + (ganjil ? "GANJIL: C = A + B" : "GENAP: C = A - B") + "\n\nMatrix C\n";
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) hasil += c[i][j] + "  ";
            hasil += "\n";
        }
        JOptionPane.showMessageDialog(null, hasil, "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}
