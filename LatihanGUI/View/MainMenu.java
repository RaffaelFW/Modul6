package View;
import javax.swing.*;
public class MainMenu {
    public MainMenu() {
        Boolean menu = true;
        while(menu) {
            int choosen = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Menu: "
                    + "\n1. Isi Form KTP "
                    + "\n2. Show KTP "
            ));
            switch(choosen) {
                case 1: new MainMenu1Screen();
                    break;
//                case 2: new MainMenu2Screen();
//                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Input Error","", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}