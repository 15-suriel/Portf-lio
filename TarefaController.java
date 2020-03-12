package controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Tarefa;
import persistencia.TarefaDAO;

@Controller    
@RequestMapping(path="/usuario/")
public class TarefaController {


private TarefaDAO tDAO;

@RequestMapping(value = "", method = RequestMethod.POST)

public ResponseEntity<Tarefa> cadastrarTarefa(@RequestBody Tarefa tarefa) {
tDAO = new TarefaDAO();
tarefa = tDAO.cadastrarTarefa(tarefa);
return new ResponseEntity<Tarefa>(tarefa, HttpStatus.CREATED);

}
}