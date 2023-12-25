import java.awt.Frame;
import java.awt.MenuBar;
import java.awt.Menu;
import java.awt.MenuItem;

public class Q1AWTSetl extends Frame {
    Q1AWTSetl() {
        MenuBar mb = new MenuBar();

        // Create Menu
        Menu menu = new Menu("File");

        // Create SubMenus
        Menu subMenu1 = new Menu("Import Project");
        MenuItem subMenuItem1i = new MenuItem("Import Eclipse Project");
        MenuItem subMenuItem1ii = new MenuItem("Import from Zip File");
        MenuItem subMenuItem1iii = new MenuItem("Import from Google Drive");

        // Add SubMenuItems to SubMenus
        subMenu1.add(subMenuItem1i);
        subMenu1.add(subMenuItem1ii);
        subMenu1.add(subMenuItem1iii);

        // Add SubMenus to Menu
        menu.add(subMenu1);

        // Create another SubMenu
        Menu subMenu2 = new Menu("Export Project");
        MenuItem subMenuItem2i = new MenuItem("Export to Cloud");
        MenuItem subMenuItem2ii = new MenuItem("Export to Other Device");

        // Add SubMenuItems to SubMenus
        subMenu2.add(subMenuItem2i);
        subMenu2.add(subMenuItem2ii);

        // Add SubMenu2 to Menu
        menu.add(subMenu2);

        // Add Menu to MenuBar
        mb.add(menu);

        setTitle("Menu File");
        setMenuBar(mb);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String args[]) {
        new Q1AWTSetl();
    }
}
