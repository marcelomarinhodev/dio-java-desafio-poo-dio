package br.com.dio.desafio.dominio;

public class CertificadoConclusaoMentoria extends CertificadoConclusao {


    public CertificadoConclusaoMentoria(Conteudo conteudo,
                                        Dev dev) {
        super(TipoCertificadoConclusaoEnum.MENTORIA, conteudo, dev);
    }

    @Override
    public void imprimirTextoCertificadoConclusao() {
        System.out.printf("Parabéns %s por terminar a Mentoria - %s. Esperamos que ela faça a diferença na sua carreira!%n",
                getDev().getNome().toUpperCase(),
                getConteudo().getTitulo().toUpperCase());
    }
}
