import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MenuActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}

public class Toolbar {



    Toolbar(JFrame window) {
        JMenuBar menuBar = new JMenuBar();
        JMenu tFile = new JMenu("File");
        JMenu tView = new JMenu("View");
        JMenu tHelp = new JMenu("Help"); 
    
        //Items in the File Menu.
        JMenuItem mNew = new JMenuItem("New");
        JMenuItem mOpen = new JMenuItem("Open");
        JMenuItem mSave = new JMenuItem("Save");
        JMenuItem mExit = new JMenuItem("Exit");
        mExit.addActionListener(new MenuActionListener());
        
        //Items in the View Menu
        JMenuItem mLight = new JMenuItem("Light Theme");
        JMenuItem mDark = new JMenuItem("Dark Theme");
        
        //Items in the Help Menu
        JMenuItem mAbout = new JMenuItem("About");
        JMenuItem mUpdate = new JMenuItem("Check for Updates");
    
        tFile.add(mNew);
        tFile.add(mOpen);
        tFile.add(mSave);
        tFile.add(mExit);

        tView.add(mLight);
        tView.add(mDark);

        tHelp.add(mAbout);
        tHelp.add(mUpdate);

        menuBar.add(tFile);
        menuBar.add(tView);
        menuBar.add(tHelp);

        
        window.setJMenuBar(menuBar);
    }

}