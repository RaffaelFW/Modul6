package View;

import Model.Penduduk;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu2Screen extends JFrame{
    public MainMenu2Screen(Object penduduk1, Object o7, Object object6, Object o6, Object object5, Object o5, Object object4, Object o4, Object object3, Object o3, Object object2, Object o2, Object object1, Object o1, Object object, String s, Object o, Penduduk penduduk, String date) {
        JFrame frame = this;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(530, 350);
        JPanel panel = new JPanel(null);
        panel.setPreferredSize(new Dimension(530, 350));

        JLabel labelTitle = new JLabel("Republik Harapan Bangsa");
        labelTitle.setBounds(150, 10, 400, 20);
        labelTitle.setFont(new Font("Arial", Font.BOLD, 18));
        JLabel labelNIKHasil = new JLabel("NIK         : " + penduduk.getNik());
        labelNIKHasil.setBounds(10, 50, 380, 20);
        labelNIKHasil.setFont(new Font("Arial", Font.BOLD, 18));
        JLabel labelNamaHasil = new JLabel("Nama                            : " +penduduk.getNama() );
        labelNamaHasil.setBounds(10, 80, 380, 20);
        JLabel labelTTLHasil = new JLabel("Tempat/Tgl Lahir       : " + penduduk.getTempatLahir() + ", " + penduduk.getTanggalLahir().toString());
        labelTTLHasil.setBounds(10, 95, 380, 20);
        JLabel labelJKHasil = new JLabel("Jenis Kelamin            : " + penduduk.getJenisKelamin());
        labelJKHasil.setBounds(10, 110, 200, 20);
        JLabel labelGolDarHasil = new JLabel("Gol. Darah     : " + penduduk.getGolDarah());
        labelGolDarHasil.setBounds(220, 110, 100, 20);
        JLabel labelAlamatHasil = new JLabel("Alamat                         : " + penduduk.getAlamat());
        labelAlamatHasil.setBounds(10, 125, 380, 20);
        JLabel labelRTRWHasil = new JLabel("RT/RW                   : " + penduduk.getRtRw());
        labelRTRWHasil.setBounds(30, 140, 380, 20);
        JLabel labelKelDesaHasil = new JLabel("Kel/Desa               : " + penduduk.getKelDesa());
        labelKelDesaHasil.setBounds(30, 155, 380, 20);
        JLabel labelKecamatanHasil = new JLabel("Kecamatan          : " + penduduk.getKecamatan());
        labelKecamatanHasil.setBounds(30, 170, 380, 20);
        JLabel labelAgamaHasil = new JLabel("Agama                         : " + penduduk.getAgama());
        labelAgamaHasil.setBounds(10, 185, 380, 20);
        JLabel labelStatusPerkawinanHasil = new JLabel("Status Perkawinan  : " + penduduk.getStatusPerkawinan());
        labelStatusPerkawinanHasil.setBounds(10, 200, 380, 20);
        JLabel labelPekerjaanHasil = new JLabel("Pekerjaan                   : " + penduduk.getPekerjaan());
        labelPekerjaanHasil.setBounds(10, 215, 380, 20);
        JLabel labelKewarganegaraanHasil = new JLabel("Kewarganegaraan   : " + penduduk.getKewarganegaraan());
        labelKewarganegaraanHasil.setBounds(10, 230, 380, 20);
        JLabel labelMasaBerlakuHasil = new JLabel("Masa Berlaku            : " + penduduk.getBerlakuHingga().toString());
        labelMasaBerlakuHasil.setBounds(10, 245, 380, 20);
        JLabel labelKotaPembuatanHasil = new JLabel(penduduk.getKotaPembuatanKTP());
        labelKotaPembuatanHasil.setBounds(415, 215, 380, 20);
        labelKotaPembuatanHasil.setFont(new Font("Arial", Font.PLAIN, 12));
        JLabel labelTanggalPembuatanHasil = new JLabel(penduduk.getTanggalPembuatanKTP());
        labelTanggalPembuatanHasil.setBounds(400, 227, 380, 20);
        labelTanggalPembuatanHasil.setFont(new Font("Arial", Font.PLAIN, 12));
        ImageIcon originalFotoIcon = new ImageIcon(penduduk.getFotoPath());
        Image originalFoto = originalFotoIcon.getImage();
        Image resizedFoto = originalFoto.getScaledInstance(125, 155, Image.SCALE_SMOOTH);
        ImageIcon resizedFotoIcon = new ImageIcon(resizedFoto);
        JLabel labelFotoHasil = new JLabel(resizedFotoIcon);
        labelFotoHasil.setBounds(370, 60, 125, 155);
        ImageIcon originalTTDIcon = new ImageIcon(penduduk.getTandaTanganPath());
        Image originalTTD = originalTTDIcon.getImage();
        Image resizedTTD = originalTTD.getScaledInstance(125, 50, Image.SCALE_SMOOTH);
        ImageIcon resizedTTDIcon = new ImageIcon(resizedTTD);
        JLabel labelTTDHasil = new JLabel(resizedTTDIcon);
        labelTTDHasil.setBounds(370, 250, 125, 50);
        JButton back = new JButton("Back to Main Menu");
        back.setBounds(10, 280, 150, 30);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                frame.dispose();
                new MainMenu();
            }
        });

        panel.add(labelTitle);
        panel.add(labelNIKHasil);
        panel.add(labelNamaHasil);
        panel.add(labelTTLHasil);
        panel.add(labelJKHasil);
        panel.add(labelGolDarHasil);
        panel.add(labelAlamatHasil);
        panel.add(labelRTRWHasil);
        panel.add(labelKelDesaHasil);
        panel.add(labelKecamatanHasil);
        panel.add(labelAgamaHasil);
        panel.add(labelStatusPerkawinanHasil);
        panel.add(labelPekerjaanHasil);
        panel.add(labelKewarganegaraanHasil);
        panel.add(labelMasaBerlakuHasil);
        panel.add(labelKotaPembuatanHasil);
        panel.add(labelTanggalPembuatanHasil);
        panel.add(labelFotoHasil);
        panel.add(labelTTDHasil);
        panel.add(back);

        panel.setBackground(Color.decode("#ccdef6"));
        add(panel);
        setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainMenu2Screen(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "Downloads/Pasfoto.jpg", null, null, "1970-1-1");
            }
        });
    }
}