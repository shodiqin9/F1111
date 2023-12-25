import java.awt.Frame;
import java.awt.MenuBar;
import java.awt.Menu;
import java.awt.MenuItem;

public class QIAWTSet1 extends Frame {
    QIAWTSet1() {
        MenuBar mb = new MenuBar();

        Menu menu = new Menu("File");

        Menu subMenu1 = new Menu("Import Project");
        MenuItem subMenuItem1 = new MenuItem("Eclipse Project");
        MenuItem subMenuItem2 = new MenuItem("From Zip File");
        MenuItem subMenuItem3 = new MenuItem("Google Drive");

        subMenu1.add(subMenuItem1);
        subMenu1.add(subMenuItem2);
        subMenu1.add(subMenuItem3);

        Menu subMenu2 = new Menu("Export Project");
        MenuItem subMenuItem4 = new MenuItem("Cloud");
        MenuItem subMenuItem5 = new MenuItem("Other Device");

        subMenu2.add(subMenuItem4);
        subMenu2.add(subMenuItem5);

        menu.add(subMenu1);
        menu.add(subMenu2);

        mb.add(menu);

        setTitle("Menu File");
        setMenuBar(mb);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String args[]) {
        new QIAWTSet1();
    }
}
