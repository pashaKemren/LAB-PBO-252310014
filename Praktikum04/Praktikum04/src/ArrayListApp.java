import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArrayListApp {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<String>();

        nama.add("Radit");
        System.out.println(nama.get(0));

        JOptionPane jop = new JOptionPane();
        nama.add(jop.showInputDialog(null, "Input nama: "));

        jop.showMessageDialog(null, "Nama: " + nama.get(nama.size() - 1));

        nama.remove(0); //menghapus
        System.out.println("nama setelah dihapus: " + nama.get(0));

        // pertanyaan
        // System.out.println(nama.get(1));

        nama.add("radit");
        nama.add("Tania");
        System.out.println("List nama: ");
        for (int i = 0; i < nama.size(); i++) {
            System.out.println(nama.get(i));
        }

        nama.clear(); // menghapus semua data
        System.out.println(nama.size());
    }
}
