package controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Usuario;
import persistencia.UsuarioDAO;

@Controller    
@RequestMapping(path="/usuario/")
public class UsuarioController {


private UsuarioDAO uDAO;

@RequestMapping(value = "", method = RequestMethod.POST)

public ResponseEntity<Usuario> cadastrarUsuario(@RequestBody Usuario usuario) {
uDAO = new UsuarioDAO();
usuario = uDAO.cadastrarUsuario(usuario);
return new ResponseEntity<Usuario>(usuario, HttpStatus.CREATED);

}
@RequestMapping(value = "", method = RequestMethod.PUT)
public ResponseEntity<Void> atualizarDados(@RequestBody Usuario usuario){
uDAO = new UsuarioDAO();
uDAO.atualizarDados(usuario);
return new ResponseEntity<Void>(HttpStatus.OK);

}

@RequestMapping(value = "{idUsuario}", method = RequestMethod.DELETE)
public ResponseEntity<Void> excluirContaUsuario(@PathVariable long idUsuario){
uDAO = new UsuarioDAO();
uDAO.excluirContaUsuario(idUsuario);
return new ResponseEntity<Void>(HttpStatus.OK);

}
}