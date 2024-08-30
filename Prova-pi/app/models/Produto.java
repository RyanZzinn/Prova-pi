package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Produto extends Model {

	public String nome;
	public double preco;
	public int quantidade;
	public String categoria;
	public double Total;

}
