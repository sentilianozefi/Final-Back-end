package Hotel.Project.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;

import Hotel.Project.model.Hotel;

public interface HotelService {
    public abstract void updateRooms(Integer id, Hotel room);
    public abstract Collection<Hotel> getRooms() throws FileNotFoundException, IOException;
    public abstract Collection<Hotel> getFreeRooms() throws FileNotFoundException, IOException;
    public abstract Collection<Hotel> getwithJacuzzi() throws FileNotFoundException, IOException;
    public abstract Collection<Hotel> getwithBreakfast() throws FileNotFoundException, IOException;
}
