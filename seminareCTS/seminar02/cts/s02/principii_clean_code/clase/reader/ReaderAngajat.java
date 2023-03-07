package cts.s02.principii_clean_code.clase.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cts.s02.principii_clean_code.clase.Angajat;
import cts.s02.principii_clean_code.clase.Aplicant;

public class ReaderAngajat extends ReaderAplicant {

	@Override
	public List<Aplicant> readAplicants(String file) throws FileNotFoundException {
		Scanner input2 = new Scanner(new File(file));
		input2.useDelimiter(",");
		List<Aplicant> angajati = new ArrayList<Aplicant>();

		while (input2.hasNext()) {
			Angajat angajat = new Angajat();
			super.readAplicant(angajat, input2);
			angajat.setSalariu(input2.nextInt());
			angajat.setOcupatie(input2.next().toString());
			angajati.add(angajat);
			
		}
		input2.close();
		return angajati;
	}

}
