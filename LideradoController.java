package controller;

	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;

	import model.Tarefa;
	import persistencia.LideradoDAO;

	@Controller    
	@RequestMapping(path="/liderado/")
	public class LideradoController {

	private LideradoDAO lidDAO;

	@RequestMapping(value = "", method = RequestMethod.PUT)
	public ResponseEntity<Void> realizarTarefa(@RequestBody Tarefa tarefa){
	lidDAO = new LideradoDAO();
	lidDAO.realizarTarefa(tarefa);
	return new ResponseEntity<Void>(HttpStatus.OK);

	}

	
}


