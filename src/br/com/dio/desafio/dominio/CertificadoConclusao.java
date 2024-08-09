package br.com.dio.desafio.dominio;

public abstract class CertificadoConclusao {

    private final TipoCertificadoConclusaoEnum tipoCertificadoConclusao;
    private final Conteudo conteudo;
    private final Dev dev;

    public CertificadoConclusao(TipoCertificadoConclusaoEnum tipoCertificadoConclusao,
                                Conteudo conteudo,
                                Dev dev) {
        this.tipoCertificadoConclusao = tipoCertificadoConclusao;
        this.conteudo = conteudo;
        this.dev = dev;
    }

    public abstract void imprimirTextoCertificadoConclusao();


    public TipoCertificadoConclusaoEnum getTipoCertificadoConclusao() {
        return tipoCertificadoConclusao;
    }

    public Conteudo getConteudo() {
        return conteudo;
    }

    public Dev getDev() {
        return dev;
    }
}
