package ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ifrn.pi.eventos.models.Evento;

@Controller
public class EventosCotrollers {
	
	@RequestMapping("/eventos/form")
	public String form() {
		return "formEvento";
	}
	  @PostMapping("/processarForm")
	    public String processarFormulario(@ModelAttribute Evento evento, Model model) {
	       
	        System.out.println("Nome: " + evento.getNome());
	        System.out.println("Descrição: " + evento.getLocal());
	        System.out.println("Data: " + evento.getData());
	        System.out.println("Horário: " + evento.getHorario());

	        return "home"; 
	    }

	
}
