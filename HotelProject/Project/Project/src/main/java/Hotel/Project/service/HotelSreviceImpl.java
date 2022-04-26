package Hotel.Project.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import Hotel.Project.model.Hotel;

@Service
public class HotelSreviceImpl implements HotelService{
        private static Map<Integer, Hotel> rooms = new HashMap<Integer, Hotel>();
        private final AtomicLong id = new AtomicLong();

        public HotelSreviceImpl(){
        try (BufferedReader br = new BufferedReader(new FileReader("Hotel.csv"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");
                    for (int i = 0;i < values.length;i++) {
                        values[i] = values[i].trim();
                    }
                    Hotel room = new Hotel((int)id.incrementAndGet(), values[0], values[1], values[2], values[3], values[4], values[5], Boolean.parseBoolean(values[6]), values[7]);
                    rooms.put(id.intValue(), room);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }}

        @Override
        public void updateRooms(Integer id, Hotel room) {
            
            rooms.remove(id);
            room.setId(id);
            rooms.put(room.getId(), room);

        }

        @Override
        public Collection<Hotel> getRooms() throws FileNotFoundException, IOException {
            return rooms.values();
        }

        @Override
        public Collection<Hotel> getFreeRooms() throws FileNotFoundException, IOException {
        Map<Integer, Hotel> newMap = new HashMap<Integer, Hotel>();
        AtomicLong counter = new AtomicLong();

        for(Map.Entry<Integer, Hotel> el : rooms.entrySet()) {
            if(!el.getValue().getReserved())
                newMap.put((int)counter.incrementAndGet(), el.getValue());
        }            
            return newMap.values();
      
    }

        @Override
        public Collection<Hotel> getwithJacuzzi() throws FileNotFoundException, IOException {
            Map<Integer, Hotel> newMap = new HashMap<Integer, Hotel>();
        AtomicLong counter = new AtomicLong();

        for(Map.Entry<Integer, Hotel> el : rooms.entrySet()) {
            if(el.getValue().getJacuzzi().equals("JACUZZI INCLUDED"))
                newMap.put((int)counter.incrementAndGet(), el.getValue());
        }            
            return newMap.values();
        }

        @Override
        public Collection<Hotel> getwithBreakfast() throws FileNotFoundException, IOException {
            Map<Integer, Hotel> newMap = new HashMap<Integer, Hotel>();
        AtomicLong counter = new AtomicLong();

        for(Map.Entry<Integer, Hotel> el : rooms.entrySet()) {
            if(el.getValue().getRoomService().equals("BREAKFAST"))
                newMap.put((int)counter.incrementAndGet(), el.getValue());
        }            
            return newMap.values();
        }
}

