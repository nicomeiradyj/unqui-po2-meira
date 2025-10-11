package ar.edu.unq.po2.tp8;

import java.util.List;

public class FiltroLinkEnComun extends Filtros{

	@Override
	protected boolean sonSimilares(WikipediaPage pag1, WikipediaPage pag2) {
		return hayAlMenosUnLinkEnAmbas(pag1.getLinks(), pag2.getLinks());
	}

	private boolean hayAlMenosUnLinkEnAmbas(List<WikipediaPage> links, List<WikipediaPage> links2) {
		for(WikipediaPage link : links) {
			if(links2.contains(link)) {
				return true;
			}
		}
		return false;
	}
	
}
