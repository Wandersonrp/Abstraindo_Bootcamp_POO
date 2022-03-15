import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Ambiente de Desenvolvimento Java");
		curso1.setDescricao("Curso de ambiente de desenvolvimento na linguagem Java");
		curso1.setCargaHoraria(1);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso de Lógica de Programação em Java");
		curso2.setDescricao("Curso de Lógica de Programação voltado à linguagem Java");
		curso2.setCargaHoraria(4);
		
		Conteudo conteudo = new Curso();
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Saiba as possibilidades de utilização da linguagem Java");
		mentoria.setDescricao("Java e sua versatilidade");
		mentoria.setData(LocalDate.now());
		
		//System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Bootcamp intensivo em Java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos" + devCamila.getConteudosInscritos());
		
		devCamila.progredir();
		devCamila.progredir();
		
		System.out.println("Conteúdos inscritos" + devCamila.getConteudosInscritos());
		System.out.println("Conteúdos concluídos" + devCamila.getConteudosConcluidos());
		System.out.println("XP:" + devCamila.calcularTotalXp());
		
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos" + devJoao.getConteudosInscritos());
		
		devJoao.progredir();
		
		System.out.println("Conteúdos inscritos" + devJoao.getConteudosInscritos());
		System.out.println("Conteúdos concluídos" + devJoao.getConteudosConcluidos());
		System.out.println("XP:" + devJoao.calcularTotalXp());
	}
}
