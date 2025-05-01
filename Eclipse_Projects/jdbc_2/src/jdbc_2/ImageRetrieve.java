package jdbc_2;

import java.sql.*;
import java.io.*;
public class ImageRetrieve {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/mydb";
		String query = "select Image_Data FROM IMAGE_TABLE WHERE IMAGE_ID = ?";
		String Filepath = "D:\\";
		String ImagePath = Filepath+"BlackGoku.pdf";
		try {
			Connection con = DriverManager.getConnection(url,"root","2004");
			PreparedStatement st = con.prepareStatement(query);
			st.setInt(1, 1);
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				byte[] Image = rs.getBytes("Image_Data");
			
			FileOutputStream fos = new FileOutputStream(ImagePath);
			fos.write(Image);
			System.out.println("Image  Found!!");
			}else {
				System.out.println("Image NOT Found!!");
			}
			con.close();
			rs.close();
			st.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
