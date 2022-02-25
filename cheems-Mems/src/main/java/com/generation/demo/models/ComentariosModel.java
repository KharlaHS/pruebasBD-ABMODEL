package com.generation.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Comentarios")
public class ComentariosModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "Nombre", nullable = false, length = 40)
	private String nombre;
	
	@Column(name = "email", nullable = false, length = 255)
	private String email;
	
	@Column(name = "Mensaje", nullable = false)
	private String mensaje;
	
}
