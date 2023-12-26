import java.awt.*;
import javax.swing.*;

public class Q2SwingSetli extends JFrame {

    JLabel lblHeader, lblFooter, lblName, lblMatrixNo, lblProposal, lblProjDemo, lblTechRepo;
    Panel pnHeader, pnInfo, pnLeft, pnRight, pnFooter;
    Panel pnLeft_lblName, pnLeft_lblMatrixNo, pnLeft_lblProposal, pnLeft_lblProjDemo, pnLeft_lblTechRepo;
    Panel pnRight_txtFldName, pnRight_txtFldMatrixNo, pnRight_txtFldProposal, pnRight_txtFldProjDemo, pnRight_txtFldTechRepo;

    Button btnReset, btnTotalMarks;
    Font font1, font2;

    public Q2SwingSetli() {
        Color head = new Color(95, 45, 47);
        Color bg = new Color(241, 106, 40);
        Color darkGray = new Color(51, 51, 51);
        Color darkYellow = new Color(255, 204, 0);

        font1 = new Font("Winner Sans Wide Medium", Font.BOLD, 28);
        font2 = new Font("Manche Medium Expanded", Font.BOLD, 26);

        pnHeader = new Panel(new FlowLayout(FlowLayout.CENTER));
        pnHeader.setBackground(head);

        pnInfo = new Panel();
        pnInfo.setLayout(new GridLayout(1, 2));

        pnFooter = new Panel(new FlowLayout(FlowLayout.CENTER));
        pnFooter.setBackground(head);

        pnLeft = new Panel(new GridLayout(5, 1));
        pnLeft.setBackground(bg);

        pnLeft_lblName = new Panel(new FlowLayout(FlowLayout.RIGHT));
        pnLeft_lblMatrixNo = new Panel(new FlowLayout(FlowLayout.RIGHT));
        pnLeft_lblProposal = new Panel(new FlowLayout(FlowLayout.RIGHT));
        pnLeft_lblProjDemo = new Panel(new FlowLayout(FlowLayout.RIGHT));
        pnLeft_lblTechRepo = new Panel(new FlowLayout(FlowLayout.RIGHT));

        pnRight = new Panel(new GridLayout(5, 1));
        pnRight.setBackground(bg);

        pnRight_txtFldName = new Panel(new FlowLayout(FlowLayout.LEFT));
        pnRight_txtFldMatrixNo = new Panel(new FlowLayout(FlowLayout.LEFT));
        pnRight_txtFldProposal = new Panel(new FlowLayout(FlowLayout.LEFT));
        pnRight_txtFldProjDemo = new Panel(new FlowLayout(FlowLayout.LEFT));
        pnRight_txtFldTechRepo = new Panel(new FlowLayout(FlowLayout.LEFT));

        lblHeader = new JLabel("FINAL YEAR PROJECT MARKS", JLabel.CENTER);
        lblHeader.setFont(font1);
        lblHeader.setForeground(Color.WHITE);

        lblFooter = new JLabel("JTMK DEPARTMENT", JLabel.CENTER);
        lblFooter.setFont(font1);
        lblFooter.setForeground(Color.WHITE);

        lblName = new JLabel("Name");
        lblName.setFont(font2);
        lblName.setForeground(Color.WHITE);

        lblMatrixNo = new JLabel("Matrix No.");
        lblMatrixNo.setFont(font2);
        lblMatrixNo.setForeground(Color.WHITE);

        lblProposal = new JLabel("Proposal");
        lblProposal.setFont(font2);
        lblProposal.setForeground(Color.WHITE);

        lblProjDemo = new JLabel("Project Demonstration");
        lblProjDemo.setFont(font2);
        lblProjDemo.setForeground(Color.WHITE);

        lblTechRepo = new JLabel("Technical Report");
        lblTechRepo.setFont(font2);
        lblTechRepo.setForeground(Color.WHITE);

        pnLeft_lblName.add(lblName);
        pnLeft_lblMatrixNo.add(lblMatrixNo);
        pnLeft_lblProposal.add(lblProposal);
        pnLeft_lblProjDemo.add(lblProjDemo);
        pnLeft_lblTechRepo.add(lblTechRepo);

        JTextField txtFldName = new JTextField(30);
        txtFldName.setFont(font2);

        JTextField txtFldMatrixNo = new JTextField(10);
        txtFldMatrixNo.setFont(font2);

        JTextField txtFldProposal = new JTextField(5);
        txtFldProposal.setFont(font2);

        JTextField txtFldProjDemo = new JTextField(5);
        txtFldProjDemo.setFont(font2);

        JTextField txtFldTechRepo = new JTextField(5);
        txtFldTechRepo.setFont(font2);

        pnRight_txtFldName.add(txtFldName);
        pnRight_txtFldMatrixNo.add(txtFldMatrixNo);
        pnRight_txtFldProposal.add(txtFldProposal);
        pnRight_txtFldProjDemo.add(txtFldProjDemo);
        pnRight_txtFldTechRepo.add(txtFldTechRepo);

        btnTotalMarks = new Button("TOTAL MARKS");
        btnTotalMarks.setForeground(darkGray);
        btnTotalMarks.setBackground(darkYellow);
        btnTotalMarks.setFont(font1);

        btnReset = new Button("RESET");
        btnReset.setForeground(darkGray);
        btnReset.setBackground(darkYellow);
        btnReset.setFont(font1);

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

        pnHeader.add(lblHeader);
        pnFooter.add(btnTotalMarks);
        pnFooter.add(btnReset);

        add(pnHeader, BorderLayout.NORTH);
        add(pnInfo, BorderLayout.CENTER);
        add(pnFooter, BorderLayout.SOUTH);

        setTitle("FYP-Result");
        setSize(1100, 500);
        setLocation(500, 320);
        setVisible(true);
    }

    public static void main(String[] args) {
        Q2SwingSetli objFrm = new Q2SwingSetli();
    }
}
