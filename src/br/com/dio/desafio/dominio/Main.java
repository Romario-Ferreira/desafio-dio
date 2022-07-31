package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso c1 =  new Curso();
		c1.setTitulo("curso java");
		c1.setDescricao("descriçao curso java");
		c1.setCargaHoraria(10);
		
		Curso c2 =  new Curso();
		c2.setTitulo("curso js");
		c2.setDescricao("descriçao curso js");
		c2.setCargaHoraria(4);
		
		Mentoria m1 = new Mentoria();
		m1.setTitulo("mentoria java");
		m1.setDescricao("descriçao mentoria java");
		m1.setData(LocalDate.now());
		
		/*System.out.println(c1);
		*System.out.println(c2);
		*System.out.println(m1.calcularXp());
		*/
		
		Bootcamp bt1 = new Bootcamp();
		bt1.setName("bootcamp java");
		bt1.setDescricao("descriçao bootcamp java");
		
		bt1.getConteudos().add(c1);
		bt1.getConteudos().add(c2);
		bt1.getConteudos().add(m1);
		
		
		
		Dev d1 = new Dev();
		d1.setNome("Romario");
		d1.increverBootcamp(bt1);

		
		Dev d2 = new Dev();
		d2.setNome("Flavia");
		d2.increverBootcamp(bt1);

		
		System.out.println(d1.getConteudosInscritos());
		System.out.println(d2.getConteudosInscritos());
		d1.progredir();
		d2.progredir();
		System.out.println(d1.getConteudosConcluidos());
		System.out.println(d2.getConteudosConcluidos());
		System.out.println(d1.getConteudosInscritos());
		System.out.println(d2.getConteudosInscritos());
		System.out.println(d1.calcularXp());
		System.out.println(d2.calcularXp());
		
		
	}
}
