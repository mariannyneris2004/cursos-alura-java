public class Endereco {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;

    public Endereco(String cep, String logradouro, String complemento,
                    String bairro, String localidade, String uf) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
    }

    public static Endereco buscaEndereco(String cep){
        Endereco enderecoEncontrado = ConsultaCep.buscaEnderecoNoBanco(cep);

        if (enderecoEncontrado.getCep() == null){
            throw new RuntimeException("Esse endereço está vazio!");
        }
        return enderecoEncontrado;
    }

    public String getCep(){
        return cep;
    }

    @Override
    public String toString() {
        return "----------------------------------\n"+
                "Endereco: \n" +
                "----------------------------------\n"+
                "CEP = " + cep + "\n" +
                "Logradouro = " + logradouro + "\n" +
                "Complemento = " + complemento + "\n" +
                "Bairro = " + bairro + "\n" +
                "Localidade = " + localidade + "\n" +
                "UF = " + uf + "\n" +
                "----------------------------------\n";
    }
}
