package fr.oga.tracking;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrackingRepository extends JpaRepository<TrackingData,Long > {
    List<TrackingData> findByUserName(String username);
}
