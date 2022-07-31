package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

	private String name;
	private String descricao;
	private final LocalDate dataInicial = LocalDate.now();
	private final LocalDate dateFinal = LocalDate.now().plusDays(45);
	private Set<Dev> devs = new HashSet<>();
	private Set<Conteudo> conteudos = new LinkedHashSet<>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDate getDataInicial() {
		return dataInicial;
	}
	public LocalDate getDateFinal() {
		return dateFinal;
	}
	public Set<Dev> getDevs() {
		return devs;
	}
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(name, other.name);
	}
	
	

}
