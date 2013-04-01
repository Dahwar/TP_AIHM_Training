package aihm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.DefaultButtonModel;

public class LiftButtonModel extends DefaultButtonModel implements ActionListener{
	
	public LiftButtonModel(){
		addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		setSelected(!isSelected());
	}
}
