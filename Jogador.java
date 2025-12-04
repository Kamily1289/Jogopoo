public class Jogador {

    private int x = 0;
    private int y = 0;
    private int pontos = 0;
    private boolean[][] visitado = new boolean[6][6];

    public int getX() { return x; }
    public int getY() { return y; }
    public int getPontos() { return pontos; }

    public boolean jaVisitou(int x, int y) {
        return visitado[x][y];
    }

    public void marcarVisitado() {
        visitado[x][y] = true;
    }

    public void adicionarPontos(int valor) {
        pontos += valor;
    }

    public boolean mover(char direcao) {
        int novoX = x;
        int novoY = y;

        switch(Character.toUpperCase(direcao)) {
            case 'W': novoX--; break;
            case 'S': novoX++; break;
            case 'A': novoY--; break;
            case 'D': novoY++; break;
            default: return false;
        }

        if (novoX < 0 || novoX >= 6 || novoY < 0 || novoY >= 6)
            return false;

        x = novoX;
        y = novoY;

        return true;
    }
}
