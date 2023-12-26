import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;

public class PCStoreGUI extends JFrame {
    private JTextField txtItemName;
    private JTextField txtOrderID;
    private JRadioButton rbtnDeliver;
    private JRadioButton rbtnProgress;

    public PCStoreGUI() {
        setTitle("PC STORE");
        setSize(500, 320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Header Panel
        JPanel pnHeader = new JPanel(new FlowLayout(FlowLayout.CENTER));
        pnHeader.setBackground(Color.PINK);
        JLabel lblHeader = new JLabel("ORDER INFORMATION");
        lblHeader.setFont(new Font("Arial", Font.BOLD, 22));
        lblHeader.setForeground(Color.BLUE);
        pnHeader.add(lblHeader);

        // Left Info Panel
        JPanel pnLeftInfo = new JPanel(new GridLayout(4, 1));
        pnLeftInfo.setBackground(Color.LIGHT_GRAY);

        JLabel lblOrderID = new JLabel("ORDER ID:");
        lblOrderID.setFont(new Font("Arial", Font.PLAIN, 20));
        lblOrderID.setForeground(Color.BLUE);
        pnLeftInfo.add(lblOrderID);

        JLabel lblItemName = new JLabel("Item Name:");
        lblItemName.setFont(new Font("Arial", Font.PLAIN, 20));
        lblItemName.setForeground(Color.BLUE);
        pnLeftInfo.add(lblItemName);

        JLabel lblStatus = new JLabel("Status:");
        lblStatus.setFont(new Font("Arial", Font.PLAIN, 20));
        lblStatus.setForeground(Color.BLUE);
        pnLeftInfo.add(lblStatus);

        // Right Info Panel
        JPanel pnRightInfo = new JPanel(new GridLayout(4, 1));
        pnRightInfo.setBackground(Color.WHITE);

        txtOrderID = new JTextField(15);
        pnRightInfo.add(txtOrderID);

        txtItemName = new JTextField(15);
        pnRightInfo.add(txtItemName);

        rbtnDeliver = new JRadioButton("Deliver");
        rbtnProgress = new JRadioButton("Progress");

        ButtonGroup statusGroup = new ButtonGroup();
        statusGroup.add(rbtnDeliver);
        statusGroup.add(rbtnProgress);

        pnRightInfo.add(rbtnDeliver);
        pnRightInfo.add(rbtnProgress);

        // Info Panel (Left and Right)
        JPanel pnInfo = new JPanel(new GridLayout(1, 2));
        pnInfo.add(pnLeftInfo);
        pnInfo.add(pnRightInfo);

        // Footer Panel
        JPanel pnFooter = new JPanel(new FlowLayout(FlowLayout.CENTER));
        pnFooter.setBackground(Color.PINK);
        JLabel lblFooter = new JLabel("PRODUCT DEPARTMENT");
        lblFooter.setFont(new Font("Arial", Font.BOLD, 22));
        lblFooter.setForeground(Color.BLUE);
        pnFooter.add(lblFooter);

        // Main Content Panel
        JPanel pnContent = new JPanel(new BorderLayout());
        pnContent.add(pnHeader, BorderLayout.NORTH);
        pnContent.add(pnInfo, BorderLayout.CENTER);
        pnContent.add(pnFooter, BorderLayout.SOUTH);

        // Add content panel to the frame
        add(pnContent);

        // Submit Button
        JButton btnSubmit = new JButton("SUBMIT");
        btnSubmit.setFont(new Font("Arial", Font.PLAIN, 20));
        pnLeftInfo.add(btnSubmit);

        // Display Label
        JLabel lblDisplay = new JLabel("DISPLAY");
        lblDisplay.setFont(new Font("Arial", Font.PLAIN, 20));
        lblDisplay.setForeground(Color.BLUE);

        // Add DISPLAY label event handling
        lblDisplay.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                handleDisplayLabelClick();
            }
        });

        pnLeftInfo.add(lblDisplay);

        // Add SUBMIT button event handling
        btnSubmit.addActionListener(new ButtonSubmit());
    }

    // Event handling for SUBMIT button
    private class ButtonSubmit implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            handleSubmitButton();
        }
    }

    // Display label click event handling
    private void handleDisplayLabelClick() {
        JOptionPane.showMessageDialog(this, "DISPLAY label clicked!", "Display Label Clicked", JOptionPane.INFORMATION_MESSAGE);
    }

    // Submit button click event handling
    private void handleSubmitButton() {
        String status = rbtnProgress.isSelected() ? "Progress" : "Delivery";
        JOptionPane.showMessageDialog(this, "Order ID: " + txtOrderID.getText() +
                "\nItem Name: " + txtItemName.getText() +
                "\nStatus: " + status, "Order Information", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PCStoreGUI().setVisible(true);
        });
    }
}
