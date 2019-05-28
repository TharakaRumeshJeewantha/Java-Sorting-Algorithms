
package daa_sorting;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Insertion_Sort extends javax.swing.JFrame { 
    // create string variables for user inputs..
    String I1;
    String I2;
    String I3;
    String I4;
    String I5;

    public Insertion_Sort() {
        initComponents();     
        // some lables and buttons automatically hidden within form load 
        lbl1.setVisible(false);
        lbl2.setVisible(false);
        lbl3.setVisible(false);
        lbl4.setVisible(false);
        
        lbl21.setVisible(false);
        lbl31.setVisible(false);
        lbl32.setVisible(false);
        lbl41.setVisible(false);
        lbl42.setVisible(false);
        lbl43.setVisible(false);
        
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        
        ar1.setVisible(false);
        ar2.setVisible(false);
        ar3.setVisible(false);
        ar4.setVisible(false);      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt1 = new javax.swing.JTextField();
        txt111 = new javax.swing.JTextField();
        txt11 = new javax.swing.JTextField();
        txt11111 = new javax.swing.JTextField();
        txt22 = new javax.swing.JTextField();
        txt1111 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt222 = new javax.swing.JTextField();
        txt2222 = new javax.swing.JTextField();
        txt22222 = new javax.swing.JTextField();
        txt33333 = new javax.swing.JTextField();
        txt3333 = new javax.swing.JTextField();
        txt333 = new javax.swing.JTextField();
        txt33 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt44 = new javax.swing.JTextField();
        txt444 = new javax.swing.JTextField();
        txt4444 = new javax.swing.JTextField();
        txt44444 = new javax.swing.JTextField();
        txt55555 = new javax.swing.JTextField();
        txt5555 = new javax.swing.JTextField();
        txt555 = new javax.swing.JTextField();
        txt55 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        txt66 = new javax.swing.JTextField();
        txt666 = new javax.swing.JTextField();
        txt6666 = new javax.swing.JTextField();
        txt66666 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbla = new javax.swing.JLabel();
        lblb1 = new javax.swing.JLabel();
        lblc1 = new javax.swing.JLabel();
        lblc2 = new javax.swing.JLabel();
        lbld1 = new javax.swing.JLabel();
        lbld2 = new javax.swing.JLabel();
        lbld4 = new javax.swing.JLabel();
        lbld3 = new javax.swing.JLabel();
        lbl21 = new javax.swing.JLabel();
        lbl32 = new javax.swing.JLabel();
        lbl31 = new javax.swing.JLabel();
        lbl43 = new javax.swing.JLabel();
        lbl42 = new javax.swing.JLabel();
        lbl41 = new javax.swing.JLabel();
        ar1 = new javax.swing.JLabel();
        ar2 = new javax.swing.JLabel();
        ar3 = new javax.swing.JLabel();
        ar4 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(450, 60, 0, 0));
        setMaximumSize(new java.awt.Dimension(655, 590));
        setMinimumSize(new java.awt.Dimension(655, 590));
        setUndecorated(true);

        txt1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt1.setForeground(new java.awt.Color(0, 51, 0));
        txt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1.setToolTipText("Please Input your numbers only here");

        txt111.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt111.setForeground(new java.awt.Color(0, 51, 0));
        txt111.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt111.setToolTipText("Please Input your numbers only here");

        txt11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt11.setForeground(new java.awt.Color(0, 51, 0));
        txt11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt11.setToolTipText("Please Input your numbers only here");

        txt11111.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt11111.setForeground(new java.awt.Color(0, 51, 0));
        txt11111.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt11111.setToolTipText("Please Input your numbers only here");

        txt22.setEditable(false);
        txt22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt22.setToolTipText("you cannot edit here");

        txt1111.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt1111.setForeground(new java.awt.Color(0, 51, 0));
        txt1111.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1111.setToolTipText("Please Input your numbers only here");

        txt2.setEditable(false);
        txt2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2.setToolTipText("you cannot edit here");

        txt222.setEditable(false);
        txt222.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt222.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt222.setToolTipText("you cannot edit here");

        txt2222.setEditable(false);
        txt2222.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt2222.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2222.setToolTipText("you cannot edit here");

        txt22222.setEditable(false);
        txt22222.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt22222.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt22222.setToolTipText("you cannot edit here");

        txt33333.setEditable(false);
        txt33333.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt33333.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt33333.setToolTipText("you cannot edit here");

        txt3333.setEditable(false);
        txt3333.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt3333.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3333.setToolTipText("you cannot edit here");

        txt333.setEditable(false);
        txt333.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt333.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt333.setToolTipText("you cannot edit here");

        txt33.setEditable(false);
        txt33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt33.setToolTipText("you cannot edit here");

        txt3.setEditable(false);
        txt3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3.setToolTipText("you cannot edit here");

        txt4.setEditable(false);
        txt4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4.setToolTipText("you cannot edit here");

        txt44.setEditable(false);
        txt44.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt44.setToolTipText("you cannot edit here");

        txt444.setEditable(false);
        txt444.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt444.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt444.setToolTipText("you cannot edit here");

        txt4444.setEditable(false);
        txt4444.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt4444.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4444.setToolTipText("you cannot edit here");

        txt44444.setEditable(false);
        txt44444.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt44444.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt44444.setToolTipText("you cannot edit here");

        txt55555.setEditable(false);
        txt55555.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt55555.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt55555.setToolTipText("you cannot edit here");

        txt5555.setEditable(false);
        txt5555.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt5555.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5555.setToolTipText("you cannot edit here");

        txt555.setEditable(false);
        txt555.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt555.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt555.setToolTipText("you cannot edit here");

        txt55.setEditable(false);
        txt55.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt55.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt55.setToolTipText("you cannot edit here");

        txt5.setEditable(false);
        txt5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5.setToolTipText("you cannot edit here");

        txt6.setEditable(false);
        txt6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt6.setForeground(new java.awt.Color(102, 0, 0));
        txt6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6.setToolTipText("you cannot edit here");

        txt66.setEditable(false);
        txt66.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt66.setForeground(new java.awt.Color(102, 0, 0));
        txt66.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt66.setToolTipText("you cannot edit here");

        txt666.setEditable(false);
        txt666.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt666.setForeground(new java.awt.Color(102, 0, 0));
        txt666.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt666.setToolTipText("you cannot edit here");

        txt6666.setEditable(false);
        txt6666.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt6666.setForeground(new java.awt.Color(102, 0, 0));
        txt6666.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6666.setToolTipText("you cannot edit here");

        txt66666.setEditable(false);
        txt66666.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt66666.setForeground(new java.awt.Color(102, 0, 0));
        txt66666.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt66666.setToolTipText("you cannot edit here");

        jButton2.setBackground(new java.awt.Color(0, 51, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Step 1");
        jButton2.setToolTipText("Step 1 execute");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 51, 51));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Step 2");
        jButton3.setToolTipText("Step 2 execute");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 51, 51));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Step 3");
        jButton4.setToolTipText("Step 3 execute");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 51, 51));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Step 4");
        jButton5.setToolTipText("Step 4 execute");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(102, 0, 0));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Answer using Insertion Sort");
        jButton6.setToolTipText("Insertion Sort Answer for your number series");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel1.setText("~ Insertion Sort ~");

        lbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/daa_sorting/a2.png"))); // NOI18N

        lbl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/daa_sorting/a2.png"))); // NOI18N

        lbl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/daa_sorting/a2.png"))); // NOI18N

        lbl4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/daa_sorting/a2.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/daa_sorting/nclear.png"))); // NOI18N
        jLabel2.setToolTipText("Clear");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/daa_sorting/nclose.png"))); // NOI18N
        jLabel3.setToolTipText("Close");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        lbl21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/daa_sorting/a2.png"))); // NOI18N

        lbl32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/daa_sorting/a2.png"))); // NOI18N

        lbl31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/daa_sorting/a2.png"))); // NOI18N

        lbl43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/daa_sorting/a2.png"))); // NOI18N

        lbl42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/daa_sorting/a2.png"))); // NOI18N

        lbl41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/daa_sorting/a2.png"))); // NOI18N

        ar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/daa_sorting/aar2.png"))); // NOI18N

        ar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/daa_sorting/aar2.png"))); // NOI18N

        ar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/daa_sorting/aar2.png"))); // NOI18N

        ar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/daa_sorting/aar2.png"))); // NOI18N

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt66, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt666, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt6666, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt66666, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt4, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                            .addComponent(lbl31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lbl32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt44, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt5, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                            .addComponent(lbl41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lbl42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt55, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt555, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                    .addComponent(txt444, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt5555, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                    .addComponent(txt4444, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                    .addComponent(ar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt55555, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                    .addComponent(txt44444, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                    .addComponent(ar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txt2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txt22, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                                .addComponent(ar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(20, 20, 20)
                                                    .addComponent(jLabel4)
                                                    .addGap(17, 17, 17)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jLabel5)
                                                    .addGap(11, 11, 11)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt3, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                            .addComponent(lbl21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt33, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txt222, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt2222, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txt333, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt3333, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt33333, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt22222, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(ar2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt111, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(jLabel6)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt1111, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(jLabel7)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt11111, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(13, 13, 13)))))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbla, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbld1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblc1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblc2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbld4, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                        .addComponent(lbld2, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                        .addComponent(lbld3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addComponent(lblb1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt111, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt11111, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt1111, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt22, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt222, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt2222, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt22222, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbla)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jButton2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jButton3)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(ar1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt33, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt333, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt3333, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt33333, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(lblb1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbl2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(ar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt44, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt444, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt4444, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt44444, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(2, 2, 2)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jButton5)
                                .addGap(64, 64, 64)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbl32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbl31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(ar3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt55, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt555, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt5555, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt55555, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lbl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbl43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbl42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbl41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt66, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt666, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt6666, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt66666, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton6))
                                    .addComponent(ar4)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblc1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblc2)
                        .addGap(34, 34, 34)
                        .addComponent(lbld1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbld2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbld3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbld4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // user has empty txt fields then display error msg
        if (txt1.getText().isEmpty() || txt11.getText().isEmpty() || txt111.getText().isEmpty() || txt1111.getText().isEmpty() || txt11111.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter 5 Numbers Please");
        }
        else {
        // otherwise program execute..    
        ar1.setVisible(true);
        jButton3.setVisible(true);
              
        I1 = txt1.getText();
        I2 = txt11.getText();
        I3 = txt111.getText();
        I4 = txt1111.getText();
        I5 = txt11111.getText();
        
        double ss1 = Double.parseDouble(I1);
        double ss11 = Double.parseDouble(I2);
        
        // check index(a) & index(b) values
        if (ss1 < ss11) {
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            
            txt2.setText(sss1);           
            txt22.setText(sss11); 
            txt2.setForeground(Color.red);
            txt22.setForeground(Color.blue);
            lbla.setText(I1 +" < " + I2 + " ,No changing ");
            txt222.setText(I3); 
            txt2222.setText(I4); 
            txt22222.setText(I5);           
        }
        else {
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            
            txt2.setText(sss11);
            txt22.setText(sss1);
            lbl1.setVisible(true);
            txt2.setForeground(Color.red);
            txt22.setForeground(Color.blue);
            lbla.setText(I1 +" > " + I2 + " ,changing ");
            lbla.setForeground(Color.red);
            txt222.setText(I3); 
            txt2222.setText(I4); 
            txt22222.setText(I5);
            }
        }     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
             
        jButton4.setVisible(true);
        ar2.setVisible(true);
        
        I1 = txt2.getText();
        I2 = txt22.getText();
        I3 = txt111.getText();
        I4 = txt2222.getText();
        I5 = txt22222.getText();
        
        double ss1 = Double.parseDouble(I2);
        double ss11 = Double.parseDouble(I3);
        double ss111 = Double.parseDouble(I1);
        // check index(b) & index(c) values
        if (ss1 < ss11) {
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            
            txt3.setText(I1);
            txt3.setForeground(Color.red);
            txt33.setText(sss1);
            txt333.setText(sss11);
            txt33.setForeground(Color.red);
            txt333.setForeground(Color.blue);
            lblb1.setText(I2 +" < " + I3 + " ,No changing ");
            txt3333.setText(I4);
            txt33333.setText(I5);
        }
        else {
            // check index(a) & index(c) values
            if(ss111 > ss11) {
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            String sss111 = String.valueOf(ss111);
            
            txt3.setText(sss11);
            txt33.setText(sss111);
            txt333.setText(sss1); 
            lbl2.setVisible(true);
            txt3.setForeground(Color.red);
            txt33.setForeground(Color.red);
            txt333.setForeground(Color.blue);
            lbl21.setVisible(true);
            lblb1.setText(I1 +" > " + I3 + " ,changing " + I3 + " comming to first ");
            lblb1.setForeground(Color.red);
            txt3333.setText(I4);
            txt33333.setText(I5);
            
        }
            else {
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            String sss111 = String.valueOf(ss111);
            
            txt3.setText(sss111);
            txt33.setText(sss11);
            txt333.setText(sss1);
            lbl2.setVisible(true);
            txt3.setForeground(Color.red);
            txt33.setForeground(Color.red);
            txt333.setForeground(Color.blue);

            lblb1.setText(I3 +" > " + I1 + " ,changing " + I3 + " comming to second ");
            lblb1.setForeground(Color.red);
            txt3333.setText(I4);
            txt33333.setText(I5);
            }
        }        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
           
        jButton5.setVisible(true);
        ar3.setVisible(true);
        
        I1 = txt3.getText();
        I2 = txt33.getText();
        I3 = txt333.getText();
        I4 = txt1111.getText();
        I5 = txt33333.getText();
        
        double ss1 = Double.parseDouble(I1);
        double ss11 = Double.parseDouble(I2);
        double ss111 = Double.parseDouble(I3);
        double ss1111 = Double.parseDouble(I4);
        
        if (ss111 < ss1111) {
            //check index(c) & index(d) values
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            String sss111 = String.valueOf(ss111);
            String sss1111 = String.valueOf(ss1111);
            
            txt4.setText(sss1);
            txt44.setText(sss11);
            txt444.setText(sss111); 
            txt4444.setText(sss1111);
            txt4.setForeground(Color.red);
            txt44.setForeground(Color.red);
            txt444.setForeground(Color.red);
            txt4444.setForeground(Color.blue);
            lblc1.setText(I3 +" < " + I4 + " ,No changing ");
            txt44444.setText(I5);       
        }
        
        else {
            //check index(b) & index(d) values
            if(ss11 < ss1111) {
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            String sss111 = String.valueOf(ss111);
            String sss1111 = String.valueOf(ss1111);
            
            txt4.setText(sss1);
            txt44.setText(sss11);
            txt444.setText(sss1111); 
            txt4444.setText(sss111);
            lbl3.setVisible(true);
            txt4.setForeground(Color.red);
            txt44.setForeground(Color.red);
            txt444.setForeground(Color.red);
            txt4444.setForeground(Color.blue);

            lblc1.setText(I2 +" < " + I4 + " ,changing " + I4 + " comming to third ");
            lblc1.setForeground(Color.red);         
            }
            
            else {
            //check index(a) & index(d) values
                if(ss1 < ss1111) {
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            String sss111 = String.valueOf(ss111);
            String sss1111 = String.valueOf(ss1111);
            
            txt4.setText(sss1);
            txt44.setText(sss1111);
            txt444.setText(sss11); 
            txt4444.setText(sss111);
            lbl3.setVisible(true);
            txt4.setForeground(Color.red);
            txt44.setForeground(Color.red);
            txt444.setForeground(Color.red);
            txt4444.setForeground(Color.blue);
            lbl32.setVisible(true);

            lblc1.setText(I2 +" < " + I4 + " ,changing " + I4 + " comming to third ");
            lblc2.setText(I1 +" < " + I4 + " ,changing " + I4 + " comming to second ");
            lblc2.setForeground(Color.red);
            txt44444.setText(I5);
                }
                else
                {
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            String sss111 = String.valueOf(ss111);
            String sss1111 = String.valueOf(ss1111);
            
            txt4.setText(sss1111);
            txt44.setText(sss1);
            txt444.setText(sss11); 
            txt4444.setText(sss111);
            lbl3.setVisible(true);
            txt4.setForeground(Color.red);
            txt44.setForeground(Color.red);
            txt444.setForeground(Color.red);
            txt4444.setForeground(Color.blue);
            lbl31.setVisible(true);
            lbl32.setVisible(true);

            lblc1.setText(I2 +" < " + I4 + " ,changing " + I4 + " comming to third ");
            lblc2.setText(I1 +" > " + I4 + " ,changing " + I4 + " comming to first ");
            lblc2.setForeground(Color.red);
            txt44444.setText(I5);
                }
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        ar4.setVisible(true);
        jButton6.setVisible(true);
        
        I1 = txt4.getText();
        I2 = txt44.getText();
        I3 = txt444.getText();
        I4 = txt4444.getText();
        I5 = txt11111.getText();
        
        double ss1 = Double.parseDouble(I1);
        double ss11 = Double.parseDouble(I2);
        double ss111 = Double.parseDouble(I3);
        double ss1111 = Double.parseDouble(I4);
        double ss11111 = Double.parseDouble(I5);
        
        if ( ss1111 < ss11111 ) {
            //check index(d) & index(e) values
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            String sss111 = String.valueOf(ss111);
            String sss1111 = String.valueOf(ss1111);
            String sss11111 = String.valueOf(ss11111);
            
            txt5.setText(sss1);
            txt55.setText(sss11);
            txt555.setText(sss111); 
            txt5555.setText(sss1111);
            txt55555.setText(sss11111);
            txt5.setForeground(Color.red);
            txt55.setForeground(Color.red);
            txt555.setForeground(Color.red);
            txt5555.setForeground(Color.red);
            txt55555.setForeground(Color.red);
            lbld1.setText(I4 +" < " + I5 + " ,No changing ");
        }
        
        else {
            //check index(c) & index(e) values
            if( ss111 < ss11111 ) {
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            String sss111 = String.valueOf(ss111);
            String sss1111 = String.valueOf(ss1111);
            String sss11111 = String.valueOf(ss11111);
            
            txt5.setText(sss1);
            txt55.setText(sss11);
            txt555.setText(sss111); 
            txt5555.setText(sss11111);
            txt55555.setText(sss1111);
            lbl4.setVisible(true);
            txt5.setForeground(Color.red);
            txt55.setForeground(Color.red);
            txt555.setForeground(Color.red);
            txt5555.setForeground(Color.red);
            txt55555.setForeground(Color.red);

            lbld1.setText(I4 +" > " + I5 + " ,changing " + I5 + " comming to fourth ");
            lbld1.setForeground(Color.red);
            }
            
            else {
                //check index(b) & index(e) values
                if ( ss11 < ss11111 ) {
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            String sss111 = String.valueOf(ss111);
            String sss1111 = String.valueOf(ss1111);
            String sss11111 = String.valueOf(ss11111);
            
            txt5.setText(sss1);
            txt55.setText(sss11);
            txt555.setText(sss11111); 
            txt5555.setText(sss111);
            txt55555.setText(sss1111);
            lbl4.setVisible(true);
            txt5.setForeground(Color.red);
            txt55.setForeground(Color.red);
            txt555.setForeground(Color.red);
            txt5555.setForeground(Color.red);
            txt55555.setForeground(Color.red);
            lbl43.setVisible(true);

            lbld1.setText(I4 +" > " + I5 + " ,changing " + I5 + " comming to fourth ");
            lbld2.setText(I3 +" > " + I5 + " ,changing " + I5 + " comming to third ");
            lbld2.setForeground(Color.red);
                }
                
                else {
                   //check index(a) & index(e) values 
                    if ( ss1 < ss11111 ) {
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            String sss111 = String.valueOf(ss111);
            String sss1111 = String.valueOf(ss1111);
            String sss11111 = String.valueOf(ss11111);
            
            txt5.setText(sss1);
            txt55.setText(sss11111);
            txt555.setText(sss11); 
            txt5555.setText(sss111);
            txt55555.setText(sss1111);
            lbl4.setVisible(true);
            txt5.setForeground(Color.red);
            txt55.setForeground(Color.red);
            txt555.setForeground(Color.red);
            txt5555.setForeground(Color.red);
            txt55555.setForeground(Color.red);
            lbl43.setVisible(true);
            lbl42.setVisible(true);

            lbld1.setText(I4 +" > " + I5 + " ,changing " + I5 + " comming to fourth ");
            lbld2.setText(I3 +" > " + I5 + " ,changing " + I5 + " comming to third ");
            lbld4.setText(I2 +" > " + I5 + " ,changing " + I5 + " comming to second ");
            lbld4.setForeground(Color.red);
                    }
                    
                    else {
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            String sss111 = String.valueOf(ss111);
            String sss1111 = String.valueOf(ss1111);
            String sss11111 = String.valueOf(ss11111);
            
            txt5.setText(sss11111);
            txt55.setText(sss1);
            txt555.setText(sss11); 
            txt5555.setText(sss111);
            txt55555.setText(sss1111);
            lbl4.setVisible(true);
            txt5.setForeground(Color.red);
            txt55.setForeground(Color.red);
            txt555.setForeground(Color.red);
            txt5555.setForeground(Color.red);
            txt55555.setForeground(Color.red);
            lbl43.setVisible(true);
            lbl42.setVisible(true);
            lbl41.setVisible(true);

            lbld1.setText(I4 +" > " + I5 + " ,changing " + I5 + " comming to fourth ");
            lbld2.setText(I3 +" > " + I5 + " ,changing " + I5 + " comming to third ");
            lbld3.setText(I2 +" > " + I5 + " ,changing " + I5 + " comming to second ");
            lbld4.setText(I1 +" > " + I5 + " ,changing " + I5 + " comming to first ");
            lbld4.setForeground(Color.red);
                    }
                }
            }   
        }       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        I1 = txt5.getText();
        I2 = txt55.getText();
        I3 = txt555.getText();
        I4 = txt5555.getText();
        I5 = txt55555.getText();
        
        txt6.setText(I1);
        txt66.setText(I2);
        txt666.setText(I3);
        txt6666.setText(I4);
        txt66666.setText(I5);       
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // Reset to begin again..
        txt1.setText("");
        txt11.setText("");
        txt111.setText("");
        txt1111.setText("");
        txt11111.setText("");
        
        txt2.setText("");
        txt22.setText("");
        txt222.setText("");
        txt2222.setText("");
        txt22222.setText("");
        
        txt3.setText("");
        txt33.setText("");
        txt333.setText("");
        txt3333.setText("");
        txt33333.setText("");
        
        txt4.setText("");
        txt44.setText("");
        txt444.setText("");
        txt4444.setText("");
        txt44444.setText("");
        
        txt5.setText("");
        txt55.setText("");
        txt555.setText("");
        txt5555.setText("");
        txt55555.setText("");
        
        txt6.setText("");
        txt66.setText("");
        txt666.setText("");
        txt6666.setText("");
        txt66666.setText("");
        
        lbl1.setVisible(false);
        lbl2.setVisible(false);
        lbl3.setVisible(false);
        lbl4.setVisible(false);
        
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        
        lbla.setVisible(false);
        lblb1.setVisible(false);
        lblc1.setVisible(false);
        lblc2.setVisible(false);
        lbld1.setVisible(false);
        lbld2.setVisible(false);
        lbld3.setVisible(false);
        lbld4.setVisible(false);
        
        lbl21.setVisible(false);
        lbl31.setVisible(false);
        lbl32.setVisible(false);
        lbl41.setVisible(false);
        lbl42.setVisible(false);
        lbl43.setVisible(false);
        
        ar1.setVisible(false);
        ar2.setVisible(false);
        ar3.setVisible(false);
        ar4.setVisible(false);       
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // close and return to OS
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(Insertion_Sort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insertion_Sort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insertion_Sort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insertion_Sort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insertion_Sort().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ar1;
    private javax.swing.JLabel ar2;
    private javax.swing.JLabel ar3;
    private javax.swing.JLabel ar4;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
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
    private javax.swing.JLabel lbl21;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl31;
    private javax.swing.JLabel lbl32;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl41;
    private javax.swing.JLabel lbl42;
    private javax.swing.JLabel lbl43;
    private javax.swing.JLabel lbla;
    private javax.swing.JLabel lblb1;
    private javax.swing.JLabel lblc1;
    private javax.swing.JLabel lblc2;
    private javax.swing.JLabel lbld1;
    private javax.swing.JLabel lbld2;
    private javax.swing.JLabel lbld3;
    private javax.swing.JLabel lbld4;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt11;
    private javax.swing.JTextField txt111;
    private javax.swing.JTextField txt1111;
    private javax.swing.JTextField txt11111;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt22;
    private javax.swing.JTextField txt222;
    private javax.swing.JTextField txt2222;
    private javax.swing.JTextField txt22222;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt33;
    private javax.swing.JTextField txt333;
    private javax.swing.JTextField txt3333;
    private javax.swing.JTextField txt33333;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt44;
    private javax.swing.JTextField txt444;
    private javax.swing.JTextField txt4444;
    private javax.swing.JTextField txt44444;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt55;
    private javax.swing.JTextField txt555;
    private javax.swing.JTextField txt5555;
    private javax.swing.JTextField txt55555;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt66;
    private javax.swing.JTextField txt666;
    private javax.swing.JTextField txt6666;
    private javax.swing.JTextField txt66666;
    // End of variables declaration//GEN-END:variables
}
