package Gui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Text;

import Data.Person;

import org.eclipse.swt.widgets.Label;

public class MyFirstWindow {

	protected Shell shlFrWindow;
	private Text nachnameTF;
	private Text vornameTF;
	private Text PLZTF;
	private Text OrtTF;
	private Text StrasseTF;
	private Text HausnummerTF;
	private Label VornameOut;
	private Label NachnameOut;
	private Label getPLZOut;
	private Label OrtOut;
	private Label StrasseOut;
	private Label HausnummerOut;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MyFirstWindow window = new MyFirstWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlFrWindow.open();
		shlFrWindow.layout();
		while (!shlFrWindow.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlFrWindow = new Shell();
		shlFrWindow.setSize(486, 302);
		shlFrWindow.setText("FR Window");

		Button Button1 = new Button(shlFrWindow, SWT.NONE);
		Button1.addMouseMoveListener(new MouseMoveListener() {
			public void mouseMove(MouseEvent me) {
				System.out.println("Maus über Knoppe bewegt lol");
				//
				System.out.println("Maus auf: " + me.x + " / " + me.y);
			}

		});
		Button1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Knoppe gedrückt lool");
				//
				System.out.println(vornameTF.getText());
				System.out.println(nachnameTF.getText());
				System.out.println(PLZTF.getText());
				System.out.println(OrtTF.getText());
				System.out.println(StrasseTF.getText());
				System.out.println(HausnummerTF.getText());

			getVornameOut().setText(getVornameTF().getText());
			getNachnameOut().setText(getNachnameTF().getText());
			getGetPLZOut().setText(getPLZTF().getText());
			getOrtOut().setText(getOrtTF().getText());
			getStrasseOut().setText(getStrasseTF().getText());
			getHausnummerOut().setText(getHausnummerTF().getText());
			
			
			}

		});
		Button1.setBounds(53, 25, 75, 25);
		Button1.setText("Mein 1 Knopf");

		Label lblVorname = new Label(shlFrWindow, SWT.NONE);
		lblVorname.setBounds(10, 64, 55, 15);
		lblVorname.setText("vorname");

		Label lblNachname = new Label(shlFrWindow, SWT.NONE);
		lblNachname.setBounds(10, 95, 69, 15);
		lblNachname.setText("nachname");

		nachnameTF = new Text(shlFrWindow, SWT.BORDER);
		nachnameTF.setBounds(85, 92, 76, 21);

		vornameTF = new Text(shlFrWindow, SWT.BORDER);
		vornameTF.setBounds(85, 61, 76, 21);

		Label lblPlz = new Label(shlFrWindow, SWT.NONE);
		lblPlz.setBounds(38, 122, 55, 15);
		lblPlz.setText("PLZ");

		PLZTF = new Text(shlFrWindow, SWT.BORDER);
		PLZTF.setBounds(85, 119, 76, 21);

		OrtTF = new Text(shlFrWindow, SWT.BORDER);
		OrtTF.setBounds(85, 154, 76, 21);

		StrasseTF = new Text(shlFrWindow, SWT.BORDER);
		StrasseTF.setBounds(85, 192, 76, 21);

		HausnummerTF = new Text(shlFrWindow, SWT.BORDER);
		HausnummerTF.setBounds(85, 235, 76, 21);

		Label lblOrt = new Label(shlFrWindow, SWT.NONE);
		lblOrt.setBounds(38, 157, 35, 15);
		lblOrt.setText("Ort");

		Label lblStrasse = new Label(shlFrWindow, SWT.NONE);
		lblStrasse.setBounds(24, 195, 55, 15);
		lblStrasse.setText("Strasse");

		Label lblHausnummer = new Label(shlFrWindow, SWT.NONE);
		lblHausnummer.setBounds(10, 238, 75, 15);
		lblHausnummer.setText("Hausnummer");
		
		VornameOut = new Label(shlFrWindow, SWT.NONE);
		VornameOut.setBounds(207, 64, 75, 15);
		
		NachnameOut = new Label(shlFrWindow, SWT.NONE);
		NachnameOut.setBounds(207, 95, 55, 15);
		
		getPLZOut = new Label(shlFrWindow, SWT.NONE);
		getPLZOut.setBounds(207, 122, 55, 15);
		
		OrtOut = new Label(shlFrWindow, SWT.NONE);
		OrtOut.setBounds(207, 154, 55, 15);
		
		StrasseOut = new Label(shlFrWindow, SWT.NONE);
		StrasseOut.setBounds(207, 198, 55, 15);
		
		HausnummerOut = new Label(shlFrWindow, SWT.NONE);
		HausnummerOut.setBounds(207, 241, 55, 15);
		
		Button btnSaveClean = new Button(shlFrWindow, SWT.NONE);
		btnSaveClean.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Person p; //VAriablen Definition
				p = new Person(); //Variablen Instanz
				//
				p.setVorname(getVornameTF().getText());
				p.setNachname(getNachnameTF().getText());
				p.setPLZ(getPLZTF().getText());
				p.setOrt(getOrtTF().getText());
				p.setStrasse(getStrasseTF().getText());
				p.setHausnummer(getHausnummerTF().getText());
				//
				System.out.println(p);
				
			}
		});
		btnSaveClean.setBounds(158, 25, 75, 25);
		btnSaveClean.setText("Save Clean");


	}
	public Label getVornameOut() {
		return VornameOut;
	}
	public Label getNachnameOut() {
		return NachnameOut;
	}
	public Label getGetPLZOut() {
		return getPLZOut;
	}
	public Label getOrtOut() {
		return OrtOut;
	}
	public Label getStrasseOut() {
		return StrasseOut;
	}
	public Label getHausnummerOut() {
		return HausnummerOut;
	}
	public Text getVornameTF() {
		return vornameTF;
	}
	public Text getNachnameTF() {
		return nachnameTF;
	}
	public Text getPLZTF() {
		return PLZTF;
	}
	public Text getOrtTF() {
		return OrtTF;
	}
	public Text getStrasseTF() {
		return StrasseTF;
	}
	public Text getHausnummerTF() {
		return HausnummerTF;
	}
}
