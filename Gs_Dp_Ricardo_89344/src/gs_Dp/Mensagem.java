package gs_Dp;


class Mensagem {
    private Cliente cliente;
    private String texto;

    
    public Mensagem(Cliente cliente, String texto) {
        this.cliente = cliente;
        this.texto = texto;
    }

    
    public Cliente getCliente() {
        return cliente;
    }

    public String getTexto() {
        return texto;
    }
}
