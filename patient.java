public class patient extends information //คลาส patient extends มาจากคลาส information
{
  //setค่าเพื่อเก็บไว้ใน String
  
 public String Address; 
 public String Phone;  
 public String DD; 
 public String MM;
 public String YY;
  
  public void setPatient(String address,String phone,String dd,String mm,String yy) //เมธอด
  {
    this.Address = address; //ค่า ของคลาส patient 
    this.Phone = phone;  //ค่า ของคลาส patient
    this.DD = dd;  //ค่า ของคลาส patient
    this.MM = mm;  //ค่า ของคลาส patient
    this.YY = yy;  //ค่า ของคลาส patient
  }
   public String getAddress() //เมธอด
  {
    return this.Address;  //returnค่า address 
  }
  
   public String getPhone() // เมธอด
  {
    return this.Phone;  //return ค่า phone   
  }
  
   public String getDD() // เมธอด
  {
    return this.DD; //return ค่า dd      
  }

   public String getMM() //เมธอด
  {
    return this.MM; //return ค่า mm      
  }
  
   public String getYY() //เมธอด
  {
    return this.YY;  //return ค่า yy    
  }
}
