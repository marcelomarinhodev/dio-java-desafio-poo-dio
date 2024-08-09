package br.com.dio.desafio.dominio;

public class CertificadoConclusaoCurso extends CertificadoConclusao {

    public CertificadoConclusaoCurso(Conteudo conteudo, Dev dev) {
        super(TipoCertificadoConclusaoEnum.CURSO,
                conteudo,
                dev);
    }

    @Override
    public void imprimirTextoCertificadoConclusao() {
        System.out.printf("Parabéns %s por terminar o Curso - %s%n",
                getDev().getNome().toUpperCase(),
                getConteudo().getTitulo().toUpperCase());
    }
}
