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
		curso2.setTitulo("Curso de L�gica de Programa��o em Java");
		curso2.setDescricao("Curso de L�gica de Programa��o voltado � linguagem Java");
		curso2.setCargaHoraria(4);
		
		Conteudo conteudo = new Curso();
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Saiba as possibilidades de utiliza��o da linguagem Java");
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
		System.out.println("Conte�dos inscritos" + devCamila.getConteudosInscritos());
		
		devCamila.progredir();
		devCamila.progredir();
		
		System.out.println("Conte�dos inscritos" + devCamila.getConteudosInscritos());
		System.out.println("Conte�dos conclu�dos" + devCamila.getConteudosConcluidos());
		System.out.println("XP:" + devCamila.calcularTotalXp());
		
		Dev devJoao = new Dev();
		devJoao.setNome("Jo�o");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos inscritos" + devJoao.getConteudosInscritos());
		
		devJoao.progredir();
		
		System.out.println("Conte�dos inscritos" + devJoao.getConteudosInscritos());
		System.out.println("Conte�dos conclu�dos" + devJoao.getConteudosConcluidos());
		System.out.println("XP:" + devJoao.calcularTotalXp());
	}
}
