package hoctap;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSONFile {

	public static void main(String[] args) {
		JSONParser parser = new JSONParser();

		try {
			// Đường dẫn tới file JSON
			String filePath = "minhphuc.json";

			// Đọc file JSON
			Object obj = parser.parse(new FileReader(filePath));
			JSONObject jsonObject = (JSONObject) obj;

			// In ra các giá trị từ file JSON
			System.out.println("Các giá trị từ file JSON:");
			for (Object key : jsonObject.keySet()) {
				System.out.println(key + ": " + jsonObject.get(key));
			}
		} catch (IOException e) {
			// Xử lý ngoại lệ IOException khi có vấn đề với việc đọc file
			e.printStackTrace();
		} catch (ParseException e) {
			// Xử lý ngoại lệ ParseException khi có vấn đề với cú pháp JSON
			e.printStackTrace();
		}
	}
}
