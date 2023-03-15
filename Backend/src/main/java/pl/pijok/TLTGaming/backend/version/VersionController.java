package pl.pijok.TLTGaming.backend.version;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/version")
public class VersionController {

    @GetMapping("/get")
    public ResponseEntity<String> getVersion(){
        return ResponseEntity.ok("0.0.1");
    }

}
