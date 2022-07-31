package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	
	private String nome;
	private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Dev [nome=" + nome + ", conteudosInscritos=" + conteudosInscritos + ", conteudosConcluidos="
				+ conteudosConcluidos + "]";
	}

	public void increverBootcamp (Bootcamp bt) {
		conteudosInscritos.addAll(bt.getConteudos());
		bt.getDevs().add(this);
		
	}
	
	public void progredir() {
		Optional<Conteudo> cont = conteudosInscritos.stream().findFirst();
		if(cont.isPresent()) {
			conteudosConcluidos.add(cont.get());
			conteudosInscritos.remove(cont.get());
		}
		else {
			System.out.println("Você não está matriculado em nenhum conteúdo!");
		}
	}
	
	public double calcularXp() {
		return conteudosConcluidos.stream().mapToDouble(x-> x.calcularXp()).sum();
	}

}
