package com.example.demo.dao;

import java.util.Map;

import com.example.demo.entity.Categoria;


public interface CategoriaDao {
	public int create(Categoria categoria);
	public int edit(Categoria categoria);
	public int delete(int id);
	public Map<String,Object> read(int id);
	public Map<String,Object> lista();
}
