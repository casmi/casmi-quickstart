package sample;

import casmi.Applet;
import casmi.AppletRunner;
import casmi.KeyEvent;
import casmi.MouseButton;
import casmi.MouseEvent;

/**
 * Sample Quick Start Project
 *
 */
public class App extends Applet 
{
    public static void main( String[] args )
    {
    	AppletRunner.run("sample.App", "This is a sample quick start project");
    }

	@Override
	public void setup() {
		setSize(1024, 768);
		// TODO implement here
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyEvent(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEvent(MouseEvent arg0, MouseButton arg1) {
		// TODO Auto-generated method stub
		
	}
}
