package exemplos.exemplo02;

public class AppPrintable {
    public static void main(String[] args) {
         // Printable escrita = new EscritaTela();
        // Printable escrita = new EscritaArquivo();

        EscreverResposta resposta = new EscreverResposta();
        

        resposta.gravar(new EscritaArquivo());
        resposta.gravar(new EscritaTela());
    }
}
