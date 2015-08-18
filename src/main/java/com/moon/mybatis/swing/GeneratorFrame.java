package com.moon.mybatis.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author quzile
 * @version 1.0
 * @since 2015/8/17
 */
public class GeneratorFrame extends JFrame {

    private static final int DEFAULT_WIDTH = 400;
    private static final int DEFAULT_HEIGHT = 300;
    private Action saveAction;
    private Action saveAsAction;

    public GeneratorFrame() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        // menu
        menu();

        // panel
        add(new GeneratorPanel());

        // pack();
    }

    private void menu() {
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(fileMenu()); // file menu
        menuBar.add(editMenu()); // edit menu
        menuBar.add(databaseMenu()); // database menu
        menuBar.add(runMenu()); // run menu
        menuBar.add(templateMenu());
        menuBar.add(helpMenu()); // help menu
    }

    /**
     * File Menu
     *
     * @return JMenu
     */
    private JMenu fileMenu() {
        JMenu menu = new JMenu("File");
        menu.setMnemonic('F');
        menu.add(new TestAction("New"));

        //
        JMenuItem openItem = menu.add(new TestAction("Open"));
        openItem.setAccelerator(KeyStroke.getKeyStroke("ctrl O"));

        menu.addSeparator();

        saveAction = new TestAction("Save");
        JMenuItem saveItem = menu.add(saveAction);
        saveItem.setAccelerator(KeyStroke.getKeyStroke("ctrl S"));

        saveAsAction = new TestAction("Save As");
        menu.add(saveAsAction);
        menu.addSeparator();

        menu.add(new TestAction("Config"));
        menu.addSeparator();

        menu.add(new AbstractAction("Exit") {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });

        return menu;
    }

    /**
     * Edit Menu
     *
     * @return
     */
    private JMenu editMenu() {
        JMenu menu = new JMenu("Edit");
        menu.setMnemonic('E');
        JMenu optionMenu = new JMenu("Options");

        checkbox(optionMenu);
        optionMenu.addSeparator();
        radio(optionMenu);

        menu.add(optionMenu);
        return menu;
    }

    private void checkbox(JMenu menu) {
        JCheckBoxMenuItem insert = new JCheckBoxMenuItem("INSERT");
        insert.setState(true);
        insert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JCheckBoxMenuItem delete = new JCheckBoxMenuItem("DELETE");
        delete.setState(true);
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JCheckBoxMenuItem update = new JCheckBoxMenuItem("UPDATE");
        update.setState(true);
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JCheckBoxMenuItem select = new JCheckBoxMenuItem("SELECT");
        select.setState(true);
        select.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        menu.add(insert);
        menu.add(delete);
        menu.add(update);
        menu.add(select);
    }

    private void radio(JMenu menu) {
        ButtonGroup group = new ButtonGroup();
        JRadioButtonMenuItem button1 = new JRadioButtonMenuItem("Mybatis 2");
        JRadioButtonMenuItem button2 = new JRadioButtonMenuItem("Mybatis 3");
        button2.setSelected(true);
        group.add(button1);
        group.add(button2);

        //
        menu.add(button1);
        menu.add(button2);
    }

    private JMenu databaseMenu() {
        JMenu menu = new JMenu("Database");
        menu.setMnemonic('D');
        menu.add(new TestAction("Configure Instance..."));

        return menu;
    }

    private JMenu runMenu() {
        JMenu menu = new JMenu("Run");
        menu.setMnemonic('R');
        menu.add(new TestAction("Run..."));
        return menu;
    }

    private JMenu templateMenu() {
        JMenu menu = new JMenu("Template");
        menu.setMnemonic('T');
        menu.add(new TestAction("Default Template"));
        return menu;
    }

    /**
     * Help Menu
     *
     * @return
     */
    private JMenu helpMenu() {
        JMenu menu = new JMenu("Help");
        menu.setMnemonic('H');

        // you can also add the mnemonic key to an action
        Action aboutAction = new TestAction("About");
        aboutAction.putValue(Action.MNEMONIC_KEY, new Integer('A'));
        menu.add(aboutAction);
        return menu;
    }

    protected class TestAction extends AbstractAction {

        public TestAction(String name) {
            super(name);
        }

        public void actionPerformed(ActionEvent event) {
            System.out.println(getValue(Action.NAME) + " selected.");
        }

    }
}
