/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aboutme;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.imageio.*;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JCheckBox;
import java.util.ArrayList;

class Surface extends JPanel {
    private void swingComponents() {
        this.setLayout(null);
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 1, 10, 7);
        slider.setMinorTickSpacing(1);
        slider.setMajorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setLabelTable(slider.createStandardLabels(1));
        slider.setBounds(70, 770, slider.getPreferredSize().width, slider.getPreferredSize().height);
        this.add(slider);
        ArrayList<JCheckBox> boxes = new ArrayList<JCheckBox>();
        boxes.add(new JCheckBox("<html>I WOULD RUN FOR <br/>PRESIDENT", false));
        boxes.get(boxes.size() - 1).setBounds(355, 450, boxes.get(boxes.size() - 1).getPreferredSize().width, boxes.get(boxes.size() - 1).getPreferredSize().height);
        boxes.add(new JCheckBox("I'M LEFT HANDED", false));
        boxes.get(boxes.size() - 1).setBounds(355, 485, boxes.get(boxes.size() - 1).getPreferredSize().width, boxes.get(boxes.size() - 1).getPreferredSize().height);
        boxes.add(new JCheckBox("I'M A MORNING PERSON", false));
        boxes.get(boxes.size() - 1).setBounds(355, 505, boxes.get(boxes.size() - 1).getPreferredSize().width, boxes.get(boxes.size() - 1).getPreferredSize().height);
        boxes.add(new JCheckBox("<html>I'M SECRETLY A <br/>SUPERHERO", false));
        boxes.get(boxes.size() - 1).setBounds(355, 525, boxes.get(boxes.size() - 1).getPreferredSize().width, boxes.get(boxes.size() - 1).getPreferredSize().height);
        boxes.add(new JCheckBox("<html>I HAVE A FEAR OF <br/>PUBLIC SPEAKING", false));
        boxes.get(boxes.size() - 1).setBounds(355, 560, boxes.get(boxes.size() - 1).getPreferredSize().width, boxes.get(boxes.size() - 1).getPreferredSize().height);
        boxes.add(new JCheckBox("I LOVE PIZZA", true));
        boxes.get(boxes.size() - 1).setBounds(355, 595, boxes.get(boxes.size() - 1).getPreferredSize().width, boxes.get(boxes.size() - 1).getPreferredSize().height);
        for (JCheckBox b : boxes) {
            this.add(b);
        }
        
    }
    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawRect(50, 45, 700, 800); //entire rectangle
        g2d.drawLine(50, 345, 750, 345); //first separating line
        g2d.drawLine(50, 385, 750, 385); //second separating line
        g2d.drawLine(50, 425, 750, 425); //third separating line
        g2d.drawLine(300, 45, 300, 345); //vertical separating line in top rectangle
        g2d.drawLine(300, 45, 750, 345); //first diagonal line
        g2d.drawLine(525, 195, 750, 75); //second diagonal line
        g2d.drawLine(345, 75, 750, 75); //upper horizontal name line
        g2d.drawLine(350, 425, 350, 650); //lower vertical separating line
        g2d.drawLine(50, 650, 750, 650); //lower horizontal separating line
        g2d.drawLine(50, 425, 350, 650); //first diagonal line
        g2d.drawLine(50, 650, 350, 425); //second diagonal line
        g2d.drawLine(300, 650, 350, 845); //separating diagonal line
        g2d.drawLine(50, 750, 326, 750); //last horizontal line interesecting with diagonal
        g2d.drawLine(635, 650, 635, 845); //last lower vertical separating line
        g2d.drawOval(525, 425, 225, 225); //most important circle
        g2d.setColor(this.getBackground());
        g2d.fillRect(637, 426, 112, 112); //clear out upper right hand corner of circle
        g2d.setColor(Color.BLACK);
        g2d.drawString("ABOUT ME", 375, 40);
        g2d.drawString("DEFAULT DOODLE", 54, 60);
        g2d.drawString("NAME (FIRST AND LAST): DANIEL ELLIOTT", 505, 65);
        g2d.drawString("JOB I WOULD NEVER HAVE: BUSINESSMAN", 415, 95);
        g2d.drawString("JOB I WOULD LOVE TO HAVE:", 570, 192);
        g2d.drawString("AEROSPACE ENGINEER", 570, 207);
        g2d.drawString("BEST DAY OF MY LIFE: GETTING FEBRUARY ACT SCORES BACK", 305, 340);
        g2d.drawString("WORDS MY FRIENDS WOULD USE", 54, 362);
        g2d.drawString("TO DESCRIBE ME: SMART, BRAVE, HUMOROUS", 54, 377);
        g2d.drawString("WORDS MY TEACHERS WOULD USE", 54, 402);
        g2d.drawString("TO DESCRIBE ME: HARDWORKING, CONSISTENT", 54, 417);
        g2d.drawString("FAVORITE SCHOOL SUBJECT:", 120, 440);
        g2d.drawString("PHYSICS", 175, 455);
        g2d.drawString("FAVORITE PLACE ON EARTH:", 120, 646);
        g2d.drawString("WHISTLER, BC", 160, 631);
        g2d.drawString("TV OR BOOKS: TV", 55, 542);
        g2d.drawString("FAVORITE MOVIE:", 247, 535);
        g2d.drawString("INTERSTELLAR", 255, 550);
        g2d.drawString("CHECK ALL THAT APPLY:", 354, 440);
        g2d.drawString("THE MOST IMPORTANT", 618, 440);
        g2d.drawString("THING TO KNOW ABOUT ME:", 587, 455);
        g2d.drawString("I DO A LOT OF MOUNTAIN BIKING", 550, 535);
        g2d.drawString("AND SKIING", 608, 550);
        g2d.drawString("EXTRACURRICULARS I AM INVOLVED IN:", 54, 666);
        g2d.drawString("TSA, VEX, SCIENCE FAIR, RESEARCH", 54, 681);
        g2d.drawString("WHAT HAS HELPED ME SUCCEED", 380, 666);
        g2d.drawString("ACADEMICALLY IN PREVIOUS CLASSES IS:", 355, 681);
        g2d.drawString("FREEDOM IN TERMS OF CURRICULUM, ", 365, 740);
        g2d.drawString("WITH A RELEVANT WORKLOAD", 385, 755);
        g2d.drawString("MY HOMEWORK", 646, 666);
        g2d.drawString("SOUNDTRACK IS:", 642, 681);
        g2d.drawString("WHATEVER'S IN", 645, 726);
        g2d.drawString("MY SOUNDCLOUD", 642, 741);
        g2d.drawString("LIKES AT THE", 650, 756);
        g2d.drawString("MOMENT", 666, 771);
        g2d.drawString("1-10, HOW EXCITED I AM FOR THIS CLASS", 54, 840);
        try {
            Image doodles = ImageIO.read(new File("doodles.jpg"));
            g2d.drawImage(doodles, 60, 70, 230, 260, this);
        }
        catch (IOException e) {
            System.out.println("IO exception caught");
        }   
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
        swingComponents();
    }
}

public class Main extends JFrame {

    public Main() {
        initUI();
    }

    private void initUI() {

        add(new Surface());

        setTitle("About Me Java Project");
        setSize(820, 940);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Main m = new Main();
                m.setVisible(true);
                m.setResizable(false);
            }
        });
    }
}