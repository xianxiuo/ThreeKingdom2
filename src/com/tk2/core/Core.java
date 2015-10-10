package com.tk2.core;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import com.tk2.util.Constant;
import com.tk2.util.PropertyUtil;

public class Core extends JFrame {

    private static final long serialVersionUID = -8491691516715471305L;

    Core() {
        init();
        this.setSize(Integer.parseInt(PropertyUtil.getConfProperty(PropertyUtil.WINDOW_WIDTH)),
                Integer.parseInt(PropertyUtil.getConfProperty(PropertyUtil.WINDOW_HEIGHT)));
        this.setTitle("Three Kingdoms");
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(Constant.SYS_PATH + "../img/icon.jpg"));
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    JTextArea j1;
    JButton j2, j31, j32, j33, j34;
    
    public void init() {

        j1 = new JTextArea();
        j1.setEditable(false);
        j1.setBackground(Color.PINK);
        j2 = new JButton();
        j2.setBorderPainted(false);
        j2.setEnabled(false);
//        j2.setMinimumSize(minimumSize);
        j2.setBackground(Color.GRAY);
        
        j31 = new JButton(new ImageIcon(Constant.SYS_PATH + "../img/cc.jpg"));
        j31.setBackground(Color.LIGHT_GRAY);
        j32 = new JButton(new ImageIcon(Constant.SYS_PATH + "../img/jd.jpg"));
        j32.setBackground(Color.LIGHT_GRAY);
        j33 = new JButton(new ImageIcon(Constant.SYS_PATH + "../img/ck.jpg"));
        j33.setBackground(Color.LIGHT_GRAY);
        j34 = new JButton(new ImageIcon(Constant.SYS_PATH + "../img/sc.jpg"));
        j34.setBackground(Color.LIGHT_GRAY);
        this.add(j1);
        this.add(j2);
        this.add(j31);
        this.add(j32);
        this.add(j33);
        this.add(j34);
        
        j31.setBorderPainted(false);
        j32.setBorderPainted(false);
        j33.setBorderPainted(false);
        j34.setBorderPainted(false);

        GridBagLayout gbl = new GridBagLayout();
        this.setLayout(gbl);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(0, 0, 0, 0);

        gbc.gridwidth = 0;
        gbc.weightx = 1;
        gbc.weighty = 5;
        gbl.setConstraints(j1, gbc);

        gbc.gridwidth = 1;
        gbc.weightx = 1;
        gbc.weighty = 2;
        gbl.setConstraints(j2, gbc);
        
        gbc.gridwidth = 1;
        gbc.weightx = 1;
        gbc.weighty = 2;
        gbl.setConstraints(j31, gbc);
        
        gbc.gridwidth = 1;
        gbc.weightx = 1;
        gbc.weighty = 2;
        gbl.setConstraints(j32, gbc);
        
        gbc.gridwidth = 1;
        gbc.weightx = 1;
        gbc.weighty = 2;
        gbl.setConstraints(j33, gbc);
        
        gbc.gridwidth = 0;
        gbc.weightx = 1;
        gbc.weighty = 2;
        gbl.setConstraints(j34, gbc);
        
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
//        
//        j31.addMouseListener(new MouseAdapter() {
//            public void mouseClicked(MouseEvent e) {
//                j2.setBackground(Color.getHSBColor(206, 206, 206));
//                
//            }
//        });
    }

    public static void main(String[] args) {
        new Core();
    }

}
