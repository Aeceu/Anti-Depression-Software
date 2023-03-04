package com.raven.treatment;

import com.raven.pop.TREAT;
import com.raven.scores.Points;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class treat extends javax.swing.JPanel {

    TREAT treat = new TREAT();

    public static boolean isScore = true;
    public static boolean isAnswer = true;
    
    public treat() {
        initComponents();
        setBackground(new Color(23, 70, 162));
        
        about1.setVisible(false);
        history1.setVisible(false);
        treating.setVisible(true);
        button1.setBackground(new Color(65, 216, 191));
        
        if(treat.getTotal() <= 9 && treat.getTotal()  >= 0){
            mini();
        }else if (treat.getTotal()  >= 10 && treat.getTotal() <= 16){
            low();
        }else if (treat.getTotal()  >= 17 && treat.getTotal() <= 23){
            moderate();
        }else if (treat.getTotal()  >=24 && treat.getTotal() <= 30){
            extreme();
        }else{
            nothing();
        }
        
        scores.setText("ABOUT YOUR SCORE:  "+ treat.getTotal() + " / 30 ");
        answers.setText("YOUR ANSWERS");
        
        
    }
    
    
    public void mini(){
        jPanel1.setBackground(Color.red);

        JLabel label = new JLabel();
        label.setOpaque(false);
        label.setText("Minimal  Depression");
        label.setBounds(10, 50, 700, 65);
        label.setFont(new Font("Segoe UI", Font.BOLD, 48));
        label.setForeground(new Color(35, 117, 145));
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.LEFT);

        JLabel label1 = new JLabel();
        label1.setOpaque(false);
        label1.setText(Points.name.toUpperCase() + ", YOUR SYMPTOMS TESTING SCORE WAS ");
        label1.setBounds(10, 10, 500, 60);
        label1.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        label1.setForeground(new Color(35, 117, 145));

        String test = "Your results indicate that you may be experiencing signs of minimal depression. These results are not meant to be a diagnosis."
                + " You can meet with a doctor or therapist to get a diagnosis and/or access therapy or medications. Sharing these results with someone "
                + "you trustcan be a great place to start.";
        JLabel label2 = new JLabel();
        label2.setOpaque(false);
        label2.setText("<html>" + test + "</html>");
        label2.setBounds(10, 110, 1050, 400);
        label2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        label2.setForeground(new Color(35, 117, 145));
        label2.setVerticalAlignment(JLabel.TOP);
        label2.setHorizontalAlignment(JLabel.LEFT);

        jPanel3.add(label1);
        jPanel3.add(label);
        jPanel3.add(label2);
    }
    public void low(){
        jPanel1.setBackground(Color.red);
        
        JLabel label = new JLabel();
        label.setOpaque(false);
        label.setText("Mild  Depression");
        label.setBounds(10, 50, 700, 65);
        label.setFont(new Font("Segoe UI", Font.BOLD, 48));
        label.setForeground(new Color(35,117,145));
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.LEFT);
        
        JLabel label1 = new JLabel();
        label1.setOpaque(false);
        label1.setText(Points.name.toUpperCase() + ", YOUR SYMPTOMS TESTING SCORE WAS ");
        label1.setBounds(10, 10, 500, 60);
        label1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        label1.setForeground(new Color(35, 117, 145));
        
        String test = "Your results indicate that you may be experiencing signs of mild depression. These results are not meant to be a diagnosis."
                + " You can meet with a doctor or therapist to get a diagnosis and/or access therapy or medications. Sharing these results with someone "
                + "you trustcan be a great place to start.";
        JLabel label2 = new JLabel();
        label2.setOpaque(false);
        label2.setText("<html>" + test + "</html>");
        label2.setBounds(10, 110, 1050, 400);
        label2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        label2.setForeground(new Color(35, 117, 145));
        label2.setVerticalAlignment(JLabel.TOP);
        label2.setHorizontalAlignment(JLabel.LEFT);
        
        jPanel3.add(label1);
        jPanel3.add(label);
        jPanel3.add(label2);
    }
    public void moderate(){
        jPanel1.setBackground(Color.red);
        
        JLabel label = new JLabel();
        label.setOpaque(false);
        label.setText("Moderate  Depression");
        label.setBounds(10, 50, 700, 65);
        label.setFont(new Font("Segoe UI", Font.BOLD, 48));
        label.setForeground(new Color(35,117,145));
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.LEFT);
        
        JLabel label1 = new JLabel();
        label1.setOpaque(false);
        label1.setText(Points.name.toUpperCase() + ",  YOUR SYMPTOMS TESTING SCORE WAS ");
        label1.setBounds(10, 10, 500, 60);
        label1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        label1.setForeground(new Color(35, 117, 145));
        
        String test = "Your results indicate that you may be experiencing signs of moderate depression. These results are not meant to be a diagnosis."
                + " You can meet with a doctor or therapist to get a diagnosis and/or access therapy or medications. Sharing these results with someone "
                + "you trustcan be a great place to start.";
        JLabel label2 = new JLabel();
        label2.setOpaque(false);
        label2.setText("<html>" + test + "</html>");
        label2.setBounds(10, 110, 1050, 400);
        label2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        label2.setForeground(new Color(35, 117, 145));
        label2.setVerticalAlignment(JLabel.TOP);
        label2.setHorizontalAlignment(JLabel.LEFT);

        jPanel3.add(label1);
        jPanel3.add(label);
        jPanel3.add(label2);
    }
    public void high_risk(){
        jPanel1.setBackground(Color.red);

        JLabel label = new JLabel();
        label.setOpaque(false);
        label.setText("High risk  Depression");
        label.setBounds(10, 50, 700, 65);
        label.setFont(new Font("Segoe UI", Font.BOLD, 48));
        label.setForeground(new Color(35,117,145));
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.LEFT);
        
        JLabel label1 = new JLabel();
        label1.setOpaque(false);
        label1.setText(Points.name.toUpperCase() + ",  YOUR SYMPTOMS TESTING SCORE WAS ");
        label1.setBounds(10, 10, 500, 60);
        label1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        label1.setForeground(new Color(35,117,145));
        
        
        String test = "Your results indicate that you may be experiencing signs of high risk or severe  depression. These results are not meant to be a diagnosis."
                + " You can meet with a doctor or therapist to get a diagnosis and/or access therapy or medications. Sharing these results with someone "
                + "you trustcan be a great place to start.";
        JLabel label2 = new JLabel();
        label2.setOpaque(false);
        label2.setText("<html>" + test + "</html>");
        label2.setBounds(10, 110, 1050, 400);
        label2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        label2.setForeground(new Color(35, 117, 145));
        label2.setVerticalAlignment(JLabel.TOP);
        label2.setHorizontalAlignment(JLabel.LEFT);

        jPanel3.add(label1);
        jPanel3.add(label);
        jPanel3.add(label2);
       
        
    }
    public void extreme(){
        jPanel1.setBackground(Color.red);

        JLabel label = new JLabel();
        label.setOpaque(false);
        label.setText("Extreme  Depression");
        label.setBounds(10, 50, 700, 65);
        label.setFont(new Font("Segoe UI", Font.BOLD, 48));
        label.setForeground(new Color(35,117,145));
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.LEFT);
        
        JLabel label1 = new JLabel();
        label1.setOpaque(false);
        label1.setText(Points.name.toUpperCase() + ",  YOUR SYMPTOMS TESTING SCORE WAS ");
        label1.setBounds(10, 10, 500, 60);
        label1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        label1.setForeground(new Color(35,117,145));

        String test = "Your results indicate that you may be experiencing signs of extreme  depression. These results are not meant to be a diagnosis."
                + " You can meet with a doctor or therapist to get a diagnosis and/or access therapy or medications. Sharing these results with someone "
                + "you trustcan be a great place to start.";
        JLabel label2 = new JLabel();
        label2.setOpaque(false);
        label2.setText("<html>"+test+"</html>");
        label2.setBounds(10, 110, 1050, 400);
        label2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        label2.setForeground(new Color(35, 117, 145));
        label2.setVerticalAlignment(JLabel.TOP);
        label2.setHorizontalAlignment(JLabel.LEFT);
        
        jPanel3.add(label1);
        jPanel3.add(label);
        jPanel3.add(label2);        
    }
    public void nothing(){
        jPanel1.setBackground(Color.red);

        JLabel label = new JLabel();
        label.setText(Points.name.toUpperCase() + ",  Fill everything first");
        label.setOpaque(false);
        label.setBounds(10, 50, 700, 65);
        label.setFont(new Font("Segoe UI", Font.BOLD, 48));
        label.setForeground(new Color(35,117,145));
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.LEFT);
 
        jPanel3.add(label);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new RoundedPanel(30, new Color(35,117,145));
        jPanel3 = new RoundedPanel(30, new Color(233,238,245));
        jPanel2 = new RoundedPanel(30, new Color(35,117,145));
        jPanel4 = new RoundedPanel(30, new Color(233,238,245));
        button1 = new com.raven.button.Button();
        scores = new com.raven.button.Button();
        answers = new com.raven.button.Button();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel6 = new javax.swing.JPanel();
        history1 = new com.raven.pop.history();
        jPanel5 = new javax.swing.JPanel();
        about1 = new com.raven.pop.about();
        jPanel7 = new javax.swing.JPanel();
        treating = new com.raven.pop.TREAT();

        setBackground(new java.awt.Color(59, 182, 164));
        setOpaque(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 208, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setOpaque(false);

        button1.setBackground(new java.awt.Color(35, 117, 145));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("TREATMENT");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        scores.setBackground(new java.awt.Color(35, 117, 145));
        scores.setForeground(new java.awt.Color(255, 255, 255));
        scores.setText("button1");
        scores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoresActionPerformed(evt);
            }
        });

        answers.setBackground(new java.awt.Color(35, 117, 145));
        answers.setForeground(new java.awt.Color(255, 255, 255));
        answers.setText("button2");
        answers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answersActionPerformed(evt);
            }
        });

        jPanel6.setOpaque(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(history1, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(history1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setOpaque(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(about1, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(about1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel7.setOpaque(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(treating, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(treating, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLayeredPane1.setLayer(jPanel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(answers, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scores, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(answers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void scoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoresActionPerformed
        if(isScore){
        about1.setVisible(true);
        history1.setVisible(false);
        treating.setVisible(false);
        scores.setBackground(new Color(65, 216, 191));
        answers.setBackground(new Color(35, 117, 145));
        button1.setBackground(new Color(35, 117, 145));
        }
    }//GEN-LAST:event_scoresActionPerformed

    private void answersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answersActionPerformed
        if(isAnswer){
        about1.setVisible(false);
        history1.setVisible(true);
        treating.setVisible(false);
        answers.setBackground(new Color(65, 216, 191));
        scores.setBackground(new Color(35, 117, 145));
        button1.setBackground(new Color(35, 117, 145));
        }
        
        
    }//GEN-LAST:event_answersActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        about1.setVisible(false);
        history1.setVisible(false);
        treating.setVisible(true);
        answers.setBackground(new Color(35, 117, 145));
        scores.setBackground(new Color(35, 117, 145));
        button1.setBackground(new Color(65, 216, 191));
    }//GEN-LAST:event_button1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.pop.about about1;
    private com.raven.button.Button answers;
    private com.raven.button.Button button1;
    private com.raven.pop.history history1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private com.raven.button.Button scores;
    private com.raven.pop.TREAT treating;
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
