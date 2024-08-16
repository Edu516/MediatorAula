class Usuario {
    private String nome;
    private SalaDeChatMediator salaDeChat;

    public Usuario(String nome, SalaDeChatMediator salaDeChat) {
        this.nome = nome;
        this.salaDeChat = salaDeChat;
    }

    public String getNome() {
        return nome;
    }

    public void enviarMensagem(String paraUsuario, String mensagem) {
        salaDeChat.enviarMensagem(nome, paraUsuario, mensagem);
    }

    public void receberMensagem(String deUsuario, String mensagem) {
        System.out.println(deUsuario + " para " + nome + ": " + mensagem);
    }
}
