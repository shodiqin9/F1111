import javax.swing.*;
import java.awt.*;

public class Q2SwingSetli extends JFrame {
    JLabel lblHeader, lblFooter, lblName, lblMatrixNo, lblProposal, lblProjDemo, lblTechRepo;
    JPanel pnHeader, pnInfo, pnLeft, pnRight, pnFooter;
    JPanel pnLeft_lblName, pnLeft_lblMatrixNo, pnLeft_lblProposal, pnLeft_lblProjDemo, pnLeft_lblTechRepo;
    JPanel pnRight_txtFldName, pnRight_txtFldMatrixNo, pnRight_txtFldProposal, pnRight_txtFldProjDemo, pnRight_txtFldTechRepo;
    JButton btnReset, btnTotalMarks;
    Font font1, font2;
    Color head, bg, darkGray, darkYellow;

    JTextField txtFldName, txtFldMatrixNo, txtFldProposal, txtFldProjDemo, txtFldTechRepo;

    public Q2SwingSetli() {
        
        font1 = new Font("Winner Sans WideMedium", Font.BOLD, 28);
        font2 = new Font("Manche Medium Expanded", Font.BOLD, 26);
        head = new Color(95, 45, 47);
        darkGray = new Color(51, 51, 51);
        bg = new Color(241, 106, 40);
        darkYellow = new Color(255, 204, 0);

       
        pnHeader = new JPanel(new FlowLayout(FlowLayout.CENTER));
        pnHeader.setBackground(head);
        pnInfo = new JPanel(new GridLayout(1, 2));
        pnFooter = new JPanel(new FlowLayout(FlowLayout.CENTER));
        pnFooter.setBackground(head);

        pnLeft = new JPanel(new GridLayout(5, 1));
        pnRight = new JPanel(new GridLayout(5, 1));

       
        pnLeft_lblName = createPanelWithLayoutAndColor(FlowLayout.RIGHT, bg);
        pnLeft_lblMatrixNo = createPanelWithLayoutAndColor(FlowLayout.RIGHT, bg);
        pnLeft_lblProposal = createPanelWithLayoutAndColor(FlowLayout.RIGHT, bg);
        pnLeft_lblProjDemo = createPanelWithLayoutAndColor(FlowLayout.RIGHT, bg);
        pnLeft_lblTechRepo = createPanelWithLayoutAndColor(FlowLayout.RIGHT, bg);

        pnRight_txtFldName = createPanelWithLayoutAndColor(FlowLayout.LEFT, bg);
        pnRight_txtFldMatrixNo = createPanelWithLayoutAndColor(FlowLayout.LEFT, bg);
        pnRight_txtFldProposal = createPanelWithLayoutAndColor(FlowLayout.LEFT, bg);
        pnRight_txtFldProjDemo = createPanelWithLayoutAndColor(FlowLayout.LEFT, bg);
        pnRight_txtFldTechRepo = createPanelWithLayoutAndColor(FlowLayout.LEFT, bg);

       
        lblHeader = createLabel("FINAL YEAR PROJECT MARKS", font1, Color.WHITE);
        lblFooter = createLabel("JTMK DEPARTMENT", font1, Color.WHITE);
        lblName = createLabel("Name", font2, Color.WHITE);
        lblMatrixNo = createLabel("Matrix No.", font2, Color.WHITE);
        lblProposal = createLabel("Proposal (20marks)", font2, Color.WHITE);
        lblProjDemo = createLabel("Project Demonstration (40marks)", font2, Color.WHITE);
        lblTechRepo = createLabel("Technical Report (40marks)", font2, Color.WHITE);

        
        txtFldName = createTextField(font2, 30);
        txtFldMatrixNo = createTextField(font2, 10);
        txtFldProposal = createTextField(font2, 5);
        txtFldProjDemo = createTextField(font2, 5);
        txtFldTechRepo = createTextField(font2, 5);

       
        btnTotalMarks = createButton("TOTAL MARKS", darkGray, darkYellow, font1);
        btnReset = createButton("RESET", darkGray, darkYellow, font1);

       
        pnLeft_lblName.add(lblName);
        pnLeft_lblMatrixNo.add(lblMatrixNo);
        pnLeft_lblProposal.add(lblProposal);
        pnLeft_lblProjDemo.add(lblProjDemo);
        pnLeft_lblTechRepo.add(lblTechRepo);

        pnRight_txtFldName.add(txtFldName);
        pnRight_txtFldMatrixNo.add(txtFldMatrixNo);
        pnRight_txtFldProposal.add(txtFldProposal);
        pnRight_txtFldProjDemo.add(txtFldProjDemo);
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

        pnHeader.add(lblHeader);
        pnFooter.add(btnTotalMarks);
        pnFooter.add(btnReset);

       
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

    private JPanel createPanelWithLayoutAndColor(int layout, Color color) {
        JPanel panel = new JPanel(new FlowLayout(layout));
        panel.setBackground(color);
        return panel;
    }

    private JLabel createLabel(String text, Font font, Color color) {
        JLabel label = new JLabel(text);
        label.setFont(font);
        label.setForeground(color);
        return label;
    }

    private JTextField createTextField(Font font, int columns) {
        JTextField textField = new JTextField(columns);
        textField.setFont(font);
        return textField;
    }

    private JButton createButton(String label, Color foreground, Color background, Font font) {
        JButton button = new JButton(label);
        button.setForeground(foreground);
        button.setBackground(background);
        button.setFont(font);
        return button;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Q2SwingSetli::new);
    }
}
