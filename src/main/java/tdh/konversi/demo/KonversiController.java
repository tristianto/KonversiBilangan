package tdh.konversi.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class KonversiController {
		
	@PostMapping(path = "/", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	  public String angka(@RequestBody KonversiPOJO KP) throws Exception {
		System.out.println("INPUT ANGKA :"+KP.getAngka());
		KonversiAngka KA = new KonversiAngka();
		System.out.println(KA.angka(Integer.valueOf(KP.getAngka())));
	    return KA.angka(Integer.valueOf(KP.getAngka()));
	  }
	
	/*========== EOC ==========*/
}
