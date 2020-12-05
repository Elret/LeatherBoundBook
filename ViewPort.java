import javax.swing.*;
import java.awt.*
;
public class ViewPort {
    void setTextSize(JFrame window, JTextArea writepad) {
        Dimension windowDimension = new Dimension();
        window.getSize(windowDimension);
        writepad.setBounds(100, 50, ((int)windowDimension.getWidth()-100), ((int)windowDimension.getHeight()-50));
    }
    ViewPort(JFrame window) {
        JTextArea writepad = new JTextArea();
        setTextSize(window, writepad);
        window.add(writepad);
        
    }    
}
