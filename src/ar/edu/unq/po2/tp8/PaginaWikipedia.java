package ar.edu.unq.po2.tp8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaginaWikipedia implements WikipediaPage{

	private String title;
    private List<WikipediaPage> links;
    private Map<String, WikipediaPage> infobox;

    public PaginaWikipedia(String title) {
        this.title = title;
        this.links = new ArrayList<>();
        this.infobox = new HashMap<>();
    }	
	
	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return this.title;
	}

	@Override
	public List<WikipediaPage> getLinks() {
		// TODO Auto-generated method stub
		return this.links;
	}

	@Override
	public Map<String, WikipediaPage> getInfobox() {
		// TODO Auto-generated method stub
		return this.infobox;
	}
	
}
