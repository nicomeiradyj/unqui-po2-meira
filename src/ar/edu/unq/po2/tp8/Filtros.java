package ar.edu.unq.po2.tp8;

import java.util.List;
import java.util.ArrayList;

public abstract class Filtros {
	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia){
		List<WikipediaPage> paginasSimilares = new ArrayList<>();
		
		for(WikipediaPage paginaAComparar : wikipedia) {
			if(this.sonSimilares(page, paginaAComparar)) {
				paginasSimilares.add(paginaAComparar);
			}
		}
		return paginasSimilares;
	}
	
	protected abstract boolean sonSimilares(WikipediaPage pag1, WikipediaPage pag2);
	
}
