import javax.swing.JOptionPane;

public class Latihan06 {
    public static void main(String[] args) {
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];

        // Contoh isian: A = [1 3; 9 5], B = [4 5; 3 6]
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

        String hasil = "Matrix A\n";
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) hasil += a[i][j] + "  ";
            hasil += "\n";
        }
        hasil += "\nMatrix B\n";
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) hasil += b[i][j] + "  ";
            hasil += "\n";
        }
        JOptionPane.showMessageDialog(null, hasil, "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}
