
package com.raven.pop;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;

import com.raven.main.Main;
import java.awt.Label;

public class history extends javax.swing.JPanel {
    public static boolean isDisplay = false;
    String one = "NOT AT ALL ";
    String two = "SEVERAL DAYS";
    String three = "MORE THAN HALF DAYS";
    String four = "NEARLY EVERYDAY";

    public history() {
        initComponents();
        setOpaque(false);
        
        display();
        


    }
    public void display(){
        if(isDisplay){
            for (int i = 0; i < 10; i++) {
                if (Main.total_score[i] == 0) {
                    getans(i + 1).setText(one + "(" + 0 + ")");
                } else if (Main.total_score[i] == 1) {
                    getans(i + 1).setText(two + "(" + 1 + ")");
                } else if (Main.total_score[i] == 2) {
                    getans(i + 1).setText(three + "(" + 2 + ")");
                } else {
                    getans(i + 1).setText(four + "(" + 3 + ")");
                }
            }    
        }
    }
    public Label getans(int index){
        switch (index) {
            case 1:
                return ans1;
            case 2:
                return ans2;
            case 3:
                return ans3;
            case 4:
                return ans4;
            case 5:
                return ans5;
            case 6:
                return ans6;
            case 7:
                return ans7;
            case 8:
                return ans8;
            case 9:
                return ans9;
            case 10:
                return ans10;
            default:
                return null;
        }
    };
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(35,117,145));
        g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));
        g2.dispose();
        super.paint(g);  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new com.raven.swing.RoundPanel();
        label1 = new java.awt.Label();
        q1 = new javax.swing.JLabel();
        q2 = new javax.swing.JLabel();
        q3 = new javax.swing.JLabel();
        q4 = new javax.swing.JLabel();
        q5 = new javax.swing.JLabel();
        q6 = new javax.swing.JLabel();
        q7 = new javax.swing.JLabel();
        q81 = new javax.swing.JLabel();
        q82 = new javax.swing.JLabel();
        q9 = new javax.swing.JLabel();
        q10 = new javax.swing.JLabel();
        q11 = new javax.swing.JLabel();
        ans1 = new java.awt.Label();
        ans2 = new java.awt.Label();
        ans3 = new java.awt.Label();
        ans10 = new java.awt.Label();
        ans9 = new java.awt.Label();
        ans8 = new java.awt.Label();
        ans6 = new java.awt.Label();
        ans7 = new java.awt.Label();
        ans4 = new java.awt.Label();
        ans5 = new java.awt.Label();

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));

        label1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        label1.setForeground(new java.awt.Color(35, 117, 145));
        label1.setText("Your answers");

        q1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        q1.setForeground(new java.awt.Color(35, 117, 145));
        q1.setText("1. Little interest or pleasure in doing things");

        q2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        q2.setForeground(new java.awt.Color(35, 117, 145));
        q2.setText("2. Feeling down, depressed, or hopeless");

        q3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        q3.setForeground(new java.awt.Color(35, 117, 145));
        q3.setText("3. Trouble falling or staying asleep, or sleeping too much");

        q4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        q4.setForeground(new java.awt.Color(35, 117, 145));
        q4.setText("4. Feeling tired or having little energy");

        q5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        q5.setForeground(new java.awt.Color(35, 117, 145));
        q5.setText("5. Poor appetite or overeating");

        q6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        q6.setForeground(new java.awt.Color(35, 117, 145));
        q6.setText("6. Feeling bad about yourself - or that you are a failure or have let yourself or your family down");

        q7.setBackground(new java.awt.Color(255, 255, 255));
        q7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        q7.setForeground(new java.awt.Color(35, 117, 145));
        q7.setText("7. Trouble concentrating on things, such as reading the newspaper or watching television");

        q81.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        q81.setForeground(new java.awt.Color(35, 117, 145));
        q81.setText("8. Moving or speaking so slowly that other people could have noticed or the opposite - being so");

        q82.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        q82.setForeground(new java.awt.Color(35, 117, 145));
        q82.setText("fidgety or restless that you have been moving around a lot more than usual");

        q9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        q9.setForeground(new java.awt.Color(35, 117, 145));
        q9.setText("9. Thoughts that you would be better off dead, or of hurting yourself");

        q10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        q10.setForeground(new java.awt.Color(35, 117, 145));
        q10.setText("10. If you checked off any problems, how difficult have these problems made it for you at ");

        q11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        q11.setForeground(new java.awt.Color(35, 117, 145));
        q11.setText("work, home, or with other people?");

        ans1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ans1.setForeground(new java.awt.Color(35, 117, 145));
        ans1.setText("label2");

        ans2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ans2.setForeground(new java.awt.Color(35, 117, 145));
        ans2.setText("label2");

        ans3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ans3.setForeground(new java.awt.Color(35, 117, 145));
        ans3.setText("label2");

        ans10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ans10.setForeground(new java.awt.Color(35, 117, 145));
        ans10.setText("label2");

        ans9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ans9.setForeground(new java.awt.Color(35, 117, 145));
        ans9.setText("label2");

        ans8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ans8.setForeground(new java.awt.Color(35, 117, 145));
        ans8.setText("label2");

        ans6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ans6.setForeground(new java.awt.Color(35, 117, 145));
        ans6.setText("label2");

        ans7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ans7.setForeground(new java.awt.Color(35, 117, 145));
        ans7.setText("label2");

        ans4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ans4.setForeground(new java.awt.Color(35, 117, 145));
        ans4.setText("label2");

        ans5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ans5.setForeground(new java.awt.Color(35, 117, 145));
        ans5.setText("label2");

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(q11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(q10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(q9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(q82, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(q81, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(q7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(q6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(q5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(q4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(q3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(q2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(q1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ans9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ans8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ans7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ans6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ans5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ans4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ans3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ans2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ans10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ans1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)))
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(q2)
                        .addGap(0, 0, 0)
                        .addComponent(q3)
                        .addGap(0, 0, 0)
                        .addComponent(q4)
                        .addGap(0, 0, 0)
                        .addComponent(q5)
                        .addGap(3, 3, 3)
                        .addComponent(q6)
                        .addGap(0, 0, 0)
                        .addComponent(q7)
                        .addGap(0, 0, 0)
                        .addComponent(q81)
                        .addGap(0, 0, 0)
                        .addComponent(q82)
                        .addGap(0, 0, 0)
                        .addComponent(q9)
                        .addGap(0, 0, 0)
                        .addComponent(q10))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ans1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addComponent(ans2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(25, 25, 25))
                            .addComponent(ans3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(ans4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(ans5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(ans6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(ans8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addComponent(ans7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(25, 25, 25)
                        .addComponent(ans9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(ans10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addComponent(q11)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label ans1;
    private java.awt.Label ans10;
    private java.awt.Label ans2;
    private java.awt.Label ans3;
    private java.awt.Label ans4;
    private java.awt.Label ans5;
    private java.awt.Label ans6;
    private java.awt.Label ans7;
    private java.awt.Label ans8;
    private java.awt.Label ans9;
    private java.awt.Label label1;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q10;
    private javax.swing.JLabel q11;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel q3;
    private javax.swing.JLabel q4;
    private javax.swing.JLabel q5;
    private javax.swing.JLabel q6;
    private javax.swing.JLabel q7;
    private javax.swing.JLabel q81;
    private javax.swing.JLabel q82;
    private javax.swing.JLabel q9;
    private com.raven.swing.RoundPanel roundPanel1;
    // End of variables declaration//GEN-END:variables
}
