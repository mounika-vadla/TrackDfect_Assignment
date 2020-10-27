package com.test.utility;
import java.util.ArrayList;

public class TestUtil {
public static Xls_Reader reader;
	public static ArrayList<Object[]> getDataFromExcel() {
		
		ArrayList<Object[]> myData=new ArrayList<Object[]>();
		try {
			reader=new Xls_Reader("./src/com/test/utility/ExcelData.xlsx");
		}catch(Exception e) {
			e.printStackTrace();
		}
		for(int rowNo=2;rowNo<3;rowNo++)
		{
			String emailId=reader.getCellData("AmazonData","emailId",rowNo);
			String password=reader.getCellData("AmazonData","password",rowNo);
			String fullName=reader.getCellData("AmazonData","fullName",rowNo);
			String phoneNo=reader.getCellData("AmazonData","phoneNo",rowNo);
			String postalCode=reader.getCellData("AmazonData","postalCode",rowNo);
			String address=reader.getCellData("AmazonData","address",rowNo);
			String area=reader.getCellData("AmazonData","area",rowNo);
			String landmark=reader.getCellData("AmazonData","landmark",rowNo);
			String city=reader.getCellData("AmazonData","city",rowNo);
			Object obj[]= { emailId,password,fullName,phoneNo,postalCode,address,area,landmark,city};
			myData.add(obj);
		}
		return myData;
	}
	
}
