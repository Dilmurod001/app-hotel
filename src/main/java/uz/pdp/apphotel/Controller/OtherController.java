package uz.pdp.apphotel.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import uz.pdp.apphotel.Entity.Room;
import uz.pdp.apphotel.Repository.RoomRepository;

@RestController
@RequestMapping("/hotel")
public class OtherController {

    @Autowired
    RoomRepository roomRepository;

    @GetMapping("/getRoomByHotelId/{id}")
    public Page<Room> getRooms(@PathVariable Integer id, @RequestParam Integer page){
        Pageable pageable = PageRequest.of(page, 10);
        return roomRepository.findAllByHotelId(id,pageable);
    }
}
