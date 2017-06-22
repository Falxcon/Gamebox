import javax.swing.*;

public class Frame extends JFrame {

    private JDesktopPane desktopPane;

    private JMenu menuAdd;

    private JMenuItem menuItemGOL, menuItemSokoban, menuItemDragSafe, menuItemDrehSafe,
            menuItemConnect6, menuItemElfFarben, menuItemRegenbogen, menuItemMVCexample, menuItemPrim;

    Frame() {
        setJMenuBar(initMenuBar());

        setTitle("Game Box");
        setSize(1700, 900);
        desktopPane = new JDesktopPane();
        desktopPane.setDesktopManager(new DefaultDesktopManager());
        setContentPane(desktopPane);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private JMenuBar initMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        menuAdd = new JMenu("Add");
        menuBar.add(menuAdd);
        // gameoflife
        menuItemGOL = new JMenuItem("gameoflife");
        menuItemGOL.addActionListener(l -> {
            desktopPane.add(new gameoflife.userinterface.IFrameMain(25, 20, desktopPane));
        });
        menuAdd.add(menuItemGOL);
        // sokoban
        menuItemSokoban = new JMenuItem("sokoban");
        menuItemSokoban.addActionListener(l -> {
            desktopPane.add(new sokoban.View());
        });
        menuAdd.add(menuItemSokoban);
        // dragsafe
        menuItemDragSafe = new JMenuItem("dragsafe");
        menuItemDragSafe.addActionListener(l -> {
            desktopPane.add(new dragsafe.DragSafe(1000, desktopPane));
        });
        menuAdd.add(menuItemDragSafe);
        // drehsafe
        menuItemDrehSafe = new JMenuItem("drehsafe");
        menuItemDrehSafe.addActionListener(l -> {
            desktopPane.add(new drehsafe.View());
        });
        menuAdd.add(menuItemDrehSafe);
        // connect6
        menuItemConnect6 = new JMenuItem("connect6");
        menuItemConnect6.addActionListener(l -> {
            desktopPane.add(new connect6.Connect6(19, desktopPane));
        });
        menuAdd.add(menuItemConnect6);
        // elffarben
        menuItemElfFarben = new JMenuItem("elffarben");
        menuItemElfFarben.addActionListener(l -> {
            desktopPane.add(new elffarben.ElfFarben());
        });
        menuAdd.add(menuItemElfFarben);
        // rainbow
        menuItemRegenbogen = new JMenuItem("rainbow");
        menuItemRegenbogen.addActionListener(l -> {
            desktopPane.add(new rainbow.IFrameBasic(desktopPane));
        });
        menuAdd.add(menuItemRegenbogen);
        // mvcexample
        menuItemMVCexample = new JMenuItem("mvc example");
        menuItemMVCexample.addActionListener(l -> {
            desktopPane.add(new mvcexample.MVCexample());
        });
        menuAdd.add(menuItemMVCexample);

        menuItemPrim = new JMenuItem("Primzahlen");
        menuItemPrim.addActionListener(l -> {
            desktopPane.add(new siebenspaltenprimzahlen.Jiframe());
        });
        menuAdd.add(menuItemPrim);

        return menuBar;
    }
}