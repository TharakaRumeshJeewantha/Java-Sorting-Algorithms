
package daa_sorting;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Merge_Sort extends javax.swing.JFrame {
 String m1;
 String m2;
 String m3;
 String m4;
 String m5;

    public Merge_Sort() {
        initComponents();
        lbl1.setVisible(false);
        lbl2.setVisible(false);
        
        btnstep2.setVisible(false);
        btnstep3.setVisible(false);
        btnstep4.setVisible(false);
        btnstep5.setVisible(false);
        btnstep6.setVisible(false);
        btnstep7.setVisible(false);
        btnstep8.setVisible(false);
        btnstep9.setVisible(false);
        btnstep10.setVisible(false);
        btnstep11.setVisible(false);
        btnstep12.setVisible(false);
        btnstep13.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txta = new javax.swing.JTextField();
        txtb = new javax.swing.JTextField();
        txtc = new javax.swing.JTextField();
        txtd = new javax.swing.JTextField();
        txte = new javax.swing.JTextField();
        txta1 = new javax.swing.JTextField();
        txtb1 = new javax.swing.JTextField();
        txta2 = new javax.swing.JTextField();
        txtb2 = new javax.swing.JTextField();
        txtc1 = new javax.swing.JTextField();
        txtd1 = new javax.swing.JTextField();
        txte1 = new javax.swing.JTextField();
        txtc2 = new javax.swing.JTextField();
        txtd2 = new javax.swing.JTextField();
        txte2 = new javax.swing.JTextField();
        txtd3 = new javax.swing.JTextField();
        txte3 = new javax.swing.JTextField();
        btnstep1 = new javax.swing.JButton();
        btnstep2 = new javax.swing.JButton();
        btnstep3 = new javax.swing.JButton();
        btnstep4 = new javax.swing.JButton();
        btnstep5 = new javax.swing.JButton();
        btnstep6 = new javax.swing.JButton();
        btnstep7 = new javax.swing.JButton();
        btnstep8 = new javax.swing.JButton();
        btnstep9 = new javax.swing.JButton();
        btnstep10 = new javax.swing.JButton();
        btnstep11 = new javax.swing.JButton();
        btnstep13 = new javax.swing.JButton();
        txtaa = new javax.swing.JTextField();
        txtbb = new javax.swing.JTextField();
        txtcc = new javax.swing.JTextField();
        txtdd = new javax.swing.JTextField();
        txtee = new javax.swing.JTextField();
        btnstep12 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblb = new javax.swing.JLabel();
        lbla = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 30, 0, 0));
        setMaximumSize(new java.awt.Dimension(643, 729));
        setMinimumSize(new java.awt.Dimension(643, 729));
        setUndecorated(true);

        txta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txta.setToolTipText("Please Input your nubers only here");
        txta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtaKeyReleased(evt);
            }
        });

        txtb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtb.setToolTipText("Please Input your nubers only here");

        txtc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtc.setToolTipText("Please Input your nubers only here");

        txtd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtd.setToolTipText("Please Input your nubers only here");

        txte.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txte.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txte.setToolTipText("Please Input your nubers only here");

        txta1.setEditable(false);
        txta1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txta1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txta1.setToolTipText("sorry, you cannot edit here");

        txtb1.setEditable(false);
        txtb1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtb1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtb1.setToolTipText("sorry, you cannot edit here");

        txta2.setEditable(false);
        txta2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txta2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txta2.setToolTipText("sorry, you cannot edit here");

        txtb2.setEditable(false);
        txtb2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtb2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtb2.setToolTipText("sorry, you cannot edit here");

        txtc1.setEditable(false);
        txtc1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtc1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtc1.setToolTipText("sorry, you cannot edit here");

        txtd1.setEditable(false);
        txtd1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtd1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtd1.setToolTipText("sorry, you cannot edit here");

        txte1.setEditable(false);
        txte1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txte1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txte1.setToolTipText("sorry, you cannot edit here");

        txtc2.setEditable(false);
        txtc2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtc2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtc2.setToolTipText("sorry, you cannot edit here");

        txtd2.setEditable(false);
        txtd2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtd2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtd2.setToolTipText("sorry, you cannot edit here");

        txte2.setEditable(false);
        txte2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txte2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txte2.setToolTipText("sorry, you cannot edit here");

        txtd3.setEditable(false);
        txtd3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtd3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtd3.setToolTipText("sorry, you cannot edit here");

        txte3.setEditable(false);
        txte3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txte3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txte3.setToolTipText("sorry, you cannot edit here");

        btnstep1.setBackground(new java.awt.Color(0, 51, 51));
        btnstep1.setForeground(new java.awt.Color(255, 255, 255));
        btnstep1.setText("Step 1");
        btnstep1.setToolTipText("Step 1 execute");
        btnstep1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnstep1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstep1ActionPerformed(evt);
            }
        });

        btnstep2.setBackground(new java.awt.Color(0, 51, 51));
        btnstep2.setForeground(new java.awt.Color(255, 255, 255));
        btnstep2.setText("Step 2");
        btnstep2.setToolTipText("Step 2 execute");
        btnstep2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnstep2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstep2ActionPerformed(evt);
            }
        });

        btnstep3.setBackground(new java.awt.Color(0, 51, 51));
        btnstep3.setForeground(new java.awt.Color(255, 255, 255));
        btnstep3.setText("Step 3");
        btnstep3.setToolTipText("Step 3 execute");
        btnstep3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnstep3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstep3ActionPerformed(evt);
            }
        });

        btnstep4.setBackground(new java.awt.Color(0, 51, 51));
        btnstep4.setForeground(new java.awt.Color(255, 255, 255));
        btnstep4.setText("Step 4");
        btnstep4.setToolTipText("Step 4 execute");
        btnstep4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnstep4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstep4ActionPerformed(evt);
            }
        });

        btnstep5.setBackground(new java.awt.Color(0, 51, 51));
        btnstep5.setForeground(new java.awt.Color(255, 255, 255));
        btnstep5.setText("Step 5");
        btnstep5.setToolTipText("Step 5 execute");
        btnstep5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnstep5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstep5ActionPerformed(evt);
            }
        });

        btnstep6.setBackground(new java.awt.Color(0, 51, 51));
        btnstep6.setForeground(new java.awt.Color(255, 255, 255));
        btnstep6.setText("Step 6");
        btnstep6.setToolTipText("Step 6 execute");
        btnstep6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnstep6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstep6ActionPerformed(evt);
            }
        });

        btnstep7.setBackground(new java.awt.Color(0, 51, 51));
        btnstep7.setForeground(new java.awt.Color(255, 255, 255));
        btnstep7.setText("Step 7");
        btnstep7.setToolTipText("Step 7 execute");
        btnstep7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnstep7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstep7ActionPerformed(evt);
            }
        });

        btnstep8.setBackground(new java.awt.Color(0, 51, 51));
        btnstep8.setForeground(new java.awt.Color(255, 255, 255));
        btnstep8.setText("Step 8");
        btnstep8.setToolTipText("Step 8 execute");
        btnstep8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnstep8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstep8ActionPerformed(evt);
            }
        });

        btnstep9.setBackground(new java.awt.Color(0, 51, 51));
        btnstep9.setForeground(new java.awt.Color(255, 255, 255));
        btnstep9.setText("Step 9");
        btnstep9.setToolTipText("Step 9 execute");
        btnstep9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnstep9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstep9ActionPerformed(evt);
            }
        });

        btnstep10.setBackground(new java.awt.Color(0, 51, 51));
        btnstep10.setForeground(new java.awt.Color(255, 255, 255));
        btnstep10.setText("Step 10");
        btnstep10.setToolTipText("Step 10 execute");
        btnstep10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnstep10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstep10ActionPerformed(evt);
            }
        });

        btnstep11.setBackground(new java.awt.Color(0, 51, 51));
        btnstep11.setForeground(new java.awt.Color(255, 255, 255));
        btnstep11.setText("Step 11");
        btnstep11.setToolTipText("Step 11 execute");
        btnstep11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnstep11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstep11ActionPerformed(evt);
            }
        });

        btnstep13.setBackground(new java.awt.Color(102, 0, 0));
        btnstep13.setForeground(new java.awt.Color(255, 255, 255));
        btnstep13.setText("Answer using Merge Sort");
        btnstep13.setToolTipText("Your Merge sort Answer");
        btnstep13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnstep13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstep13ActionPerformed(evt);
            }
        });

        txtaa.setEditable(false);
        txtaa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtaa.setForeground(new java.awt.Color(102, 0, 0));
        txtaa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtaa.setToolTipText("sorry, you cannot edit here");

        txtbb.setEditable(false);
        txtbb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtbb.setForeground(new java.awt.Color(102, 0, 0));
        txtbb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtbb.setToolTipText("sorry, you cannot edit here");

        txtcc.setEditable(false);
        txtcc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtcc.setForeground(new java.awt.Color(102, 0, 0));
        txtcc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcc.setToolTipText("sorry, you cannot edit here");

        txtdd.setEditable(false);
        txtdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtdd.setForeground(new java.awt.Color(102, 0, 0));
        txtdd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdd.setToolTipText("sorry, you cannot edit here");

        txtee.setEditable(false);
        txtee.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtee.setForeground(new java.awt.Color(102, 0, 0));
        txtee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtee.setToolTipText("sorry, you cannot edit here");

        btnstep12.setBackground(new java.awt.Color(0, 51, 51));
        btnstep12.setForeground(new java.awt.Color(255, 255, 255));
        btnstep12.setText("Step 12");
        btnstep12.setToolTipText("Step 12 execute");
        btnstep12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnstep12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstep12ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("~ Merge Sort ~");

        lbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/daa_sorting/6.png"))); // NOI18N

        lbl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/daa_sorting/6.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/daa_sorting/nclear.png"))); // NOI18N
        jLabel3.setToolTipText("Clear");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jLabel3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel3KeyPressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/daa_sorting/nclose.png"))); // NOI18N
        jLabel2.setToolTipText("Close");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel4.setText("(a)");

        jLabel5.setText("(b)");

        jLabel6.setText("(c)");

        jLabel7.setText("(d)");

        jLabel8.setText("(e)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnstep1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnstep2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnstep3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnstep4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnstep5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnstep6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbla, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtc1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtc2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtaa, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtbb, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtcc, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(txta2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                                            .addComponent(txta1)
                                                            .addComponent(txta))
                                                        .addGap(18, 18, 18))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jLabel4)
                                                        .addGap(31, 31, 31)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtb, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                                    .addComponent(txtb1)
                                                    .addComponent(txtb2)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jLabel5)
                                                        .addGap(12, 12, 12)))))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtc, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(12, 12, 12)))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtdd)
                                            .addComponent(txtd3, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                            .addComponent(txtd2)
                                            .addComponent(txtd)
                                            .addComponent(txtd1)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel7)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(19, 19, 19))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtee, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txte1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                                .addComponent(txte2)
                                                .addComponent(txte)
                                                .addComponent(txte3)))
                                        .addGap(50, 50, 50)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnstep7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnstep11, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnstep12, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnstep10, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnstep9, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnstep8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(34, 34, 34))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel8))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblb, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(btnstep13, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txta, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(txtb)
                            .addComponent(txtc)
                            .addComponent(txtd)
                            .addComponent(txte)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtcc)
                    .addComponent(txtee, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(txtdd, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtaa)
                    .addComponent(txtbb))
                .addGap(18, 18, 18)
                .addComponent(btnstep13)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnstep5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnstep1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txta1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                .addComponent(txtb1))
                            .addComponent(btnstep12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txta2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                .addComponent(txtb2))
                            .addComponent(btnstep2)
                            .addComponent(btnstep11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnstep3)
                                    .addComponent(btnstep10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txte1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtc1)
                                        .addComponent(txtd1))
                                    .addComponent(lbla, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtc2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnstep9)))
                            .addComponent(btnstep4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txte2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                .addComponent(txtd2))
                            .addComponent(btnstep8, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnstep7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txte3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtd3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnstep6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnstep1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstep1ActionPerformed
        
        if (txta.getText().isEmpty() || txtb.getText().isEmpty() || txtc.getText().isEmpty() || txtd.getText().isEmpty() || txte.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter 5 Numbers Please");
        }
        
        else {         
        btnstep2.setVisible(true);
        m1 = txta.getText(); 
        txta1.setText(m1);
        
        m2 = txtb.getText(); 
        txtb1.setText(m2);
        }
    }//GEN-LAST:event_btnstep1ActionPerformed

    private void btnstep2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstep2ActionPerformed
       
        btnstep3.setVisible(true);
        m1 = txta.getText(); 
        txta2.setText(m1);
        
        m2 = txtb.getText(); 
        txtb2.setText(m2);
    }//GEN-LAST:event_btnstep2ActionPerformed

    private void btnstep3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstep3ActionPerformed
       
        btnstep4.setVisible(true);
        m3 = txtc.getText(); 
        txtc1.setText(m3);
        
        m4 = txtd.getText(); 
        txtd1.setText(m4);
        
        m5 = txte.getText(); 
        txte1.setText(m5);
    }//GEN-LAST:event_btnstep3ActionPerformed

    private void btnstep4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstep4ActionPerformed
        
        btnstep5.setVisible(true);
        m3 = txtc.getText(); 
        txtc2.setText(m3);
    }//GEN-LAST:event_btnstep4ActionPerformed

    private void btnstep5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstep5ActionPerformed
        
        btnstep6.setVisible(true);
        m4 = txtd.getText(); 
        txtd2.setText(m4);
        
        m5 = txte.getText(); 
        txte2.setText(m5);
    }//GEN-LAST:event_btnstep5ActionPerformed

    private void btnstep6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstep6ActionPerformed
        
        btnstep7.setVisible(true);
        m4 = txtd.getText(); 
        txtd3.setText(m4);
        
        m5 = txte.getText(); 
        txte3.setText(m5);
    }//GEN-LAST:event_btnstep6ActionPerformed

    private void btnstep7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstep7ActionPerformed
        
        btnstep8.setVisible(true);
        txtd3.setText("");
        txte3.setText("");
        
        double em5 = Double.parseDouble(m5);
        double em4 = Double.parseDouble(m4);
        
        if(em4 > em5) {
            String eem4 = String.valueOf(em4);
            String eem5 = String.valueOf(em5);
            
            txtd3.setText(eem5);
            txte3.setText(eem4);
            txtd3.setForeground(Color.blue);
            txte3.setForeground(Color.magenta);
            lbl2.setVisible(true);
            lblb.setText(" changing ");
            lblb.setForeground(Color.red);
        }
        else {
            String eem4 = String.valueOf(em4);
            String eem5 = String.valueOf(em5);
            
            txtd3.setText(eem4);
            txte3.setText(eem5);
            txtd3.setForeground(Color.blue);
            txte3.setForeground(Color.magenta);
       
            lblb.setText(" No changing ");
        }
    }//GEN-LAST:event_btnstep7ActionPerformed

    private void btnstep8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstep8ActionPerformed
        
        btnstep9.setVisible(true);
        txtd2.setText("");
        txte2.setText("");
        
        double em5 = Double.parseDouble(m5);
        double em4 = Double.parseDouble(m4);
        
        if(em4 > em5) {
            String eem4 = String.valueOf(em4);
            String eem5 = String.valueOf(em5);
            
            txtd2.setText(eem5);
            txte2.setText(eem4);
            txtd2.setForeground(Color.blue);
            txte2.setForeground(Color.magenta);
        }
        else {
            String eem4 = String.valueOf(em4);
            String eem5 = String.valueOf(em5);
            
            txtd2.setText(eem4);
            txte2.setText(eem5);
            txtd2.setForeground(Color.blue);
            txte2.setForeground(Color.magenta);
        }
    }//GEN-LAST:event_btnstep8ActionPerformed

    private void btnstep9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstep9ActionPerformed
        
        btnstep10.setVisible(true);
        double step9 = Double.parseDouble(m3);
        String estep9 = String.valueOf(step9);
        
        txtc2.setText(estep9);
    }//GEN-LAST:event_btnstep9ActionPerformed

    private void btnstep10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstep10ActionPerformed
        
        btnstep11.setVisible(true);
        txtc1.setText("");
        txtd1.setText("");
        txte1.setText("");
        
        String step8d = txtd2.getText();
        String step8e = txte2.getText();
        String step9c = txtc2.getText();
        
        double estep8d = Double.parseDouble(step8d);
        double estep8e = Double.parseDouble(step8e);
        double estep9c = Double.parseDouble(step9c);
        
        if(estep9c < estep8d) {
            
            String s8d = String.valueOf(estep8d);
            String s8e = String.valueOf(estep8e);
            String s9c = String.valueOf(estep9c);
            
        txtc1.setText(s9c);
        txtd1.setText(s8d);
        txte1.setText(s8e);
        txtc1.setForeground(Color.blue);
        txtd1.setForeground(Color.magenta);
        txte1.setForeground(Color.red);
        }
        
        else {
            
            if(estep9c > estep8e ) {
            
            String s8d = String.valueOf(estep8d);
            String s8e = String.valueOf(estep8e);
            String s9c = String.valueOf(estep9c);
            
        txtc1.setText(s8d);
        txtd1.setText(s8e);
        txte1.setText(s9c);
        txtc1.setForeground(Color.blue);
        txtd1.setForeground(Color.magenta);
        txte1.setForeground(Color.red);
        }
            
            else {
                
            String s8d = String.valueOf(estep8d);
            String s8e = String.valueOf(estep8e);
            String s9c = String.valueOf(estep9c);
            
        txtc1.setText(s8d);
        txtd1.setText(s9c);
        txte1.setText(s8e);
        txtc1.setForeground(Color.blue);
        txtd1.setForeground(Color.magenta);
        txte1.setForeground(Color.red);       
            }    
        }
    }//GEN-LAST:event_btnstep10ActionPerformed

    private void btnstep11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstep11ActionPerformed
        
        btnstep12.setVisible(true);
        txta2.setText("");
        txtb2.setText("");
        
        double em1 = Double.parseDouble(m1);
        double em2 = Double.parseDouble(m2);
        
        if(em1 > em2) {
            String eem1 = String.valueOf(em1);
            String eem2 = String.valueOf(em2);
            
            txtb2.setText(eem1);
            txta2.setText(eem2);
            lbl1.setVisible(true);
            txtb2.setForeground(Color.blue);
            txta2.setForeground(Color.magenta);
            lbla.setText(" changing "); 
            lbla.setForeground(Color.red);  
        }
        else {
            String eem1 = String.valueOf(em1);
            String eem2 = String.valueOf(em2);
            
            txtb2.setText(eem2);
            txta2.setText(eem1);

            txtb2.setForeground(Color.blue);
            txta2.setForeground(Color.magenta);
            lbla.setText(" No changing ");
        }       
    }//GEN-LAST:event_btnstep11ActionPerformed

    private void btnstep13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstep13ActionPerformed

        String step10c = txtc1.getText();
        String step10d = txtd1.getText();
        String step10e = txte1.getText();
        
        String step10a = txta1.getText();
        String step10b = txtb1.getText();
        
        double estep10c = Double.parseDouble(step10c);
        double estep10d = Double.parseDouble(step10d);
        double estep10e = Double.parseDouble(step10e);
        double estep10a = Double.parseDouble(step10a);
        double estep10b = Double.parseDouble(step10b);  
        
        if(estep10a <= estep10c) {          
            if(estep10b <= estep10c) {
                
            String s10a = String.valueOf(estep10a);
            String s10b = String.valueOf(estep10b);
            String s10c = String.valueOf(estep10c);
            String s10d = String.valueOf(estep10d);
            String s10e = String.valueOf(estep10e);
            
            txtaa.setText(s10a);
            txtbb.setText(s10b);
            txtcc.setText(s10c);
            txtdd.setText(s10d);
            txtee.setText(s10e);     
            }
            
            else {
                    if (estep10b <= estep10d) {
                        
                        String s100a = String.valueOf(estep10a);
                        String s100b = String.valueOf(estep10b);
                        String s100c = String.valueOf(estep10c);
                        String s100d = String.valueOf(estep10d);
                        String s100e = String.valueOf(estep10e);
            
            txtaa.setText(s100a);
            txtbb.setText(s100c);
            txtcc.setText(s100b);
            txtdd.setText(s100d);
            txtee.setText(s100e);                              
                    }
                    
                    else {           
                        if (estep10b <= estep10e) {
                        
                        String s100a = String.valueOf(estep10a);
                        String s100b = String.valueOf(estep10b);
                        String s100c = String.valueOf(estep10c);
                        String s100d = String.valueOf(estep10d);
                        String s100e = String.valueOf(estep10e);
            
            txtaa.setText(s100a);
            txtbb.setText(s100c);
            txtcc.setText(s100d);
            txtdd.setText(s100b);
            txtee.setText(s100e); 
                    }
                    
                        else {
                        String s100a = String.valueOf(estep10a);
                        String s100b = String.valueOf(estep10b);
                        String s100c = String.valueOf(estep10c);
                        String s100d = String.valueOf(estep10d);
                        String s100e = String.valueOf(estep10e);
            
            txtaa.setText(s100a);
            txtbb.setText(s100c);
            txtcc.setText(s100d);
            txtdd.setText(s100e);
            txtee.setText(s100b);
                    }             
                }
            }
        }
        else {
            if (estep10a <= estep10d) {
                if (estep10b <= estep10d) {
                        String s100a = String.valueOf(estep10a);
                        String s100b = String.valueOf(estep10b);
                        String s100c = String.valueOf(estep10c);
                        String s100d = String.valueOf(estep10d);
                        String s100e = String.valueOf(estep10e);
            
            txtaa.setText(s100c);
            txtbb.setText(s100a);
            txtcc.setText(s100b);
            txtdd.setText(s100d);
            txtee.setText(s100e);
                }
                else {
                    if (estep10b <= estep10e) {
                        if (estep10e < estep10b) {
                        String s100a = String.valueOf(estep10a);
                        String s100b = String.valueOf(estep10b);
                        String s100c = String.valueOf(estep10c);
                        String s100d = String.valueOf(estep10d);
                        String s100e = String.valueOf(estep10e);
            
            txtaa.setText(s100c);
            txtbb.setText(s100a);
            txtcc.setText(s100d);
            txtdd.setText(s100b);
            txtee.setText(s100e);
                        }
                        
                        else {
                        String s100a = String.valueOf(estep10a);
                        String s100b = String.valueOf(estep10b);
                        String s100c = String.valueOf(estep10c);
                        String s100d = String.valueOf(estep10d);
                        String s100e = String.valueOf(estep10e);
            
            txtaa.setText(s100c);
            txtbb.setText(s100a);
            txtcc.setText(s100d);
            txtdd.setText(s100e);
            txtee.setText(s100b);
                        }                
                    }
                }
            }
            else {
                if (estep10a <= estep10e) {
                    if (estep10b <= estep10e) {
                        String s100a = String.valueOf(estep10a);
                        String s100b = String.valueOf(estep10b);
                        String s100c = String.valueOf(estep10c);
                        String s100d = String.valueOf(estep10d);
                        String s100e = String.valueOf(estep10e);
            
            txtaa.setText(s100c);
            txtbb.setText(s100d);
            txtcc.setText(s100a);
            txtdd.setText(s100b);
            txtee.setText(s100e);
                }
                    
                    else {
                        String s100a = String.valueOf(estep10a);
                        String s100b = String.valueOf(estep10b);
                        String s100c = String.valueOf(estep10c);
                        String s100d = String.valueOf(estep10d);
                        String s100e = String.valueOf(estep10e);
            
            txtaa.setText(s100c);
            txtbb.setText(s100d);
            txtcc.setText(s100a);
            txtdd.setText(s100e);
            txtee.setText(s100b);
                    }            
            } 
                else {
                     String s100a = String.valueOf(estep10a);
                        String s100b = String.valueOf(estep10b);
                        String s100c = String.valueOf(estep10c);
                        String s100d = String.valueOf(estep10d);
                        String s100e = String.valueOf(estep10e);
            
            txtaa.setText(s100c);
            txtbb.setText(s100d);
            txtcc.setText(s100e);
            txtdd.setText(s100a);
            txtee.setText(s100b);
                }
            }
        }       
    }//GEN-LAST:event_btnstep13ActionPerformed

    private void btnstep12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstep12ActionPerformed
        
        btnstep13.setVisible(true);
        txta1.setText("");
        txtb1.setText("");
        
        double em1 = Double.parseDouble(m1);
        double em2 = Double.parseDouble(m2);
        
        if(em1 > em2) {
            String eem1 = String.valueOf(em1);
            String eem2 = String.valueOf(em2);
            
            txtb1.setText(eem1);
            txta1.setText(eem2);
            txtb1.setForeground(Color.blue);
            txta1.setForeground(Color.magenta);
        }
        else {
            String eem1 = String.valueOf(em1);
            String eem2 = String.valueOf(em2);
            
            txtb1.setText(eem2);
            txta1.setText(eem1);
            txtb1.setForeground(Color.blue);
            txta1.setForeground(Color.magenta);
        }           
    }//GEN-LAST:event_btnstep12ActionPerformed

    private void jLabel3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel3KeyPressed
      
    }//GEN-LAST:event_jLabel3KeyPressed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       txta.setText("");
       txtb.setText("");
       txtc.setText("");
       txtd.setText("");
       txte.setText("");
       
       txta1.setText("");
       txta2.setText("");
       txtb1.setText("");
       txtb2.setText("");
       txtc1.setText("");
       txtc2.setText("");
       txtd1.setText("");
       txtd2.setText("");
       txtd3.setText("");
       txte1.setText("");
       txte2.setText("");
       txte3.setText("");
       txtaa.setText("");
       txtbb.setText("");
       txtcc.setText("");
       txtdd.setText("");
       txtee.setText("");
       
       lbl1.setVisible(false);
       lbl2.setVisible(false);
       
       lbla.setVisible(false);
       lblb.setVisible(false);
       
        btnstep2.setVisible(false);
        btnstep3.setVisible(false);
        btnstep4.setVisible(false);
        btnstep5.setVisible(false);
        btnstep6.setVisible(false);
        btnstep7.setVisible(false);
        btnstep8.setVisible(false);
        btnstep9.setVisible(false);
        btnstep10.setVisible(false);
        btnstep11.setVisible(false);
        btnstep12.setVisible(false);
        btnstep13.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void txtaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaKeyReleased
    
    }//GEN-LAST:event_txtaKeyReleased

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Merge_Sort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Merge_Sort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Merge_Sort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Merge_Sort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Merge_Sort().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnstep1;
    private javax.swing.JButton btnstep10;
    private javax.swing.JButton btnstep11;
    private javax.swing.JButton btnstep12;
    private javax.swing.JButton btnstep13;
    private javax.swing.JButton btnstep2;
    private javax.swing.JButton btnstep3;
    private javax.swing.JButton btnstep4;
    private javax.swing.JButton btnstep5;
    private javax.swing.JButton btnstep6;
    private javax.swing.JButton btnstep7;
    private javax.swing.JButton btnstep8;
    private javax.swing.JButton btnstep9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbla;
    private javax.swing.JLabel lblb;
    private javax.swing.JTextField txta;
    private javax.swing.JTextField txta1;
    private javax.swing.JTextField txta2;
    private javax.swing.JTextField txtaa;
    private javax.swing.JTextField txtb;
    private javax.swing.JTextField txtb1;
    private javax.swing.JTextField txtb2;
    private javax.swing.JTextField txtbb;
    private javax.swing.JTextField txtc;
    private javax.swing.JTextField txtc1;
    private javax.swing.JTextField txtc2;
    private javax.swing.JTextField txtcc;
    private javax.swing.JTextField txtd;
    private javax.swing.JTextField txtd1;
    private javax.swing.JTextField txtd2;
    private javax.swing.JTextField txtd3;
    private javax.swing.JTextField txtdd;
    private javax.swing.JTextField txte;
    private javax.swing.JTextField txte1;
    private javax.swing.JTextField txte2;
    private javax.swing.JTextField txte3;
    private javax.swing.JTextField txtee;
    // End of variables declaration//GEN-END:variables
}
