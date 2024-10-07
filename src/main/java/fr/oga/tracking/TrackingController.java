package fr.oga.tracking;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tracking")
@RequiredArgsConstructor
@CrossOrigin("*")
public class TrackingController {

    private final TrackingService trackingService;

    @PostMapping()
    public ResponseEntity<TrackingData> save(@RequestBody TrackingData trackingData){
        return new ResponseEntity<>(trackingService.save(trackingData), HttpStatus.CREATED);
    }
    @GetMapping()
    public ResponseEntity<List<TrackingData>> getAll(){
        return new ResponseEntity<>(trackingService.getAll(), HttpStatus.OK);
    }
    @GetMapping("/{username}")
    public ResponseEntity<List<TrackingData>> getByUsername(@PathVariable String username){
        return new ResponseEntity<>(trackingService.getAllByUsername(username), HttpStatus.OK);
    }

}
