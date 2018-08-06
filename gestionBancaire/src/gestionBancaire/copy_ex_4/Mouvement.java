package gestionBancaire.copy_ex_4;

import java.util.Date;

public abstract class Mouvement {
	protected int montant;
	protected Date dateMvt;
	protected String typeMvt;
	
	Mouvement(Date date, String type, int montant) {
		montant = 0;
	}
	
	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

	public Date getDateMvt() {
		return dateMvt;
	}

	public void setDateMvt(Date dateMvt) {
		this.dateMvt = dateMvt;
	}

	public String getTypeMvt() {
		return typeMvt;
	}

	public void setTypeMvt(String typeMvt) {
		this.typeMvt = typeMvt;
	}
}
