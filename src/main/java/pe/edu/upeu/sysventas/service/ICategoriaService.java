package pe.edu.upeu.sysventas.service;

import pe.edu.upeu.sysventas.model.Categoria;
import java.util.List;
import java.util.Optional;

public interface ICategoriaService extends ICrudGenericoService<Categoria, Long> {
    List<Categoria> buscarPorNombre(String nombre);
    Optional<Categoria> buscarPorNombreExacto(String nombre);
    List<Categoria> listarPorEstado(String estado);
}
