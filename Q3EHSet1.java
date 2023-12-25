import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Q3EHSet1 extends JFrame {
    JLabel lblHeader, lblFooter, lblName, lblMatrixNo, lblProposal, lblProjDemo, lblTechRepo;
    Panel pnHeader, pnInfo, pnLeft, pnRight, pnFooter;
    Panel pnLeft_lblName, pnLeft_lblMatrixNo, pnLeft_lblProposal, pnLeft_lblProjDemo, pnLeft_lblTechRepo;
    Panel pnRight_txtFldName, pnRight_txtFldMatrixNo, pnRight_txtFldProposal, pnRight_txtFldProjDemo,
            pnRight_txtFldTechRepo;
    JTextField txtFldName, txtFldMatrixNo, txtFldProposal, txtFldProjDemo, txtFldTechRepo;
    Font font1, font2;
    JButton btnTotalMarks, btnReset;
    Color head, bg, darkGray, darkYellow;

    public Q3EHSet1() {
        head = new Color(195, 45, 47);
        bg = new Color(241, 106, 40);
        darkGray = new Color(51, 51, 51);
        darkYellow = new Color(255, 204, 0);
        font1 = new Font("Winner Sans Wide Medium", Font.BOLD, 28);
        font2 = new Font("Manche Medium Expanded", Font.BOLD, 26);

        lblHeader = new JLabel("FINAL YEAR PROJECT MARKS", JLabel.CENTER);
        lblHeader.setFont(font1);
        lblHeader.setForeground(Color.WHITE);

        lblFooter = new JLabel("JTMK DEPARTMENT", JLabel.CENTER);
        lblFooter.setFont(font1);
        lblFooter.setForeground(Color.WHITE);

        lblName = new JLabel("Name", JLabel.CENTER);
        lblName.setFont(font2);
        lblName.setForeground(Color.WHITE);

        lblMatrixNo = new JLabel("Matrix No.", JLabel.CENTER);
        lblMatrixNo.setFont(font2);
        lblMatrixNo.setForeground(Color.WHITE);

        lblProposal = new JLabel("Proposal (20 marks)", JLabel.CENTER);
        lblProposal.setFont(font2);
        lblProposal.setForeground(Color.WHITE);

        lblProjDemo = new JLabel("Project Demonstration (40 marks)", JLabel.CENTER);
        lblProjDemo.setFont(font2);
        lblProjDemo.setForeground(Color.WHITE);

        lblTechRepo = new JLabel("Technical Report (40 marks)", JLabel.CENTER);
        lblTechRepo.setFont(font2);
        lblTechRepo.setForeground(Color.WHITE);

        txtFldName = new JTextField(30);
        txtFldName.setFont(font2);

        txtFldMatrixNo = new JTextField(10);
        txtFldMatrixNo.setFont(font2);

        txtFldProposal = new JTextField(5);
        txtFldProposal.setFont(font2);

        txtFldProjDemo = new JTextField(5);
        txtFldProjDemo.setFont(font2);

        txtFldTechRepo = new JTextField(5);
        txtFldTechRepo.setFont(font2);

        btnReset = new JButton("RESET MARKS");
        btnReset.setForeground(darkGray);
        btnReset.setBackground(darkYellow);
        btnReset.setFont(font1);
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtFldName.setText("");
                txtFldMatrixNo.setText("");
                txtFldProposal.setText("");
                txtFldProjDemo.setText("");
                txtFldTechRepo.setText("");
                JOptionPane.showMessageDialog(Q3EHSet1.this, "RESET - All Mark Fields", "Notification",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        btnTotalMarks = new JButton("TOTAL MARKS");
        btnTotalMarks.setForeground(darkGray);
        btnTotalMarks.setBackground(darkYellow);
        btnTotalMarks.setFont(font1);
        btnTotalMarks.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String matrixNo = txtFldMatrixNo.getText();
                String proposal = txtFldProposal.getText();
                String projDemo = txtFldProjDemo.getText();
                String techRepo = txtFldTechRepo.getText();

                int proposalMarks = 0, projDemoMarks = 0, techRepoMarks = 0, total = 0;

                try {
                    proposalMarks = Integer.parseInt(proposal);
                    projDemoMarks = Integer.parseInt(projDemo);
                    techRepoMarks = Integer.parseInt(techRepo);
                    total = proposalMarks + projDemoMarks + techRepoMarks;

                    JOptionPane.showMessageDialog(Q3EHSet1.this,
                            "Your Matrix Number: " + matrixNo + "\nTotal Marks: " + total, "Notification",
                            JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(Q3EHSet1.this, "Invalid input. Please enter valid numbers.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        pnHeader = new Panel(new FlowLayout(FlowLayout.CENTER));
        pnHeader.setBackground(head);
        pnHeader.setForeground(Color.WHITE);
        pnHeader.add(lblHeader);

        pnInfo = new Panel();
        pnInfo.setBackground(Color.WHITE);
        pnInfo.setLayout(new GridLayout(1, 2));

        pnFooter = new Panel(new FlowLayout(FlowLayout.CENTER));
        pnFooter.setBackground(head);
        pnFooter.setForeground(Color.WHITE);
        pnFooter.add(btnTotalMarks);
        pnFooter.add(btnReset);

        pnLeft = new Panel(new GridLayout(5, 1));

        pnLeft_lblName = new Panel(new FlowLayout(FlowLayout.RIGHT));
        pnLeft_lblName.setBackground(bg);
        pnLeft_lblName.add(lblName);

        pnLeft_lblMatrixNo = new Panel(new FlowLayout(FlowLayout.RIGHT));
        pnLeft_lblMatrixNo.setBackground(bg);
        pnLeft_lblMatrixNo.add(lblMatrixNo);

        pnLeft_lblProposal = new Panel(new FlowLayout(FlowLayout.RIGHT));
        pnLeft_lblProposal.setBackground(bg);
        pnLeft_lblProposal.add(lblProposal);

        pnLeft_lblProjDemo = new Panel(new FlowLayout(FlowLayout.RIGHT));
        pnLeft_lblProjDemo.setBackground(bg);
        pnLeft_lblProjDemo.add(lblProjDemo);

        pnLeft_lblTechRepo = new Panel(new FlowLayout(FlowLayout.RIGHT));
        pnLeft_lblTechRepo.setBackground(bg);
        pnLeft_lblTechRepo.add(lblTechRepo);

        pnRight = new Panel(new GridLayout(5, 1));

        pnRight_txtFldName = new Panel(new FlowLayout(FlowLayout.LEFT));
        pnRight_txtFldName.setBackground(bg);
        pnRight_txtFldName.add(txtFldName);

        pnRight_txtFldMatrixNo = new Panel(new FlowLayout(FlowLayout.LEFT));
        pnRight_txtFldMatrixNo.setBackground(bg);
        pnRight_txtFldMatrixNo.add(txtFldMatrixNo);

        pnRight_txtFldProposal = new Panel(new FlowLayout(FlowLayout.LEFT));
        pnRight_txtFldProposal.setBackground(bg);
        pnRight_txtFldProposal.add(txtFldProposal);

        pnRight_txtFldProjDemo = new Panel(new FlowLayout(FlowLayout.LEFT));
        pnRight_txtFldProjDemo.setBackground(bg);
        pnRight_txtFldProjDemo.add(txtFldProjDemo);

        pnRight_txtFldTechRepo = new Panel(new FlowLayout(FlowLayout.LEFT));
        pnRight_txtFldTechRepo.setBackground(bg);
        pnRight_txtFldTechRepo.add(txtFldTechRepo);

        pnLeft.add(pnLeft_lblName);
        pnLeft.add(pnLeft_lblMatrixNo);
        pnLeft.add(pnLeft_lblProposal);
        pnLeft.add(pnLeft_lblProjDemo);
        pnLeft.add(pnLeft_lblTechRepo);

        pnRight.add(pnRight_txtFldName);
        pnRight.add(pnRight_txtFldMatrixNo);
        pnRight.add(pnRight_txtFldProposal);
        pnRight.add(pnRight_txtFldProjDemo);
        pnRight.add(pnRight_txtFldTechRepo);

        pnInfo.add(pnLeft);
        pnInfo.add(pnRight);

        setLayout(new BorderLayout());
        add(pnHeader, BorderLayout.NORTH);
        add(pnInfo, BorderLayout.CENTER);
        add(pnFooter, BorderLayout.SOUTH);

        setTitle("FYP-Result");
        setSize(1100, 500);
        setLocation(500, 320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Q3EHSet1();
    }
}
