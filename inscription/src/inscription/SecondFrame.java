package inscription;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class SecondFrame extends Frame {
	public void SecondFrame() {
		Label message = new Label("Bravo vous �tes sur une nouvelle fen�tre");
		setLayout(new FlowLayout());
		setSize(1080,720);
		add(message);
	}

}
