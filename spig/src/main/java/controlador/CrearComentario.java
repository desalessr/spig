/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Comentario;
import modelo.ComentarioDAO;
import java.util.Random;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author desales
 */
@ManagedBean
public class CrearComentario {
    
    private int idcomentario;
     private String contenido;
     private double calificacion;
     private int comentarista;
     private int marcador;
    
    public int getIdcomentario() {
        return this.idcomentario;
    }
    
    public void setIdcomentario(int idcomentario) {
        this.idcomentario = idcomentario;
    }
    public String getContenido() {
        return this.contenido;
    }
    
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public double getCalificacion() {
        return this.calificacion;
    }
    
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    public int getComentarista() {
        return this.comentarista;
    }
    
    public void setComentarista(int comentarista) {
        this.comentarista = comentarista;
    }
    public int getMarcador() {
        return this.marcador;
    }
    
    public void setMarcador(int marcador) {
        this.marcador = marcador;
    }

    public void crearComentario() {
        Comentario c = new Comentario();
        c.setContenido(contenido);
        c.setMarcador(marcador);
        c.setComentarista(comentarista);
        ComentarioDAO cd = new ComentarioDAO();
        cd.save(c);
    }
}
