package poos3_semana12_ex_junior.main;

import java.util.Optional;

import poos3_semana12_ex_junior.entities.Curso;
import poos3_semana12_ex_junior.entities.CursoArqEnum;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String g = "Graduação";
		
		Optional<CursoArqEnum> opt = CursoArqEnum.getCursoStatus(g);
		
		CursoArqEnum curso =  opt.orElse(CursoArqEnum.GRADUAÇÃO);
		
		
		Curso curse = new Curso(curso);
		
		System.out.println(curse.getCursos());
		System.out.println(curse.getCursos().getC());
		System.out.println(CursoArqEnum.GRADUAÇÃO.getC());
		
		

	}

}
