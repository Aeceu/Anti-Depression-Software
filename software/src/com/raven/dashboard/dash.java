package com.raven.dashboard;

import com.raven.scores.Points;
import com.raven.assessment.assess;
import com.raven.cell.CellName;
import com.raven.chart.ModelChart;
import com.raven.main.Main;
import com.raven.model.ModelName;
import com.raven.model.ModelStaff;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import javax.swing.JPanel;




public class dash extends javax.swing.JPanel {
    
    
    public static boolean isStart = true;
    
    double[] chart0 = new double[]{0,0};
    double[] chart1 = new double[]{0,0};
    double[] chart2 = new double[]{0,0};
    double[] chart3 = new double[]{0,0};
    double[] chart4 = new double[]{0,0};
            
    double[] chart5 = new double[]{0,0};
    double[] chart6 = new double[]{0,0};
    double[] chart7 = new double[]{0,0};
    double[] chart8 = new double[]{0,0};
    double[] chart9 = new double[]{0,0};
    double[] chart10 = new double[]{0,0};
    int totals = 0;
    
    private static boolean isClick = true;
    
    
    
    public dash() {
        initComponents();
        table1.addTableStyle(jScrollPane1);
        
        display_chart10();
        display_data();
        
        init();
        initDataTable();
        
    }
    private void display_chart10()
    {
    
     for (int i = 0; i < Main.total_score.length; i++) 
     {
         if(i > 9)
         {
            totals += Main.total_score[i];   
         }
     }
     chart10[0] = totals;
    }
    
   private void display_data()
   {   
       for (int i = 0; i < Main.total_score.length; i++) 
       {
           if (i >= 0 && i < 10) 
           {
               getChart(i)[0] = Main.total_score[i];
           }
       }      
   }
    
    private void init(){
        curveChart1.addLegend(Points.name+"(you)", new Color(186, 37, 37), new Color(241, 100, 120));
        
        curveChart1.addData(new ModelChart("1st", chart0));
        curveChart1.addData(new ModelChart("2nd", chart1));
        curveChart1.addData(new ModelChart("3rd", chart2));
        curveChart1.addData(new ModelChart("4th", chart3));
        curveChart1.addData(new ModelChart("5th", chart4));

        curveChart1.addData(new ModelChart("6th", chart5));
        curveChart1.addData(new ModelChart("7th", chart6));
        curveChart1.addData(new ModelChart("8th", chart7));
        curveChart1.addData(new ModelChart("9th", chart8));
        curveChart1.addData(new ModelChart("10th", chart9));
        
        chart.addLegend("More", new Color(255, 141, 41), new Color(255, 205, 56));
        chart.addData(new ModelChart("Main things that contributes more ", chart10));
        
        chart.start();
        curveChart1.start();
    }
    
    private void initDataTable(){
        table1.addTableCell(new CellName(), 0);
        table1.addRow(new ModelStaff(new ModelName(Points.name),Points.age,Points.gender, assess.total), false);
    }
   
    private double[] getChart(int index){
        switch (index) {
            case 0:
                return chart0;
            case 1:
                return chart1;
            case 2:
                return chart2;
            case 3:
                return chart3;
            case 4:
                return chart4;
            case 5:
                return chart5;
            case 6:
                return chart6;
            case 7:
                return chart7;
            case 8:
                return chart8;
            case 9:
                return chart9;
            default:
                return null;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new RoundedPanel(40, new Color(51,51,51));
        chart = new com.raven.chart.CurveChart();
        jPanel2 = new RoundedPanel(30, new Color(233,238,245));
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new com.raven.swing.Table();
        jPanel3 = new RoundedPanel(40, new Color(51,51,51));
        curveChart1 = new com.raven.chart.CurveChart();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chart, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chart, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new Color(255,255,255));

        jScrollPane1.setForeground(new java.awt.Color(0, 0, 204));

        table1.setForeground(new java.awt.Color(0, 51, 204));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Age", "Gender", "Total Depression Points"
            }
        ));
        jScrollPane1.setViewportView(table1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(curveChart1, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(curveChart1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.chart.CurveChart chart;
    private com.raven.chart.CurveChart curveChart1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private com.raven.swing.Table table1;
    // End of variables declaration//GEN-END:variables
}class RoundedPanel extends JPanel
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

