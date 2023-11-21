public class Iphone implements  TocadorDeMusica, AparelhoTelefonico, Navegador{
    @Override
    public void tocar() {
        System.out.println("tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("musica pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("selecionando musica");
    }

    @Override
    public void ligar() {
        System.out.println("ligando");

    }

    @Override
    public void atender() {
        System.out.println("atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("iniciando correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("exibindo pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizando pagina");
    }
}
