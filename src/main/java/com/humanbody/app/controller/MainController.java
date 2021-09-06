package com.humanbody.app.controller;

import java.util.Optional;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.humanbody.app.dao.ParteCuerpoHumanoDAO;
import com.humanbody.app.entity.ParteCuerpoHumano;



@Controller
@RequestMapping("/cuerpohumano")
public class MainController {

	@Autowired
	private ParteCuerpoHumanoDAO puertaCuerpoDAO;
	
	
    @RequestMapping("/{idSistema}")
    public String  irASistema(@PathVariable String idSistema) {
        
        return idSistema; //view
    }
    
	@GetMapping("/getInfo/{idParte}")
	@ResponseStatus(HttpStatus.OK)
	ResponseEntity<ParteCuerpoHumano> getParte(@PathVariable long idParte) throws InterruptedException, ExecutionException {
		
		ParteCuerpoHumano parte;
		
		Optional<ParteCuerpoHumano> resultado = puertaCuerpoDAO.findById(idParte);
		
		
		if(resultado.isPresent()) {
			parte = resultado.get();
		} else {		
			parte = new ParteCuerpoHumano();
			parte.setNombre("ERROR!");
			parte.setDetalle("No se encontro la informacion de la parte indicada. Comuniquese con el administrador para reportar el problema.");
		}
		
		return new ResponseEntity<ParteCuerpoHumano>(parte, HttpStatus.OK);

	}
}
