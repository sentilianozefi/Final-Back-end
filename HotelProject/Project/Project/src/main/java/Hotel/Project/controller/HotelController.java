package Hotel.Project.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Hotel.Project.model.Hotel;
import Hotel.Project.service.HotelService;

@RestController
public class HotelController {
    @Autowired
    HotelService HotelService;
    
    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "/rooms", method = RequestMethod.GET)
    public ResponseEntity<Object> getRooms() throws FileNotFoundException, IOException{
        return new ResponseEntity<>(HotelService.getRooms(), HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "/rooms/free", method = RequestMethod.GET)
    public ResponseEntity<Object> getFreeRooms() throws FileNotFoundException, IOException{
        return new ResponseEntity<>(HotelService.getFreeRooms(), HttpStatus.OK);
    }
  
    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "/rooms/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object>updateHotel(@PathVariable("id") Integer id, @RequestBody Hotel room){
        HotelService.updateRooms(id, room);
        return new ResponseEntity<>("Room has been updated successfully", HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "/rooms/jacuzzi", method = RequestMethod.GET)
    public ResponseEntity<Object> getwithJacuzzi() throws FileNotFoundException, IOException{
        return new ResponseEntity<>(HotelService.getwithJacuzzi(), HttpStatus.OK);

}

@CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "/rooms/breakfast", method = RequestMethod.GET)
    public ResponseEntity<Object> getwithBreakfast() throws FileNotFoundException, IOException{
        return new ResponseEntity<>(HotelService.getwithBreakfast(), HttpStatus.OK);

}
}
