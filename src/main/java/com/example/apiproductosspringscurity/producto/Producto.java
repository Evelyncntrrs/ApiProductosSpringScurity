package com.example.apiproductosspringscurity.producto;
/*
spring.datasource.url=jdbc:mysql://localhost:3306/disney?serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=unafacil
spring.jpa.show-sql=true

 */
import javax.persistence.*;

@Entity
@Table( name= "productos")
public class Producto {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productoId;
    private String nombre;
    private Double precio;

    public Producto(int productoId, String nombre, Double precio) {
        this.productoId = productoId;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto() {
    }

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "productoId=" + productoId +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
