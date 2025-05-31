package quickRename;

import java.awt.Desktop;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();

        jTabbedPane1.addChangeListener((ChangeEvent e) -> {            
            field1.setText("");
            field2.setText("");
            field3.setText("");
            inizioField.setText("0");
            fineField.setText("");
            daCercare = "";
            daSostituire = "";
            daAggiungere = "";

            if (attivo == 0) 
                text = textArea.getText();            
            else if (attivo == 1) 
                text = textArea1.getText();            
            else if (attivo == 2) 
                text = textArea2.getText();

            svuotaDisattivi(textArea, 0);
            svuotaDisattivi(textArea1, 1);
            svuotaDisattivi(textArea2, 2);
            attivo = jTabbedPane1.getSelectedIndex();
        });
    }

    public void svuotaDisattivi(JTextArea area, int offset) {
        if (offset == attivo) 
            area.setText("");
        else 
            area.setText(text);
    }

    String daCercare, daSostituire, daAggiungere;
    File[] files;
    String[] filesName = new String[10000];
    int attivo=0;
    String text="";
    File directory = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panel1 = new javax.swing.JPanel();
        trovati = new javax.swing.JLabel();
        applica = new javax.swing.JButton();
        sfoglia = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        field2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        field1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        info = new javax.swing.JButton();
        apri = new javax.swing.JButton();
        panel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea1 = new javax.swing.JTextArea();
        field3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        change = new javax.swing.JButton();
        sfoglia1 = new javax.swing.JButton();
        info1 = new javax.swing.JButton();
        change1 = new javax.swing.JButton();
        trovati1 = new javax.swing.JLabel();
        apri1 = new javax.swing.JButton();
        panel3 = new javax.swing.JPanel();
        numerazione = new javax.swing.JButton();
        sfoglia2 = new javax.swing.JButton();
        trovati2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        textArea2 = new javax.swing.JTextArea();
        tronca = new javax.swing.JButton();
        inizioField = new javax.swing.JTextField();
        fineField = new javax.swing.JTextField();
        info2 = new javax.swing.JButton();
        apri2 = new javax.swing.JButton();
        numerazione1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("fastRename");
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        jTabbedPane1.setBackground(new java.awt.Color(51, 51, 51));
        jTabbedPane1.setForeground(new java.awt.Color(204, 204, 204));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(600, 700));

        panel1.setBackground(new java.awt.Color(51, 51, 51));
        panel1.setPreferredSize(new java.awt.Dimension(600, 700));

        trovati.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        trovati.setForeground(new java.awt.Color(204, 204, 204));
        trovati.setText("Trovati: 0");

        applica.setBackground(new java.awt.Color(51, 51, 51));
        applica.setForeground(new java.awt.Color(204, 204, 204));
        applica.setText("Applica");
        applica.setFocusPainted(false);
        applica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applicaActionPerformed(evt);
            }
        });

        sfoglia.setBackground(new java.awt.Color(51, 51, 51));
        sfoglia.setForeground(new java.awt.Color(204, 204, 204));
        sfoglia.setText("Sfoglia...");
        sfoglia.setFocusPainted(false);
        sfoglia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sfogliaActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Stringa da sostituire");

        field2.setBackground(new java.awt.Color(102, 102, 102));
        field2.setForeground(new java.awt.Color(204, 204, 204));

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Stringa da ricercare:");

        field1.setBackground(new java.awt.Color(102, 102, 102));
        field1.setForeground(new java.awt.Color(204, 204, 204));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(234, 477));

        textArea.setEditable(false);
        textArea.setBackground(new java.awt.Color(102, 102, 102));
        textArea.setColumns(20);
        textArea.setForeground(new java.awt.Color(204, 204, 204));
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);
        textArea.getAccessibleContext().setAccessibleName("");

        info.setBackground(new java.awt.Color(51, 51, 51));
        info.setForeground(new java.awt.Color(204, 204, 204));
        info.setText("Info");
        info.setToolTipText("");
        info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoActionPerformed(evt);
            }
        });

        apri.setBackground(new java.awt.Color(51, 51, 51));
        apri.setForeground(new java.awt.Color(204, 204, 204));
        apri.setText("Apri");
        apri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(field1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(field2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sfoglia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(apri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(trovati)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(applica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(applica)
                    .addComponent(trovati)
                    .addComponent(sfoglia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(info)
                    .addComponent(apri))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Sostituire", panel1);

        panel2.setBackground(new java.awt.Color(51, 51, 51));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(234, 477));

        textArea1.setEditable(false);
        textArea1.setBackground(new java.awt.Color(102, 102, 102));
        textArea1.setColumns(20);
        textArea1.setForeground(new java.awt.Color(204, 204, 204));
        textArea1.setRows(5);
        jScrollPane2.setViewportView(textArea1);
        textArea1.getAccessibleContext().setAccessibleName("");

        field3.setBackground(new java.awt.Color(102, 102, 102));
        field3.setForeground(new java.awt.Color(204, 204, 204));

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Stringa da aggiungere:");

        change.setBackground(new java.awt.Color(51, 51, 51));
        change.setForeground(new java.awt.Color(204, 204, 204));
        change.setText("Aggiungere all'inizio");
        change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeActionPerformed(evt);
            }
        });

        sfoglia1.setBackground(new java.awt.Color(51, 51, 51));
        sfoglia1.setForeground(new java.awt.Color(204, 204, 204));
        sfoglia1.setText("Sfoglia...");
        sfoglia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sfoglia1ActionPerformed(evt);
            }
        });

        info1.setBackground(new java.awt.Color(51, 51, 51));
        info1.setForeground(new java.awt.Color(204, 204, 204));
        info1.setText("Info");
        info1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                info1ActionPerformed(evt);
            }
        });

        change1.setBackground(new java.awt.Color(51, 51, 51));
        change1.setForeground(new java.awt.Color(204, 204, 204));
        change1.setText("Aggiungere alla fine");
        change1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change1ActionPerformed(evt);
            }
        });

        trovati1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        trovati1.setForeground(new java.awt.Color(204, 204, 204));
        trovati1.setText("Trovati: 0");

        apri1.setBackground(new java.awt.Color(51, 51, 51));
        apri1.setForeground(new java.awt.Color(204, 204, 204));
        apri1.setText("Apri");
        apri1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apri1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(field3, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(apri1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sfoglia1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(trovati1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(change, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(info1, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                .addGap(377, 377, 377)
                                .addComponent(change1)))))
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sfoglia1)
                    .addComponent(change)
                    .addComponent(trovati1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(change1)
                    .addComponent(apri1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(info1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(field3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Aggiungere", panel2);

        panel3.setBackground(new java.awt.Color(51, 51, 51));

        numerazione.setBackground(new java.awt.Color(51, 51, 51));
        numerazione.setForeground(new java.awt.Color(204, 204, 204));
        numerazione.setText("Numerazione");
        numerazione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numerazioneActionPerformed(evt);
            }
        });

        sfoglia2.setBackground(new java.awt.Color(51, 51, 51));
        sfoglia2.setForeground(new java.awt.Color(204, 204, 204));
        sfoglia2.setText("Sfoglia...");
        sfoglia2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sfoglia2ActionPerformed(evt);
            }
        });

        trovati2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        trovati2.setForeground(new java.awt.Color(204, 204, 204));
        trovati2.setText("Trovati: 0");

        jScrollPane4.setPreferredSize(new java.awt.Dimension(234, 477));

        textArea2.setEditable(false);
        textArea2.setBackground(new java.awt.Color(102, 102, 102));
        textArea2.setColumns(20);
        textArea2.setForeground(new java.awt.Color(204, 204, 204));
        textArea2.setRows(5);
        jScrollPane4.setViewportView(textArea2);
        textArea2.getAccessibleContext().setAccessibleName("");

        tronca.setBackground(new java.awt.Color(51, 51, 51));
        tronca.setForeground(new java.awt.Color(204, 204, 204));
        tronca.setText("Tronca");
        tronca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                troncaActionPerformed(evt);
            }
        });

        inizioField.setBackground(new java.awt.Color(51, 51, 51));
        inizioField.setForeground(new java.awt.Color(204, 204, 204));
        inizioField.setText("0");
        inizioField.setPreferredSize(new java.awt.Dimension(35, 22));

        fineField.setBackground(new java.awt.Color(51, 51, 51));
        fineField.setForeground(new java.awt.Color(204, 204, 204));
        fineField.setPreferredSize(new java.awt.Dimension(35, 22));

        info2.setBackground(new java.awt.Color(51, 51, 51));
        info2.setForeground(new java.awt.Color(204, 204, 204));
        info2.setText("Info");
        info2.setToolTipText("");
        info2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                info2ActionPerformed(evt);
            }
        });

        apri2.setBackground(new java.awt.Color(51, 51, 51));
        apri2.setForeground(new java.awt.Color(204, 204, 204));
        apri2.setText("Apri");
        apri2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apri2ActionPerformed(evt);
            }
        });

        numerazione1.setBackground(new java.awt.Color(51, 51, 51));
        numerazione1.setForeground(new java.awt.Color(204, 204, 204));
        numerazione1.setText("Aggiungi numerazione");
        numerazione1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numerazione1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tronca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numerazione, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(inizioField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fineField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(numerazione1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(apri2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sfoglia2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(trovati2)
                        .addGap(372, 372, 372)
                        .addComponent(info2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sfoglia2)
                    .addComponent(trovati2)
                    .addComponent(info2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(apri2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numerazione)
                    .addComponent(numerazione1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tronca)
                    .addComponent(inizioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fineField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Altro", panel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sfogliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sfogliaActionPerformed
        scegli(textArea);
    }//GEN-LAST:event_sfogliaActionPerformed

    private void applicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applicaActionPerformed
        daCercare = field1.getText();
        daSostituire = field2.getText();

        if (daCercare.equals(""))
            JOptionPane.showMessageDialog(this, "Stringa da cercare vuota");
        else {
            int i = 0;
            try {
                for (String s : filesName) {
                    if (s != null) {
                        s = s.replaceFirst(daCercare, daSostituire);
                        File file = new File(files[i].getParent() + "/" + s);
                        files[i].renameTo(file);
                        files[i] = file;
                    }
                    i++;
                }
                associaFile(textArea);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Stringa da cercare non valida");
            }
            field1.setText("");
            field2.setText("");
        }
    }//GEN-LAST:event_applicaActionPerformed

    private void infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoActionPerformed
        JOptionPane.showMessageDialog(this, "I caratteri \"(\" e \")\" sono illegali.\nIl punto e gli altri caratteri speciali sono da indicare come \\\nIl carattere \".\" può causare problemi.");
    }//GEN-LAST:event_infoActionPerformed

    private void sfoglia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sfoglia1ActionPerformed
        scegli(textArea1);
    }//GEN-LAST:event_sfoglia1ActionPerformed

    private void changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeActionPerformed
        aggiungi(0);
    }//GEN-LAST:event_changeActionPerformed

    private void info1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_info1ActionPerformed
        JOptionPane.showMessageDialog(this, "Quando si inserisce alla fine, l'estensione è assunta per length = 3");
    }//GEN-LAST:event_info1ActionPerformed

    private void numerazioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numerazioneActionPerformed
        try {
            String input = JOptionPane.showInputDialog(this, "Inserire numero iniziale:", 1);
            if (input != null) {
                int initialN = Integer.valueOf(input);
                int i = 0;
                for (String s : filesName) {
                    if (s != null) {
                        String extension = s.substring(s.length() - extensionLength(s));
                        String n = String.valueOf(initialN);
                        if (n.length() == 1) {
                            n = "00" + n;
                        }
                        else if (n.length() == 2) {
                            n = "0" + n;
                        }
                        s = n + extension;
                        File file = new File(files[i].getParent() + "/" + s);
                        files[i].renameTo(file);
                        files[i] = file;
                    }
                    i++;
                    initialN++;
                }
                associaFile(textArea2);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Qualcosa è andato storto");
        }      
    }//GEN-LAST:event_numerazioneActionPerformed

    private void change1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change1ActionPerformed
        aggiungi(1);
    }//GEN-LAST:event_change1ActionPerformed

    private void sfoglia2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sfoglia2ActionPerformed
        scegli(textArea2);
    }//GEN-LAST:event_sfoglia2ActionPerformed

    private void troncaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_troncaActionPerformed
        if (inizioField.getText().equals("") || fineField.getText().equals(""))
            JOptionPane.showMessageDialog(this, "Limiti non validi");
        else {
            int inizio = Integer.valueOf(inizioField.getText());
            int fine;
            if(fineField.getText().equals("L"))
                    fine = 1001;
            else
                fine = Integer.valueOf(fineField.getText());

            try {
                int i = 0;
                String temp = troncaLinea(filesName[0], inizio, fine);
                if(JOptionPane.showConfirmDialog(this, "Questo è un esempio del risultato: \n"+temp, "Sei sicuro?", 0) == 0)
                {
                    for (String s : filesName) {
                        if (s != null) {
                            s = troncaLinea(s, inizio, fine);
                            File file = new File(files[i].getParent() + "/" + s);
                            files[i].renameTo(file);
                            files[i] = file;
                        }
                        i++;
                    }
                }
                associaFile(textArea2);
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(this, "Qualcosa è andato storto");
            }
        }
    }//GEN-LAST:event_troncaActionPerformed

    private void info2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_info2ActionPerformed
        JOptionPane.showMessageDialog(this, "Per troncare le prime 6 lettere si scriva 0-6 (contando da 1)\n"
                + "Per troncare da una posizione in avanti scrivere \"L\"");
    }//GEN-LAST:event_info2ActionPerformed

    private void apriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apriActionPerformed
        apri();
    }//GEN-LAST:event_apriActionPerformed

    private void apri1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apri1ActionPerformed
        apri();
    }//GEN-LAST:event_apri1ActionPerformed

    private void apri2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apri2ActionPerformed
        apri();
    }//GEN-LAST:event_apri2ActionPerformed

    private void numerazione1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numerazione1ActionPerformed
         try {
            String input = JOptionPane.showInputDialog(this, "Inserire numero iniziale:", 1);
            if (input != null) {
                int initialN = Integer.valueOf(input);
                int i = 0;
                for (String s : filesName) {
                    if (s != null) {
                        String n = String.valueOf(initialN);
                        if (n.length() == 1) {
                            n = "00" + n;
                        }
                        else if (n.length() == 2) {
                            n = "0" + n;
                        }
                        s = n + ". " + s;
                        File file = new File(files[i].getParent() + "/" + s);
                        files[i].renameTo(file);
                        files[i] = file;
                    }
                    i++;
                    initialN++;
                }
                associaFile(textArea2);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Qualcosa è andato storto");
        }      
    }//GEN-LAST:event_numerazione1ActionPerformed

    public String troncaLinea(String s, int inizio, int fine)
    {      
        if (fine == 1001)   //L 
            fine = s.length() - extensionLength(s);
        String extension = s.substring(s.length() - extensionLength(s));
        return s.substring(inizio, fine) + extension;
    }
    
    public void aggiungi(int dove) {
        daAggiungere = field3.getText();

        if (daAggiungere.equals("")) {
            JOptionPane.showMessageDialog(this, "Stringa da aggiungere vuota");
        } else {
            int i = 0;
            try {
                for (String s : filesName) {
                    if (s != null) {
                        if (dove == 1) 
                            s = s + daAggiungere;
                        else 
                            s = daAggiungere + s;
                        File file = new File(files[i].getParent() + "/" + s);
                        files[i].renameTo(file);
                        files[i] = file;
                    }
                    i++;
                }
                associaFile(textArea1);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Stringa da cercare non valida");
            }
            field3.setText("");
        }
    }

    public void scegli(JTextArea area) {        
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.home") + "/Desktop"));
        if(directory == null)
            directory = new File("E:\\Download");
        chooser.setCurrentDirectory(directory);
        chooser.setMultiSelectionEnabled(true);
        chooser.showOpenDialog(this);
        files = chooser.getSelectedFiles();
        associaFile(area);
        if(files.length > 0)
            directory = files[0].getParentFile();
    }

    public void associaFile(JTextArea area) {
        trovati.setText("Trovati: 0");
        trovati1.setText("Trovati: 0");
        trovati2.setText("Trovati: 0");
        area.setText("");
        int i = 0;
        for (File f : files) {
            filesName[i] = f.getName();
            area.setText(area.getText() + f.getName() + "\n");
            i++;
        }
        trovati.setText("Trovati: " + i);
        trovati1.setText("Trovati: " + i);
        trovati2.setText("Trovati: " + i);
    }
    
    public int extensionLength(String s)
    {
        int i=0, result =0;
        do
        {
            if(s.charAt(s.length()-1 - i) == '.')
                result = i;       
            i++;
        }while (result == 0);                
        return result+1;
    }
    
    public void apri()
    {
        try {            
            if (files.length > 0) 
                Desktop.getDesktop().open(files[0].getParentFile());           
        } catch (IOException e) {}
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton applica;
    private javax.swing.JButton apri;
    private javax.swing.JButton apri1;
    private javax.swing.JButton apri2;
    private javax.swing.JButton change;
    private javax.swing.JButton change1;
    private javax.swing.JTextField field1;
    private javax.swing.JTextField field2;
    private javax.swing.JTextField field3;
    private javax.swing.JTextField fineField;
    private javax.swing.JButton info;
    private javax.swing.JButton info1;
    private javax.swing.JButton info2;
    private javax.swing.JTextField inizioField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton numerazione;
    private javax.swing.JButton numerazione1;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JButton sfoglia;
    private javax.swing.JButton sfoglia1;
    private javax.swing.JButton sfoglia2;
    private javax.swing.JTextArea textArea;
    private javax.swing.JTextArea textArea1;
    private javax.swing.JTextArea textArea2;
    private javax.swing.JButton tronca;
    private javax.swing.JLabel trovati;
    private javax.swing.JLabel trovati1;
    private javax.swing.JLabel trovati2;
    // End of variables declaration//GEN-END:variables
}
