package ar.edu.unq.po2.tp8;

public class FiltroMismaLetraInicial extends Filtros{

	@Override
	protected boolean sonSimilares(WikipediaPage pag1, WikipediaPage pag2) {
		return pag1.getTitle().charAt(0) == pag2.getTitle().charAt(0);
	}
	
}
