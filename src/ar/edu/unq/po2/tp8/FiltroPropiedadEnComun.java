package ar.edu.unq.po2.tp8;

import java.util.Map;

public class FiltroPropiedadEnComun extends Filtros{

	@Override
	protected boolean sonSimilares(WikipediaPage pag1, WikipediaPage pag2) {
		return hayAlMenosUnaPropiedadEnComunEntre(pag1.getInfobox(), pag2.getInfobox());
	}

	private boolean hayAlMenosUnaPropiedadEnComunEntre(Map<String, WikipediaPage> infobox, Map<String, WikipediaPage> infobox2) {
		for(String info : infobox.keySet()) {
			if(infobox2.containsKey(info)) {
				return true;
			}
		}
		return false;
	}
	
}
