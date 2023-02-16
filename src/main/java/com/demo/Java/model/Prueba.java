package com.demo.Java.model;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
@Data
@Entity
@Table(name = "Prueba")
@NoArgsConstructor
public class Prueba implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;


    public Prueba(int i, String francisco, String granados) {
    }

    public Prueba(String nombre, String apellido) {
    }
}
