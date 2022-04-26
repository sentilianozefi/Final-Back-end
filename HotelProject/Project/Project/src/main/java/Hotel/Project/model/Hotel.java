package Hotel.Project.model;

public class Hotel {
    private Integer id;
    private String room;
    private String beds;
    private String RoomService;
    private String jacuzzi;
    private String date;
    private String image;
    private boolean reserved;
    private String price;

    public Hotel(Integer id, String room, String beds, String RoomService, String jacuzzi, String date, String image, boolean reserved, String price){
        this.id = id;
        this.room = room;
        this.beds = beds;
        this.RoomService = RoomService;
        this.jacuzzi = jacuzzi;
        this.date = date;
        this.image = image;
        this.reserved = reserved;
        this.price = price;
    }
    
    /** 
     * @return Integer
     */
    public Integer getId(){
        return id;
    }
    
    /** 
     * @param id
     */
    public void setId(Integer id){
        this.id = id;
    }

  
  /** 
   * @return String
   */
  public String getRoom(){
      return room;
  }
  
  /** 
   * @return String
   */
  public String getBeds(){
      return beds;
  }
  
  /** 
   * @return String
   */
  public String getRoomService(){
      return RoomService;
  }
  
  /** 
   * @return String
   */
  public String getJacuzzi(){
      return jacuzzi;
  }
  
  /** 
   * @return String
   */
  public String getDate(){
      return date;
  }
  
  /** 
   * @return String
   */
  public String getImage(){
      return image;
  }
  
  /** 
   * @return boolean
   */
  public boolean getReserved(){
      return reserved;
  }

  
  /** 
   * @param room
   */
  public void setRoom(String room){
      this.room = room;
  }
  
  /** 
   * @param beds
   */
  public void setBeds(String beds){
      this.beds = beds;
  }
  
  /** 
   * @param RoomService
   */
  public void setRoomService(String RoomService){
      this.RoomService = RoomService;
  }
  
  /** 
   * @param jacuzzi
   */
  public void setJacuzzi(String jacuzzi){
      this.jacuzzi = jacuzzi;
  }
  
  /** 
   * @param date
   */
  public void setDate(String date){
      this.date = date;
  }
  
  /** 
   * @param image
   */
  public void setImage(String image){
      this.image = image;
  }
  
  /** 
   * @param reserved
   */
  public void setReserved(boolean reserved){
      this.reserved = reserved;
  }
  
  /** 
   * @return String
   */
  public String getPrice(){
      return price;
  }
  
  /** 
   * @param price
   */
  public void setPrice(String price){
      this.price = price;
  }
}
