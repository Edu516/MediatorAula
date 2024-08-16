import java.util.HashMap;
import java.util.Map;

interface SalaDeChatMediator {
    void enviarMensagem(String deUsuario, String paraUsuario, String mensagem);
    void adicionarUsuario(Usuario usuario);
}

class SalaDeChatMediatorImpl implements SalaDeChatMediator {
    private Map<String, Usuario> usuarios = new HashMap<>();

    @Override
    public void enviarMensagem(String deUsuario, String paraUsuario, String mensagem) {
        Usuario usuario = usuarios.get(paraUsuario);
        if (usuario != null) {
            usuario.receberMensagem(deUsuario, mensagem);
        }
    }

    @Override
    public void adicionarUsuario(Usuario usuario) {
        usuarios.put(usuario.getNome(), usuario);
    }
}
