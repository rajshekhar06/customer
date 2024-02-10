public class Room_details {
    public static String detail(int rno) {
        if (rno ==101) {
            return "Room no: 101 \nFloor no: 1";
        } else if (rno == 201) {
            return "Room no: 201 \nFloor no: 2";
        } else if (rno == 301) {
            return "Room no: 301 \nFloor no: 3";
        } else {
            return "No such floor exists";
        }
    }
}