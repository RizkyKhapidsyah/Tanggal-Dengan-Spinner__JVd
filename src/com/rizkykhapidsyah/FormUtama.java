package com.rizkykhapidsyah;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class FormUtama extends JFrame {

    JSpinner spinner;

    public FormUtama() {
        super("Tanggal Dengan Menggunakan JSpinner");
        inisialisasi_komponen();
    }

    private void inisialisasi_komponen() {
        aturSpinner();
        setPreferredSize(new Dimension(300, 250));

        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void aturSpinner() {
        spinner = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(spinner, "dd/MMM/yyyy HH:mm:ss");

        spinner.setEditor(timeEditor);
        spinner.setValue(new Date());
        spinner.setFont(new Font("Cambria", Font.BOLD, 14));

        add(spinner, BorderLayout.NORTH);
    }
}
