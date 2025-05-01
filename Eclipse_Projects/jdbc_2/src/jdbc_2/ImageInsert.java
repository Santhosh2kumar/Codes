package jdbc_2;

import java.sql.*;
import java.io.*;
public class ImageInsert {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/mydb";
		String query = "INSERT INTO IMAGE_TABLE(IMAGE_DATA) VALUES(?)";
		String query2 = "SELECT * FROM IMAGE_TABLE";
		String image_path = "C:\\Users\\HP\\OneDrive\\Pictures\\749966.png";
		try {
			Connection con = DriverManager.getConnection(url,"root","2004");
			PreparedStatement st = con.prepareStatement(query);
			Statement st1 = con.createStatement();
			FileInputStream fis = new FileInputStream(image_path);
			byte[] image_data = new byte[fis.available()];
			fis.read(image_data);
			
			st.setBytes(1, image_data);
			int rows = st.executeUpdate();
			
			if(rows >0) {
				System.out.println("Image Inserted Successfully!!");
			}else {System.out.println("Image Not Inserted??	");}
			ResultSet rs = st1.executeQuery(query2);
			while(rs.next()) {
				System.out.println(rs.getInt("Image_id")+" "+rs.getBlob("Image_Data")+" "+
			rs.getTime("Upload_Date"));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}

		

	}

}
