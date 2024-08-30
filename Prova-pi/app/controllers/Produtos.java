package controllers;

import java.util.List;

import models.Produto;

public class Produtos extends play.mvc.Controller {

	public static void form() {
		render();
	}

	public static void salvar(Produto produto) {
		produto.save();
		listar();
	}

	public static void listar() {
		List<Produto> produto = Produto.findAll();
		for (Produto p : produto) {
			p.Total = p.quantidade;
			render(produto, p);
		}

	}

	public static void remover(Long id) {
		Produto p = Produto.findById(id);
		p.delete();
		listar();
	}

}
