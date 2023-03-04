package com.raven.symtoms;

import com.raven.button.Button;
import com.raven.main.Main;

import java.awt.Color;
import javax.swing.JRadioButton;


public class symp1 extends javax.swing.JPanel {
    Main main = new Main();
    public  int count1 = 0;
    public static int count2 = 0;
    public  int count3 = 0;
    
    private static boolean[][] button_array = 
    {
        {false, false, false, false},
        {false, false, false, false},
        {false, false, false, false},
        {false, false, false, false}
    };
    
    private static boolean[][] rad_button_array = 
    {
        {true, true, true, true},
        {true, true, true, true},
    };

    public symp1() {
        
        initComponents();
        setBackground(new Color(23, 70, 162));
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (button_array[i][j]== true) {
                    Button button = get_ans(count1);
                    button.setBackground(new Color(65, 216, 191));
                } 
                count1++;
            }
        }

        
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 4; j++){
                if(rad_button_array[i][j] == false){
                    JRadioButton radio = get_rad(count3);
                    radio.setEnabled(false);
                }
                count3++;
        }    
    }
    
 }        
    private  JRadioButton get_rad(int index){
        switch (index){
            case 0:
                return rad1;
            case 1:
                return rad2;
            case 2:
                return rad3;
            case 3:
                return rad4;
            case 4:
                return rad5;
            case 5:
                return rad6;
            case 6:
                return rad7;
            case 7:
                return rad8;
            default:
                return null;
        } 
    };
    private Button get_ans(int index) {
            switch (index) {
                case 0:
                    return seven1;
                case 1:
                    return seven2;
                case 2:
                    return seven3;
                case 3:
                    return seven4;
                case 4:
                    return eight1;
                case 5:
                    return eight2;
                case 6:
                    return eight3;
                case 7:
                    return eight4;
                case 8:
                    return nine1;
                case 9:
                    return nine2;
                case 10:
                    return nine3;
                case 11:
                    return nine4;
                case 12:
                    return ten1;
                case 13:
                    return ten2;
                case 14:
                    return ten3;
                case 15:
                    return ten4;
                default:
                    return null;
            }
        } 
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        two = new javax.swing.JPanel();
        q7 = new javax.swing.JLabel();
        q81 = new javax.swing.JLabel();
        q9 = new javax.swing.JLabel();
        q10 = new javax.swing.JLabel();
        seven1 = new com.raven.button.Button();
        seven2 = new com.raven.button.Button();
        seven3 = new com.raven.button.Button();
        seven4 = new com.raven.button.Button();
        eight1 = new com.raven.button.Button();
        eight2 = new com.raven.button.Button();
        eight3 = new com.raven.button.Button();
        eight4 = new com.raven.button.Button();
        nine1 = new com.raven.button.Button();
        nine2 = new com.raven.button.Button();
        nine3 = new com.raven.button.Button();
        nine4 = new com.raven.button.Button();
        ten1 = new com.raven.button.Button();
        ten2 = new com.raven.button.Button();
        ten3 = new com.raven.button.Button();
        ten4 = new com.raven.button.Button();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        rad1 = new javax.swing.JRadioButton();
        rad2 = new javax.swing.JRadioButton();
        rad3 = new javax.swing.JRadioButton();
        rad4 = new javax.swing.JRadioButton();
        rad8 = new javax.swing.JRadioButton();
        rad5 = new javax.swing.JRadioButton();
        rad6 = new javax.swing.JRadioButton();
        rad7 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(142, 147, 205));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1138, 760));

        jPanel6.setOpaque(false);
        jPanel6.setPreferredSize(new java.awt.Dimension(866, 223));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(35, 117, 145));
        jTextField5.setText("Symptoms Testing");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(35, 117, 145));
        jLabel11.setText("Over the last  week, how often have you been bothered by any of the following problems?");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/123.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jTextField5)
                .addGap(3, 3, 3)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        two.setBackground(new java.awt.Color(255, 255, 255));
        two.setOpaque(false);

        q7.setBackground(new java.awt.Color(255, 255, 255));
        q7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q7.setForeground(new java.awt.Color(35, 117, 145));
        q7.setText("7. Trouble concentrating on things, such as reading the books, playing video games or watching television");

        q81.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q81.setForeground(new java.awt.Color(35, 117, 145));
        q81.setText("8. Moving at a sluggish pace or fidgeting excessively, noticeable by others.");

        q9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q9.setForeground(new java.awt.Color(35, 117, 145));
        q9.setText("9. Thoughts that you would be better off dead, or of hurting yourself");

        q10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q10.setForeground(new java.awt.Color(35, 117, 145));
        q10.setText("10. How have these problems impacted your work, home, or social life?");

        seven1.setBackground(new java.awt.Color(35, 117, 145));
        seven1.setForeground(new java.awt.Color(255, 255, 255));
        seven1.setText("NOT AT ALL");
        seven1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seven1ActionPerformed(evt);
            }
        });

        seven2.setBackground(new java.awt.Color(35, 117, 145));
        seven2.setForeground(new java.awt.Color(255, 255, 255));
        seven2.setText("SEVERAL DAYS");
        seven2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seven2ActionPerformed(evt);
            }
        });

        seven3.setBackground(new java.awt.Color(35, 117, 145));
        seven3.setForeground(new java.awt.Color(255, 255, 255));
        seven3.setText("MORE THAN HALF THE DAYS");
        seven3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seven3ActionPerformed(evt);
            }
        });

        seven4.setBackground(new java.awt.Color(35, 117, 145));
        seven4.setForeground(new java.awt.Color(255, 255, 255));
        seven4.setText("NEARLY EVERYDAY");
        seven4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seven4ActionPerformed(evt);
            }
        });

        eight1.setBackground(new java.awt.Color(35, 117, 145));
        eight1.setForeground(new java.awt.Color(255, 255, 255));
        eight1.setText("NOT AT ALL");
        eight1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eight1ActionPerformed(evt);
            }
        });

        eight2.setBackground(new java.awt.Color(35, 117, 145));
        eight2.setForeground(new java.awt.Color(255, 255, 255));
        eight2.setText("SEVERAL DAYS");
        eight2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eight2ActionPerformed(evt);
            }
        });

        eight3.setBackground(new java.awt.Color(35, 117, 145));
        eight3.setForeground(new java.awt.Color(255, 255, 255));
        eight3.setText("MORE THAN HALF THE DAYS");
        eight3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eight3ActionPerformed(evt);
            }
        });

        eight4.setBackground(new java.awt.Color(35, 117, 145));
        eight4.setForeground(new java.awt.Color(255, 255, 255));
        eight4.setText("NEARLY EVERYDAY");
        eight4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eight4ActionPerformed(evt);
            }
        });

        nine1.setBackground(new java.awt.Color(35, 117, 145));
        nine1.setForeground(new java.awt.Color(255, 255, 255));
        nine1.setText("NOT AT ALL");
        nine1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nine1ActionPerformed(evt);
            }
        });

        nine2.setBackground(new java.awt.Color(35, 117, 145));
        nine2.setForeground(new java.awt.Color(255, 255, 255));
        nine2.setText("SEVERAL DAYS");
        nine2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nine2ActionPerformed(evt);
            }
        });

        nine3.setBackground(new java.awt.Color(35, 117, 145));
        nine3.setForeground(new java.awt.Color(255, 255, 255));
        nine3.setText("MORE THAN HALF THE DAYS");
        nine3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nine3ActionPerformed(evt);
            }
        });

        nine4.setBackground(new java.awt.Color(35, 117, 145));
        nine4.setForeground(new java.awt.Color(255, 255, 255));
        nine4.setText("NEARLY EVERYDAY");
        nine4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nine4ActionPerformed(evt);
            }
        });

        ten1.setBackground(new java.awt.Color(35, 117, 145));
        ten1.setForeground(new java.awt.Color(255, 255, 255));
        ten1.setText("NOT DIFFICULT AT ALL");
        ten1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ten1ActionPerformed(evt);
            }
        });

        ten2.setBackground(new java.awt.Color(35, 117, 145));
        ten2.setForeground(new java.awt.Color(255, 255, 255));
        ten2.setText("SOMEWHAT DIFFICULT");
        ten2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ten2ActionPerformed(evt);
            }
        });

        ten3.setBackground(new java.awt.Color(35, 117, 145));
        ten3.setForeground(new java.awt.Color(255, 255, 255));
        ten3.setText("VERY DIFFICULT");
        ten3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ten3ActionPerformed(evt);
            }
        });

        ten4.setBackground(new java.awt.Color(35, 117, 145));
        ten4.setForeground(new java.awt.Color(255, 255, 255));
        ten4.setText("EXTREMELY DIFFICULT");
        ten4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ten4ActionPerformed(evt);
            }
        });

        jPanel3.setOpaque(false);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(35, 117, 145));
        jLabel16.setText("Think about your mental health test. What are the main things contributing ");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(35, 117, 145));
        jLabel17.setText("to your mental health problems right now? ");

        rad1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rad1.setForeground(new java.awt.Color(35, 117, 145));
        rad1.setText("abuse or violence");
        rad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad1ActionPerformed(evt);
            }
        });

        rad2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rad2.setForeground(new java.awt.Color(35, 117, 145));
        rad2.setText("Relationship problems (friends, family, or significant other)");
        rad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad2ActionPerformed(evt);
            }
        });

        rad3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rad3.setForeground(new java.awt.Color(35, 117, 145));
        rad3.setText("Body image or self-image");
        rad3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad3ActionPerformed(evt);
            }
        });

        rad4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rad4.setForeground(new java.awt.Color(35, 117, 145));
        rad4.setText("School or work problems");
        rad4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad4ActionPerformed(evt);
            }
        });

        rad8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rad8.setForeground(new java.awt.Color(35, 117, 145));
        rad8.setText("Financial problems");
        rad8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad8ActionPerformed(evt);
            }
        });

        rad5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rad5.setForeground(new java.awt.Color(35, 117, 145));
        rad5.setText("Loneliness or isolation");
        rad5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad5ActionPerformed(evt);
            }
        });

        rad6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rad6.setForeground(new java.awt.Color(35, 117, 145));
        rad6.setText("Grief or loss of someone or something");
        rad6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad6ActionPerformed(evt);
            }
        });

        rad7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rad7.setForeground(new java.awt.Color(35, 117, 145));
        rad7.setText("Racism, homophobia, transphobia, or discrimination");
        rad7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad7ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(35, 117, 145));
        jLabel15.setText("About Your Mental Health");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(rad1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rad3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rad2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(rad4, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(rad6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rad7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rad5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(rad8, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addGap(0, 0, 0)
                .addComponent(jLabel16)
                .addGap(0, 0, 0)
                .addComponent(jLabel17)
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rad1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rad5))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rad2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rad6))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rad3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rad7))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rad4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rad8))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout twoLayout = new javax.swing.GroupLayout(two);
        two.setLayout(twoLayout);
        twoLayout.setHorizontalGroup(
            twoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(twoLayout.createSequentialGroup()
                .addGroup(twoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(q7)
                    .addComponent(q81)
                    .addComponent(q9)
                    .addComponent(q10))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(twoLayout.createSequentialGroup()
                .addComponent(seven1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seven2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seven3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seven4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(twoLayout.createSequentialGroup()
                .addComponent(eight1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eight2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eight3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eight4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(twoLayout.createSequentialGroup()
                .addComponent(nine1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nine2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nine3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nine4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(twoLayout.createSequentialGroup()
                .addComponent(ten1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ten2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ten3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ten4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        twoLayout.setVerticalGroup(
            twoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(twoLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(q7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(twoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seven1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seven2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seven3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seven4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(q81)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(twoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eight1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eight2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eight3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eight4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(q9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(twoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nine1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nine2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nine3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nine4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(q10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(twoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ten1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ten2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ten3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ten4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 1138, Short.MAX_VALUE)
            .addComponent(two, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad1ActionPerformed
        // TODO add your handling code here:
        if(rad_button_array[0][0] = true){
            main.add_points(2);
            rad1.setEnabled(false);
            rad_button_array[0][0] = false;
        }
    }//GEN-LAST:event_rad1ActionPerformed

    private void rad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad2ActionPerformed
        // TODO add your handling code here:
         if(rad_button_array[0][1] = true){
            main.add_points(2);
            rad2.setEnabled(false);
            rad_button_array[0][1] = false;
        }
    }//GEN-LAST:event_rad2ActionPerformed

    private void rad3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad3ActionPerformed
        // TODO add your handling code here:
        if (rad_button_array[0][2] = true) {
            rad3.setEnabled(false);
            rad_button_array[0][2] = false;
            main.add_points(2);
        }
    }//GEN-LAST:event_rad3ActionPerformed

    private void rad4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad4ActionPerformed
        // TODO add your handling code here:
        if(rad_button_array[0][3] = true){
        rad4.setEnabled(false);
        rad_button_array[0][3]= false;
        main.add_points(2);
        }
    }//GEN-LAST:event_rad4ActionPerformed

    private void rad5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad5ActionPerformed
        // TODO add your handling code here:
        if(rad_button_array[1][0] = true){
        rad5.setEnabled(false);
        rad_button_array[1][0] = false;
        main.add_points(2);
        }
    }//GEN-LAST:event_rad5ActionPerformed

    private void rad6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad6ActionPerformed
        // TODO add your handling code here:
        if(rad_button_array[1][1] = true){
        rad6.setEnabled(false);
        rad_button_array[1][1] = false;
        main.add_points(2);
        }
    }//GEN-LAST:event_rad6ActionPerformed

    private void rad7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad7ActionPerformed
        // TODO add your handling code here:
        if(rad_button_array[1][2] = true){
        rad7.setEnabled(false);
        rad_button_array[1][2] = false;
        main.add_points(2);
        }
    }//GEN-LAST:event_rad7ActionPerformed

    private void rad8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad8ActionPerformed
        // TODO add your handling code here:
        if(rad_button_array[1][3] = true){
        rad8.setEnabled(false);
        rad_button_array[1][3] = false;
        main.add_points(2);
        }
    }//GEN-LAST:event_rad8ActionPerformed

    private void seven1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seven1ActionPerformed
        if (button_array[0][0] == false && button_array[0][1] == false && button_array[0][2] == false && button_array[0][3] == false) {
        seven1.setBackground(new Color(65, 216, 191));
        button_array[0][0] = true;
        main.add_points(0);
        count2++;
        }
    }//GEN-LAST:event_seven1ActionPerformed

    private void seven2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seven2ActionPerformed
        if (button_array[0][0] == false && button_array[0][1] == false && button_array[0][2] == false && button_array[0][3] == false) {
        seven2.setBackground(new Color(65, 216, 191));
        button_array[0][1] = true;
        main.add_points(1);
        count2++;
        }
    }//GEN-LAST:event_seven2ActionPerformed

    private void seven3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seven3ActionPerformed
        if (button_array[0][0] == false && button_array[0][1] == false && button_array[0][2] == false && button_array[0][3] == false) {
            seven3.setBackground(new Color(65, 216, 191));
            button_array[0][2] = true;
            main.add_points(2);
        count2++;
        }
    }//GEN-LAST:event_seven3ActionPerformed

    private void seven4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seven4ActionPerformed
        if (button_array[0][0] == false && button_array[0][1] == false && button_array[0][2] == false && button_array[0][3] == false) {
            seven4.setBackground(new Color(65, 216, 191));
            button_array[0][3] = true;
            main.add_points(3);
        count2++;
        }
    }//GEN-LAST:event_seven4ActionPerformed

    private void eight1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eight1ActionPerformed
        if (button_array[1][0] == false && button_array[1][1] == false && button_array[1][2] == false && button_array[1][3] == false) {
        eight1.setBackground(new Color(65, 216, 191));
        button_array[1][0] = true;
        main.add_points(0);
        count2++;
        }
    }//GEN-LAST:event_eight1ActionPerformed

    private void eight2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eight2ActionPerformed
        if (button_array[1][0] == false && button_array[1][1] == false && button_array[1][2] == false && button_array[1][3] == false) {
        eight2.setBackground(new Color(65, 216, 191));
        button_array[1][1]= true;
        main.add_points(1);
        count2++;
        }
    }//GEN-LAST:event_eight2ActionPerformed

    private void eight3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eight3ActionPerformed
        if (button_array[1][0] == false && button_array[1][1] == false && button_array[1][2] == false && button_array[1][3] == false) {
        eight3.setBackground(new Color(65, 216, 191));
        button_array[1][2] = true;
        main.add_points(2);
        count2++;
        }
    }//GEN-LAST:event_eight3ActionPerformed

    private void eight4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eight4ActionPerformed
        if (button_array[1][0] == false && button_array[1][1] == false && button_array[1][2] == false && button_array[1][3] == false) {
        eight4.setBackground(new Color(65, 216, 191));
        button_array[1][3] = true;
        main.add_points(3);
        count2++;
        }
    }//GEN-LAST:event_eight4ActionPerformed

    private void nine1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nine1ActionPerformed
        if (button_array[2][0] == false && button_array[2][1] == false && button_array[2][2] == false && button_array[2][3] == false) {
        nine1.setBackground(new Color(65, 216, 191));
        button_array[2][0] = true;
        main.add_points(0);
        count2++;
        }
    }//GEN-LAST:event_nine1ActionPerformed

    private void nine2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nine2ActionPerformed
        if (button_array[2][0] == false && button_array[2][1] == false && button_array[2][2] == false && button_array[2][3] == false) {
        nine2.setBackground(new Color(65, 216, 191));
        button_array[2][1] = true;  
        main.add_points(1);
        count2++;
        }
    }//GEN-LAST:event_nine2ActionPerformed

    private void nine3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nine3ActionPerformed
        if (button_array[2][0] == false && button_array[2][1] == false && button_array[2][2] == false && button_array[2][3] == false) {
        nine3.setBackground(new Color(65, 216, 191));
        button_array[2][2] = true;  
        main.add_points(2);
        count2++;
        }
    }//GEN-LAST:event_nine3ActionPerformed

    private void nine4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nine4ActionPerformed
        if (button_array[2][0] == false && button_array[2][1] == false && button_array[2][2] == false && button_array[2][3] == false) {
        nine4.setBackground(new Color(65, 216, 191));
        button_array[2][3] = true;  
        main.add_points(3);
        count2++;
        }
    }//GEN-LAST:event_nine4ActionPerformed

    private void ten1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ten1ActionPerformed
        if (button_array[3][0] == false && button_array[3][1] == false && button_array[3][2] == false && button_array[3][3] == false) {
        ten1.setBackground(new Color(65, 216, 191));
        button_array[3][0] = true;  
        main.add_points(0);
        count2++;
        }
    }//GEN-LAST:event_ten1ActionPerformed

    private void ten2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ten2ActionPerformed
        if (button_array[3][0] == false && button_array[3][1] == false && button_array[3][2] == false && button_array[3][3] == false) {
        ten2.setBackground(new Color(65, 216, 191));
        button_array[3][1] = true;  
        main.add_points(1);
        count2++;
        }
    }//GEN-LAST:event_ten2ActionPerformed

    private void ten3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ten3ActionPerformed
        if (button_array[3][0] == false && button_array[3][1] == false && button_array[3][2] == false && button_array[3][3] == false) {
        ten3.setBackground(new Color(65, 216, 191));
        button_array[3][2] = true;  
        main.add_points(2);
        count2++;
        }
    }//GEN-LAST:event_ten3ActionPerformed

    private void ten4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ten4ActionPerformed
        if (button_array[3][0] == false && button_array[3][1] == false && button_array[3][2] == false && button_array[3][3] == false) {
        ten4.setBackground(new Color(65, 216, 191));
        button_array[3][3] = true;  
        main.add_points(3);
        count2++;
        }
    }//GEN-LAST:event_ten4ActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.button.Button eight1;
    private com.raven.button.Button eight2;
    private com.raven.button.Button eight3;
    private com.raven.button.Button eight4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel jTextField5;
    private com.raven.button.Button nine1;
    private com.raven.button.Button nine2;
    private com.raven.button.Button nine3;
    private com.raven.button.Button nine4;
    private javax.swing.JLabel q10;
    private javax.swing.JLabel q7;
    private javax.swing.JLabel q81;
    private javax.swing.JLabel q9;
    private javax.swing.JRadioButton rad1;
    private javax.swing.JRadioButton rad2;
    private javax.swing.JRadioButton rad3;
    private javax.swing.JRadioButton rad4;
    private javax.swing.JRadioButton rad5;
    private javax.swing.JRadioButton rad6;
    private javax.swing.JRadioButton rad7;
    private javax.swing.JRadioButton rad8;
    private com.raven.button.Button seven1;
    private com.raven.button.Button seven2;
    private com.raven.button.Button seven3;
    private com.raven.button.Button seven4;
    private com.raven.button.Button ten1;
    private com.raven.button.Button ten2;
    private com.raven.button.Button ten3;
    private com.raven.button.Button ten4;
    private javax.swing.JPanel two;
    // End of variables declaration//GEN-END:variables
}
