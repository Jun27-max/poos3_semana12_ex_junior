package poos3_semana12_ex_junior.entities;

import java.util.Optional;


public enum CursoArqEnum {
	
	TECNICO("Tecnico"),
	GRADUAÇÃO("Graduação"),
	POS_GRADUACAO("Pós-Graduação"),
	NÃO_INFORMADO("Inexistente.");
	

	private String c;
	
	CursoArqEnum(String c){
		this.c = c;
	}

	public String getC() {
		return c;
	}
	
	public static Optional<CursoArqEnum> getCursoStatus(String nivel){
		CursoArqEnum[] constantes = values();
		for (CursoArqEnum c : constantes) {
			if (c.getC() == nivel) {
				return Optional.of(c);
			}
		}
		return Optional.empty();
	}
	

	

}
