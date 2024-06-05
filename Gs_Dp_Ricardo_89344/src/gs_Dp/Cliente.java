package gs_Dp;

class Cliente {
    private String nome;
    private String cpf;
    private String contatoWhatsapp;

   
    public Cliente(String cpf, String nome, String contatoWhatsapp) {
        this.cpf = cpf;
        this.nome = nome;
        this.contatoWhatsapp = contatoWhatsapp;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getContatoWhatsapp() {
        return contatoWhatsapp;
    }

    public void setContatoWhatsapp(String contatoWhatsapp) {
        this.contatoWhatsapp = contatoWhatsapp;
    }

   
    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf + ", Contato Whatsapp: " + contatoWhatsapp;
    }
}
