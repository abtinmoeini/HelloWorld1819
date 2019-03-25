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
import org.eclipse.swt.widgets.Label;

public class MyFirstWindow {

	protected Shell shlFrWindow;
	private Text nachname;
	private Text vorname;
	private Text PLZ;
	private Text Ort;
	private Text Strasse;
	private Text Hausnummer;

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
		shlFrWindow.setSize(450, 300);
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
				System.out.println(vorname.getText());
				System.out.println(nachname.getText());
				System.out.println(PLZ.getText());
				System.out.println(Ort.getText());
				System.out.println(Strasse.getText());
				System.out.println(Hausnummer.getText());

			}

		});
		Button1.setBounds(79, 65, 75, 25);
		Button1.setText("Mein 1 Knopf");

		Label lblVorname = new Label(shlFrWindow, SWT.NONE);
		lblVorname.setBounds(79, 119, 55, 15);
		lblVorname.setText("vorname");

		Label lblNachname = new Label(shlFrWindow, SWT.NONE);
		lblNachname.setBounds(79, 143, 55, 15);
		lblNachname.setText("nachname");

		nachname = new Text(shlFrWindow, SWT.BORDER);
		nachname.setText("r");
		nachname.setBounds(140, 140, 76, 21);

		vorname = new Text(shlFrWindow, SWT.BORDER);
		vorname.setText("F");
		vorname.setBounds(140, 116, 76, 21);

		Label lblPlz = new Label(shlFrWindow, SWT.NONE);
		lblPlz.setBounds(79, 174, 55, 15);
		lblPlz.setText("PLZ");

		PLZ = new Text(shlFrWindow, SWT.BORDER);
		PLZ.setBounds(140, 168, 76, 21);

		Ort = new Text(shlFrWindow, SWT.BORDER);
		Ort.setBounds(140, 193, 76, 21);

		Strasse = new Text(shlFrWindow, SWT.BORDER);
		Strasse.setBounds(140, 220, 76, 21);

		Hausnummer = new Text(shlFrWindow, SWT.BORDER);
		Hausnummer.setBounds(314, 119, 76, 21);

		Label lblOrt = new Label(shlFrWindow, SWT.NONE);
		lblOrt.setBounds(79, 199, 55, 15);
		lblOrt.setText("Ort");

		Label lblStrasse = new Label(shlFrWindow, SWT.NONE);
		lblStrasse.setBounds(79, 226, 55, 15);
		lblStrasse.setText("Strasse");

		Label lblHausnummer = new Label(shlFrWindow, SWT.NONE);
		lblHausnummer.setBounds(244, 122, 55, 15);
		lblHausnummer.setText("Hausnummer");

	}
}
