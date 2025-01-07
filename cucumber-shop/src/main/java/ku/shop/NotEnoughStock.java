package ku.shop;

// สร้าง NotEnoughStock class ให้สืบทอดมาจาก Exception
public class NotEnoughStock extends Exception {
    // คุณสามารถเพิ่มข้อความหรือ constructor ตามต้องการ
    public NotEnoughStock(String message) {
        super(message); // ส่งข้อความไปยัง constructor ของ Exception
    }
}
