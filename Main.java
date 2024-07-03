import java.util.Scanner; //คำสั่งที่ไว้เรียกใช้ตัวScanner
class Main //คลาสmain
  { 
  public static void main(String[] args)
  {
     int num; //เซต int ให้เก็บใน num
    Scanner in = new Scanner(System.in); //สร้างตัวรับค่า
    patient p1 = new patient(); //เรียกใช้คลาส patient
    symptom s1 = new symptom(); //เรียกใช้คลาส symptom
    bmi b1 = new bmi();  //เรียกใช้คลาส bmi
    p1.setPatient("address", "phone", "dd", "mm", "yy"); //เรียกใช้เมธอด setPatient ในคลาส Patient
    do //ตัวเริ่มลูป do-while
    {         //ปีกกา เปิดเพื่อเรียกใช้ฟังก์ชั่นข้างในปีกกา
    System.out.println("**************************"); //ส่วนนี้คือตัวแสดง menu//
    System.out.println("**************************"); 
    System.out.println("****       MENU       ****"); 
    System.out.println("กด 1 เพื่อเพิ่มประวัติผู้ป่วย      ");  
    System.out.println("กด 2 แสดงข้อมูลผู้ป่วย  ");        
    System.out.println("กด 3 ระดับความเสื่ยงโรคอ้วน    ");  
    System.out.println("กด 4 เพื่อออกจากโปรแกรม   ");    
    System.out.println("**************************\n"); 
    System.out.println("**************************\t"); 
    System.out.println("กด 1 , กด 2 , กด 3 , กด 4  ");  
    num = in.nextInt(); //รับค่า num แล้วไปแสดงในบรรทัดถัดไป
    
    switch (num) // เริ่ม switch โดยที่ใช้ค่า num ถ้า num = 1 ให้เริ่มทำ case 1 
  {
    case 1 : //เริ่มทำ case 1
    in.nextLine(); // รับค่า
    System.out.println(" ID : ");
    String id = in.nextLine(); //รับค่าID
    System.out.println(" กรอกชื่อของคุณ : ");
    String name = in.nextLine(); //รับค่าname
    System.out.println(" กรอกที่อยู่ของคุณ : ");
    String address = in.nextLine(); //รับค่าaddress
    System.out.println(" กรอกเบอร์โทรของคุณ : ");
    String phone = in.nextLine(); //รับค่าphone
    System.out.println(" กรอกวันที่คุณเกิด : ");
    String dd = in.nextLine(); //รับค่าวัน
    System.out.println(" กรอกเดือนที่คุณเกิด : ");
    String mm = in.nextLine(); //รับค่าเดือน
    System.out.println(" กรอกปีที่คุณเกิด : ");
    String yy = in.nextLine(); //รับค่าปี
    System.out.println(" น้ำหนักของคุณ : ");
    Double w = in.nextDouble(); //รับค่าน้ำหนัก
    System.out.println(" ส่วนสูงของคุณ : ");
    Double h = in.nextDouble(); //รับค่าส่วนสูง
    b1.cal_symptom(w,h); //เรียกใช้เมธอด cal_symptom จากคลาส bmi
    p1.setData(id,name); //เรียกใช้เมธอด setData จากคลาส patient
    p1.setPatient(address,phone,dd,mm,yy); ////เรียกใช้เมธอด setPatient จากคลาส patient
      break; //หยุดทำ case 1
    
    case 2 : //เริ่มทำ case 2
    System.out.println("แสดงข้อมูล"); 
    System.out.println(" ชื่อ: "+p1.getName()); //เรียกแสดงคลาส patient ในเมธอดgetName
    System.out.println(" ที่อยู่ : "+p1.getAddress()); //เรียกแสดงคลาส patient ในเมธอดgetAddress
    System.out.println(" เบอร์โทรศัพท์ : "+p1.getPhone()); //เรียกแสดงคลาส patient ในเมธอดgetPhone
    System.out.println(" เกิดวันที่ : "+p1.getDD()); //เรียกแสดงคลาส patient ในเมธอดgetDD
    System.out.println(" เกิดเดือน : "+p1.getMM()); //เรียกแสดงคลาส patient ในเมธอดgetMM
    System.out.println(" เกิดปี : "+p1.getYY());    //เรียกแสดงคลาส patient ในเมธอดgetYY
    System.out.println(" น้ำหนัก : "+b1.getWeight()); //เรียกแสดงคลาส bmi ในเมธอดgetWeight
    System.out.println(" ส่วนสูง : "+b1.getHeight());  //เรียกแสดงคลาส bmi ในเมธอดgetHeight
      break; //หยุด case 2
      
    case 3 : //เริ่มทำ case 3
       b1.getWeight(); //เรียกแสดงคลาส bmi ในเมธอดgetWeight
       b1.getHeight(); //เรียกแสดงคลาส bmi ในเมธอดgetWeight
       System.out.println(" ID : "+p1.getId()); //เรียกแสดงคลาส patient ในเมธอด getId
       System.out.println(" ชื่อ : "+p1.getName()); //เรียกแสดงคลาส patient ในเมธอด getName
       b1.setShowData(); //เรียกแสดงคลาส bmi ในเมธอดsetShowData
       break; //หยุด case 3
      
       case 4 :
       System.out.println("********** ออกจากโปรแกรม **********\t"); 
 
       default : System.out.println("************ จบการทำงาน ***********");
      }
    }
      while(num != 4); //จบลูป while  เมื่อ num ไม่เท่ากับ 4
  }
}
