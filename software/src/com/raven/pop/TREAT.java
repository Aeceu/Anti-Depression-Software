
package com.raven.pop;

//import forms

import com.raven.main.Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JLabel;


public class TREAT extends javax.swing.JPanel {
    public  int total = 0;
    public TREAT() {
        initComponents();
        setOpaque(false);
        
        getScore();
        
        if (total <= 9 && total >= 0) {
            mini();
        } else if (total >= 10 && total <= 16) {
            mild();
        } else if (total >= 17 && total <= 23) {
            moderate();
        } else if (total >= 24 && total <= 30) {
            extreme();
        } else {
        }
    }
    public int getTotal(){
        return total;
    }
    public void getScore(){
        // get the total points of the 10 question ONLY
        for(int i = 0; i < Main.total_score.length;i++){
            if(i < 10){
                total+=Main.total_score[i];
            }
        }
    }
    public void  setTreat(String text, int y){
        JLabel h2 = new JLabel();
        h2.setText(text);
        h2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        h2.setForeground(new Color(35, 117, 145));
        h2.setBounds(10, y, 1100, 60);
        h2.setVerticalAlignment(JLabel.TOP);
        h2.setHorizontalAlignment(JLabel.LEFT);
        
        box.add(h2);
    }
    public void mini(){
        h1.setText("What  does minimal depression feel like?");
        h1.setFont(new Font("Segoe UI", Font.BOLD, 32));
        h1.setForeground(new Color(35, 117, 145));
        h1.setBounds(10, 5, 500, 60);
        box.add(h1);
        
        JLabel h2 = new JLabel();
        String text = "Minimal depression involves is a feeling  blue temporarily. Your symptoms likely happens on average people, it is noticable as lack of self steem because something bad or traumatizing happen on you'";
        h2.setText("<html>" + text + "<html>");
        h2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        h2.setForeground(new Color(35, 117, 145));
        h2.setBounds(10, 40, 1100, 150);
        h2.setVerticalAlignment(JLabel.TOP);
        h2.setHorizontalAlignment(JLabel.LEFT);
        box.add(h2);
        
        String[] bullet = new String[]{"Minimal  depression may cause:", "*feeling unmotivated                  *having difficulty focusing", "*wanting to be left alone             *moving or talking slowly", "*eating more or less than usual   *losing empathy with others"};
        int y_axis = 90;
        for (int i = 0; i < bullet.length; i++) {
            setTreat(bullet[i], y_axis);
            y_axis += 25;
        }
        
        String text4 = "Persons suffering from low-grade depression are also advised to maintain a healthy lifestyle to avoid aggravating their symptoms." +
                              " Patients should attempt to eat healthily, exercise several days per week, and abstain from drugs and alcohol. "+
                              "Looking after your health is key to your recovery from low-level depression.";
        JLabel h3 = new JLabel();
        h3.setText("<html>" + text4 + "<html>");
        h3.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        h3.setForeground(new Color(35, 117, 145));
        h3.setBounds(10, 195, 1000, 150);
        h3.setVerticalAlignment(JLabel.TOP);
        h3.setHorizontalAlignment(JLabel.LEFT);
        box.add(h3);
        
        String[] bullet2 = new String[]{"Here are  ways to boost your mood during a depressive episode:", "*Stick to a healthy routine.    *Structure your day", "*Don’t be afraid                    *Stay active", "*Don’t isolate yourself          *Find new ways to relieve stress"};
        int y_axis2 = 275;
        for (int i = 0; i < bullet2.length; i++) {
            setTreat(bullet2[i], y_axis2);
            y_axis2 += 25;
        }
    }
    public void mild(){
        h1.setText("What  does mild depression feel like?");
        h1.setFont(new Font("Segoe UI", Font.BOLD, 32));
        h1.setForeground(new Color(35, 117, 145));
        h1.setBounds(10, 5, 500, 60);
        box.add(h1);
        
        JLabel h2 = new JLabel();
        String text = "Mild depression involves more than just feeling blue temporarily. Your symptoms can go on for days and are noticeable enough to interfere with your usual activities.";
        h2.setText("<html>" + text + "<html>");
        h2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        h2.setForeground(new Color(35, 117, 145));
        h2.setBounds(10, 40, 1100, 150);
        h2.setVerticalAlignment(JLabel.TOP);
        h2.setHorizontalAlignment(JLabel.LEFT);
        box.add(h2);
        
        String[] bullet = new String[]{"Mild depression may cause:","*irritability or anger   *appetite changes", "*hopelessness            *feelings of guilt and despair", "*self-loathing             *insomnia"};
        int y_axis = 90;
        for(int i = 0; i < bullet.length;i++){
            setTreat(bullet[i], y_axis);
            y_axis+=25;
        }
        
        String text3 = "Though mild depression is noticeable, it’s the most difficult to diagnose." + 
                " It’s easy to dismiss the symptoms and avoid discussing them with your doctor." + 
                "Despite the challenges in diagnosis, mild depression is the easiest to treat. "+ 
                "Certain lifestyle changes can go a long way in boosting serotonin levels in the brain, which can help fight depressive symptoms.";
        JLabel h3 = new JLabel();
        h3.setText("<html>" + text3 + "<html>");
        h3.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        h3.setForeground(new Color(35, 117, 145));
        h3.setBounds(10, 195, 1000, 150);
        h3.setVerticalAlignment(JLabel.TOP);
        h3.setHorizontalAlignment(JLabel.LEFT);
        box.add(h3);
        
        String[] bullet2 = new String[] {"Helpful lifestyle changes include:","*exercising daily                       *eating a balanced diet rich in fruits and vegetables","*adhering to a sleep schedule  *playing video games", "*doing activities that reduce stress, such as  reading, or listening to music "};
        int y_axis2 = 275;
        for(int i = 0; i < bullet2.length;i++){
            setTreat(bullet2[i], y_axis2);
            y_axis2+=25;
        }
    }
    public void moderate(){
        h1.setText("What  does moderate depression feel like?");
        h1.setFont(new Font("Segoe UI", Font.BOLD, 32));
        h1.setForeground(new Color(35, 117, 145));
        h1.setBounds(10, 5, 500, 60);
        box.add(h1);

        JLabel h2 = new JLabel();
        String text = "In terms of symptomatic severity, moderate depression is the next level up from mild cases. Moderate and mild depression share similar symptoms.Additionally, moderate depression may cause:";
        h2.setText("<html>" + text + "<html>");
        h2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        h2.setForeground(new Color(35, 117, 145));
        h2.setBounds(10, 40, 1000, 150);
        h2.setVerticalAlignment(JLabel.TOP);
        h2.setHorizontalAlignment(JLabel.LEFT);

        box.add(h2);

        String[] bullet = new String[]{"*problems with self-esteem    *increased sensitivities", "*feelings of worthlessness      *excessive worrying", "*reduced productivity"};
        int y_axis = 100;
        for (int i = 0; i < bullet.length; i++) {
            setTreat(bullet[i], y_axis);
            y_axis += 25;
        }

        String text3 = "Moderate depression is easier to diagnose than mild cases because the symptoms significantly impact your daily life. " +
                               "The key to a diagnosis, though, is to make sure you talk to your doctor about the symptoms you’re experiencing.";                          
        JLabel h3 = new JLabel();
        h3.setText("<html>" + text3 + "<html>");
        h3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        h3.setForeground(new Color(35, 117, 145));
        h3.setBounds(10, 195, 1000, 140);
        h3.setVerticalAlignment(JLabel.TOP);
        h3.setHorizontalAlignment(JLabel.LEFT);
        box.add(h3);
        
        String text4 = "SSRIs, such as sertraline (Zoloft) or paroxetine (Paxil), may be prescribed. These medications can take up to six weeks to take full effect. Cognitive behavioral therapy (CBT) is also used in some cases of moderate depression.";                    
        JLabel h4 = new JLabel();
        h4.setText("<html>" + text4 + "<html>");
        h4.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        h4.setForeground(new Color(35, 117, 145));
        h4.setBounds(10, 280, 1000, 150);
        h4.setVerticalAlignment(JLabel.TOP);
        h4.setHorizontalAlignment(JLabel.LEFT);
        box.add(h4);

    }
    public void extreme(){
        h1.setText("What  does extreme  depression feel like?");
        h1.setFont(new Font("Segoe UI", Font.BOLD, 32));
        h1.setForeground(new Color(35, 117, 145));
        h1.setBounds(10, 5, 500, 60);
        box.add(h1);

        JLabel h2 = new JLabel();
        String text = "Extreme  epression is the more-severe form of depression, also known as major depression or major depressive disorder." + 
                            "If you have 5 or more of these symptoms for at least 2 weeks, you may be diagnosed with depression. These feelings are a noticeable change from what’s “normal” for you." +
                            "The symptoms of depression may look like other mental health conditions. Always see a healthcare provider for a diagnosis.";
        h2.setText("<html>" + text + "<html>");
        h2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        h2.setForeground(new Color(35, 117, 145));
        h2.setBounds(10, 40, 1000, 150);
        h2.setVerticalAlignment(JLabel.TOP);
        h2.setHorizontalAlignment(JLabel.LEFT);
        box.add(h2);

        String[] bullet = new String[]{"Signs and symptoms of extreme depression may include:", "*Frequent or recurrent thoughts of death, suicidal thoughts, suicide attempts or suicide", "*Unexplained physical problems, such as back pain or headaches", "*Anxiety, agitation or restlessness","*Loss of interest or pleasure in most or all normal activities, such as sex, hobbies or sports"};
        int y_axis = 140;
        for (int i = 0; i < bullet.length; i++) {
            setTreat(bullet[i], y_axis);
            y_axis += 25;
        }

        String text3 = "Clinical depression can affect people of any age, including children. However, clinical depression symptoms, even if severe, usually improve with psychological counseling, antidepressant medications or a combination of the two.";
        JLabel h3 = new JLabel();
        h3.setText("<html>" + text3 + "<html>");
        h3.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        h3.setForeground(new Color(35, 117, 145));
        h3.setBounds(10, 270, 1000, 150);
        h3.setVerticalAlignment(JLabel.TOP);
        h3.setHorizontalAlignment(JLabel.LEFT);
        box.add(h3);
        
        String[] bullet1 = new String[]{"*Get help. If you think you may be depressed, see a healthcare provider as soon as possible.", "*Set realistic goals in light of the depression and don’t take on too much.", "*Try to be with other people and confide in someone. It’s usually better than being alone and secretive."};
        int y_axis1 = 320;
        for (int i = 0; i < bullet1.length; i++) {
            setTreat(bullet1[i], y_axis1);
            y_axis1 += 25;
        }

    }
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(35,117,145));
        g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20
        ));
        g2.dispose();
        super.paint(g);  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        box = new com.raven.swing.RoundPanel();
        h1 = new java.awt.Label();

        box.setBackground(new java.awt.Color(255, 255, 255));

        h1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        h1.setForeground(new java.awt.Color(35, 117, 145));

        javax.swing.GroupLayout boxLayout = new javax.swing.GroupLayout(box);
        box.setLayout(boxLayout);
        boxLayout.setHorizontalGroup(
            boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(h1, javax.swing.GroupLayout.DEFAULT_SIZE, 1045, Short.MAX_VALUE)
                .addContainerGap())
        );
        boxLayout.setVerticalGroup(
            boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxLayout.createSequentialGroup()
                .addComponent(h1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 352, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(box, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(box, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.RoundPanel box;
    private java.awt.Label h1;
    // End of variables declaration//GEN-END:variables
}
