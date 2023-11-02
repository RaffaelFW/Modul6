package View;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import Controller.DateLabelFormatter;
import Model.Penduduk;
import net.sourceforge.jdatepicker.JDatePicker;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

public class MainMenu1Screen {
    JTextField nikTextField;
    JTextField namaTextField;
    JTextField tempatLahirTextField;
    JDatePicker tanggalLahirDatePicker;
    JRadioButton priaRadioButton;
    JRadioButton wanitaRadioButton;
    ButtonGroup jenisKelaminButtonGroup;
    JRadioButton golAButton;
    JRadioButton golBButton;
    JRadioButton golOButton;
    JRadioButton golABButton;
    ButtonGroup golDarahButtonGroup;
    JTextField alamatTextField;
    JTextField rtRwTextField;
    JTextField kelDesaTextField;
    JTextField kecamatanTextField;
    JComboBox<String> agamaComboBox;
    JComboBox<String> statusComboBox;
    JCheckBox karyawanSwastaCheckBox;
    JCheckBox pnsCheckBox;
    JCheckBox wiraswastaCheckBox;
    JCheckBox akademisiCheckBox;
    JCheckBox pengangguranCheckBox;
    JRadioButton wniRadioButton;
    JRadioButton wnaRadioButton;
    JTextField warganegaraTextField;
    JButton fotoFileChooserButton;
    JButton tandaTanganFileChooserButton;
    JTextField berlakuHinggaTextField;
    JTextField kotaPembuatanKTPTextField;
    JDatePicker tanggalPembuatanKTPDatePicker;

    public MainMenu1Screen() {
        // Memasukan Data di KTP
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout ktplayout = new GridLayout(30, 2);
        JPanel panel = new JPanel(ktplayout);

        nikTextField = new JTextField(20);
        namaTextField = new JTextField(20);
        tempatLahirTextField = new JTextField(20);
        priaRadioButton = new JRadioButton("Pria");
        wanitaRadioButton = new JRadioButton("Wanita");
        jenisKelaminButtonGroup = new ButtonGroup();
        jenisKelaminButtonGroup.add(priaRadioButton);
        jenisKelaminButtonGroup.add(wanitaRadioButton);
        golAButton = new JRadioButton("A");
        golBButton = new JRadioButton("B");
        golOButton = new JRadioButton("O");
        golABButton = new JRadioButton("AB");
        golDarahButtonGroup = new ButtonGroup();
        golDarahButtonGroup.add(golAButton);
        golDarahButtonGroup.add(golBButton);
        golDarahButtonGroup.add(golOButton);
        golDarahButtonGroup.add(golABButton);
        alamatTextField = new JTextField(50);
        rtRwTextField = new JTextField(10);
        kelDesaTextField = new JTextField(20);
        kecamatanTextField = new JTextField(20);
        agamaComboBox = new JComboBox<>(new String[]{"Islam", "Kristen", "Katolik", "Hindu", "Buddha", "Konghucu", "Lainnya"});
        statusComboBox = new JComboBox<>(new String[]{"Belum Menikah", "Menikah", "Janda/Duda"});
        karyawanSwastaCheckBox = new JCheckBox("Karyawan Swasta");
        pnsCheckBox = new JCheckBox("PNS");
        wiraswastaCheckBox = new JCheckBox("Wiraswasta");
        akademisiCheckBox = new JCheckBox("Akademisi");
        pengangguranCheckBox = new JCheckBox("Pengangguran");
        wniRadioButton = new JRadioButton("WNI");
        wnaRadioButton = new JRadioButton("WNA");
        warganegaraTextField = new JTextField(20);
        fotoFileChooserButton = new JButton("Pilih Foto");
        tandaTanganFileChooserButton = new JButton("Pilih Tanda Tangan");
        berlakuHinggaTextField = new JTextField(10);
        kotaPembuatanKTPTextField = new JTextField(20);
        UtilDateModel model = new UtilDateModel();
        JDatePanelImpl datePanel = new JDatePanelImpl(model);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);

        panel.add(new Label("NIK :"));
        panel.add(nikTextField);

        panel.add(new Label("Nama : "));
        panel.add(namaTextField);

        panel.add(new Label("Tempat Lahir : "));
        panel.add(tempatLahirTextField);

        panel.add(new Label("Tanngal Lahir : "));
        panel.add(datePicker);

        panel.add(new Label("Jenis Kelamin :"));
        panel.add(priaRadioButton);
        panel.add(wanitaRadioButton);

        panel.add(new Label("Golongan Darah"));
        panel.add(golABButton);
        panel.add(golAButton);
        panel.add(golOButton);
        panel.add(golBButton);

        panel.add(new Label("Alamat:"));
        panel.add(alamatTextField);

        panel.add(new Label("RT/RW: "));
        panel.add(rtRwTextField);

        panel.add(new Label("Kel/Desa: "));
        panel.add(kelDesaTextField);

        panel.add(new Label("Kecamatan:"));
        panel.add(kecamatanTextField);

        panel.add(new Label("Agama: "));
        panel.add(agamaComboBox);

        panel.add(new Label("Status Perkawinan: "));
        panel.add(statusComboBox);

        panel.add(new Label("Pekerjaan: "));
        panel.add(karyawanSwastaCheckBox);
        panel.add(wiraswastaCheckBox);
        panel.add(akademisiCheckBox);
        panel.add(pnsCheckBox);
        panel.add(pengangguranCheckBox);

        pengangguranCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (pengangguranCheckBox.isSelected()) {
                    karyawanSwastaCheckBox.setEnabled(false);
                    pnsCheckBox.setEnabled(false);
                    wiraswastaCheckBox.setEnabled(false);
                    akademisiCheckBox.setEnabled(false);
                } else {
                    karyawanSwastaCheckBox.setEnabled(true);
                    pnsCheckBox.setEnabled(true);
                    wiraswastaCheckBox.setEnabled(true);
                    akademisiCheckBox.setEnabled(true);
                }
            }
        });

        panel.add(new Label("Kewarganegaraan: "));
        JLabel negaraLabel = new JLabel("Masukan Warga negara: ");
        panel.add(negaraLabel);
        negaraLabel.setVisible(false);
        warganegaraTextField.setVisible(false);
        panel.add(warganegaraTextField);
        wnaRadioButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == 1) {
                    negaraLabel.setVisible(true);
                    warganegaraTextField.setVisible(true);
                } else {
                    negaraLabel.setVisible(false);
                    warganegaraTextField.setVisible(false);
                }
            }
        });
        panel.add(wniRadioButton);
        panel.add(wnaRadioButton);

        panel.add(new Label("Foto :"));
        panel.add(fotoFileChooserButton);
        JLabel fotopreview = new JLabel();
        fotopreview.setVisible(false);
        JLabel fotopath = new JLabel();
        panel.add(fotopreview);
        fotoFileChooserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    fotopath.setText(selectedFile.getAbsolutePath());
                    // Tambahkan logika untuk memproses file foto yang dipilih
                    ImageIcon imageIcon = new ImageIcon(selectedFile.getPath());
                    Image image = imageIcon.getImage().getScaledInstance(75, 100, Image.SCALE_DEFAULT);
                    fotopreview.setIcon(new ImageIcon(image));
                    fotopreview.setVisible(true);
                }
            }
        });

        panel.add(new Label("Masukan Tanda Tangan :"));
        panel.add(new Label("Pilih foto tanda Tangan"));
        panel.add(tandaTanganFileChooserButton);
        JLabel ttdPreview = new JLabel();
        fotopreview.setVisible(false);
        ttdPreview.setVisible(false);
        JLabel ttdPath = new JLabel();
        panel.add(ttdPreview);
        tandaTanganFileChooserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    ttdPath.setText(selectedFile.getAbsolutePath());
                    // Tambahkan logika untuk memproses file foto yang dipilih
                    ImageIcon imageIcon = new ImageIcon(selectedFile.getPath());
                    Image image = imageIcon.getImage().getScaledInstance(75, 100, Image.SCALE_DEFAULT);
                    ttdPreview.setIcon(new ImageIcon(image));
                    ttdPreview.setVisible(true);
                }
            }
        });

        panel.add(new Label("Berlaku Hingga :"));
        panel.add(berlakuHinggaTextField);
        UtilDateModel berlakuHinggaModel = new UtilDateModel();
        JDatePanelImpl berlakuHinggaDatePanel = new JDatePanelImpl(berlakuHinggaModel);
        JDatePickerImpl berlakuHinggaDatePicker = new JDatePickerImpl(berlakuHinggaDatePanel, new DateLabelFormatter());
        panel.add(berlakuHinggaDatePicker);

        panel.add(new Label("Kota Pembuatan KTP"));
        panel.add(kotaPembuatanKTPTextField);

        JLabel tanggalBuatLabel =  new JLabel("Tanggal Pembuatan KTP: "+new SimpleDateFormat("dd-MM-yyyy").format(new Date()));
        panel.add(tanggalBuatLabel);

        JLabel provinsiPembuatanLabel = new JLabel("Provinsi Pembuatan KTP:");
        JTextField provinsiPembuatanTextField = new JTextField("Republik Harapan Bangsa");

        panel.add(new Label("Berlaku Hingga :"));
        panel.add(berlakuHinggaTextField);


        JButton simpanButton = new JButton("Simpan");
        simpanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nik = nikTextField.getText();
                String nama = namaTextField.getText();
                String tempatLahir = tempatLahirTextField.getText();
                String tanggalLahir = datePicker.getJFormattedTextField().getText();
                String jenisKelamin = priaRadioButton.isSelected() ? "Pria" : "Wanita";
                String golDarah = golABButton.isSelected() ? "A" : golBButton.isSelected() ? "B" : golOButton.isSelected() ? "O" : "AB";
                String alamat = alamatTextField.getText();
                String rtRw = rtRwTextField.getText();
                String kelDesa = kelDesaTextField.getText();
                String kecamatan = kecamatanTextField.getText();
                String agama = agamaComboBox.getSelectedItem().toString();
                String statusPerkawinan = statusComboBox.getSelectedItem().toString();
                String pekerjaan = karyawanSwastaCheckBox.isSelected() ? "Karyawan Swasta" : pnsCheckBox.isSelected() ? "PNS" : wiraswastaCheckBox.isSelected() ? "Wiraswasta" : akademisiCheckBox.isSelected() ? "Akademisi" : "Pengangguran";
                String kewarganegaraan = wniRadioButton.isSelected() ? "WNI" : "WNA";
                String foto = fotopath.getText();
                String tandaTangan = ttdPath.getText();
                String berlakuHingga = berlakuHinggaTextField.getText();
                String kotaPembuatan = kotaPembuatanKTPTextField.getText();
                String tanggalPembuatan = tanggalBuatLabel.getText();
                String provinsiPembuatan = provinsiPembuatanTextField.getText();

                if (nik.isEmpty() || nama.isEmpty() || tempatLahir.isEmpty() || tanggalLahir.isEmpty() || jenisKelamin.isEmpty() || golDarah.isEmpty() || alamat.isEmpty() || rtRw.isEmpty() || kelDesa.isEmpty() || kecamatan.isEmpty() || agama.isEmpty() || statusPerkawinan.isEmpty() || pekerjaan.isEmpty() || kewarganegaraan.isEmpty() || foto.isEmpty() || tandaTangan.isEmpty() || berlakuHingga.isEmpty() || kotaPembuatan.isEmpty() || tanggalPembuatan.isEmpty() || provinsiPembuatan.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Ada data yang kosong. Mohon isi semua data.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
                    new MainMenu1Screen();
                } else {
                    Penduduk hasil = new Penduduk(nik, nama, tempatLahir, tanggalLahir, jenisKelamin, golDarah, alamat, rtRw, kelDesa, kecamatan, agama, statusPerkawinan, pekerjaan, kewarganegaraan, foto, tandaTangan, berlakuHingga, kotaPembuatan, tanggalPembuatan, provinsiPembuatan);
                    new MainMenu2Screen(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "Downloads/Pasfoto.jpg", null, hasil, "1970-1-1");
                }
                frame.dispose();
            }
        });

        frame.add(panel);
        frame.setSize(720, 480);
        frame.setVisible(true);


    }


}