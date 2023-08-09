import com.google.gson.JsonSyntaxException;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu CEP: ");
        String cep = scanner.next();

        try{
            Endereco endereco = Endereco.buscaEndereco(cep);
            GeradorDeArquivo.geraArquivoJson(endereco);
        } catch (JsonSyntaxException e){
            System.out.println("CEP inválido!");
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        scanner.close();
    }
}