package ar.edu.utn.frba.dds.services.externo;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import ar.edu.utn.frba.dds.model.poi.cgp.CGP;

public interface ServicioConsultaCGP {

    public List<CGP> getCentrosExternos(String zona) throws JsonParseException, JsonMappingException, IOException;

}
