/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.List;

/**
 *
 * @author desales
 */
public class ComentarioDAO extends AbstractDAO<Comentario> {
    
    /**
     * Constructor
     * @author desalessr
     */
    public ComentarioDAO() { 
        super(); 
    }

    /**
     * Método para almacenar un nuevo comentario
     * @param comentario Comentario a almacenar
     */
    public void save(Comentario comentario) {
        super.save(comentario);
    }

    /**
     * Método para actualizar un comentario
     *  @param comentario Comentario a actualizar 
     */
    public void update(Comentario comentario) {
        super.save(comentario);
    }

    /**
     *Método para eliminar un marcador
     @param comentario Comentario a eliminar
     */
    public void delete(Comentario comentario) {
        super.delete(comentario);
    }


    /**
     * Método que nos ayidará a mostrar todos los comentarios del marcador
     *@return comentarios Comentarios que serán mostrados
     */
    public List<Comentario> findAll(){
        return super.findAll(Comentario.class);
    }
}