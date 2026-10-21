package pertemuan4; //belajar bikin ui, pop up

import javax.swing.JOptionPane;

public class app {
    public static void main(String[] args) {
        JOptionPane jop = new JOptionPane();
        
        String nama, npm;
        int umur;
        
        int confirm = 0;
        
        do {
        	nama = jop.showInputDialog(
        			null,
        			"Masukan nama anda",
        			"input",
        			jop.QUESTION_MESSAGE
        			);
        	confirm = jop.showConfirmDialog(
        			null,
        			"Apakah anda yakin nama anda " + nama
        			);
        	if (confirm == 2) {
        		return;
        	}
        } while (confirm != 0);
        
        npm = jop.showInputDialog(
        		null,
        		"input npm",
        		"252310014"
        		);
        
        umur = Integer.parseInt(jop.showInputDialog(
        		null,
        		"input umur"
        		));
        
        String output = "Nama: " + nama + "\n" +
        				"NPM: " + npm + "\n" +
        				"Umur: " + umur;
        JOptionPane.showMessageDialog(null, output, "Biodata", jop.ERROR_MESSAGE);E
        
    }
}
