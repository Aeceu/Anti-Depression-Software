package com.raven.assessment;


import com.raven.main.Main;
import com.raven.pop.history;
import com.raven.scores.Points;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class assess extends javax.swing.JPanel {
    
    Main Main = new Main();
   
    private static String name_ = null;
    private static String age_= null;
    private static String gender_= null;
    private static boolean isAge;
    private static boolean isSubmit = false;
    
    // array of button if true, thats what the user age is
    private static boolean[][] age_array = 
    {
    {false, false, false, false},
    {false, false, false, false},
    {false, false, false, false},
    {false, false, false, false},
    };
    
    private static String[][] age_string = 
    {
    {"14", "15", "16", "17"},
    {"18", "19", "20", "21"},
    {"22", "23", "24", "25"},
    {"26", "27", "28", "29"},    
    };
    
    
    private static boolean sex11;
    private static boolean sex22;
    private static boolean sex33;
    
    
    public static int total = 0;
    //public static int count3 = 0;
    
    public assess() {
        initComponents();
        setBackground(new Color(23, 70, 162));
        total = Main.getTotal();
       
        // Loop through the array of ages and if one is true, change the background and break
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (age_array[i][j] == true) {
                    int count = i + j;
                    get_age(count).setBackground(new Color(65, 216, 191));
                }
            }
        }
        // set the gender background if true
        if(sex11 == true) sex1.setBackground(new Color(65, 216, 191));
        if(sex22 == true) sex2.setBackground(new Color(65, 216, 191));
        if(sex33 == true) sex3.setBackground(new Color(65, 216, 191));
        // makes the name appear in the namefield if you switch and go back to assessment form/page
        if(name_ != null){
            namefield.setText(name_);
        }else{
            namefield.setText(null);
        } 
          
         display();
    }
    
    private  JButton get_age(int index){
        switch (index){
            case 0:
                return one;
            case 1:
                return two;
            case 2:
                return three;
            case 3:
                return four;
            case 4:
                return four;
            case 5:
                return five;
            case 6:
                return six;
            case 7:
                return seven;
            case 8:
                return eight;
            case 9:
                return nine;
            case 10:
                return ten;
            case 11:
                return eleven;
            case 12:
                return twelve;
            case 13:
                return thirteen;
            case 14:
                return fourteen;
            case 15:
                return fifteen;
            case 16:
                return sixteen;
            default:
                return null;
        } 
    }
    
    private void display(){
        JLabel label = new JLabel();
        label.setOpaque(false);
        label.setText("Suicide Prevention");
        label.setBounds(10, 0, 400, 38);
        label.setFont(new Font("Segoe UI", Font.BOLD, 40));
        label.setForeground(new Color(255, 255, 255));
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.LEFT);

        hotline.add(label);
        String text1 = "If you need immediate help, you can reach  the National Center for Mental Health Crisis Hotline by texting or calling 0966-351-4518."
                + "You can also visit in-touch.org to help you."
                + "In-Touch: Crisis Line is dedicated to providing 24/7, free, compassionate and confidential support over phone and online chat.";
        JLabel label1 = new JLabel();
        label1.setOpaque(false);
        label1.setText("<html>" + text1 + "</html>");
        label1.setBounds(10, 50, 420, 180);
        label1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        label1.setForeground(new Color(255, 255, 255));
        label1.setVerticalAlignment(JLabel.CENTER);
        label1.setHorizontalAlignment(JLabel.LEFT);

        hotline.add(label1);

        String text2 = "Remember that you’re not alone and resources are available to you. If you need to talk to someone right away, you can:";
        JLabel label2 = new JLabel();
        label2.setOpaque(false);
        label2.setText("<html>" + text2 + "</html>");
        label2.setBounds(10, 240, 420, 80);
        label2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        label2.setForeground(new Color(255, 255, 255));
        label2.setVerticalAlignment(JLabel.CENTER);
        label2.setHorizontalAlignment(JLabel.LEFT);

        hotline.add(label2);

        String text3 = "-Call the National Suicide Prevention Lifeline 24 hours a day at 800-273-8255.";
        JLabel p3 = new JLabel();
        p3.setText("<html>" + text3 + "<html>");
        p3.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        p3.setBounds(10, 340, 420, 50);
        p3.setVerticalAlignment(JLabel.TOP);
        p3.setHorizontalAlignment(JLabel.LEFT);
        p3.setForeground(new Color(255, 255, 255));
        hotline.add(p3);

        String text4 = "-Text “HOME” to the Crisis Textline at 741741.";
        JLabel p4 = new JLabel();
        p4.setText("<html>" + text4 + "<html>");
        p4.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        p4.setBounds(10, 390, 560, 20);
        p4.setVerticalAlignment(JLabel.TOP);
        p4.setHorizontalAlignment(JLabel.LEFT);
        p4.setForeground(new Color(255, 255, 255));
        hotline.add(p4);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new com.raven.swing.RoundPanel();
        jPanel1 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new RoundedPanel(30, new Color(233,238,245));
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        four = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        namefield = new javax.swing.JTextField();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        ten = new javax.swing.JButton();
        eleven = new javax.swing.JButton();
        twelve = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        thirteen = new javax.swing.JButton();
        fourteen = new javax.swing.JButton();
        fifteen = new javax.swing.JButton();
        sixteen = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        sex1 = new com.raven.button.Button();
        sex2 = new com.raven.button.Button();
        sex3 = new com.raven.button.Button();
        jLabel16 = new javax.swing.JLabel();
        hotline = new com.raven.swing.RoundPanel();
        button1 = new com.raven.button.Button();

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setOpaque(false);

        jPanel1.setOpaque(false);

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(35, 117, 145));
        jTextField5.setText("Information Gathering");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(35, 117, 145));
        jLabel2.setText("Please take a moment to answer the following optional questions. Your answers are totally anonymous —we won't be able to identify you based on ");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(35, 117, 145));
        jLabel1.setText("this information. Your answers help us provide better");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/345.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(jLabel3)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField5)
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(jLabel3))
        );

        jPanel2.setOpaque(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(35, 117, 145));
        jLabel6.setText("Information about you:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(35, 117, 145));
        jLabel7.setText("Your age:");

        one.setBackground(new java.awt.Color(255, 255, 255));
        one.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        one.setForeground(new java.awt.Color(35, 117, 145));
        one.setText("14");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        two.setBackground(new java.awt.Color(255, 255, 255));
        two.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        two.setForeground(new java.awt.Color(35, 117, 145));
        two.setText("15");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        three.setBackground(new java.awt.Color(255, 255, 255));
        three.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        three.setForeground(new java.awt.Color(35, 117, 145));
        three.setText("16");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        four.setBackground(new java.awt.Color(255, 255, 255));
        four.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        four.setForeground(new java.awt.Color(35, 117, 145));
        four.setText("17");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(35, 117, 145));
        jLabel11.setText("Your name:");

        five.setBackground(new java.awt.Color(255, 255, 255));
        five.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        five.setForeground(new java.awt.Color(35, 117, 145));
        five.setText("18");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        six.setBackground(new java.awt.Color(255, 255, 255));
        six.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        six.setForeground(new java.awt.Color(35, 117, 145));
        six.setText("19");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        seven.setBackground(new java.awt.Color(255, 255, 255));
        seven.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        seven.setForeground(new java.awt.Color(35, 117, 145));
        seven.setText("20");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        eight.setBackground(new java.awt.Color(255, 255, 255));
        eight.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eight.setForeground(new java.awt.Color(35, 117, 145));
        eight.setText("21");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        nine.setBackground(new java.awt.Color(255, 255, 255));
        nine.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nine.setForeground(new java.awt.Color(35, 117, 145));
        nine.setText("22");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        ten.setBackground(new java.awt.Color(255, 255, 255));
        ten.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ten.setForeground(new java.awt.Color(35, 117, 145));
        ten.setText("23");
        ten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenActionPerformed(evt);
            }
        });

        eleven.setBackground(new java.awt.Color(255, 255, 255));
        eleven.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eleven.setForeground(new java.awt.Color(35, 117, 145));
        eleven.setText("24");
        eleven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elevenActionPerformed(evt);
            }
        });

        twelve.setBackground(new java.awt.Color(255, 255, 255));
        twelve.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        twelve.setForeground(new java.awt.Color(35, 117, 145));
        twelve.setText("25");
        twelve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twelveActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(35, 117, 145));
        jLabel8.setText("Your gender:");

        thirteen.setBackground(new java.awt.Color(255, 255, 255));
        thirteen.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        thirteen.setForeground(new java.awt.Color(35, 117, 145));
        thirteen.setText("26");
        thirteen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirteenActionPerformed(evt);
            }
        });

        fourteen.setBackground(new java.awt.Color(255, 255, 255));
        fourteen.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fourteen.setForeground(new java.awt.Color(35, 117, 145));
        fourteen.setText("27");
        fourteen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourteenActionPerformed(evt);
            }
        });

        fifteen.setBackground(new java.awt.Color(255, 255, 255));
        fifteen.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fifteen.setForeground(new java.awt.Color(35, 117, 145));
        fifteen.setText("28");
        fifteen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fifteenActionPerformed(evt);
            }
        });

        sixteen.setBackground(new java.awt.Color(255, 255, 255));
        sixteen.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sixteen.setForeground(new java.awt.Color(35, 117, 145));
        sixteen.setText("29");
        sixteen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixteenActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(35, 117, 145));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(35, 117, 145));
        jLabel15.setText("Which of the following populations describes you?");

        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(35, 117, 145));
        jRadioButton1.setText("Veteran or active-duty military");

        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(35, 117, 145));
        jRadioButton2.setText("Caregiver of someone living with emotional or physical illness");

        jRadioButton3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(35, 117, 145));
        jRadioButton3.setText("LGBTQ+");

        jRadioButton4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(35, 117, 145));
        jRadioButton4.setText("Student");

        jRadioButton5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(35, 117, 145));
        jRadioButton5.setText("Solo parent");

        jRadioButton6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jRadioButton6.setForeground(new java.awt.Color(35, 117, 145));
        jRadioButton6.setText("Healthcare worker");

        jRadioButton7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jRadioButton7.setForeground(new java.awt.Color(35, 117, 145));
        jRadioButton7.setText("New or expecting parent");

        jRadioButton8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jRadioButton8.setForeground(new java.awt.Color(35, 117, 145));
        jRadioButton8.setText("Trauma survivor");

        sex1.setBackground(new java.awt.Color(35, 117, 145));
        sex1.setForeground(new java.awt.Color(255, 255, 255));
        sex1.setText("Male");
        sex1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sex1ActionPerformed(evt);
            }
        });

        sex2.setBackground(new java.awt.Color(35, 117, 145));
        sex2.setForeground(new java.awt.Color(255, 255, 255));
        sex2.setText("Female");
        sex2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sex2ActionPerformed(evt);
            }
        });

        sex3.setBackground(new java.awt.Color(35, 117, 145));
        sex3.setForeground(new java.awt.Color(255, 255, 255));
        sex3.setText("Prefer not to say");
        sex3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sex3ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(35, 117, 145));
        jLabel16.setText("Select all that apply. Select all that apply.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(883, 883, 883))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(665, 665, 665))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(265, 265, 265))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(namefield)
                                    .addGap(158, 158, 158)))
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(thirteen, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fourteen, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fifteen, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(sixteen, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(ten, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(eleven, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                        .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                        .addComponent(twelve, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton4)
                                    .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButton5))
                                .addGap(85, 85, 85)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton1)
                                    .addComponent(jRadioButton2)
                                    .addComponent(jRadioButton7))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton6)
                            .addComponent(jLabel8)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(sex1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sex2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sex3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel16))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, 0)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namefield, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel13))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(one)
                            .addComponent(two)
                            .addComponent(three)
                            .addComponent(four))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(five)
                            .addComponent(six)
                            .addComponent(seven)
                            .addComponent(eight))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nine)
                            .addComponent(ten)
                            .addComponent(eleven)
                            .addComponent(twelve))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(thirteen)
                            .addComponent(fourteen)
                            .addComponent(fifteen)
                            .addComponent(sixteen))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sex1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sex2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sex3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(0, 0, 0)
                .addComponent(jLabel16)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton2))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioButton3)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton5)
                            .addComponent(jRadioButton7)))
                    .addComponent(jRadioButton1))
                .addGap(0, 0, 0)
                .addComponent(jRadioButton8)
                .addGap(0, 0, 0)
                .addComponent(jRadioButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        hotline.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout hotlineLayout = new javax.swing.GroupLayout(hotline);
        hotline.setLayout(hotlineLayout);
        hotlineLayout.setHorizontalGroup(
            hotlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        hotlineLayout.setVerticalGroup(
            hotlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
        );

        button1.setBackground(new java.awt.Color(35, 117, 145));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("submit");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hotline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(hotline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 6, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

     
    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        // TODO add your handling code here:
        if(isAge == false){
            one.setBackground(new Color(65, 216, 191));
            age_array[0][0]= true;
            isAge = true;
        }
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        // TODO add your handling code here:
        if(isAge == false){
            two.setBackground(new Color(65, 216, 191));
            age_array[0][1]= true;
            isAge = true;
        }
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        // TODO add your handling code here:
        if(isAge == false){
            three.setBackground(new Color(65, 216, 191));
            age_array[0][2]= true;
            isAge = true;
        }
    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        // TODO add your handling code here:
        if(isAge == false){
            four.setBackground(new Color(65, 216, 191));
            age_array[0][3]= true;
            isAge = true;
        }
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        // TODO add your handling code here:
        if(isAge == false){
            five.setBackground(new Color(65, 216, 191));
            age_array[1][0]= true;
            isAge = true;
        }
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        // TODO add your handling code here:
        if(isAge == false){
            six.setBackground(new Color(65, 216, 191));
            age_array[1][1]= true;
            isAge = true;
        }
    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        // TODO add your handling code here:
        if(isAge == false){
            seven.setBackground(new Color(65, 216, 191));
            age_array[1][2]= true;
            isAge = true;
        }
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        // TODO add your handling code here:
        if(isAge == false){
            eight.setBackground(new Color(65, 216, 191));
            age_array[1][3]= true;
            isAge = true;
        }
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        // TODO add your handling code here:
        if(isAge == false){
            nine.setBackground(new Color(65, 216, 191));
            age_array[2][0]= true;
            isAge = true;
        }
    }//GEN-LAST:event_nineActionPerformed

    private void tenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenActionPerformed
        // TODO add your handling code here:
        if(isAge == false){
            ten.setBackground(new Color(65, 216, 191));
            age_array[2][1]= true;
            isAge = true;
        }
    }//GEN-LAST:event_tenActionPerformed

    private void elevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elevenActionPerformed
        // TODO add your handling code here:
        if(isAge == false){
            eleven.setBackground(new Color(65, 216, 191));
            age_array[2][2]= true;
            isAge = true;
        }
    }//GEN-LAST:event_elevenActionPerformed

    private void twelveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twelveActionPerformed
        // TODO add your handling code here:
        if(isAge == false){
            twelve.setBackground(new Color(65, 216, 191));
            age_array[2][3]= true;
            isAge = true;
        }
    }//GEN-LAST:event_twelveActionPerformed

    private void thirteenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirteenActionPerformed
        // TODO add your handling code here:
        if(isAge == false){
            thirteen.setBackground(new Color(65, 216, 191));
            age_array[3][0]= true;
            isAge = true;
        }
    }//GEN-LAST:event_thirteenActionPerformed

    private void fourteenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourteenActionPerformed
        // TODO add your handling code here:
        if(isAge == false){
            fourteen.setBackground(new Color(65, 216, 191));
            age_array[3][1]= true;
            isAge = true;
        }
    }//GEN-LAST:event_fourteenActionPerformed

    private void fifteenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fifteenActionPerformed
        // TODO add your handling code here:
        if(isAge == false){
            fifteen.setBackground(new Color(65, 216, 191));
            age_array[3][2]= true;
            isAge = true;
        }
    }//GEN-LAST:event_fifteenActionPerformed

    private void sixteenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixteenActionPerformed
        // TODO add your handling code here:
        if(isAge == false){
            sixteen.setBackground(new Color(65, 216, 191));
            age_array[3][3]= true;
            isAge = true;
        }
    }//GEN-LAST:event_sixteenActionPerformed

    private void sex1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sex1ActionPerformed
        // TODO add your handling code here:
        if (sex11 == false && sex22 == false && sex33 == false) {
            sex1.setBackground(new Color(65, 216, 191));
            sex11 = true;
        }
    }//GEN-LAST:event_sex1ActionPerformed

    private void sex2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sex2ActionPerformed
        if (sex11 == false && sex22 == false && sex33 == false) {
            sex2.setBackground(new Color(65, 216, 191));
            sex22 = true;
        }
    }//GEN-LAST:event_sex2ActionPerformed

    private void sex3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sex3ActionPerformed
        if (sex11 == false && sex22 == false && sex33 == false) {
            sex3.setBackground(new Color(65, 216, 191));
            sex33 = true;
        }
    }//GEN-LAST:event_sex3ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
       // TODO add your handling code here:
        name_ = namefield.getText();
        
        // Loop through the array of ages and if one is true, break
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4;j++){
                if(age_array[i][j] == true){
                    age_ = age_string[i][j];
                }
            }
        }
        
        // Set the gender if one is true
        if(sex11 == true) gender_ = "male";
        else if (sex22 == true) gender_ = "female";
        else gender_ = "prefer not to say";
       
        if(age_ == null || name_ == null || gender_ == null){
            JOptionPane.showMessageDialog(null, "Fill all the questions!");               
        }else{
            if(isSubmit == false){
            button1.setBackground(new Color(65, 216, 191));
            
            // Get the information and display it to the Data.csv file
            Points person = new Points(name_, age_, gender_);
            person.getData();
            
            // Display the answer history of the user, coded it here to prevent getting an error
            history.isDisplay = true;
            
            // Make the treatment and treatment plan form openable
            Main.opentreat = true;
            Main.openplan = true;
            
            // Make the submit button one click only to prevent doubling the data
            isSubmit = true;
            } 
        }
    }//GEN-LAST:event_button1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.button.Button button1;
    private javax.swing.JButton eight;
    private javax.swing.JButton eleven;
    private javax.swing.JButton fifteen;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton fourteen;
    private com.raven.swing.RoundPanel hotline;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JLabel jTextField5;
    private javax.swing.JTextField namefield;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private com.raven.swing.RoundPanel roundPanel1;
    private javax.swing.JButton seven;
    private com.raven.button.Button sex1;
    private com.raven.button.Button sex2;
    private com.raven.button.Button sex3;
    private javax.swing.JButton six;
    private javax.swing.JButton sixteen;
    private javax.swing.JButton ten;
    private javax.swing.JButton thirteen;
    private javax.swing.JButton three;
    private javax.swing.JButton twelve;
    private javax.swing.JButton two;
    // End of variables declaration//GEN-END:variables
}

class RoundedPanel extends JPanel
    {
        private Color backgroundColor;
        private int cornerRadius = 15;
        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }
        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;
            
        }
        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
            
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
//            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
//             
        }
    }
