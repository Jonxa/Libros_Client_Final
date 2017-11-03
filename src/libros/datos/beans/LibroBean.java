/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros.datos.beans;

import java.beans.*;
import java.io.Serializable;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author ubuntu
 */
public class LibroBean implements Serializable {
    
    
    private final SimpleStringProperty isbn;
    private final SimpleStringProperty titulo;
    private final SimpleStringProperty autor;
    private final SimpleStringProperty editorial;
    private final SimpleStringProperty descripcion;
    private final SimpleStringProperty fechaPub;
    private final SimpleFloatProperty precio;
    private final SimpleIntegerProperty stock;

    
     public LibroBean(String isbn,String titulo,String autor,
            String editorial,String descripcion,String fechaPub,Float precio,Integer stock){
        
        this.isbn= new SimpleStringProperty(isbn);
        this.titulo= new SimpleStringProperty(titulo);
        this.autor= new SimpleStringProperty(autor);
        this.editorial= new SimpleStringProperty(editorial);
        this.descripcion= new SimpleStringProperty(descripcion);
        this.fechaPub= new SimpleStringProperty(fechaPub);
        this.precio= new SimpleFloatProperty(precio);
        this.stock= new SimpleIntegerProperty (stock);
        
}

    public String getIsbn() {
        return this.isbn.get();
    }

    public void setIsbn(String isbn) {
        this.isbn.set(isbn);
    }

    public String getTitulo() {
        return this.titulo.get();
    }

    public void setTitulo(String titulo) {
        this.titulo.set(titulo);
    }

    public String getAutor() {
        return this.autor.get();
    }

    public void setAutor(String autor) {
        this.autor.set(autor);
    }

    public String getEditorial() {
        return this.editorial.get();
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaPub() {
        return fechaPub;
    }

    public void setFechaPub(String fechaPub) {
        this.fechaPub = fechaPub;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
    
   
    
}