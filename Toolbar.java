import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Toolbar {

    JMenuBar menuBar;
    JMenu tFile;
    JMenu tView;
    JMenu tHelp; 

    JMenuItem mNew;
    JMenuItem mOpen;
    JMenuItem mSave;
    JMenuItem mExit;
    
    JMenuItem mLight;
    JMenuItem mDark;
    
    JMenuItem mAbout;
    JMenuItem mUpdate;

    class MenuActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == mExit) {
            System.exit(0);
            }
        }
    }

    Toolbar(JFrame window) {
        menuBar = new JMenuBar();
        tView = new JMenu("View");
        tFile = new JMenu("File");
        tHelp = new JMenu("Help"); 
    
        //Items in the File Menu.
        mNew = new JMenuItem("New");
        mOpen = new JMenuItem("Open");
        mOpen.addActionListener(new MenuActionListener());
        mSave = new JMenuItem("Save");
        mExit = new JMenuItem("Exit");
        mExit.addActionListener(new MenuActionListener());
        
        //Items in the View Menu
        mLight = new JMenuItem("Light Theme");
        mDark = new JMenuItem("Dark Theme");
        
        //Items in the Help Menu
        mAbout = new JMenuItem("About");
        mUpdate = new JMenuItem("Check for Updates");
    
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