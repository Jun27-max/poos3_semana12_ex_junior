package poos3_semana12_ex_junior.entities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class GerenciadorArquivo {

	private File file;

	public GerenciadorArquivo(File file) {
		this.file = file;
	}

	public List<Curso> lerArquivo() throws FileNotFoundException {
		List<Curso> nome = new ArrayList<>();

		try (Workbook w = new XSSFWorkbook(
				new FileInputStream("C:\\Users\\Junior\\Desktop\\POO\\Semana 12\\cursos_arq.xlsx"))) {// fluxo de
																										// conexão
			Sheet sheet = w.getSheetAt(0);// importar ss
			if (sheet.getPhysicalNumberOfRows() > 0) {
				sheet.removeRow(sheet.getRow(0));
			}
			
			

			sheet.forEach(row -> {
				row.forEach(cell ->{
					nome.add(new Curso(row.getCell(0).getStringCellValue(),row.getCell(1).getNumericCellValue(),row.getCell(2).getRichStringCellValue())));
				});
			});
			

		} catch (IOException e) {
			e.printStackTrace();
		}

		return nome;
	}
}
