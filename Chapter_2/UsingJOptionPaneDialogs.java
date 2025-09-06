import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        while (true) {
            String name = JOptionPane.showInputDialog("Enter your name:");
            if (name == null) break;

            int confirm = JOptionPane.showConfirmDialog(
                null,
                "Would you like to display your name?",
                "Confirm",
                JOptionPane.YES_NO_OPTION
            );

            if (confirm == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Your name is: " + name);
                break;
            }
        }
    }
}
