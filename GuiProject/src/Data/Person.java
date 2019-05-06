package Data;

public class Person {
private String vorname;
private String nachname;
private String PLZ;
private String Ort;
private String Strasse;
private String Hausnummer;
public String getVorname() {
	return vorname;
}
public void setVorname(String vorname) {
	this.vorname = vorname;
}
public String getNachname() {
	return nachname;
}
public void setNachname(String nachname) {
	this.nachname = nachname;
}
public String getPLZ() {
	return PLZ;
}
public void setPLZ(String pLZ) {
	PLZ = pLZ;
}
public String getOrt() {
	return Ort;
}
public void setOrt(String ort) {
	Ort = ort;
}
public String getStrasse() {
	return Strasse;
}
public void setStrasse(String strasse) {
	Strasse = strasse;
}
public String getHausnummer() {
	return Hausnummer;
}
public void setHausnummer(String hausnummer) {
	Hausnummer = hausnummer;
}
}

