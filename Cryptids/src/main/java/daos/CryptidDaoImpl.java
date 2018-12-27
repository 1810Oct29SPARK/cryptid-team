package daos;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Cryptid;
import util.ConnectionUtil;

public class CryptidDaoImpl implements CryptidDao {
	private static final String filename = "connection.properties";

	public void createRequest(Cryptid c) {
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "INSERT INTO CRYPTID_CRYPTIDS(CRYPTIDID,NAME,DIET,AVG_1WEIGHT,CLASS) VALUES (?,?,?,?,?)";
			PreparedStatement p = con.prepareStatement(sql);
			p.setInt(1, c.getId());
			p.setString(2, c.getName());
			p.setString(3, c.getDiet());
			p.setInt(4, c.getAvgWeight());
			p.setString(5, c.getCategory());
			p.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void deleteRequest(Cryptid c) {

		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "DELETE FROM CRYPTID_CRYPTIDS WHERE CRYPTIDID=?";
			PreparedStatement p = con.prepareStatement(sql);
			p.setInt(1, c.getId());
			p.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Cryptid getAccountsById(int id) {
		Cryptid cl = null;
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "SELECT * FROM CRYPTID_CRYPTIDS WHERE CryptidID = ?";
			PreparedStatement p = con.prepareStatement(sql);
			p.setInt(1, id);
			ResultSet rs = p.executeQuery();
			while (rs.next()) {
				int cid = rs.getInt("CRYPTIDID");
				String name = rs.getString("NAME");
				String diet = rs.getString("DIET");
				int weight = rs.getInt("AVG_1WEIGHT");
				String category = rs.getString("CLASS");
				cl= new Cryptid(cid, name, diet, weight, category);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return cl;
	}

	public void updateRequest(Cryptid c) {
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "UPDATE CRYPTID_CRYPTIDS SET AVG_1WEIGHT = ? WHERE CRYPTIDID = ?";
			PreparedStatement p = con.prepareStatement(sql);
			p.setInt(1, c.getAvgWeight());
			p.setInt(2, c.getId());
			p.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
