package poos3_semana12_ex_junior.entities;

import java.util.Optional;


public enum CursoArqEnum {
	
	TECNICO("Tecnico"),
	GRADUA��O("Gradua��o"),
	POS_GRADUACAO("P�s-Gradua��o"),
	N�O_INFORMADO("Inexistente.");
	

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
