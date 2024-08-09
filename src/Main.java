import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso("Curso Java", "descrição curso java", 8);
        Curso cursoJavaScript = new Curso("Curso JavaScript", "descrição curso javascript", 4);
        Mentoria mentoriaJava = new Mentoria("Mentoria Java", "descrição da mentoria java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
        bootcamp.adicionarConteudos(cursoJava, cursoJavaScript, mentoriaJava);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);

        devCamila.listarConteudosInscritos();
        devJoao.listarConteudosInscritos();

        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        devCamila.listarConteudosInscritos();
        devCamila.listarConteudosConcluidos();
        System.out.println("XP:" + devCamila.calcularTotalXp());

        devJoao.listarConteudosInscritos();
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        devJoao.listarConteudosInscritos();
        devJoao.listarConteudosConcluidos();
        System.out.println("XP:" + devJoao.calcularTotalXp());

        System.out.printf("%n%n====================%n%n");

        devCamila.listarCertificadosConclusao();

        System.out.printf("%n%n====================%n%n");

        devJoao.listarCertificadosConclusao();

    }

}
