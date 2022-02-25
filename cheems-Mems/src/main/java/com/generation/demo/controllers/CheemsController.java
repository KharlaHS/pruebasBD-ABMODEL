package com.generation.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.generation.demo.models.ComentariosModel;
import com.generation.demo.models.ProductosModel;
import com.generation.demo.models.UsuariosModel;
import com.generation.demo.services.ComentariosService;
import com.generation.demo.services.ProductosService;
import com.generation.demo.services.UsuariosService;



public class CheemsController {
private final UsuariosService usuariosService;
private final ProductosService productosService;
private final ComentariosService comentariosService;

	
	public CheemsController(
		@Autowired UsuariosService usuariosService,
		@Autowired ProductosService productosService,
		@Autowired ComentariosService comentariosService) {
		this.usuariosService = usuariosService;
		this.productosService = productosService;
		this.comentariosService = comentariosService;
	}
	
	//mostrar datos de usuarios
	@GetMapping("/usuarios")
	public ArrayList<UsuariosModel> obtenerDatos() {
		return usuariosService.obtenerDatos();
	}
	
	//Guardar & editar datos en la tabla usuarios
	@PostMapping("/usuarios")
	public UsuariosModel guardarDatos(@RequestBody UsuariosModel usuariosModel) {
		return usuariosService.guardarDatos(usuariosModel);
	}
	
	//Eliminar datos va a borrar elementos utilizando un identificador
	@DeleteMapping(path = "/usuarios/{id}") 
	public boolean eliminarDato(@PathVariable("id") Integer id) {
		return usuariosService.eliminarDato(id);
	}
	
	//mostrar datos de productos
		@GetMapping("/productos")
		public ArrayList<ProductosModel> obtenerDatosProduct() {
			return productosService.obtenerDatos();
		}
		
		//Guardar & editar datos en la tabla usuarios
		@PostMapping("/productos")
		public ProductosModel guardarDatosProduct(@RequestBody ProductosModel productosModel) {
			return productosService.guardarDatos(productosModel);
		}
		
		//Eliminar datos va a borrar elementos utilizando un identificador
		@DeleteMapping(path = "/productos/{id}") 
		public boolean eliminarDatoProduct(@PathVariable("id") Integer id) {
			return productosService.eliminarDato(id);
		}
		
		//mostrar datos de comentarios
		@GetMapping("/comentarios")
		public ArrayList<ComentariosModel> obtenerDatosComent() {
			return comentariosService.obtenerDatos();
		}
				
		//Guardar & editar datos en la tabla usuarios
		@PostMapping("/comentarios")
		public ComentariosModel guardarDatosComent(@RequestBody ComentariosModel comentariosModel) {
			return comentariosService.guardarDatos(comentariosModel);
		}
				
		//Eliminar datos va a borrar elementos utilizando un identificador
		@DeleteMapping(path = "/comentarios/{id}") 
		public boolean eliminarDatoComent(@PathVariable("id") Integer id) {
			return comentariosService.eliminarDato(id);
		}
}
