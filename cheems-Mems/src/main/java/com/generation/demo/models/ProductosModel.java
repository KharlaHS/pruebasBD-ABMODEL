package com.generation.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Productos")
public class ProductosModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "Nombre_producto", nullable = false, length = 255)
	private String nombre_producto;
	
	@Column(name = "Precio", nullable = false)
	private int precio;
	
	@Column(name = "Cantidad_inventario", nullable = false)
	private byte cantidad_inventario;
	
	
}
