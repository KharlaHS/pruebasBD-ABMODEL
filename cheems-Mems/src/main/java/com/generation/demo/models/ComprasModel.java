package com.generation.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Compras")
public class ComprasModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Integer id;
	
	@JoinColumn(name = "Usuario_id", referencedColumnName = "id",nullable = false)
	private int usuario_id;
	
	@Column(name = "total", nullable = false)
	private int total;
	
	@Column(name = "Estatus", nullable = false, length = 255)
	private String Estatus;
	
}
