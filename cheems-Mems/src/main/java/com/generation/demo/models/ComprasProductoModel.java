package com.generation.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ComprasProducto")
public class ComprasProductoModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "cantidad", nullable = false)
	private int cantidad;
	
	@Column(name = "subtotal", nullable = false, length = 255)
	private String subtotal;
	
	

	public ComprasProductoModel() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(String subtotal) {
		this.subtotal = subtotal;
	}

	@Override
	public String toString() {
		return "ComprasProductoModel [id=" + id + ", cantidad=" + cantidad + ", subtotal=" + subtotal + "]";
	}
	
	
}
