package com.demo.Java.model;
import lombok.*;
import javax.persistence.*;
@Getter
@Setter
@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "person")
public class Humano {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String ubication;
    String position;
    String fullname;
    String image;


}
