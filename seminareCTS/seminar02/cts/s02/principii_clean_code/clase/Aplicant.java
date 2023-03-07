package cts.s02.principii_clean_code.clase;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctajObtinut;
	protected int nrProiecte;
	protected String[] denumiriProiect;
	private static int sumaFinantare;
	protected static int pragAcceptare =80;

	public static int getSumaFinantare() {
		return sumaFinantare;
	}
	public static void setSumaFinantare(int sumaFinantare) {
		Aplicant.sumaFinantare = sumaFinantare;
	}
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public void afisareStatut(){
		
		System.out.println("Aplicantul "+nume+" "+prenume +  (punctajObtinut>pragAcceptare ? "": " nu ") + "a fost acceptat");
		}
	
	public int getPunctaj() {
		return punctajObtinut;
	}
	public void setPunctaj(int punctaj) {
		this.punctajObtinut = punctaj;
	}
	
	

	
	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumiriProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctajObtinut = punctaj;
		this.nrProiecte = nrProiecte;
		this.denumiriProiect = denumiriProiect;
	}
	public int getnrProiecte() {
		return nrProiecte;
	}
	public void setDenumireProiect(int nr_proiecte, String[] denumireProiect) {
		this.nrProiecte = nr_proiecte;
		this.denumiriProiect = new String[nr_proiecte];
		for(int i=0; i< this.nrProiecte; i++)
		{
			this.denumiriProiect[i] = denumireProiect[i];
		}
	}
	public abstract void afisareSumaFinantare();
	protected void afisareSumaFinantare(String tipAplicant, int sumaFinantare) {
		System.out.println(tipAplicant +getNume()+" "+getPrenume()+" primeste"+ sumaFinantare +" Euro/zi in proiect.");
	}
}