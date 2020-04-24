package CW7;
import java.util.ArrayList;
public class House {
    private static int ROOM_Counter = 0;
    private ArrayList<Room> room;
    private String adress;

    public House(String adress, ArrayList<Room> room) {
        this.adress = adress;
     this.room=room;
    }

    public static House createHouse(String adress) {
        ArrayList<Room> List = new ArrayList<>();
        House Home = new House(adress, List);
        return Home;

    }

    public void addRoom(Room rooms) {
        ArrayList<Room> room = this.room;
        room.add(rooms);
        this.room = room;
        ROOM_Counter++;

    }

    public void addRoom(ArrayList<Room> newRooms) {
        ArrayList<Room> room = this.room;
        int i;
        for (i = 0; i < newRooms.size(); i++) {
            room.add(newRooms.get(i));
            ROOM_Counter++;
        }
        }
        public int getRoom_Counter () {

            return ROOM_Counter;
        }
    }

