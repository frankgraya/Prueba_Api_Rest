package com.demo.Java.model;

import lombok.*;
import org.hibernate.Hibernate;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;



/**
 *@Table(name = "Cliente", uniqueConstraints = {@UniqueConstraint(columnNames = {"nombre"})})
 * Es una regla que funciona para que  el titulo sea unico y nos e mande por el Json
 */

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
//@Table(name = "clientes", uniqueConstraints = {@UniqueConstraint(columnNames = {"nombre"})})
@Table(name = "clientes")
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "email")
    private String email;
    @Column(name = "create_At")
    private String createAt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Cliente cliente = (Cliente) o;
        return id != null && Objects.equals(id, cliente.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }


}
