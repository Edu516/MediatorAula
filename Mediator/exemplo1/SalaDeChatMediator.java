interface SalaDeChatMediator {
    void enviarMensagem(String deUsuario, String paraUsuario, String mensagem);
    void adicionarUsuario(Usuario usuario);
}