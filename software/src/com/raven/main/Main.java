package com.raven.main;

import com.raven.event.MenuEvent;
import java.awt.Color;
import java.awt.Component;

// import forms
import com.raven.assessment.assess;
import com.raven.symtoms.symp;
import com.raven.symtoms.symp1;
import com.raven.dashboard.dash;
import com.raven.treatment.treat;
import com.raven.home.Home;
import com.raven.pop.error;
import com.raven.pop.message;
import com.raven.pop.submission;
import com.raven.pop.window1;
import com.raven.treatmentPlan.Plan;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JPanel;
import raven.glasspanepopup.GlassPanePopup;



public class Main extends javax.swing.JFrame {
   
    private static int person = 0;
    
    public static boolean openDash = false;
    public static boolean opensymp = false;
    public static boolean opensymp1 = false;
    public static boolean openassess = false;
    public static boolean opentreat = false;
    public static boolean openplan = false;
    
    
    private static Integer[] append(Integer[] arr, int element){
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        list.add(element);
        return list.toArray(new Integer[0]);
    } 
    public  void add_points(int num){
        total_score = append(total_score,num);
    }
    public int getTotal(){
        int total = 0;
        for(int i = 0; i < total_score.length;i++){
          total += total_score[i];  
        }
        return total;
    }
    public void add_index(int num){
        person +=num;
    }
    public int getPerson(){
        return person;
    }
   
    public static Integer[] total_score = {};
        
    public Main() {
        GlassPanePopup.install(this);
        initComponents();
        getContentPane().setBackground(new Color(23, 70, 162)); // border color
        //setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 30, 30));
        
        
        // For event button 
        MenuEvent event = new MenuEvent() {
            @Override
            public void menuSelected(int index) {
                switch (index) {
                    case 0:
                        showForm(new Home());
                        break;
                    case 1:
                        showForm(new dash());
                        break;
                    case 2:
                        if(opensymp == true){
                            showForm(new symp());
                        }else{
                            GlassPanePopup.showPopup(new message());
                            showForm(new error());
                        }
                        break;
                    case 3:
                        if (opensymp == true) {
                            showForm(new symp1());
                        } else {
                            GlassPanePopup.showPopup(new message());
                            showForm(new error());
                        }    
                        break;
                    case 4:
                        if(symp.count == 6 && symp1.count2 == 4){
                            showForm(new assess());
                        }else{
                            GlassPanePopup.showPopup(new submission());
                            showForm(new error());
                        }
                        break;
                    case 5:
                        if(opentreat){
                            showForm(new treat());
                        }else{
                            GlassPanePopup.showPopup(new window1()); 
                            showForm(new error());
                        }
                        break;
                    case 6:if(opentreat){
                            showForm(new Plan());     
                        }else{
                            GlassPanePopup.showPopup(new window1()); 
                            showForm(new error());
                        }           
                        break;
                    case 7:                 
                        System.exit(0);
                        break;
                    default:
                        break;
                }
            }
        };
            
        menu.initMenu(event);
        
        menu.setSelected(0); 
    }
    
    
    
    public void showForm(Component com) {
        body.removeAll();
        body.add(com);
        body.revalidate();
        body.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menu = new com.raven.component.Menu();
        body = new RoundedPanel(30, new Color(255, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 213, 190));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        menu.setBackground(new java.awt.Color(62, 188, 172));

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setForeground(new java.awt.Color(255, 255, 255));
        body.setOpaque(false);
        body.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 1151, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

 
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
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JPanel jPanel1;
    private com.raven.component.Menu menu;
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
