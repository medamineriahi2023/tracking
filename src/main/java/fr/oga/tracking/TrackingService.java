package fr.oga.tracking;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TrackingService {

    private final TrackingRepository trackingRepository;

        public TrackingData save(TrackingData trackingData){
            return trackingRepository.save(trackingData);
        }


        public List<TrackingData> getAll(){
            return trackingRepository.findAll();
        }

    public List<TrackingData> getAllByUsername(String username){
        return trackingRepository.findByUserName(username);
    }
}
