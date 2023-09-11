package ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ifrn.pi.eventos.models.Evento;

@Controller
public class EventosCotrollers {
	
	@RequestMapping("/eventos/form")
	public String form() {
		return "formEvento";
	}
	

	
}
