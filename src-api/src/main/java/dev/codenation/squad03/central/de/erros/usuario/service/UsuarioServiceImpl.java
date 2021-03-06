package dev.codenation.squad03.central.de.erros.usuario.service;

import dev.codenation.squad03.central.de.erros.usuario.model.Usuario;
import dev.codenation.squad03.central.de.erros.usuario.repository.UsuarioRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

  @Autowired
  private UsuarioRepository usuarioRepository;

  @Transactional
  @Override
  public Usuario save(Usuario usuario) {
    return this.usuarioRepository.save(usuario);
  }

  @Transactional(readOnly = true)
  @Override
  public Usuario findByEmail(String email) {
    return this.usuarioRepository.findByEmail(email);
  }

  @Override
  public Usuario logar(Usuario usuario) {
    return null;
  }

  @Override
  public Optional<Usuario> findById(Long id) {
    return usuarioRepository.findById(id);
  }

}
