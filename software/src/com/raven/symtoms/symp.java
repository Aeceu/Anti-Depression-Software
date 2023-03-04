package com.raven.symtoms;

import com.raven.button.Button;
import com.raven.main.Main;

import java.awt.Color;

public class symp extends javax.swing.JPanel {
    Main main = new Main();
    
    public static int count;
    private  int count1;
    private static boolean[][] ans_array = 
    {
        {false, false, false, false},
        {false, false, false, false},
        {false, false, false, false},
        {false, false, false, false},
        {false, false, false, false},
        {false, false, false, false}
    };
    
    public symp() {
        
        initComponents();
        setBackground(new Color(23, 70, 162));    
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (ans_array[i][j] == true) {
                    Button button = get_ans(count1);
                    button.setBackground(new Color(65, 216, 191));
                }
                count1++;
            }
        }
       
        if(count == 6) Main.opensymp1 = true;
    }
    private Button get_ans(int index) {
            switch (index) {
                case 0:
                    return one1;
                case 1:
                    return one2;
                case 2:
                    return one3;
                case 3:
                    return one4;
                case 4:
                    return two1;
                case 5:
                    return two2;
                case 6:
                    return two3;
                case 7:
                    return two4;
                case 8:
                    return three1;
                case 9:
                    return three2;
                case 10:
                    return three3;
                case 11:
                    return three4;
                case 12:
                    return four1;
                case 13:
                    return four2;
                case 14:
                    return four3;
                case 15:
                    return four4;
                case 16:
                    return five1;
                case 17:
                    return five2;
                case 18:
                    return five3;
                case 19:
                    return five4;
                case 20:
                    return six1;
                case 21:
                    return six2;
                case 22:
                    return six3;
                case 23:
                    return six4;
                default:
                    return null;
            }
        } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        one = new javax.swing.JPanel();
        q1 = new javax.swing.JLabel();
        q2 = new javax.swing.JLabel();
        q3 = new javax.swing.JLabel();
        q4 = new javax.swing.JLabel();
        q5 = new javax.swing.JLabel();
        q6 = new javax.swing.JLabel();
        one1 = new com.raven.button.Button();
        one2 = new com.raven.button.Button();
        one3 = new com.raven.button.Button();
        one4 = new com.raven.button.Button();
        two4 = new com.raven.button.Button();
        two3 = new com.raven.button.Button();
        two2 = new com.raven.button.Button();
        two1 = new com.raven.button.Button();
        three1 = new com.raven.button.Button();
        three2 = new com.raven.button.Button();
        three3 = new com.raven.button.Button();
        three4 = new com.raven.button.Button();
        four1 = new com.raven.button.Button();
        four2 = new com.raven.button.Button();
        four3 = new com.raven.button.Button();
        four4 = new com.raven.button.Button();
        five1 = new com.raven.button.Button();
        five2 = new com.raven.button.Button();
        five3 = new com.raven.button.Button();
        five4 = new com.raven.button.Button();
        six1 = new com.raven.button.Button();
        six2 = new com.raven.button.Button();
        six3 = new com.raven.button.Button();
        six4 = new com.raven.button.Button();

        setBackground(new java.awt.Color(142, 147, 205));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1138, 760));

        jPanel1.setOpaque(false);

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(35, 117, 145));
        jTextField3.setText("Symptoms Testing");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(35, 117, 145));
        jLabel1.setText("Over the last  week, how often have you been bothered by any of the following problems?");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/123.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1138, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        one.setBackground(new java.awt.Color(255, 255, 255));
        one.setOpaque(false);

        q1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q1.setForeground(new java.awt.Color(35, 117, 145));
        q1.setText("1. Little interest or pleasure in doing things");

        q2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q2.setForeground(new java.awt.Color(35, 117, 145));
        q2.setText("2. Feeling down, depressed, or hopeless");

        q3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q3.setForeground(new java.awt.Color(35, 117, 145));
        q3.setText("3. Trouble falling or staying asleep, or sleeping too much");

        q4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q4.setForeground(new java.awt.Color(35, 117, 145));
        q4.setText("4. Feeling tired or having little energy");

        q5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q5.setForeground(new java.awt.Color(35, 117, 145));
        q5.setText("5. Poor appetite or overeating");

        q6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q6.setForeground(new java.awt.Color(35, 117, 145));
        q6.setText("6. Feeling bad about yourself - or that you are a failure or have let yourself or your family down");

        one1.setBackground(new java.awt.Color(35, 117, 145));
        one1.setForeground(new java.awt.Color(255, 255, 255));
        one1.setText("NOT AT ALL");
        one1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                one1ActionPerformed(evt);
            }
        });

        one2.setBackground(new java.awt.Color(35, 117, 145));
        one2.setForeground(new java.awt.Color(255, 255, 255));
        one2.setText("SEVERAL DAYS");
        one2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                one2ActionPerformed(evt);
            }
        });

        one3.setBackground(new java.awt.Color(35, 117, 145));
        one3.setForeground(new java.awt.Color(255, 255, 255));
        one3.setText("MORE THAN HALF THE DAYS");
        one3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                one3ActionPerformed(evt);
            }
        });

        one4.setBackground(new java.awt.Color(35, 117, 145));
        one4.setForeground(new java.awt.Color(255, 255, 255));
        one4.setText("NEARLY EVERYDAY");
        one4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                one4ActionPerformed(evt);
            }
        });

        two4.setBackground(new java.awt.Color(35, 117, 145));
        two4.setForeground(new java.awt.Color(255, 255, 255));
        two4.setText("NEARLY EVERYDAY");
        two4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                two4ActionPerformed(evt);
            }
        });

        two3.setBackground(new java.awt.Color(35, 117, 145));
        two3.setForeground(new java.awt.Color(255, 255, 255));
        two3.setText("MORE THAN HALF THE DAYS");
        two3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                two3ActionPerformed(evt);
            }
        });

        two2.setBackground(new java.awt.Color(35, 117, 145));
        two2.setForeground(new java.awt.Color(255, 255, 255));
        two2.setText("SEVERAL DAYS");
        two2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                two2ActionPerformed(evt);
            }
        });

        two1.setBackground(new java.awt.Color(35, 117, 145));
        two1.setForeground(new java.awt.Color(255, 255, 255));
        two1.setText("NOT AT ALL");
        two1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                two1ActionPerformed(evt);
            }
        });

        three1.setBackground(new java.awt.Color(35, 117, 145));
        three1.setForeground(new java.awt.Color(255, 255, 255));
        three1.setText("NOT AT ALL");
        three1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                three1ActionPerformed(evt);
            }
        });

        three2.setBackground(new java.awt.Color(35, 117, 145));
        three2.setForeground(new java.awt.Color(255, 255, 255));
        three2.setText("SEVERAL DAYS");
        three2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                three2ActionPerformed(evt);
            }
        });

        three3.setBackground(new java.awt.Color(35, 117, 145));
        three3.setForeground(new java.awt.Color(255, 255, 255));
        three3.setText("MORE THAN HALF THE DAYS");
        three3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                three3ActionPerformed(evt);
            }
        });

        three4.setBackground(new java.awt.Color(35, 117, 145));
        three4.setForeground(new java.awt.Color(255, 255, 255));
        three4.setText("NEARLY EVERYDAY");
        three4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                three4ActionPerformed(evt);
            }
        });

        four1.setBackground(new java.awt.Color(35, 117, 145));
        four1.setForeground(new java.awt.Color(255, 255, 255));
        four1.setText("NOT AT ALL");
        four1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                four1ActionPerformed(evt);
            }
        });

        four2.setBackground(new java.awt.Color(35, 117, 145));
        four2.setForeground(new java.awt.Color(255, 255, 255));
        four2.setText("SEVERAL DAYS");
        four2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                four2ActionPerformed(evt);
            }
        });

        four3.setBackground(new java.awt.Color(35, 117, 145));
        four3.setForeground(new java.awt.Color(255, 255, 255));
        four3.setText("MORE THAN HALF THE DAYS");
        four3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                four3ActionPerformed(evt);
            }
        });

        four4.setBackground(new java.awt.Color(35, 117, 145));
        four4.setForeground(new java.awt.Color(255, 255, 255));
        four4.setText("NEARLY EVERYDAY");
        four4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                four4ActionPerformed(evt);
            }
        });

        five1.setBackground(new java.awt.Color(35, 117, 145));
        five1.setForeground(new java.awt.Color(255, 255, 255));
        five1.setText("NOT AT ALL");
        five1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five1ActionPerformed(evt);
            }
        });

        five2.setBackground(new java.awt.Color(35, 117, 145));
        five2.setForeground(new java.awt.Color(255, 255, 255));
        five2.setText("SEVERAL DAYS");
        five2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five2ActionPerformed(evt);
            }
        });

        five3.setBackground(new java.awt.Color(35, 117, 145));
        five3.setForeground(new java.awt.Color(255, 255, 255));
        five3.setText("MORE THAN HALF THE DAYS");
        five3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five3ActionPerformed(evt);
            }
        });

        five4.setBackground(new java.awt.Color(35, 117, 145));
        five4.setForeground(new java.awt.Color(255, 255, 255));
        five4.setText("NEARLY EVERYDAY");
        five4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five4ActionPerformed(evt);
            }
        });

        six1.setBackground(new java.awt.Color(35, 117, 145));
        six1.setForeground(new java.awt.Color(255, 255, 255));
        six1.setText("NOT AT ALL");
        six1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                six1ActionPerformed(evt);
            }
        });

        six2.setBackground(new java.awt.Color(35, 117, 145));
        six2.setForeground(new java.awt.Color(255, 255, 255));
        six2.setText("SEVERAL DAYS");
        six2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                six2ActionPerformed(evt);
            }
        });

        six3.setBackground(new java.awt.Color(35, 117, 145));
        six3.setForeground(new java.awt.Color(255, 255, 255));
        six3.setText("MORE THAN HALF THE DAYS");
        six3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                six3ActionPerformed(evt);
            }
        });

        six4.setBackground(new java.awt.Color(35, 117, 145));
        six4.setForeground(new java.awt.Color(255, 255, 255));
        six4.setText("NEARLY EVERYDAY");
        six4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                six4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout oneLayout = new javax.swing.GroupLayout(one);
        one.setLayout(oneLayout);
        oneLayout.setHorizontalGroup(
            oneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oneLayout.createSequentialGroup()
                .addGroup(oneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(q1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(q2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(q3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(q4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(q5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(q6, javax.swing.GroupLayout.DEFAULT_SIZE, 1123, Short.MAX_VALUE))
                .addGap(15, 15, 15))
            .addGroup(oneLayout.createSequentialGroup()
                .addComponent(one1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(one2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(one3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(one4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(oneLayout.createSequentialGroup()
                .addComponent(two1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(two2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(two3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(two4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(oneLayout.createSequentialGroup()
                .addComponent(three1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(three2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(three3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(three4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(oneLayout.createSequentialGroup()
                .addComponent(four1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(four2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(four3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(four4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(oneLayout.createSequentialGroup()
                .addComponent(five1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(five2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(five3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(five4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(oneLayout.createSequentialGroup()
                .addComponent(six1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(six2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(six3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(six4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        oneLayout.setVerticalGroup(
            oneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(oneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(one1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(one2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(one3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(one4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(q2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(oneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(two1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(two2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(two3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(two4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(q3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(oneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(three1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(three2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(three3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(three4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(q4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(oneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(four1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(four2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(four3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(four4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(q5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(oneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(five1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(five2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(five3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(five4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(q6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(oneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(six1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(six2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(six3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(six4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(one, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(one, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void one1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_one1ActionPerformed
        if(ans_array[0][0] == false && ans_array[0][1] == false && ans_array[0][2] == false && ans_array[0][3] == false){
        one1.setBackground(new Color(65, 216, 191));
        ans_array[0][0] = true;
        main.add_points(0);
        count++;
        }
    }//GEN-LAST:event_one1ActionPerformed

    private void one2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_one2ActionPerformed
        if(ans_array[0][0] == false && ans_array[0][1] == false && ans_array[0][2] == false && ans_array[0][3] == false){        
        one2.setBackground(new Color(65, 216, 191));
        ans_array[0][1]= true;  
        main.add_points(1);
        count++;
        }
    }//GEN-LAST:event_one2ActionPerformed

    private void one3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_one3ActionPerformed
        if(ans_array[0][0] == false && ans_array[0][1] == false && ans_array[0][2] == false && ans_array[0][3] == false){        
        one3.setBackground(new Color(65, 216, 191));
        ans_array[0][2] = true;
        main.add_points(2);
        count++;
        }
    }//GEN-LAST:event_one3ActionPerformed

    private void one4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_one4ActionPerformed
        if(ans_array[0][0] == false && ans_array[0][1] == false && ans_array[0][2] == false && ans_array[0][3] == false){        
        one4.setBackground(new Color(65, 216, 191));
        ans_array[0][3] = true; 
        main.add_points(3);
        count++;
        }
    }//GEN-LAST:event_one4ActionPerformed

    private void two4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_two4ActionPerformed
         if(ans_array[1][0] == false && ans_array[1][1] == false && ans_array[1][2] == false && ans_array[1][3] == false){
        two4.setBackground(new Color(65, 216, 191));
        ans_array[1][3]= true; 
        main.add_points(3);
        count++;
        }
    }//GEN-LAST:event_two4ActionPerformed

    private void two3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_two3ActionPerformed
        if(ans_array[1][0] == false && ans_array[1][1] == false && ans_array[1][2] == false && ans_array[1][3] == false){
        two3.setBackground(new Color(65, 216, 191));
        ans_array[1][2]= true;
        main.add_points(2);
        count++;
        }
    }//GEN-LAST:event_two3ActionPerformed

    private void two2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_two2ActionPerformed
        if(ans_array[1][0] == false && ans_array[1][1] == false && ans_array[1][2] == false && ans_array[1][3] == false){
        two2.setBackground(new Color(65, 216, 191));
        ans_array[1][1] = true; 
        main.add_points(1);
        count++;
        }
    }//GEN-LAST:event_two2ActionPerformed

    private void two1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_two1ActionPerformed
        if(ans_array[1][0] == false && ans_array[1][1] == false && ans_array[1][2] == false && ans_array[1][3] == false){
        two1.setBackground(new Color(65, 216, 191));
        ans_array[1][0] = true; 
        main.add_points(0);
        count++;
        }
    }//GEN-LAST:event_two1ActionPerformed

    private void three1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_three1ActionPerformed
        if(ans_array[2][0] == false && ans_array[2][1] == false && ans_array[2][2] == false && ans_array[2][3] == false){
        three1.setBackground(new Color(65, 216, 191));
        ans_array[2][0] = true; 
        main.add_points(0);
        count++;
        }
    }//GEN-LAST:event_three1ActionPerformed

    private void three2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_three2ActionPerformed
      if(ans_array[2][0] == false && ans_array[2][1] == false && ans_array[2][2] == false && ans_array[2][3] == false){
        three2.setBackground(new Color(65, 216, 191));
        ans_array[2][1] = true; 
        main.add_points(1);
        count++;
        }
    }//GEN-LAST:event_three2ActionPerformed

    private void three3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_three3ActionPerformed
        if(ans_array[2][0] == false && ans_array[2][1] == false && ans_array[2][2] == false && ans_array[2][3] == false){
            three3.setBackground(new Color(65, 216, 191));
            ans_array[2][2] = true;
            main.add_points(2);
        count++;
        }
    }//GEN-LAST:event_three3ActionPerformed

    private void three4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_three4ActionPerformed
        if(ans_array[2][0] == false && ans_array[2][1] == false && ans_array[2][2] == false && ans_array[2][3] == false){
            three4.setBackground(new Color(65, 216, 191));
            ans_array[2][3] = true;
            main.add_points(3);
        count++;
        }
    }//GEN-LAST:event_three4ActionPerformed

    private void four1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_four1ActionPerformed
        if(ans_array[3][0] == false && ans_array[3][1] == false && ans_array[3][2] == false && ans_array[3][3] == false){
             four1.setBackground(new Color(65, 216, 191));
             ans_array[3][0]  = true;
            main.add_points(0);
        count++;
        }
    }//GEN-LAST:event_four1ActionPerformed

    private void four2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_four2ActionPerformed
        if(ans_array[3][0] == false && ans_array[3][1] == false && ans_array[3][2] == false && ans_array[3][3] == false){
             four2.setBackground(new Color(65, 216, 191));
             ans_array[3][1]  = true;
            main.add_points(1);
        count++;
        }
    }//GEN-LAST:event_four2ActionPerformed

    private void four3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_four3ActionPerformed
        if(ans_array[3][0] == false && ans_array[3][1] == false && ans_array[3][2] == false && ans_array[3][3] == false){
             four3.setBackground(new Color(65, 216, 191));
             ans_array[3][2]  = true;
            main.add_points(2);
        count++;
        }
    }//GEN-LAST:event_four3ActionPerformed

    private void four4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_four4ActionPerformed
        if(ans_array[3][0] == false && ans_array[3][1] == false && ans_array[3][2] == false && ans_array[3][3] == false){
             four4.setBackground(new Color(65, 216, 191));
             ans_array[3][3]  = true;
            main.add_points(3);
        count++;
        }
    }//GEN-LAST:event_four4ActionPerformed

    private void five1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five1ActionPerformed
        if(ans_array[4][0] == false && ans_array[4][1] == false && ans_array[4][2] == false && ans_array[4][3] == false){
             five1.setBackground(new Color(65, 216, 191));
             ans_array[4][0] = true;
            main.add_points(0);
        count++;
        }
    }//GEN-LAST:event_five1ActionPerformed

    private void five2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five2ActionPerformed
        if(ans_array[4][0] == false && ans_array[4][1] == false && ans_array[4][2] == false && ans_array[4][3] == false){
             five2.setBackground(new Color(65, 216, 191));
             ans_array[4][1]  = true;
            main.add_points(1);
        count++;
        }
    }//GEN-LAST:event_five2ActionPerformed

    private void five3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five3ActionPerformed
        if(ans_array[4][0] == false && ans_array[4][1] == false && ans_array[4][2] == false && ans_array[4][3] == false){
             five3.setBackground(new Color(65, 216, 191));
             ans_array[4][2]  = true;
            main.add_points(2);
        count++;
        }
    }//GEN-LAST:event_five3ActionPerformed

    private void five4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five4ActionPerformed
        if(ans_array[4][0] == false && ans_array[4][1] == false && ans_array[4][2] == false && ans_array[4][3] == false){
             five4.setBackground(new Color(65, 216, 191));
             ans_array[4][3]  = true;
            main.add_points(3);
        count++;
        }
    }//GEN-LAST:event_five4ActionPerformed

    private void six1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_six1ActionPerformed
        if(ans_array[5][0] == false && ans_array[5][1] == false && ans_array[5][2] == false && ans_array[5][3] == false){
        six1.setBackground(new Color(65, 216, 191));
        ans_array[5][0] = true;
        main.add_points(0);
        count++;
        }
    }//GEN-LAST:event_six1ActionPerformed

    private void six2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_six2ActionPerformed
        if(ans_array[5][0] == false && ans_array[5][1] == false && ans_array[5][2] == false && ans_array[5][3] == false){
        six2.setBackground(new Color(65, 216, 191));
        ans_array[5][1] = true;
        main.add_points(1);
        count++;
        }
    }//GEN-LAST:event_six2ActionPerformed

    private void six3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_six3ActionPerformed
        if(ans_array[5][0] == false && ans_array[5][1] == false && ans_array[5][2] == false && ans_array[5][3] == false){
        six3.setBackground(new Color(65, 216, 191));
        ans_array[5][2]  = true;
        main.add_points(2);
        count++;
        }
    }//GEN-LAST:event_six3ActionPerformed

    private void six4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_six4ActionPerformed
        if(ans_array[5][0] == false && ans_array[5][1] == false && ans_array[5][2] == false && ans_array[5][3] == false){
        six4.setBackground(new Color(65, 216, 191));
        ans_array[5][3] = true;
        main.add_points(3);
        count++;
        }
    }//GEN-LAST:event_six4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.button.Button five1;
    private com.raven.button.Button five2;
    private com.raven.button.Button five3;
    private com.raven.button.Button five4;
    private com.raven.button.Button four1;
    private com.raven.button.Button four2;
    private com.raven.button.Button four3;
    private com.raven.button.Button four4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jTextField3;
    private javax.swing.JPanel one;
    private com.raven.button.Button one1;
    private com.raven.button.Button one2;
    private com.raven.button.Button one3;
    private com.raven.button.Button one4;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel q3;
    private javax.swing.JLabel q4;
    private javax.swing.JLabel q5;
    private javax.swing.JLabel q6;
    private com.raven.button.Button six1;
    private com.raven.button.Button six2;
    private com.raven.button.Button six3;
    private com.raven.button.Button six4;
    private com.raven.button.Button three1;
    private com.raven.button.Button three2;
    private com.raven.button.Button three3;
    private com.raven.button.Button three4;
    private com.raven.button.Button two1;
    private com.raven.button.Button two2;
    private com.raven.button.Button two3;
    private com.raven.button.Button two4;
    // End of variables declaration//GEN-END:variables
}
