/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcqonbangabandhu;

/**
 *
 * @author motaleb14029
 */


   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MCQONBANGABANDHU  extends JFrame implements ActionListener {

    JLabel l;
    JRadioButton jb[] = new JRadioButton[5];
    JButton b1, b2;
    ButtonGroup bg;
    int count = 0, current = 0, x = 1, y = 1, now = 0;
    int m[] = new int[10];

    MCQONBANGABANDHU(String s) {
        super(s);
        l = new JLabel();
        add(l);
        bg = new ButtonGroup();
        for (int i = 0; i < 5; i++) {
            jb[i] = new JRadioButton();
            add(jb[i]);
            bg.add(jb[i]);
        }
        b1 = new JButton("Next");
        b2 = new JButton("Bookmark");
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(b1);
        add(b2);
        set();
        l.setBounds(30, 40, 450, 20);
        jb[0].setBounds(50, 80, 1000, 20);
        jb[1].setBounds(50, 110, 1000, 20);
        jb[2].setBounds(50, 140, 1000, 20);
        jb[3].setBounds(50, 170, 1000, 20);
        b1.setBounds(100, 240, 100, 30);
        b2.setBounds(270, 240, 100, 30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250, 100);
        setVisible(true);
        setSize(600, 350);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            if (check()) {
                count = count + 1;
            }
            current++;
            set();
            if (current == 9) {
                b1.setEnabled(false);
                b2.setText("Result");
            }
        }
        if (e.getActionCommand().equals("Bookmark")) {
            JButton bk = new JButton("Bookmark" + x);
            bk.setBounds(480, 20 + 30 * x, 100, 30);
            add(bk);
            bk.addActionListener(this);
            m[x] = current;
            x++;
            current++;
            set();
            if (current == 9) {
                b2.setText("Result");
            }
            setVisible(false);
            setVisible(true);
        }
        for (int i = 0, y = 1; i < x; i++, y++) {
            if (e.getActionCommand().equals("Bookmark" + y)) {
                if (check()) {
                    count = count + 1;
                }
                now = current;
                current = m[y];
                set();
                ((JButton) e.getSource()).setEnabled(false);
                current = now;
            }
        }

        if (e.getActionCommand().equals("Result")) {
            if (check()) {
                count = count + 1;
            }
            current++;
            //System.out.println("correct ans="+count);
            JOptionPane.showMessageDialog(this, "correct ans=" + count);
            System.exit(0);
        }
    }

    void set() {
        jb[4].setSelected(true);
        if (current == 0) {
            l.setText("Que1: Unfinished Autobiography' book  Author's What is the name");

            jb[0].setText("Kazi Nazrul Islam");
            jb[1].setText("Bangabandhu Sheikh Mujibur Rahman");
            jb[2].setText("Kobi Josimuddin");
            jb[3].setText("Begum Rokea");
        }
        if (current == 1) {
            l.setText("Que2: Bangabandhu Sheikh Mujibur Rahman How birth in where");
            
            jb[0].setText("On 20 March 1920,Gopalganj");
            jb[1].setText("On 15 March 1920, Gopalganj");
            jb[2].setText("On 17 March 1920, Gopalganj");

            jb[3].setText("On 17 August 1920,Gopalganj");
        }
        if (current == 2) {
            l.setText("Que3:  University of Dhaka, Bangabandhu was a student of ");
            jb[0].setText("History Department");
            jb[1].setText("Bangla Department");
            jb[2].setText("Cse Department");
            jb[3].setText("Law Department");
        }
        if (current == 3) {
            l.setText("Que4: Sheikh Mujibur Rahman at Bangabandhu when is the title in");
            jb[0].setText("1969 3 February");
            jb[1].setText("1969 4 February");
            jb[2].setText("1969 6 February");
            jb[3].setText("1969 12 February");
        }
        if (current == 4) {
            l.setText("Que5: March 7 speech of Bangabandhu where is he ");
            jb[0].setText("polton");
            jb[1].setText("Shabag");
            jb[2].setText("Suhrawardy udyona");
            jb[3].setText("Motejeel");
        }
        if (current == 5) {
            l.setText("Que6:when  Bangabandhu  returned in independent Bangladesh");
            jb[0].setText("17 march 1972");
            jb[1].setText("29 December 1971");
            jb[2].setText("10 January 1972");
            jb[3].setText("15 April 1972");
        }
        if (current == 6) {
            l.setText("Que7: Who gave title Bangabandhu of Sheikh Mujibur Rahman ");
            jb[0].setText("Kader siddiki");
            jb[1].setText("Abdul Hamid");
            jb[2].setText("Tufayal Ahamed");
            jb[3].setText("Tajuddin Ahamed");
        }
        if (current == 7) {
            l.setText("Que8: Six-point 1st when Bangabandhu Sheikh Mujib Announcements");

            jb[0].setText("15 february 1966");
            jb[1].setText("5 february 1966");
            jb[2].setText("17 february 1966");
            jb[3].setText("2 february 1966");
        }
        if (current == 8) {
            l.setText("Que9: Where is the Bangabandhu Museum Located");

            jb[0].setText("Savar");
            jb[1].setText("Dhanmondi");
            jb[2].setText("Motejeel");
            jb[3].setText("Framgate");
        }
        if (current == 9) {
            l.setText("Que10: Bangabandhu was killed at ");
            jb[0].setText(" 15 July 1975");
            jb[1].setText("15 September 1975");
            jb[2].setText("15 August 1975");
            jb[3].setText("15 August 1976");
        }
        l.setBounds(30, 40, 450, 20);
        for (int i = 0, j = 0; i <= 90; i += 30, j++) {
            jb[j].setBounds(100, 80 + i, 200, 20);
        }
    }

    boolean check() {
        if (current == 0) {
            return (jb[1].isSelected());
        }
        if (current == 1) {
            return (jb[2].isSelected());
        }
        if (current == 2) {
            return (jb[3].isSelected());
        }
        if (current == 3) {
            return (jb[0].isSelected());
        }
        if (current == 4) {
            return (jb[2].isSelected());
        }
        if (current == 5) {
            return (jb[2].isSelected());
        }
        if (current == 6) {
            return (jb[1].isSelected());
        }
        if (current == 7) {
            return (jb[3].isSelected());
        }
        if (current == 8) {
            return (jb[1].isSelected());
        }
        if (current == 9) {
            return (jb[2].isSelected());
        }
        return false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new MCQONBANGABANDHU("Online Test Of Bangabandhu");
    }
}
