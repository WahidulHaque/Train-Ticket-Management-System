//user defined package Declaration
package entities;
//class name
public class User1{
    //fields
    private int trainNo;
    String trainName,departure,departureTime,arrival,arrivalTime,ticketPrice;

    //parameterless constructor
   public User1(){}
   //parameterized constructor
    public User1(String[]values){
        this.trainName=values[0];
        this.departure=values[1];
        this.departureTime=values[2];
        this.arrival=values[3];
        this.arrivalTime=values[4];
        this.ticketPrice=values[5];
    }
    //setter methods
    public void setTrainNo(int trainNo) {
        this.trainNo = trainNo;
    }
    public void setTrainName(String trainName){
      this.trainName=trainName;
    }
    public void setDeparture(String departure){
    this.departure=departure;
    }
    public void setDepartureTime(String departureTime){
        this.departureTime=departureTime;
    }
    public void setArrival(String arrival){
        this.arrival=arrival;
    } 
    public void setArrivalTime(String arrivalTime){
        this.arrivalTime=arrivalTime;
    }
    public void setTicketPrice(String ticketPrice){
        this.ticketPrice=ticketPrice;
    }
    //getter methods
    public int getTrainNo(){
        return trainNo;
    }
    public String getTrainName(){
        return trainName;
    }
    public String getDeparture(){
        return departure;
    }
    public String getDepartureTime(){
        return departureTime;
    }
    public String getArrival(){
        return arrival;
    }
    public String getArrivalTime(){
        return arrivalTime;
    }
    public String getTicketPrice(){
        return ticketPrice;
    }
}



