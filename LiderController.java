package controller;

	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;


	import model.Tarefa;
	import persistencia.LiderDAO;


	@Controller    
	@RequestMapping(path="/lider/")

	public class LiderController {

	private LiderDAO lDAO;

	@RequestMapping(value = "", method = RequestMethod.POST)

	public ResponseEntity<Tarefa> adicionarTarefa(@RequestBody Tarefa tarefa) {
	lDAO = new LiderDAO();
	lDAO.adicionarTarefa(tarefa);
	return new ResponseEntity<Tarefa>(HttpStatus.CREATED);

	}
	

	@RequestMapping(value = "{idTarefa}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> excluirTarefa(@PathVariable long idTarefa){
	lDAO = new LiderDAO();
	lDAO.excluirTarefa(idTarefa);
	return new ResponseEntity<Void>(HttpStatus.OK);

	}
	
}
