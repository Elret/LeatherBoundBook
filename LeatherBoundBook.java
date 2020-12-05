import javax.swing.JFrame;
import javax.swing.JTextArea;


public class LeatherBoundBook {

    static void createWindow(JFrame window) {
        CreateWindow newWindow = new CreateWindow();
        newWindow.newWindow(window);
    }
    public static void main(String args[]) {
        JFrame window = new JFrame();
        createWindow(window);
        Toolbar toolbar = new Toolbar(window);
        ViewPort viewport = new ViewPort(window);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
