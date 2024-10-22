import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;

public class Excel {

	public void excel() {

		// Crear un nuevo libro de Excel
		try (Workbook wb = new HSSFWorkbook()) {
			// Crear una hoja en el libro
			Sheet sheet = wb.createSheet("MiHoja");

			// Crear una fila en la hoja
			Row row = sheet.createRow(0);

			// Crear una celda en la fila y establecer su valor
			Cell cell = row.createCell(0);
			cell.setCellValue("Hola");

			// Escribir el libro en un archivo
			try (FileOutputStream outputStream = new FileOutputStream("C:\\Users\\juanj\\Desktop\\Proyecto Amazon\\PruebaProgramacion\\MiArchivo.xls")) {
				wb.write(outputStream);
			} catch (IOException e) {
				e.printStackTrace();
			}

			System.out.println("Archivo Excel creado exitosamente.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
