
package com.raven.treatmentPlan;

import com.raven.pop.TREAT;
import com.raven.swing.RoundPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;


public class Plan extends javax.swing.JPanel {
        TREAT treat = new TREAT();
    public Plan() {
        initComponents();

        if(treat.getTotal() <= 9 && treat.getTotal()  >= 0){
                header_minimal();
                medic_minimal();
                lifestyle_minimal();
        }else if (treat.getTotal()  >= 10 && treat.getTotal() <= 16){
                header_mild();
                medic_mild();
                lifestyle_mild();
        }else if (treat.getTotal()  >= 17 && treat.getTotal() <= 23){
                header_moderate();
                medic_moderate();
                lifestyle_moderate();
        }else if (treat.getTotal()  >=24 && treat.getTotal() <= 30){
                header_extreme();
                medic_extreme();
                lifestyle_extreme();
        }else{
            
        }

    }
    
    public void blueprint(String text1, String text2,int font_size1,int font_size2,  int y_position1, int x_position1, int height1, int y_position2, int x_position2,  int height2, RoundPanel box, boolean isBold,boolean  isPlain){
        
        JLabel p3 = new JLabel();
        p3.setText("<html>" + text1 + "<html>");
        if(isBold){
            p3.setFont(new Font("Segoe UI", Font.BOLD, font_size1));
        }else{
            p3.setFont(new Font("Segoe UI", Font.PLAIN, font_size1));
        }
        
        p3.setBounds(x_position1, y_position1, 560, height1);
        p3.setVerticalAlignment(JLabel.TOP);
        p3.setHorizontalAlignment(JLabel.LEFT);
        p3.setForeground(new Color(35, 117, 145));
        box.add(p3);

        
        JLabel p4 = new JLabel();
        p4.setText("<html>" + text2 + "<html>");
        if(isPlain){
            p4.setFont(new Font("Segoe UI", Font.PLAIN, font_size2));
        }else{
            p4.setFont(new Font("Segoe UI", Font.BOLD, font_size2));
        }
        
        p4.setBounds(x_position2, y_position2, 560, height2);
        p4.setVerticalAlignment(JLabel.TOP);
        p4.setHorizontalAlignment(JLabel.LEFT);
        p4.setForeground(new Color(35, 117, 145));
        box.add(p4);
    }
    
    public void header_minimal(){
        JLabel h1 = new JLabel();
        h1.setText("Minimal Depression Treatment Plan");
        h1.setFont(new Font("Segoe UI", Font.BOLD, 48));
        h1.setBounds(10, 0, 900, 65);
        h1.setHorizontalAlignment(JLabel.LEFT);
        h1.setForeground(new Color(35,117,145));
        box1.add(h1);
        
        String text = "Medications and psychotherapy are effective for most people with depression. \n" +
                            "Your primary care doctor or psychiatrist can prescribe medications to relieve symptoms." + 
                            "However, many people with depression also benefit from seeing a psychiatrist, psychologist or other mental health professional.";
        JLabel h2 = new JLabel();
        h2.setText("<html>"+ text + "<html>");
        h2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        h2.setBounds(10, 65, 1130, 70);
        h2.setVerticalAlignment(JLabel.TOP);
        h2.setHorizontalAlignment(JLabel.LEFT);
        h2.setForeground(new Color(35,117,145));
        box1.add(h2);
        
        String text1 = "If you have severe depression, you may need a hospital stay, or you may need to participate in an outpatient treatment program until your symptoms improve."+
                                "Here's a closer look at depression treatment options.";
        JLabel h3 = new JLabel();
        h3.setText("<html>" + text1 + "<html>");
        h3.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        h3.setBounds(10, 140, 1130, 50);
        h3.setVerticalAlignment(JLabel.TOP);
        h3.setHorizontalAlignment(JLabel.LEFT);
        h3.setForeground(new Color(35, 117, 145));
        box1.add(h3);
    }
    public void medic_minimal(){
        JLabel p1 = new JLabel();
        p1.setText("Minimal Depression Therapy");
        p1.setFont(new Font("Segoe UI", Font.BOLD, 38));
        p1.setBounds(5, 0, 800, 63);
        p1.setVerticalAlignment(JLabel.TOP);
        p1.setHorizontalAlignment(JLabel.LEFT);
        p1.setForeground(new Color(35, 117, 145));
        header2.add(p1);

        String text = "Talk therapy is effective for treating and managing a wide range of mental health conditions, not just depression.";
        JLabel p2 = new JLabel();
        p2.setText("<html>" + text + "<html>");
        p2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        p2.setBounds(5, 63, 525, 53);
        p2.setVerticalAlignment(JLabel.TOP);
        p2.setHorizontalAlignment(JLabel.LEFT);
        p2.setForeground(new Color(35, 117, 145));
        header2.add(p2);
        
        String text1 = "Therapy can help ease negative feelings in the moment and can also help you notice harmful patterns or behaviors in your life that can be addressed and changed."+
                                "Therapists can help you work on:";
        JLabel p3 = new JLabel();
        p3.setText("<html>" + text1 + "<html>");
        p3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        p3.setBounds(10, 140, 540, 74);
        p3.setVerticalAlignment(JLabel.TOP);
        p3.setHorizontalAlignment(JLabel.LEFT);
        p3.setForeground(new Color(35, 117, 145));
        box2.add(p3);
        
        String text2 = "*coping skills";
        String text3 = "*stress management";
        String text4 = "*self-esteem";
        String text5 = "*trauma recovery";
        blueprint(text2, text3,16,16, 207,10, 20 , 229,10, 25, box2,true,false);
        blueprint(text5, text4,16,16, 207,200, 25 , 229,200, 20, box2,true,false);
        
         String cognitive = "Cognitive Behavior Therapy";
         String about = "In depression, negative thought patterns such as self-doubt and feelings of guilt often make the problem worse."+
                                 "It aims to break these patterns bit by bit, so that people feel better about themselves."+
                                 "Cognitive behavioral therapy combines two treatment approaches:";
         blueprint(cognitive, about,16,16, 250,10, 30 , 270,10, 90, box2,true,true);
       
       String cog = "Cognitive Therapy";
       String about_cog = "It is based on the idea that problems are often caused less by things and situations themselves, but rather by the importance that people attach to them.";
        blueprint(cog, about_cog, 16, 16, 355,10, 30, 375,10, 70, box2, true, true);
        String bev = "Behavioral  Therapy";
        String about_bev = "Behavioral therapy is based on the assumption that behavior is learned and can also be unlearned." + 
                                        " The goal of behavioral therapy is to identify destructive patterns of behavior, then work at them and change them."; 
        blueprint(bev, about_bev, 16, 16, 420, 10, 20, 440, 10, 70, box2, true, true);
    }
    public void lifestyle_minimal(){
        JLabel p1 = new JLabel();
        p1.setText("Self-Care Suggestion");
        p1.setFont(new Font("Segoe UI", Font.BOLD, 40));
        p1.setBounds(5, 0, 540, 53);
        p1.setVerticalAlignment(JLabel.TOP);
        p1.setHorizontalAlignment(JLabel.LEFT);
        p1.setForeground(new Color(35, 117, 145));
        header3.add(p1);
        
        String text = "Below are some ways you can do for yourself  to complement your depression . Consult with your doctor before making any changes.";
        JLabel p2 = new JLabel();
        p2.setText("<html>" + text + "<html>");
        p2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        p2.setBounds(5, 58, 535, 53);
        p2.setVerticalAlignment(JLabel.TOP);
        p2.setHorizontalAlignment(JLabel.LEFT);
        p2.setForeground(new Color(35, 117, 145));
        header3.add(p2);
        
        String text1 = "1-Minute Mindfullenss Exercises";
        String text2 = "Research in 2019 suggests that regular meditation of a short duration can have similar health benefits as meditations of longer duration and higher intensity."+
                "The practice of mindfulness involves two types of meditation:" ;
        blueprint(text1, text2, 18, 16, 140,10, 20, 162,10, 75, box3, true, true);
        
        String text3 = "Traditional meditation:";
        String text4 = "You sit undisturbed and pay attention to your breath and body.";
        blueprint(text3, text4, 16, 16, 228,10, 20, 250,10, 20, box3, true, true);
        String text5 = "Activity meditation:";
        String text6 = "You focus your attention while doing daily activities like walking or washing dishes.";
        blueprint(text5, text6, 16, 16, 272,10, 20, 294,10, 25, box3, true, true);
        
        String emo = "Emotional Self-Care";
        String about_emo = "The centerpiece of self-care is the promotion of health and well-being. Emotional self-care is centered around ensuring your emotional needs are met and protected." + 
                                            "In a small 2014 studyTrusted Source of self-care among palliative care nurses and doctors, some effective strategies for emotional self-care they practiced included:";
        blueprint(emo, about_emo, 16, 16, 320, 10, 20, 340, 10, 120, box3, true, true);
        
        String pract1 = "*yoga";
        String pract2 = "*massage";
        String pract3 = "*socializing";
        String pract4 = "*maintaining positive relationships";
        
        blueprint(pract1, pract2, 18, 18, 455, 10, 25, 455, 110, 25, box3, true, false);
        blueprint(pract3, pract4, 18, 18, 475, 10, 25, 475, 110, 25, box3, true, false);  
    }
    
    public void header_mild(){
        JLabel h1 = new JLabel();
        h1.setText("Mild Treatment Plan");
        h1.setFont(new Font("Segoe UI", Font.BOLD, 48));
        h1.setBounds(10, 0, 800, 53);
        h1.setVerticalAlignment(JLabel.TOP);
        h1.setHorizontalAlignment(JLabel.LEFT);
        h1.setForeground(new Color(35,117,145));
        box1.add(h1);
        
        String text = "Mild depression involves depressive symptoms that are considered low-grade." +
                            "While many of the same symptoms of more severe depression are present, including irritability, sadness, and lack of motivation, they are often more subtle and less intense." +
                            "People with mild depression may not even realize they are depressed."+
                            "In fact, the chronic feelings of sadness and low mood they experience may have been around for so long that they feel normal." +
                            "However, it is not normal to go through life feeling unhappy all of the time." +
                            "Everyone experiences occasional bouts of low mood in response to sad or stressful life events, but constantly feeling depressed does not have to be the story of your life.";
        JLabel h2 = new JLabel();
        h2.setText("<html>"+ text + "<html>");
        h2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        h2.setBounds(10, 65, 1150, 170);
        h2.setVerticalAlignment(JLabel.TOP);
        h2.setHorizontalAlignment(JLabel.LEFT);
        h2.setForeground(new Color(35,117,140));
        box1.add(h2);
    }
    public void medic_mild(){
        JLabel p1 = new JLabel();
        p1.setText("Medication for Mild Depression");
        p1.setFont(new Font("Segoe UI", Font.BOLD, 36));
        p1.setBounds(5, 0, 800, 53);
        p1.setVerticalAlignment(JLabel.TOP);
        p1.setHorizontalAlignment(JLabel.LEFT);
        p1.setForeground(new Color(35, 117, 145));
        header2.add(p1);
        
        String text = "Your doctor or mental health professional could recommend medication to treat your mild depression." + 
                                " Medications can help correct chemical imbalances in your brain in order to stabilize your mood.";
        JLabel p2 = new JLabel();
        p2.setText("<html>" + text + "<html>");
        p2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        p2.setBounds(5, 43, 525, 68);
        p2.setVerticalAlignment(JLabel.TOP);
        p2.setHorizontalAlignment(JLabel.LEFT);
        p2.setForeground(new Color(35, 117, 145));
        header2.add(p2);
        
        String text1 = "There are several types of medication used to treat depression, and each have different benefits and side effects. The most commonly prescribed medications include:";
        JLabel p3 = new JLabel();
        p3.setText("<html>" + text1 + "<html>");
        p3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        p3.setBounds(10, 140, 550, 70);
        p3.setVerticalAlignment(JLabel.TOP);
        p3.setHorizontalAlignment(JLabel.LEFT);
        p3.setForeground(new Color(35, 117, 145));
        box2.add(p3);
        
        String text2 = "*Antidepressants";
        String text3 = "*Mood Stabilizers";
        String text4 = "*SSRIs";
        String text5 = "*SNRIs";
        blueprint(text2, text3,16,16, 210,10, 20 , 232,10, 25, box2,true,false);
        blueprint(text4, text5,16,16, 210,200, 25 , 232,200, 20, box2,true,false);
        
        String text6 = "Psychotherapy";
        String text7 = "Psychotherapy approaches scientifically proven to work with depression include:";
        blueprint(text6, text7,20,16, 257,10, 30 , 285,10, 30, box2,true,true);
        
        String text8 = "*Cognitive Behavioral Therapy (CBT)";
        String text9 = "*Interpersonal Therapy";
        blueprint(text8, text9, 16, 16, 310, 10, 30, 330, 10, 30, box2, true, false);
        
        String text10 = "*Psychodynamic Therapy";
        JLabel p4 = new JLabel();
        p4.setText("<html>" + text10 + "<html>");
        p4.setFont(new Font("Segoe UI", Font.BOLD, 16));
        p4.setBounds(10, 350, 350, 30);
        p4.setVerticalAlignment(JLabel.TOP);
        p4.setHorizontalAlignment(JLabel.LEFT);
        p4.setForeground(new Color(35, 117, 145));
        box2.add(p4);
        
        String text11 = "Antidepressants such as selective serotonin reuptake inhibitors (SSRIs) are the most commonly prescribed medications for depression." +
                                "When psychotherapy and antidepressants don’t work, clinicians may consider other treatment options." +
                                "Usually, additional medication to support the existing antidepressant medication is considered.";
        JLabel p5 = new JLabel();
        p5.setText("<html>" + text11 + "<html>");
        p5.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        p5.setBounds(10, 380, 550, 120);
        p5.setVerticalAlignment(JLabel.TOP);
        p5.setHorizontalAlignment(JLabel.LEFT);
        p5.setForeground(new Color(35, 117, 145));
        box2.add(p5);
     
    }
    public void lifestyle_mild(){
        JLabel p1 = new JLabel();
        p1.setText("Coping With Mild Depression");
        p1.setFont(new Font("Segoe UI", Font.BOLD, 38));
        p1.setBounds(5, 0, 540, 53);
        p1.setVerticalAlignment(JLabel.TOP);
        p1.setHorizontalAlignment(JLabel.LEFT);
        p1.setForeground(new Color(35, 117, 145));
        header3.add(p1);
        
        String text = "There are also several self-care treatments that can help treat chronic mild depression. Here are a few suggestions to keep in mind:";
        JLabel p2 = new JLabel();
        p2.setText("<html>" + text + "<html>");
        p2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        p2.setBounds(5, 58, 535, 53);
        p2.setVerticalAlignment(JLabel.TOP);
        p2.setHorizontalAlignment(JLabel.LEFT);
        p2.setForeground(new Color(35, 117, 145));
        header3.add(p2);
        
        String text1 = "Aim for 30 minutes of moderately-intense exercise ";
        String text2 = "most days of the week, and add vigorous exercise if you are able to do so.";
        blueprint(text1, text2, 18, 18, 140, 10, 30, 160, 10, 50, box3, true, true);
        
        String text3 = "Avoid alcohol and illegal drugs.";
        String text4 = "Substance abuse can worsen the symptoms of depression and negatively impact overall well-being. " +
                              "By avoiding these harmful substances, you are taking a positive step towards improving your mental health and promoting a healthier lifestyle.";
        blueprint(text3, text4, 18, 18, 210, 10, 30, 230, 10, 100, box3, true, true);

        String text5 = "Be sure that you are taking your medications correctly.";
        String text6 = "Tell your doctor about any supplements or herbal remedies you take.";
        blueprint(text5, text6, 18, 18, 330, 10, 30, 350, 10, 50, box3, true, true);
        
        String text7 = "Eat a varied and nutritious diet.";
        String text8 = "Find things to do that you enjoy.";
        blueprint(text7, text8, 18, 18, 400, 10, 30, 425, 10, 30, box3, true, false);
        
        String text9 = "Get enough sleep.";
        String text10 = "and ensure you have a restful sleeping environment.";
        blueprint(text9, text10, 18, 18, 445, 10, 30, 465, 10, 30, box3, true, true);
    }
    
    public void header_moderate(){
        JLabel h1 = new JLabel();
        h1.setText("Moderate Depression Treatment Plan");
        h1.setFont(new Font("Segoe UI", Font.BOLD, 48));
        h1.setBounds(10, 0, 800, 53);
        h1.setVerticalAlignment(JLabel.TOP);
        h1.setHorizontalAlignment(JLabel.LEFT);
        h1.setForeground(new Color(35,117,145));
        box1.add(h1);
        
        String text = "Medications and psychotherapy are effective for most people with depression. \n" +
                            "Your primary care doctor or psychiatrist can prescribe medications to relieve symptoms." + 
                            "However, many people with depression also benefit from seeing a psychiatrist, psychologist or other mental health professional.";
        JLabel h2 = new JLabel();
        h2.setText("<html>"+ text + "<html>");
        h2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        h2.setBounds(10, 65, 1130, 70);
        h2.setVerticalAlignment(JLabel.TOP);
        h2.setHorizontalAlignment(JLabel.LEFT);
        h2.setForeground(new Color(35,117,145));
        box1.add(h2);
        
        String text1 = "If you have severe depression, you may need a hospital stay, or you may need to participate in an outpatient treatment program until your symptoms improve."+
                                "Here's a closer look at depression treatment options.";
        JLabel h3 = new JLabel();
        h3.setText("<html>" + text1 + "<html>");
        h3.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        h3.setBounds(10, 140, 1130, 50);
        h3.setVerticalAlignment(JLabel.TOP);
        h3.setHorizontalAlignment(JLabel.LEFT);
        h3.setForeground(new Color(35, 117, 145));
        box1.add(h3);
    }
    public void medic_moderate(){
        JLabel p1 = new JLabel();
        p1.setText("Medication  for Moderate Depression");
        p1.setFont(new Font("Segoe UI", Font.BOLD, 36));
        p1.setBounds(5, 0, 1100, 53);
        p1.setVerticalAlignment(JLabel.TOP);
        p1.setHorizontalAlignment(JLabel.LEFT);
        p1.setForeground(new Color(35, 117, 145));
        header2.add(p1);
        
        String text = "Many types of antidepressants are available, including those below. Be sure to discuss possible major side effects with your doctor or pharmacist.";
        JLabel p2 = new JLabel();
        p2.setText("<html>" + text + "<html>");
        p2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        p2.setBounds(5, 58, 525, 53);
        p2.setVerticalAlignment(JLabel.TOP);
        p2.setHorizontalAlignment(JLabel.LEFT);
        p2.setForeground(new Color(35, 117, 145));
        header2.add(p2);
        
        String text1 = "Selective serotonin reuptake inhibitors (SSRIs).";
        JLabel p3 = new JLabel();
        p3.setText("<html>" + text1 + "<html>");
        p3.setFont(new Font("Segoe UI", Font.BOLD, 16));
        p3.setBounds(10, 140, 540, 22);
        p3.setVerticalAlignment(JLabel.TOP);
        p3.setHorizontalAlignment(JLabel.LEFT);
        p3.setForeground(new Color(35, 117, 145));
        box2.add(p3);
        
        String text2 = "Doctors often start by prescribing an SSRI. These drugs are considered safer and generally cause fewer bothersome side effects than other types of antidepressants. " + 
                              "SSRIs include citalopram (Celexa), escitalopram (Lexapro), fluoxetine (Prozac), paroxetine (Paxil, Pexeva), sertraline (Zoloft) and vilazodone (Viibryd).";
        JLabel p4 = new JLabel();
        p4.setText("<html>" + text2 + "<html>");
        p4.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        p4.setBounds(10, 160, 560, 108);
        p4.setVerticalAlignment(JLabel.TOP);
        p4.setHorizontalAlignment(JLabel.LEFT);
        p4.setForeground(new Color(35, 117, 145));
        box2.add(p4);
        
        String text3 = "Serotonin-norepinephrine reuptake inhibitors (SNRIs).";
        JLabel p5 = new JLabel();
        p5.setText("<html>" + text3 + "<html>");
        p5.setFont(new Font("Segoe UI", Font.BOLD, 16));
        p5.setBounds(10, 270, 540, 24);
        p5.setVerticalAlignment(JLabel.TOP);
        p5.setHorizontalAlignment(JLabel.LEFT);
        p5.setForeground(new Color(35, 117, 145));
        box2.add(p5);

        String text4 = "Examples of SNRIs include duloxetine (Cymbalta), venlafaxine (Effexor XR), desvenlafaxine (Pristiq, Khedezla) and levomilnacipran (Fetzima). ";
        JLabel p6 = new JLabel();
        p6.setText("<html>" + text4 + "<html>");
        p6.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        p6.setBounds(10, 290, 560, 60);
        p6.setVerticalAlignment(JLabel.TOP);
        p6.setHorizontalAlignment(JLabel.LEFT);
        p6.setForeground(new Color(35, 117, 145));
        box2.add(p6);
        
        String text5 = "Atypical antidepressants";
        JLabel p7 = new JLabel();
        p7.setText("<html>" + text5 + "<html>");
        p7.setFont(new Font("Segoe UI", Font.BOLD, 16));
        p7.setBounds(10, 335, 540, 22);
        p7.setVerticalAlignment(JLabel.TOP);
        p7.setHorizontalAlignment(JLabel.LEFT);
        p7.setForeground(new Color(35, 117, 145));
        box2.add(p7);
        
        String text6 = "These medications don't fit neatly into any of the other antidepressant categories. They include bupropion (Wellbutrin XL, Wellbutrin SR, Aplenzin, Forfivo XL), mirtazapine (Remeron), nefazodone, trazodone and vortioxetine (Trintellix). ";
        JLabel p8 = new JLabel();
        p8.setText("<html>" + text6 + "<html>");
        p8.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        p8.setBounds(10, 355, 560, 90);
        p8.setVerticalAlignment(JLabel.TOP);
        p8.setHorizontalAlignment(JLabel.LEFT);
        p8.setForeground(new Color(35, 117, 145));
        box2.add(p8);
        
        String text7 = "Other medications.";
        JLabel p9 = new JLabel();
        p9.setText("<html>" + text7 + "<html>");
        p9.setFont(new Font("Segoe UI", Font.BOLD, 16));
        p9.setBounds(10, 445, 560, 22);
        p9.setVerticalAlignment(JLabel.TOP);
        p9.setHorizontalAlignment(JLabel.LEFT);
        p9.setForeground(new Color(35, 117, 145));
        box2.add(p9);
        
        String text8 = "Medications may be added to an antidepressant to enhance its effects and a combination of two antidepressants may be recommended by a doctor.";
        JLabel p10 = new JLabel();
        p10.setText("<html>" + text8 + "<html>");
        p10.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        p10.setBounds(10, 465, 560, 40);
        p10.setVerticalAlignment(JLabel.TOP);
        p10.setHorizontalAlignment(JLabel.LEFT);
        p10.setForeground(new Color(35, 117, 145));
        box2.add(p10);
    }
    public void lifestyle_moderate(){
        JLabel p1 = new JLabel();
        p1.setText("Lifestyle Change Treatment");
        p1.setFont(new Font("Segoe UI", Font.BOLD, 40));
        p1.setBounds(5, 0, 540, 53);
        p1.setVerticalAlignment(JLabel.TOP);
        p1.setHorizontalAlignment(JLabel.LEFT);
        p1.setForeground(new Color(35, 117, 145));
        header3.add(p1);
        
        String text = "Below are some ways you can improve your lifestyle to complement your depression treatment. Consult with your doctor before making any changes.";
        JLabel p2 = new JLabel();
        p2.setText("<html>" + text + "<html>");
        p2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        p2.setBounds(5, 58, 525, 53);
        p2.setVerticalAlignment(JLabel.TOP);
        p2.setHorizontalAlignment(JLabel.LEFT);
        p2.setForeground(new Color(35, 117, 145));
        header3.add(p2);
        
        String text1 = "EXERCISE:   ";
        String text2 = "Aim to exercise for 30 minutes a day, 5 days a week. This can be as simple as a brisk walk, jogging, or participating in a favorite physical activity.";
        blueprint(text1, text2,16,14, 140,10, 22, 160,10, 40,box3,true,true);
        
        String text3 = "SLEEP:";
        String text4 = "Establish a consistent sleep schedule by going to bed and waking up at the same time every day. Aim for 7-9 hours of quality sleep each night.";
        blueprint(text3, text4,16,14, 200,10, 20, 220,10, 40,box3,true,true);
        
        String text5 = "DIET:";
        String text6 = "Incorporate nutrient-rich foods into your diet such as fruits, vegetables, lean proteins, and whole grains. Avoid processed foods and limit caffeine and sugar intake.";
        blueprint(text5, text6,16,14, 260,10, 20, 280,10, 40,box3,true,true);
        
        String text7 = "SOCIAL SUPPORT:";
        String text8 = "Connect with friends, family, or join a social group. Schedule at least one social activity, such as a coffee date or a movie night, each day.";
        blueprint(text7, text8,16,14, 320,10, 20, 340,10, 40,box3,true,true);
        
        String text9 = "MINDFULNESS: ";
        String text10 = "Practice mindfulness through meditation, deep breathing, or yoga. Start with a few minutes each day and increase the time as you feel comfortable.";
        blueprint(text9, text10,16,14, 385,10, 20, 405,10, 40,box3,true,true);
        
        String text11 = "SELF-CARE:";
        String text12 = "Engage in activities that bring you joy and relaxation such as reading, listening to music, or taking a bath. Schedule at least 30 minutes each day for self-care.";
        blueprint(text11, text12,16,14, 450,10, 20, 470,10, 40,box3,true,true);
    }
 
    public void header_extreme(){
        JLabel h1 = new JLabel();
        h1.setText("Extreme Depression Treatment Plan");
        h1.setFont(new Font("Segoe UI", Font.BOLD, 48));
        h1.setBounds(10, 0, 1100, 60);
        h1.setVerticalAlignment(JLabel.TOP);
        h1.setHorizontalAlignment(JLabel.LEFT);
        h1.setForeground(new Color(35,117,145));
        box1.add(h1);
        
        String text = "Depression is a serious mood disorder that affects your whole body including your mood and thoughts" +
                            "It touches every part of your life. It’s important to know that depression is not a weakness or character flaw." + 
                            "It’s a chemical imbalance in your brain that needs to be treated.";
        JLabel h2 = new JLabel();
        h2.setText("<html>"+ text + "<html>");
        h2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        h2.setBounds(10, 65, 1130, 70);
        h2.setVerticalAlignment(JLabel.TOP);
        h2.setHorizontalAlignment(JLabel.LEFT);
        h2.setForeground(new Color(35,117,145));
        box1.add(h2);
        
        String text1 = "Clinical depression, or major depressive disorder, is often just called “depression.” It’s the most severe type of depression." +
                             "Without treatment, depression can get worse and last longer. In severe cases, it can lead to self-harm or death by suicide."+
                                "The good news is that treatments can be very effective in improving symptoms.";
        JLabel h3 = new JLabel();
        h3.setText("<html>" + text1 + "<html>");
        h3.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        h3.setBounds(10, 115, 1130, 80);
        h3.setVerticalAlignment(JLabel.TOP);
        h3.setHorizontalAlignment(JLabel.LEFT);
        h3.setForeground(new Color(35, 117, 145));
        box1.add(h3);
    }
    public void medic_extreme(){
        JLabel p1 = new JLabel();
        p1.setText("Medication  for Extreme Depression");
        p1.setFont(new Font("Segoe UI", Font.BOLD, 30));
        p1.setBounds(5, 0, 800, 53);
        p1.setVerticalAlignment(JLabel.TOP);
        p1.setHorizontalAlignment(JLabel.LEFT);
        p1.setForeground(new Color(35, 117, 145));
        header2.add(p1);

        String text = "Depression is one of the most treatable mental health conditions. Approximately 80% to 90% of people with depression who seek treatment eventually respond well to treatment.";
        JLabel p2 = new JLabel();
        p2.setText("<html>" + text + "<html>");
        p2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        p2.setBounds(5, 43, 525, 70);
        p2.setVerticalAlignment(JLabel.TOP);
        p2.setHorizontalAlignment(JLabel.LEFT);
        p2.setForeground(new Color(35, 117, 145));
        header2.add(p2);
        
        String text1 = "Psychotherapy: ";
        String text2 = "Psychotherapy (talk therapy) involves talking with a mental health professional. "
                + "Your therapist helps you identify and change unhealthy emotions, thoughts and behaviors. "
                + "There are many types of psychotherapy — cognitive behavioral therapy (CBT) is the most common. ";
        blueprint(text1, text2, 17, 17, 140, 10, 30, 160, 10, 100, box2, true, true);
        
        String text3 = "Brain stimulation therapy:";
        String text4 = "Brain stimulation therapy can help people who have severe depression or depression with psychosis. "
                + "Types of brain stimulation therapy include electroconvulsive therapy (ECT), transcranial magnetic stimulation (TMS) and vagus nerve stimulation (VNS).";
        blueprint(text3, text4, 17, 17, 265, 10, 35, 285, 10, 95, box2, true, true);
        
        String text5 = "Complementary medicine:";
        String text6 = "This involves treatments you may receive along with traditional Western medicine. "
                + "People with mild depression or ongoing symptoms can improve their well-being with therapies such as acupuncture, massage, hypnosis and biofeedback.";
        blueprint(text5, text6, 17, 17, 385, 10, 35, 405, 10, 100, box2, true, true);
    }
    public void lifestyle_extreme(){
        JLabel p1 = new JLabel();
        p1.setText("Lifestyle Change Treatment");
        p1.setFont(new Font("Segoe UI", Font.BOLD, 40));
        p1.setBounds(5, 0, 540, 53);
        p1.setVerticalAlignment(JLabel.TOP);
        p1.setHorizontalAlignment(JLabel.LEFT);
        p1.setForeground(new Color(35, 117, 145));
        header3.add(p1);
        
        String text = "Depression can make you feel exhausted, worthless, helpless, and hopeless. "
                + "Negative thinking fades as treatment begins to take effect. Meanwhile, consider the following:";
        JLabel p2 = new JLabel();
        p2.setText("<html>" + text + "<html>");
        p2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        p2.setBounds(5, 48, 525, 70);
        p2.setVerticalAlignment(JLabel.TOP);
        p2.setHorizontalAlignment(JLabel.LEFT);
        p2.setForeground(new Color(35, 117, 145));
        header3.add(p2);
        
        String text1 = "Staying Active";
        String text2 = "When you are depressed, you may not enjoy activities that you once loved. "
                + "You may also think you won’t enjoy something but, when you do it, you actually enjoy it more than you expected."
                +  "If you don’t try activities, you reduce the number of things that may help you cope with your depression. "
                + "To increase the amount of activities you enjoy, you can:";
        blueprint(text1, text2, 18  , 16, 140, 10, 30, 165, 10, 120, box3, true, true);
        
        String text3 = "-list activities you used to enjoy – include as many as possible";
        String text4 = "-plan one of these activities each day";
        blueprint(text3, text4, 16, 16, 275, 10, 30, 295, 10, 30, box3, true, false);
        
        String text5 = "-increase the amount of time available for activities you enjoy. ";
        String text6 = "-after an activity, think about or write down what you enjoyed about it.";
        blueprint(text6, text5, 16, 16, 315, 10, 30, 335, 10, 30, box3, true, false);
   
        String text7 = "-talk to others about what activities they like.";
        String text8 = "If you keep going, it will help you get better. You will enjoy activities more as you recover.";
        blueprint(text7, text8, 16, 16, 355, 10, 30, 375, 10, 60,box3, true, true);
        
        String text9 = "Tips to help you control worry and reduce negative thinking include:";
        String text10 = "-Write down what you are worried about. Go through each concern and think about how realistic your negative thoughts are. Explore alternative thoughts and explanations.";
        blueprint(text9, text10, 18, 16, 415, 10, 30, 435, 10, 70, box3, true, true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        box1 = new com.raven.swing.RoundPanel();
        box2 = new com.raven.swing.RoundPanel();
        border1 = new com.raven.swing.RoundPanel();
        header2 = new com.raven.swing.RoundPanel();
        box3 = new com.raven.swing.RoundPanel();
        border2 = new com.raven.swing.RoundPanel();
        header3 = new com.raven.swing.RoundPanel();

        setBackground(new java.awt.Color(35, 117, 145));

        box1.setBackground(new java.awt.Color(233, 238, 245));

        javax.swing.GroupLayout box1Layout = new javax.swing.GroupLayout(box1);
        box1.setLayout(box1Layout);
        box1Layout.setHorizontalGroup(
            box1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 988, Short.MAX_VALUE)
        );
        box1Layout.setVerticalGroup(
            box1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        box2.setBackground(new java.awt.Color(233, 238, 245));

        border1.setBackground(new java.awt.Color(35, 117, 145));

        header2.setBackground(new java.awt.Color(233, 238, 245));

        javax.swing.GroupLayout header2Layout = new javax.swing.GroupLayout(header2);
        header2.setLayout(header2Layout);
        header2Layout.setHorizontalGroup(
            header2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        header2Layout.setVerticalGroup(
            header2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout border1Layout = new javax.swing.GroupLayout(border1);
        border1.setLayout(border1Layout);
        border1Layout.setHorizontalGroup(
            border1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(border1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        border1Layout.setVerticalGroup(
            border1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(border1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout box2Layout = new javax.swing.GroupLayout(box2);
        box2.setLayout(box2Layout);
        box2Layout.setHorizontalGroup(
            box2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(box2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(border1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        box2Layout.setVerticalGroup(
            box2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(box2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(border1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(246, Short.MAX_VALUE))
        );

        box3.setBackground(new java.awt.Color(233, 238, 245));

        border2.setBackground(new java.awt.Color(35, 117, 145));

        header3.setBackground(new java.awt.Color(233, 238, 245));

        javax.swing.GroupLayout header3Layout = new javax.swing.GroupLayout(header3);
        header3.setLayout(header3Layout);
        header3Layout.setHorizontalGroup(
            header3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        header3Layout.setVerticalGroup(
            header3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout border2Layout = new javax.swing.GroupLayout(border2);
        border2.setLayout(border2Layout);
        border2Layout.setHorizontalGroup(
            border2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(border2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        border2Layout.setVerticalGroup(
            border2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(border2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout box3Layout = new javax.swing.GroupLayout(box3);
        box3.setLayout(box3Layout);
        box3Layout.setHorizontalGroup(
            box3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(box3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(border2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        box3Layout.setVerticalGroup(
            box3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(box3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(border2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(box1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(box2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(box3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(box2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(box3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.RoundPanel border1;
    private com.raven.swing.RoundPanel border2;
    private com.raven.swing.RoundPanel box1;
    private com.raven.swing.RoundPanel box2;
    private com.raven.swing.RoundPanel box3;
    private com.raven.swing.RoundPanel header2;
    private com.raven.swing.RoundPanel header3;
    // End of variables declaration//GEN-END:variables
}
