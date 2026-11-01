import javax.swing.JOptionPane;

public class Latihan08 {
    public static void main(String[] args) {
        String[][] data = {
            {"Septian Calyadi", "Dramaga cantik residence II, Bogor", "+62 899-9506-210"},
            {"Isnan Mulia", "Jl.Marsanggal, Bogor", "+62 819-3208-0875"},
            {"Edi Nurachmand", "Taman Cimanggu Permai, Bogor", "+62 856-9380-0384"}
        };
        String[] judul = {"Nama Lengkap", "Alamat", "No Telp"};

        String hasil = "";
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                hasil += judul[j] + ": " + data[i][j] + "\n";
            }
            hasil += "\n";
        }
        JOptionPane.showMessageDialog(null, hasil, "Data Array Multidimensi",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
