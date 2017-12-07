package jogo;


public class CampoAberto implements Jogadas {

	public CampoAberto(int i, int j, JanelaJogo window) {
		jogar(i, j, window);
	}

	@Override
	public void jogar(int i, int j, JanelaJogo window) {
		for (int k = 0; k < 3; k++) {
			for (int k2 = 0; k2 < 3; k2++) {
				if (Mapa.isValido(window.getCampo().getCampoJogador(), i + k - 1, j + k2 - 1)
						&& window.getCampo().getCampoJogador()[i + k - 1][j + k2 - 1] == 10) {
					new AbrirCampos(i + k - 1, j + k2 - 1, window);
					if (window.getCampo().getCampoReferencia()[i + k - 1][j + k2 - 1] == 9) {
						break;
					}
				}
			}
		}
	}

}
