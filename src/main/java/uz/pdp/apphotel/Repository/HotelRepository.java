package uz.pdp.apphotel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.apphotel.Entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {
}
