import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class APImdb {

    public static void main(String []args) throws IOException, InterruptedException {

        //fazendo conexão HTTP e buscar melhores 250 filmes
         String url = "https://imdb-api.com/en/API/Top250Movies/k_0svd84te";
         URI endereco = URI.create(url);
         HttpClient cliente = HttpClient.newHttpClient();
         HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();
         HttpResponse response = cliente.send(request, BodyHandlers.ofString());
         String body = (String) response.body();
          System.out.println(body);

        //pegando os dados necessarios (Titulo ; Poster ; Nota)
        JsonPars parser = new JsonPars();
        List<Map<String, String>> listaDeFilmes = parser.parse(body);


        //exibir e manipular dados
        for (Map<String,String>filme:listaDeFilmes) {
            System.out.println(filme.get("title"));
            System.out.println(filme.get("image"));
            System.out.println(filme.get("imDbRating"));
            System.out.println();

        }


    }



}
