package joao.tcc.mono.app.web.rest;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class TestResource {
	
	
	@GetMapping("/matriz")
	public void test(){
	    CalculadoraMatriz.init(300);
	}
	
	@GetMapping("/collection")
	public ResponseEntity<ArrayList<Integer>> getSort(){
		return ResponseEntity.ok(CollectionTest.init());
	}

    
}
