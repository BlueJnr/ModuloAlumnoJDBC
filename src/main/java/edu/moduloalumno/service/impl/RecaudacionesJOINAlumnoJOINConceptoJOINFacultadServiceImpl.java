package edu.moduloalumno.service.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.IRecaudacionesJOINAlumnoJOINConceptoJOINFacultadDAO;
import edu.moduloalumno.entity.Recaudaciones;
import edu.moduloalumno.entity.RecaudacionesJOINAlumnoJOINConceptoJOINFacultad;
import edu.moduloalumno.service.IRecaudacionesJOINAlumnoJOINConceptoJOINFacultadService;

@Service
public class RecaudacionesJOINAlumnoJOINConceptoJOINFacultadServiceImpl implements IRecaudacionesJOINAlumnoJOINConceptoJOINFacultadService {
	@Autowired
	private IRecaudacionesJOINAlumnoJOINConceptoJOINFacultadDAO recaudacionesJOINAlumnoJOINConceptoJOINFacultadDAO;

	@Override
	public List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getAllRecaudacionesJOINAlumnoJOINConceptoJOINFacultads() {
		return recaudacionesJOINAlumnoJOINConceptoJOINFacultadDAO.getAllRecaudacionesJOINAlumnoJOINConceptoJOINFacultads();
	}
	
	@Override
	public List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadIdByNombresApellidosRestringido(String nombres, String apellidos) {
		
		List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> alumnoProgramaList = recaudacionesJOINAlumnoJOINConceptoJOINFacultadDAO.getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadIdByNombresApellidosRestringido(nombres, apellidos);
		
		return alumnoProgramaList;
	}

	@Override
	public RecaudacionesJOINAlumnoJOINConceptoJOINFacultad getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadById(int idRecaudaciones) {

		RecaudacionesJOINAlumnoJOINConceptoJOINFacultad recaudaciones = recaudacionesJOINAlumnoJOINConceptoJOINFacultadDAO.getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadById(idRecaudaciones);
		
		return recaudaciones;
	}

	@Override
	public List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByStartDateBetween(Date fechaInicial, Date fechaFinal) {

		List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> recaudacionesList = recaudacionesJOINAlumnoJOINConceptoJOINFacultadDAO.getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByStartDateBetween(fechaInicial,
				fechaFinal);
		return recaudacionesList;
	}

	@Override
	public List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNomApeStartDateBetween(String nomApe, Date fechaInicial,
			Date fechaFinal) {

		List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> recaudacionesList = recaudacionesJOINAlumnoJOINConceptoJOINFacultadDAO.getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNomApeStartDateBetween(nomApe,
				fechaInicial, fechaFinal);
		
		return recaudacionesList;
	}

	@Override
	public List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNomApe(String nomApe) {

		List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> recaudacionesList = recaudacionesJOINAlumnoJOINConceptoJOINFacultadDAO.getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNomApe(nomApe);
		return recaudacionesList;
	}

	@Override
	public List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNomApeConcepto(String concepto, String nomApe) {

		List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> recaudacionesList = recaudacionesJOINAlumnoJOINConceptoJOINFacultadDAO.getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNomApeConcepto(concepto, nomApe);
		
		return recaudacionesList;
	}

	@Override
	public List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNomApeRecibo(String recibo, String nomApe) {

		List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> recaudacionesList = recaudacionesJOINAlumnoJOINConceptoJOINFacultadDAO.getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNomApeRecibo(recibo, nomApe);
		return recaudacionesList;

	}

	@Override
	public List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByPosgrado() {
		List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> recaudacionesList = recaudacionesJOINAlumnoJOINConceptoJOINFacultadDAO.getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByPosgrado();
		
		return recaudacionesList;
	}

	@Override
	public List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNombresApellidosStartDateBetween(String nombres, String apellidos,
			Date fechaInicial, Date fechaFinal) {

		List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> recaudacionesList = recaudacionesJOINAlumnoJOINConceptoJOINFacultadDAO
				.getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNombresApellidosStartDateBetween(nombres, apellidos, fechaInicial, fechaFinal);
		
		return recaudacionesList;
	}

	@Override
	public List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNombresApellidos(String nombres, String apellidos) {

		List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> recaudacionesList = recaudacionesJOINAlumnoJOINConceptoJOINFacultadDAO.getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNombresApellidos(nombres, apellidos);
		
		return recaudacionesList;
	}

	@Override
	public List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNombresApellidosConcepto(String concepto, String nombres,
			String apellidos) {

		List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> recaudacionesList = recaudacionesJOINAlumnoJOINConceptoJOINFacultadDAO.getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNombresApellidosConcepto(concepto,
				nombres, apellidos);
		
		return recaudacionesList;
	}

	@Override
	public List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNombresApellidosRecibo(String recibo, String nombres,
			String apellidos) {

		List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> recaudacionesList = recaudacionesJOINAlumnoJOINConceptoJOINFacultadDAO.getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNombresApellidosRecibo(recibo,
				nombres, apellidos);
		return recaudacionesList;
	}

	@Override
	public int updateRecaudacionesJOINAlumnoJOINConceptoJOINFacultad(RecaudacionesJOINAlumnoJOINConceptoJOINFacultad recaudaciones) {
		return recaudacionesJOINAlumnoJOINConceptoJOINFacultadDAO.updateRecaudacionesJOINAlumnoJOINConceptoJOINFacultad(recaudaciones);
	}

	@Override
	public int updateRecaudacionesJOINAlumnoJOINConceptoJOINFacultad(List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> reacaudacionesList) {
		int update = 0;
		for (RecaudacionesJOINAlumnoJOINConceptoJOINFacultad recaudaciones : reacaudacionesList) {
			update+=recaudacionesJOINAlumnoJOINConceptoJOINFacultadDAO.updateRecaudacionesJOINAlumnoJOINConceptoJOINFacultad(recaudaciones);
		}
		return update;
	}
	@Override
	public void deleteRecaudacionesJOINAlumnoJOINConceptoJOINFacultad(int idRecaudaciones) {
		recaudacionesJOINAlumnoJOINConceptoJOINFacultadDAO.deleteRecaudacionesJOINAlumnoJOINConceptoJOINFacultad(idRecaudaciones);
	}
}
