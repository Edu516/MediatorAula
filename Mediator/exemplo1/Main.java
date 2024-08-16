public class Main {
    public static void main(String[] args) {
        SalaDeChatMediator salaDeChat = new SalaDeChatMediatorImpl();

        Usuario usuario1 = new Usuario("Alice", salaDeChat);
        Usuario usuario2 = new Usuario("Bob", salaDeChat);
        Usuario usuario3 = new Usuario("Carlos", salaDeChat);

        salaDeChat.adicionarUsuario(usuario1);
        salaDeChat.adicionarUsuario(usuario2);
        salaDeChat.adicionarUsuario(usuario3);

        usuario1.enviarMensagem("Bob", "Olá Bob!");
        usuario2.enviarMensagem("Alice", "Oi Alice!");
        usuario3.enviarMensagem("Alice", "Ei Alice, aqui é o Carlos!");
    }
}
