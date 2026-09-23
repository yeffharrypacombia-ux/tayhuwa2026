package pe.edu.upeu.sysventas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pe.edu.upeu.sysventas.model.Categoria;
import pe.edu.upeu.sysventas.service.ICategoriaService;

import java.util.List;
import java.util.Optional;

@Controller
public class CategoriaController {

    @Autowired
    private ICategoriaService categoriaService;

    public List<Categoria> listarCategorias() {
        try {
            return categoriaService.listar();
        } catch (Exception e) {
            System.err.println("Error al listar categorías: " + e.getMessage());
            return null;
        }
    }

    public Categoria guardarCategoria(Categoria categoria) {
        try {
            return categoriaService.guardar(categoria);
        } catch (Exception e) {
            System.err.println("Error al guardar categoría: " + e.getMessage());
            return null;
        }
    }

    public Categoria actualizarCategoria(Long id, Categoria categoria) {
        try {
            categoria.setIdCategoria(id);
            return categoriaService.modificar(categoria);
        } catch (Exception e) {
            System.err.println("Error al actualizar categoría: " + e.getMessage());
            return null;
        }
    }

    public void eliminarCategoria(Long id) {
        try {
            categoriaService.eliminar(id);
        } catch (Exception e) {
            System.err.println("Error al eliminar categoría: " + e.getMessage());
        }
    }

    public Optional<Categoria> buscarPorId(Long id) {
        try {
            return categoriaService.listarPorId(id);
        } catch (Exception e) {
            System.err.println("Error al buscar categoría por ID: " + e.getMessage());
            return Optional.empty();
        }
    }
}
