package sample;

import casmi.Applet;
import casmi.AppletRunner;
import casmi.KeyEvent;
import casmi.MouseButton;
import casmi.MouseEvent;

/**
 * casmi main class.
 */
public class App extends Applet {

    @Override
    public void setup() {
        // Implement here.
    }

    @Override
    public void update() {
        // Implement here.
    }

    // Comment out if you want to exec terminating processes.
    // This is called when the application is quitted.
//    @Override
//    public void exit() {
//        // Implement here.
//    }

    @Override
    public void mouseEvent(MouseEvent e, MouseButton b) {
        // Implement here.
    }

    @Override
    public void keyEvent(KeyEvent e) {
        // Implement here.
    }

    public static void main(String[] args) {
        AppletRunner.run("sample.App", "This is a sample quick start project");
    }
}