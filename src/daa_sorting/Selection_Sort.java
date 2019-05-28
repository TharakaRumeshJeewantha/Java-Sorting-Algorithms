
package daa_sorting;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Selection_Sort extends javax.swing.JFrame {

    String s1;
    String s2;
    String s3;
    String s4;
    String s5;

    public Selection_Sort() {
        initComponents();
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(false);          
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        txt7 = new javax.swing.JTextField();
        txt8 = new javax.swing.JTextField();
        txt9 = new javax.swing.JTextField();
        txt101 = new javax.swing.JTextField();
        txte1 = new javax.swing.JTextField();
        txt121 = new javax.swing.JTextField();
        txt11 = new javax.swing.JTextField();
        txt22 = new javax.swing.JTextField();
        txt33 = new javax.swing.JTextField();
        txt44 = new javax.swing.JTextField();
        txt55 = new javax.swing.JTextField();
        txt66 = new javax.swing.JTextField();
        txt77 = new javax.swing.JTextField();
        txt88 = new javax.swing.JTextField();
        txt99 = new javax.swing.JTextField();
        txt102 = new javax.swing.JTextField();
        txte2 = new javax.swing.JTextField();
        txt122 = new javax.swing.JTextField();
        txt111 = new javax.swing.JTextField();
        txt222 = new javax.swing.JTextField();
        txt1111 = new javax.swing.JTextField();
        txt11111 = new javax.swing.JTextField();
        txt2222 = new javax.swing.JTextField();
        txt22222 = new javax.swing.JTextField();
        txt333 = new javax.swing.JTextField();
        txt3333 = new javax.swing.JTextField();
        txt33333 = new javax.swing.JTextField();
        txt444 = new javax.swing.JTextField();
        txt4444 = new javax.swing.JTextField();
        txt44444 = new javax.swing.JTextField();
        txt555 = new javax.swing.JTextField();
        txt5555 = new javax.swing.JTextField();
        txt55555 = new javax.swing.JTextField();
        txt666 = new javax.swing.JTextField();
        txt6666 = new javax.swing.JTextField();
        txt66666 = new javax.swing.JTextField();
        txt777 = new javax.swing.JTextField();
        txt7777 = new javax.swing.JTextField();
        txt77777 = new javax.swing.JTextField();
        txt888 = new javax.swing.JTextField();
        txt8888 = new javax.swing.JTextField();
        txt88888 = new javax.swing.JTextField();
        txt999 = new javax.swing.JTextField();
        txt9999 = new javax.swing.JTextField();
        txt99999 = new javax.swing.JTextField();
        txt103 = new javax.swing.JTextField();
        txt104 = new javax.swing.JTextField();
        txt105 = new javax.swing.JTextField();
        txte3 = new javax.swing.JTextField();
        txte4 = new javax.swing.JTextField();
        txte5 = new javax.swing.JTextField();
        txt123 = new javax.swing.JTextField();
        txt124 = new javax.swing.JTextField();
        txt125 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        txtas1 = new javax.swing.JTextField();
        txtas2 = new javax.swing.JTextField();
        txtas3 = new javax.swing.JTextField();
        txtas4 = new javax.swing.JTextField();
        txtas5 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(450, 0, 0, 0));
        setUndecorated(true);

        txt1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt1.setForeground(new java.awt.Color(0, 51, 0));
        txt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1.setToolTipText("Please Enter your number only here");

        txt2.setEditable(false);
        txt2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2.setToolTipText("You cannot edit this");

        txt3.setEditable(false);
        txt3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3.setToolTipText("You cannot edit this");

        txt4.setEditable(false);
        txt4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4.setToolTipText("You cannot edit this");

        txt5.setEditable(false);
        txt5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5.setToolTipText("You cannot edit this");

        txt6.setEditable(false);
        txt6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6.setToolTipText("You cannot edit this");

        txt7.setEditable(false);
        txt7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt7.setToolTipText("You cannot edit this");

        txt8.setEditable(false);
        txt8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt8.setToolTipText("You cannot edit this");

        txt9.setEditable(false);
        txt9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt9.setToolTipText("You cannot edit this");

        txt101.setEditable(false);
        txt101.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt101.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt101.setToolTipText("You cannot edit this");

        txte1.setEditable(false);
        txte1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txte1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txte1.setToolTipText("You cannot edit this");

        txt121.setEditable(false);
        txt121.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt121.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt121.setToolTipText("You cannot edit this");

        txt11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt11.setForeground(new java.awt.Color(0, 51, 0));
        txt11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt11.setToolTipText("Please Enter your number only here");

        txt22.setEditable(false);
        txt22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt22.setToolTipText("You cannot edit this");

        txt33.setEditable(false);
        txt33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt33.setToolTipText("You cannot edit this");

        txt44.setEditable(false);
        txt44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt44.setToolTipText("You cannot edit this");

        txt55.setEditable(false);
        txt55.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt55.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt55.setToolTipText("You cannot edit this");

        txt66.setEditable(false);
        txt66.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt66.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt66.setToolTipText("You cannot edit this");

        txt77.setEditable(false);
        txt77.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt77.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt77.setToolTipText("You cannot edit this");

        txt88.setEditable(false);
        txt88.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt88.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt88.setToolTipText("You cannot edit this");

        txt99.setEditable(false);
        txt99.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt99.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt99.setToolTipText("You cannot edit this");

        txt102.setEditable(false);
        txt102.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt102.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt102.setToolTipText("You cannot edit this");

        txte2.setEditable(false);
        txte2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txte2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txte2.setToolTipText("You cannot edit this");

        txt122.setEditable(false);
        txt122.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt122.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt122.setToolTipText("You cannot edit this");

        txt111.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt111.setForeground(new java.awt.Color(0, 51, 0));
        txt111.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt111.setToolTipText("Please Enter your number only here");

        txt222.setEditable(false);
        txt222.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt222.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt222.setToolTipText("You cannot edit this");

        txt1111.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt1111.setForeground(new java.awt.Color(0, 51, 0));
        txt1111.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1111.setToolTipText("Please Enter your number only here");

        txt11111.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt11111.setForeground(new java.awt.Color(0, 51, 0));
        txt11111.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt11111.setToolTipText("Please Enter your number only here");

        txt2222.setEditable(false);
        txt2222.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt2222.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2222.setToolTipText("You cannot edit this");

        txt22222.setEditable(false);
        txt22222.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt22222.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt22222.setToolTipText("You cannot edit this");

        txt333.setEditable(false);
        txt333.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt333.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt333.setToolTipText("You cannot edit this");

        txt3333.setEditable(false);
        txt3333.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt3333.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3333.setToolTipText("You cannot edit this");

        txt33333.setEditable(false);
        txt33333.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt33333.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt33333.setToolTipText("You cannot edit this");

        txt444.setEditable(false);
        txt444.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt444.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt444.setToolTipText("You cannot edit this");

        txt4444.setEditable(false);
        txt4444.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt4444.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4444.setToolTipText("You cannot edit this");

        txt44444.setEditable(false);
        txt44444.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt44444.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt44444.setToolTipText("You cannot edit this");

        txt555.setEditable(false);
        txt555.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt555.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt555.setToolTipText("You cannot edit this");

        txt5555.setEditable(false);
        txt5555.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt5555.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5555.setToolTipText("You cannot edit this");

        txt55555.setEditable(false);
        txt55555.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt55555.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt55555.setToolTipText("You cannot edit this");

        txt666.setEditable(false);
        txt666.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt666.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt666.setToolTipText("You cannot edit this");

        txt6666.setEditable(false);
        txt6666.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt6666.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6666.setToolTipText("You cannot edit this");

        txt66666.setEditable(false);
        txt66666.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt66666.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt66666.setToolTipText("You cannot edit this");

        txt777.setEditable(false);
        txt777.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt777.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt777.setToolTipText("You cannot edit this");

        txt7777.setEditable(false);
        txt7777.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt7777.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt7777.setToolTipText("You cannot edit this");

        txt77777.setEditable(false);
        txt77777.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt77777.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt77777.setToolTipText("You cannot edit this");

        txt888.setEditable(false);
        txt888.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt888.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt888.setToolTipText("You cannot edit this");

        txt8888.setEditable(false);
        txt8888.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt8888.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt8888.setToolTipText("You cannot edit this");

        txt88888.setEditable(false);
        txt88888.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt88888.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt88888.setToolTipText("You cannot edit this");

        txt999.setEditable(false);
        txt999.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt999.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt999.setToolTipText("You cannot edit this");

        txt9999.setEditable(false);
        txt9999.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt9999.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt9999.setToolTipText("You cannot edit this");

        txt99999.setEditable(false);
        txt99999.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt99999.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt99999.setToolTipText("You cannot edit this");

        txt103.setEditable(false);
        txt103.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt103.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt103.setToolTipText("You cannot edit this");

        txt104.setEditable(false);
        txt104.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt104.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt104.setToolTipText("You cannot edit this");

        txt105.setEditable(false);
        txt105.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt105.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt105.setToolTipText("You cannot edit this");

        txte3.setEditable(false);
        txte3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txte3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txte3.setToolTipText("You cannot edit this");

        txte4.setEditable(false);
        txte4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txte4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txte4.setToolTipText("You cannot edit this");

        txte5.setEditable(false);
        txte5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txte5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txte5.setToolTipText("You cannot edit this");

        txt123.setEditable(false);
        txt123.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt123.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt123.setToolTipText("You cannot edit this");

        txt124.setEditable(false);
        txt124.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt124.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt124.setToolTipText("You cannot edit this");

        txt125.setEditable(false);
        txt125.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt125.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt125.setToolTipText("You cannot edit this");

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Step 1");
        jButton1.setToolTipText("Step 1 execute");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 51, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Step 2");
        jButton2.setToolTipText("Step 2 execute");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 51, 51));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Step 3");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 51, 51));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Step 4");
        jButton4.setToolTipText("Step 4 execute");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 51, 51));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Step 5");
        jButton5.setToolTipText("Step 5 execute");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 51, 51));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Step 6");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 51, 51));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Step 7");
        jButton7.setToolTipText("Step 7 execute");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 51, 51));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Step 8");
        jButton8.setToolTipText("Step 8 execute");
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 51, 51));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Step 9");
        jButton9.setToolTipText("Step 9 execute");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(0, 51, 51));
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Step 10");
        jButton10.setToolTipText("Step 10 execute");
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        txtas1.setEditable(false);
        txtas1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtas1.setForeground(new java.awt.Color(102, 0, 0));
        txtas1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtas1.setToolTipText("You cannot edit this");

        txtas2.setEditable(false);
        txtas2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtas2.setForeground(new java.awt.Color(102, 0, 0));
        txtas2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtas2.setToolTipText("You cannot edit this");

        txtas3.setEditable(false);
        txtas3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtas3.setForeground(new java.awt.Color(102, 0, 0));
        txtas3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtas3.setToolTipText("You cannot edit this");

        txtas4.setEditable(false);
        txtas4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtas4.setForeground(new java.awt.Color(102, 0, 0));
        txtas4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtas4.setToolTipText("You cannot edit this");

        txtas5.setEditable(false);
        txtas5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtas5.setForeground(new java.awt.Color(102, 0, 0));
        txtas5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtas5.setToolTipText("You cannot edit this");

        jButton11.setBackground(new java.awt.Color(102, 0, 0));
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Answer using Selection Sort");
        jButton11.setToolTipText("Please Enter your nukmber here");
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(0, 51, 51));
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Step 11");
        jButton12.setToolTipText("Step 11 execute");
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("~ Selection Sort ~");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/daa_sorting/nclear.png"))); // NOI18N
        jLabel2.setToolTipText("Clear");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jLabel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel2KeyPressed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtas1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                    .addComponent(txt2)
                                    .addComponent(txt1)
                                    .addComponent(txt3)
                                    .addComponent(txt4)
                                    .addComponent(txt5)
                                    .addComponent(txt6)
                                    .addComponent(txt7)
                                    .addComponent(txt8)
                                    .addComponent(txt9)
                                    .addComponent(txt101)
                                    .addComponent(txte1)
                                    .addComponent(txt121))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt11, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                    .addComponent(txt22)
                                    .addComponent(txt33)
                                    .addComponent(txt44)
                                    .addComponent(txt55)
                                    .addComponent(txt66)
                                    .addComponent(txt77)
                                    .addComponent(txt88)
                                    .addComponent(txt99)
                                    .addComponent(txt102)
                                    .addComponent(txte2)
                                    .addComponent(txt122)
                                    .addComponent(txtas2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt111, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                            .addComponent(txt222)
                                            .addComponent(txt333)
                                            .addComponent(txt444)
                                            .addComponent(txt555)
                                            .addComponent(txt666)
                                            .addComponent(txt777)
                                            .addComponent(txt888)
                                            .addComponent(txt999)
                                            .addComponent(txt103)
                                            .addComponent(txte3)
                                            .addComponent(txt123))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt1111, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                            .addComponent(txt2222)
                                            .addComponent(txt3333)
                                            .addComponent(txt4444)
                                            .addComponent(txt5555)
                                            .addComponent(txt6666)
                                            .addComponent(txt7777)
                                            .addComponent(txt8888)
                                            .addComponent(txt9999)
                                            .addComponent(txt104)
                                            .addComponent(txte4)
                                            .addComponent(txt124))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt11111, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                            .addComponent(txt22222)
                                            .addComponent(txt33333)
                                            .addComponent(txt44444)
                                            .addComponent(txt55555)
                                            .addComponent(txt66666)
                                            .addComponent(txt77777)
                                            .addComponent(txt88888)
                                            .addComponent(txt99999)
                                            .addComponent(txt105)
                                            .addComponent(txte5)
                                            .addComponent(txt125)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtas3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtas4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtas5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(lbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt11111, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(txt1111)
                            .addComponent(txt111)
                            .addComponent(txt11)
                            .addComponent(txt1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                    .addGroup(layout.createSequentialGroup()
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                            .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                    .addGroup(layout.createSequentialGroup()
                                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                            .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                    .addGroup(layout.createSequentialGroup()
                                                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                            .addComponent(txt22222)
                                                                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(txt22, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(txt222, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                            .addComponent(txt2222)
                                                                                                            .addComponent(lbl1, javax.swing.GroupLayout.Alignment.TRAILING))
                                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                                .addComponent(txt33333, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                                                                                                .addComponent(txt3333)
                                                                                                                .addComponent(txt333)
                                                                                                                .addComponent(txt3)
                                                                                                                .addComponent(txt33))
                                                                                                            .addComponent(lbl2)))
                                                                                                    .addGroup(layout.createSequentialGroup()
                                                                                                        .addComponent(jButton1)
                                                                                                        .addGap(28, 28, 28)
                                                                                                        .addComponent(jButton2)))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                        .addComponent(txt44444, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                                                                                        .addComponent(txt4444)
                                                                                                        .addComponent(txt44)
                                                                                                        .addComponent(txt4)
                                                                                                        .addComponent(txt444, javax.swing.GroupLayout.Alignment.TRAILING))
                                                                                                    .addComponent(lbl3)))
                                                                                            .addComponent(jButton3))
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                .addComponent(txt55555, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                                                                                .addComponent(txt5555)
                                                                                                .addComponent(txt555)
                                                                                                .addComponent(txt55)
                                                                                                .addComponent(txt5))
                                                                                            .addComponent(lbl4)))
                                                                                    .addComponent(jButton4))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(txt66666, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                                                                        .addComponent(txt6666)
                                                                                        .addComponent(txt666)
                                                                                        .addComponent(txt66)
                                                                                        .addComponent(txt6))
                                                                                    .addComponent(lbl5)))
                                                                            .addComponent(jButton5))
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(txt77777, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                                                                .addComponent(txt7777)
                                                                                .addComponent(txt777)
                                                                                .addComponent(txt77)
                                                                                .addComponent(txt7))
                                                                            .addComponent(lbl6)))
                                                                    .addComponent(jButton6))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(txt88888, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                                                        .addComponent(txt8888)
                                                                        .addComponent(txt888)
                                                                        .addComponent(txt88)
                                                                        .addComponent(txt8))
                                                                    .addComponent(lbl7)))
                                                            .addComponent(jButton7))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(txt99999, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                                                .addComponent(txt9999)
                                                                .addComponent(txt999)
                                                                .addComponent(txt99)
                                                                .addComponent(txt9))
                                                            .addComponent(lbl8)))
                                                    .addComponent(jButton8))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txt105, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                                        .addComponent(txt104)
                                                        .addComponent(txt103)
                                                        .addComponent(txt102)
                                                        .addComponent(txt101))
                                                    .addComponent(lbl9)))
                                            .addComponent(jButton9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txte5, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                                .addComponent(txte4)
                                                .addComponent(txte3)
                                                .addComponent(txte2)
                                                .addComponent(txte1))
                                            .addComponent(lbl10)))
                                    .addComponent(jButton10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt121, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                        .addComponent(txt122)
                                        .addComponent(txt123)
                                        .addComponent(txt124)
                                        .addComponent(txt125))
                                    .addComponent(lbl11)))
                            .addComponent(jButton12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtas1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtas2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtas3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtas4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtas5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton11)))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if (txt1.getText().isEmpty() || txt11.getText().isEmpty() || txt111.getText().isEmpty() || txt1111.getText().isEmpty() || txt11111.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter 5 Numbers Please");
        }
        
        else {
            
        jButton2.setVisible(true);
        s1 = txt1.getText();
        s2 = txt11.getText();
        s3 = txt111.getText();
        s4 = txt1111.getText();
        s5 = txt11111.getText();
        
        double ss1 = Double.parseDouble(s1);
        double ss11 = Double.parseDouble(s2);
        
        if (ss1 <= ss11) {
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            
            txt2.setText(sss1);
            txt22.setText(sss11);
            txt2.setForeground(Color.blue);
            txt22.setForeground(Color.magenta);
            txt222.setText(s3);
            txt2222.setText(s4);
            txt22222.setText(s5);
            
            lbl1.setText(s1 +" < " + s2 + " ,No changing ");
        }
        else {
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            
            txt2.setText(sss11);
            txt22.setText(sss1);
            txt2.setForeground(Color.blue);
            txt22.setForeground(Color.magenta);
            lbl1.setText(s1 +" > "+ s2 + " ,changing ");
            lbl1.setForeground(Color.red);
            txt222.setText(s3);
            txt2222.setText(s4);
            txt22222.setText(s5);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        jButton3.setVisible(true);
        s1 = txt2.getText();
        s2 = txt22.getText();
        s3 = txt111.getText();
        s4 = txt1111.getText();
        s5 = txt11111.getText();
        
        double ss1 = Double.parseDouble(s2);
        double ss11 = Double.parseDouble(s3);
        
        if (ss1 < ss11) {
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            
            txt3.setText(s1);
            txt33.setText(sss1);
            txt333.setText(sss11);
            txt33.setForeground(Color.blue);
            txt333.setForeground(Color.magenta);
            lbl2.setText(s2 +" < " + s3 + " ,No changing ");
            txt3333.setText(s4);
            txt33333.setText(s5);
        }
        else {
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            
            txt3.setText(s1);
            txt33.setText(sss11);
            txt333.setText(sss1);
            txt33.setForeground(Color.blue);
            txt333.setForeground(Color.magenta);
            lbl2.setText(s2 +" > "+ s3 + " ,changing ");
            lbl2.setForeground(Color.red);
            txt3333.setText(s4);
            txt33333.setText(s5);
        }   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        jButton4.setVisible(true);
        s1 = txt3.getText();
        s2 = txt33.getText();
        s3 = txt333.getText();
        s4 = txt1111.getText();
        s5 = txt11111.getText();
        
        double ss1 = Double.parseDouble(s3);
        double ss11 = Double.parseDouble(s4);
        
        if (ss1 < ss11) {
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            
            txt4.setText(s1);
            txt44.setText(s2);
            txt444.setText(sss1);
            txt4444.setText(sss11);
            txt444.setForeground(Color.blue);
            txt4444.setForeground(Color.magenta);
            lbl3.setText(s3 +" < " + s4 + " ,No changing ");
            txt44444.setText(s5);
        }
        else {
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            
            txt4.setText(s1);
            txt44.setText(s2);
            txt444.setText(sss11);
            txt4444.setText(sss1);
            txt444.setForeground(Color.blue);
            txt4444.setForeground(Color.magenta);
            lbl3.setText(s3 +" > "+ s4 + " ,changing ");
            lbl3.setForeground(Color.red);
            txt44444.setText(s5);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        jButton5.setVisible(true);
        s1 = txt4.getText();
        s2 = txt44.getText();
        s3 = txt444.getText();
        s4 = txt4444.getText();
        s5 = txt11111.getText();
        
        double ss1 = Double.parseDouble(s4);
        double ss11 = Double.parseDouble(s5);
        
        if (ss1 < ss11) {
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            
            txt5.setText(s1);
            txt55.setText(s2);
            txt555.setText(s3);
            txt5555.setText(sss1);
            txt55555.setText(sss11);
            txt5555.setForeground(Color.blue);
            txt55555.setForeground(Color.red);
            lbl4.setText(s4 +" < " + s5 + " ,No changing ");
        }
        else {
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            
            txt5.setText(s1);
            txt55.setText(s2);
            txt555.setText(s3);
            txt5555.setText(sss11);
            txt55555.setText(sss1);
            txt5555.setForeground(Color.blue);
            txt55555.setForeground(Color.red);
            lbl4.setText(s4 +" > "+ s5 + " ,changing ");
            lbl4.setForeground(Color.red);
        }     
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      
        jButton6.setVisible(true);
        s1 = txt5.getText();
        s2 = txt55.getText();
        s3 = txt555.getText();
        s4 = txt5555.getText();
        s5 = txt55555.getText();
        
        double ss1 = Double.parseDouble(s1);
        double ss11 = Double.parseDouble(s2);
        
        if (ss1 < ss11) {
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            
            txt6.setText(s1);
            txt66.setText(s2);
            txt6.setForeground(Color.blue);
            txt66.setForeground(Color.magenta);
            lbl5.setText(s1 +" < " + s2 + " ,No changing ");
            txt666.setText(s3);
            txt6666.setText(s4);
            txt66666.setText(s5);
            txt66666.setForeground(Color.red);         
        }
        else {
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            
            txt6.setText(s2);
            txt66.setText(s1);
            txt6.setForeground(Color.blue);
            txt66.setForeground(Color.magenta);
            lbl5.setText(s1 +" > "+ s2 + " ,changing ");
            lbl5.setForeground(Color.red);
            txt666.setText(s3);
            txt6666.setText(s4);
            txt66666.setText(s5);
            txt66666.setForeground(Color.red);        
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        jButton7.setVisible(true);
        s1 = txt6.getText();
        s2 = txt66.getText();
        s3 = txt555.getText();
        s4 = txt6666.getText();
        s5 = txt66666.getText();
        
        double ss1 = Double.parseDouble(s2);
        double ss11 = Double.parseDouble(s3);
        
        if (ss1 < ss11) {
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            
            txt7.setText(s1);
            txt77.setText(sss1);
            txt777.setText(sss11);
            txt77.setForeground(Color.blue);
            txt777.setForeground(Color.magenta);
            lbl6.setText(s2 +" < " + s3 + " ,No changing ");
            txt7777.setText(s4);
            txt77777.setText(s5);
            txt77777.setForeground(Color.red);    
        }
        else {
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            
            txt7.setText(s1);
            txt77.setText(sss11);
            txt777.setText(sss1); 
            txt77.setForeground(Color.blue);
            txt777.setForeground(Color.magenta);
            lbl6.setText(s2 +" > "+ s3 + " ,changing ");
            lbl6.setForeground(Color.red);
            txt7777.setText(s4);
            txt77777.setText(s5);
            txt77777.setForeground(Color.red);
        }    
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        jButton8.setVisible(true);
        s1 = txt7.getText();
        s2 = txt77.getText();
        s3 = txt777.getText();
        s4 = txt5555.getText();
        s5 = txt77777.getText();
        
        double ss1 = Double.parseDouble(s3);
        double ss11 = Double.parseDouble(s4);
        
        if (ss1 < ss11) {
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            
            txt8.setText(s1);
            txt88.setText(s2);
            txt888.setText(sss1);
            txt8888.setText(sss11);
            txt888.setForeground(Color.blue);
            txt8888.setForeground(Color.magenta);
            lbl7.setText(s3 +" < " + s4 + " ,No changing ");
            txt88888.setText(s5);
            txt88888.setForeground(Color.red);          
        }
        else {
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            
            txt8.setText(s1);
            txt88.setText(s2);
            txt888.setText(sss11);
            txt8888.setText(sss1);
            txt888.setForeground(Color.blue);
            txt8888.setForeground(Color.magenta);
            lbl7.setText(s3 +" > "+ s4 + " ,changing ");
            lbl7.setForeground(Color.red);
            txt88888.setText(s5);
            txt88888.setForeground(Color.red);
        }      
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        jButton9.setVisible(true);
        s1 = txt8.getText();
        s2 = txt88.getText();
        s3 = txt888.getText();
        s4 = txt8888.getText();
        s5 = txt55555.getText();
        
        double ss1 = Double.parseDouble(s4);
        double ss11 = Double.parseDouble(s5);
        
        if (ss1 < ss11) {
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            
            txt9.setText(s1);
            txt99.setText(s2);
            txt999.setText(s3);
            txt9999.setText(sss1);
            txt99999.setText(sss11);
            txt9999.setForeground(Color.red);
            txt99999.setForeground(Color.red);
            lbl8.setText(s4 +" < " + s5 + " ,No changing ");
        }
        else {
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            
            txt9.setText(s1);
            txt99.setText(s2);
            txt999.setText(s3);
            txt9999.setText(sss11);
            txt99999.setText(sss1);
            txt9999.setForeground(Color.red);
            txt99999.setForeground(Color.red);
            lbl8.setText(s4 +" > "+ s5 + " ,changing ");
            lbl8.setForeground(Color.red);
        }     
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       
        jButton10.setVisible(true);
        s1 = txt9.getText();
        s2 = txt99.getText();
        s3 = txt999.getText();
        s4 = txt9999.getText();
        s5 = txt99999.getText();
        
        double ss1 = Double.parseDouble(s1);
        double ss11 = Double.parseDouble(s2);
        
        if (ss1 < ss11) {
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            
            txt101.setText(sss1);
            txt102.setText(sss11);
            txt101.setForeground(Color.blue);
            txt102.setForeground(Color.magenta);
            lbl9.setText(s1 +" < " + s2 + " ,No changing ");
            txt103.setText(s3);
            txt104.setText(s4);
            txt105.setText(s5);
            txt105.setForeground(Color.red);
            txt104.setForeground(Color.red);
        }
        else {
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            
            txt101.setText(sss11);
            txt102.setText(sss1);
            txt101.setForeground(Color.blue);
            txt102.setForeground(Color.magenta);
            lbl9.setText(s1 +" > "+ s2 + " ,changing ");
            lbl9.setForeground(Color.red);
            txt103.setText(s3);
            txt104.setText(s4);
            txt105.setText(s5);
            txt105.setForeground(Color.red);
            txt104.setForeground(Color.red);
        }       
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       
        jButton12.setVisible(true);
        s1 = txt101.getText();
        s2 = txt102.getText();
        s3 = txt999.getText();
        s4 = txt9999.getText();
        s5 = txt99999.getText();
        
        double ss1 = Double.parseDouble(s2);
        double ss11 = Double.parseDouble(s3);
        
        if (ss1 < ss11) {
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            
            txte1.setText(s1);
            txte2.setText(sss1);
            txte3.setText(sss11);
            txte2.setForeground(Color.blue);
            txte3.setForeground(Color.red);
            lbl10.setText(s2 +" < " + s3 + " ,No changing ");
            txte4.setText(s4);
            txte5.setText(s5);
            txte5.setForeground(Color.red);
            txte4.setForeground(Color.red);
        }
        else {
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            
            txte1.setText(s1);
            txte2.setText(sss11);
            txte3.setText(sss1);
            txte2.setForeground(Color.blue);
            txte3.setForeground(Color.red);
            lbl10.setText(s2 +" > "+ s3 + " ,changing ");
            lbl10.setForeground(Color.red);
            txte4.setText(s4);
            txte5.setText(s5);
            txte5.setForeground(Color.red);
            txte4.setForeground(Color.red);
        }     
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        
        s1 = txte1.getText();
        s2 = txte2.getText();
        s3 = txte3.getText();
        s4 = txt9999.getText();
        s5 = txt99999.getText();
        
        double ss1 = Double.parseDouble(s1);
        double ss11 = Double.parseDouble(s2);
        
        if (ss1 < ss11) {
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            
            txtas1.setText(sss1);
            txtas2.setText(sss11);
            txtas3.setText(s3);
            txtas4.setText(s4);
            txtas5.setText(s5);         
        }
        else {
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            
            txtas1.setText(sss11);
            txtas2.setText(sss1);
            txtas3.setText(s3);
            txtas4.setText(s4);
            txtas5.setText(s5);         
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        
        jButton11.setVisible(true);
        s1 = txte1.getText();
        s2 = txte2.getText();
        s3 = txte3.getText();
        s4 = txte4.getText();
        s5 = txte5.getText();
        
        
        double ss1 = Double.parseDouble(s1);
        double ss11 = Double.parseDouble(s2);
        
        if (ss1 < ss11) {
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            
            txt121.setText(sss1);
            txt122.setText(sss11);
            txt121.setForeground(Color.red);
            txt122.setForeground(Color.red);
            lbl11.setText(s1 +" < " + s2 + " ,No changing ");
            txt123.setText(s3);
            txt124.setText(s4);
            txt125.setText(s5);
            txt125.setForeground(Color.red);
            txt124.setForeground(Color.red);
            txt123.setForeground(Color.red);        
        }
        else {
            String sss1 = String.valueOf(ss1);
            String sss11 = String.valueOf(ss11);
            
            txt121.setText(sss11);
            txt122.setText(sss1);
            txt121.setForeground(Color.red);
            txt122.setForeground(Color.red);
            lbl11.setText(s1 +" > "+ s2 + " ,changing ");
            lbl11.setForeground(Color.red);
            txt123.setText(s3);
            txt124.setText(s4);
            txt125.setText(s5);
            txt125.setForeground(Color.red);
            txt124.setForeground(Color.red);
            txt123.setForeground(Color.red);
        }    
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jLabel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel2KeyPressed
        
    }//GEN-LAST:event_jLabel2KeyPressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
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
        
        txt7.setText("");
        txt77.setText("");
        txt777.setText("");
        txt7777.setText("");
        txt77777.setText("");
        
        txt8.setText("");
        txt88.setText("");
        txt888.setText("");
        txt8888.setText("");
        txt88888.setText("");
        
        txt9.setText("");
        txt99.setText("");
        txt999.setText("");
        txt9999.setText("");
        txt99999.setText("");
        
        txt101.setText("");
        txt102.setText("");
        txt103.setText("");
        txt104.setText("");
        txt105.setText("");
        
        txte1.setText("");
        txte2.setText("");
        txte3.setText("");
        txte4.setText("");
        txte5.setText("");
        
        txt121.setText("");
        txt122.setText("");
        txt123.setText("");
        txt124.setText("");
        txt125.setText("");
        
        txtas1.setText("");
        txtas2.setText("");
        txtas3.setText("");
        txtas4.setText("");
        txtas5.setText("");
        
        lbl1.setText("");
        lbl2.setText("");
        lbl3.setText("");
        lbl4.setText("");
        lbl5.setText("");
        lbl6.setText("");
        lbl7.setText("");
        lbl8.setText("");
        lbl9.setText("");
        lbl10.setText("");
        lbl11.setText(""); 
        
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(false);     
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
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
            java.util.logging.Logger.getLogger(Selection_Sort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selection_Sort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selection_Sort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selection_Sort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selection_Sort().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt101;
    private javax.swing.JTextField txt102;
    private javax.swing.JTextField txt103;
    private javax.swing.JTextField txt104;
    private javax.swing.JTextField txt105;
    private javax.swing.JTextField txt11;
    private javax.swing.JTextField txt111;
    private javax.swing.JTextField txt1111;
    private javax.swing.JTextField txt11111;
    private javax.swing.JTextField txt121;
    private javax.swing.JTextField txt122;
    private javax.swing.JTextField txt123;
    private javax.swing.JTextField txt124;
    private javax.swing.JTextField txt125;
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
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt77;
    private javax.swing.JTextField txt777;
    private javax.swing.JTextField txt7777;
    private javax.swing.JTextField txt77777;
    private javax.swing.JTextField txt8;
    private javax.swing.JTextField txt88;
    private javax.swing.JTextField txt888;
    private javax.swing.JTextField txt8888;
    private javax.swing.JTextField txt88888;
    private javax.swing.JTextField txt9;
    private javax.swing.JTextField txt99;
    private javax.swing.JTextField txt999;
    private javax.swing.JTextField txt9999;
    private javax.swing.JTextField txt99999;
    private javax.swing.JTextField txtas1;
    private javax.swing.JTextField txtas2;
    private javax.swing.JTextField txtas3;
    private javax.swing.JTextField txtas4;
    private javax.swing.JTextField txtas5;
    private javax.swing.JTextField txte1;
    private javax.swing.JTextField txte2;
    private javax.swing.JTextField txte3;
    private javax.swing.JTextField txte4;
    private javax.swing.JTextField txte5;
    // End of variables declaration//GEN-END:variables
}
