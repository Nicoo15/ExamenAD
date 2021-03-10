import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class WebScraping {

	public static Palabra buscar(Palabra palabra) {
		Palabra plbr = new Palabra();
		plbr.setPalabra(palabra);
		Document definicion;
		Document imagen;
		try {
			definicion = Jsoup.connect("https://dle.rae.es/" + palabra).get();
			imagen = Jsoup.connect("https://www.google.com/search?safe=active&tbm=isch&q=" + palabra).get();
			Elements def = definicion.getElementsByClass("j");
			Elements img = imagen.getElementsByClass("rg_i Q4LuWd");
			plbr.setDefinicion(def.get(0).text());
			plbr.setImagen(img.get(0).absUrl("src"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return plbr;
	}

}
