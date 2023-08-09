import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCep {
    public static Endereco buscaEnderecoNoBanco(String cep){
        URI endereco = URI.create("http://viacep.com.br/ws/" + cep + "/json");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        HttpResponse<String> response = null;
        try {
            response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível obter um endereço a partir desse CEP.");
        }

        return new Gson().fromJson(response.body(), Endereco.class);
    }
}
