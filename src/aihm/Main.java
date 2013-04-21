package aihm;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JSplitPane;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Main {

	public static void main(String[] args) {
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menuFichier = new JMenu("Fichier");
		JMenuItem item = new JMenuItem("Quitter");
		
		menuFichier.add(item);
	    menuBar.add(menuFichier);
		
		LiftButtonModel model1 = new LiftButtonModel();
		LiftButtonModel model2 = new LiftButtonModel();
		LiftButtonModel model3 = new LiftButtonModel();
		
		JToggleButton bouton1 = new JToggleButton (new ImageIcon("images/One.png"));
		bouton1.setBorder(BorderFactory.createEmptyBorder());
		bouton1.setModel(model1);
		
		JToggleButton bouton2 = new JToggleButton (new ImageIcon("images/Two.png"));
		bouton2.setBorder(BorderFactory.createEmptyBorder());
		bouton2.setModel(model2);
		
		JToggleButton bouton3 = new JToggleButton (new ImageIcon("images/Three.png"));
		bouton3.setBorder(BorderFactory.createEmptyBorder());
		bouton3.setModel(model3);
		
		JToggleButton bouton1bis = new JToggleButton (new ImageIcon("images/One.png"));
		bouton1bis.setBorder(BorderFactory.createEmptyBorder());
		bouton1bis.setModel(model1);
		
		JToggleButton bouton2bis = new JToggleButton (new ImageIcon("images/Two.png"));
		bouton2bis.setBorder(BorderFactory.createEmptyBorder());
		bouton2bis.setModel(model2);
		
		JToggleButton bouton3bis = new JToggleButton (new ImageIcon("images/Three.png"));
		bouton3bis.setBorder(BorderFactory.createEmptyBorder());
		bouton3bis.setModel(model3);
		
		bouton1.setSelectedIcon(new ImageIcon("images/OneSelected.png"));
		bouton2.setSelectedIcon(new ImageIcon("images/TwoSelected.png"));
		bouton3.setSelectedIcon(new ImageIcon("images/ThreeSelected.png"));
		
		bouton1bis.setSelectedIcon(new ImageIcon("images/OneSelected.png"));
		bouton2bis.setSelectedIcon(new ImageIcon("images/TwoSelected.png"));
		bouton3bis.setSelectedIcon(new ImageIcon("images/ThreeSelected.png"));
		
		final JLabel label = new JLabel("Hello World !");
		
		Box b = Box.createVerticalBox();
		
		b.add(bouton1);
		b.add(bouton2);
		b.add(bouton3);
		b.add(label);
		
		JToolBar jToolBar = new JToolBar();
		jToolBar.add(bouton1bis);
		jToolBar.add(bouton2bis);
		jToolBar.add(bouton3bis);
		
		JSlider jSlider = new JSlider(JSlider.VERTICAL);
		
		jSlider.setMaximum(100);
		jSlider.setMinimum(0);
		jSlider.setValue(50);
		
		final JPanel Elev = new Elevator();
		
		Elev.setLayout(null);
		
		JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, b, Elev);
		
		final JFrame fenetre = new JFrame();
        fenetre.setTitle("AIHM Application");
	    fenetre.setSize(400, 400);
	    fenetre.setLocationRelativeTo(null);
	    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    fenetre.setVisible(true);
	    
	    fenetre.getContentPane().add(split, BorderLayout.CENTER);
	    fenetre.getContentPane().add(jToolBar, BorderLayout.NORTH);
	    fenetre.getContentPane().add(jSlider, BorderLayout.EAST);
	    fenetre.setJMenuBar(menuBar);
	    
	    item.addActionListener(new ActionListener(){
	    	  public void actionPerformed(ActionEvent event){
	    		  fenetre.dispose();
	    	  }
	    });
	    
	    bouton1.addActionListener(new ActionListener(){
	    	  public void actionPerformed(ActionEvent event){
	    		  if(((AbstractButton) event.getSource()).isSelected())
	    			  label.setText("Bouton 1 OFF");
	    		  else
	    			  label.setText("Bouton 1 ON");
	    	  }
	    });
	    
	    bouton2.addActionListener(new ActionListener(){
	    	  public void actionPerformed(ActionEvent event){
	    		  if(((AbstractButton) event.getSource()).isSelected())
	    			  label.setText("Bouton 2 OFF");
	    		  else
	    			  label.setText("Bouton 2 ON");
	    	  }
	    });
	    
	    bouton3.addActionListener(new ActionListener(){
	    	  public void actionPerformed(ActionEvent event){
	    		  if(((AbstractButton) event.getSource()).isSelected())
	    			  label.setText("Bouton 3 OFF");
	    		  else
	    			  label.setText("Bouton 3 ON");
	    	  }
	    });
	    
	    bouton1bis.addActionListener(new ActionListener(){
	    	  public void actionPerformed(ActionEvent event){
	    		  if(((AbstractButton) event.getSource()).isSelected())
	    			  label.setText("Bouton 1 OFF");
	    		  else
	    			  label.setText("Bouton 1 ON");
	    	  }
	    });
	    
	    bouton2bis.addActionListener(new ActionListener(){
	    	  public void actionPerformed(ActionEvent event){
	    		  if(((AbstractButton) event.getSource()).isSelected())
	    			  label.setText("Bouton 2 OFF");
	    		  else
	    			  label.setText("Bouton 2 ON");
	    	  }
	    });
	    
	    bouton3bis.addActionListener(new ActionListener(){
	    	  public void actionPerformed(ActionEvent event){
	    		  if(((AbstractButton) event.getSource()).isSelected())
	    			  label.setText("Bouton 3 OFF");
	    		  else
	    			  label.setText("Bouton 3 ON");
	    	  }
	    });
	    
	    jSlider.addChangeListener(new ChangeListener(){
		      public void stateChanged(ChangeEvent event){
		    	  ((Elevator) Elev).setPourcentage(((JSlider)event.getSource()).getValue());
		    	  Elev.repaint();
		      }
		}); 
	}
}
