import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {
    public List findAll() {
        List<UserInfo> list = new ArrayList<>();
        ResultSet resultSet = null;
        PreparedStatement statement = null;
        Connection connection = null;
        try {
            connection = DBUtil.connection();
            //3.写sql
            String sql = "select * from city";
            //4.得到statement对象
            statement = connection.prepareStatement(sql);
            //5.执行sql
            resultSet = statement.executeQuery();
            //6处理结果集
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String city_id = resultSet.getString(3);
                double lat = resultSet.getDouble(4);
                double lon = resultSet.getDouble(5);
                java.sql.Date fxDate = resultSet.getDate(6);
                int tempMax = resultSet.getInt(7);
                int tempMin = resultSet.getInt(8);
                String textDay = resultSet.getString(9);
                UserInfo info = new UserInfo(id, name, city_id, lat, lon, fxDate, tempMax, tempMin, textDay);
                list.add(info);

            }
            statement = connection.prepareStatement(sql);
            statement.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public  List<UserInfo> findByCity(String city){
        List<UserInfo> list = new ArrayList<>();
        ResultSet resultSet = null;
        PreparedStatement statement = null;
        Connection connection = null;
        try {
            connection = DBUtil.connection();
            //3.写sql
            String sql = "select * from city where name=?";
            //4.得到statement对象
            statement = connection.prepareStatement(sql);
            statement.setString(1,city);
            //5.执行sql
            resultSet = statement.executeQuery();
            //6处理结果集
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String city_id = resultSet.getString(3);
                double lat = resultSet.getDouble(4);
                double lon = resultSet.getDouble(5);
                java.sql.Date fxDate = resultSet.getDate(6);
                int tempMax = resultSet.getInt(7);
                int tempMin = resultSet.getInt(8);
                String textDay = resultSet.getString(9);
                UserInfo info = new UserInfo(id, name, city_id, lat, lon, fxDate, tempMax, tempMin, textDay);
                list.add(info);

            }
//            statement = connection.prepareStatement(sql);
//            statement.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public int insert(UserInfo user) {
        List<UserInfo> list = new ArrayList<>();
        ResultSet resultSet = null;
        PreparedStatement statement = null;
        Connection connection = null;
        int resultCount=0;
        String sql = "insert into city(name,city_id,lat,lon,fxDate,tempMax,tempMin,textDay) values(?,?,?,?,?,?,?,?)";
        try {
            connection = DBUtil.connection();
            //3.写sql
//          String sql = "insert into city values('2','福州','101230101','26.07530','119.30623','2002-1-13','15','7','多云')";
            //4.得到statement对象
            statement = connection.prepareStatement(sql);
//            statement.setInt(1,user.getId());
            statement.setString(1,user.getName());
            statement.setString(2,user.getCity_id());
            statement.setDouble(3,user.getLat());
            statement.setDouble(4,user.getLon());
            statement.setDate(5,user.getFxDate());
            statement.setInt(6,user.getTempMax());
            statement.setInt(7,user.getTempMin());
            statement.setString(8,user.getTextDay());
            //5.执行sql
            resultCount = statement.executeUpdate();
            //6处理结果集
//            statement = connection.prepareStatement(sql);
//            statement.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultCount;
    }


    public int update(UserInfo user){
        List<UserInfo> list = new ArrayList<>();
        ResultSet resultSet = null;
        PreparedStatement statement = null;
        Connection connection = null;
        int resultCount=0;
        String sql = "update city set name=?,city_id=?,lat=?,lon=?,fxDate=?,tempMax=?,tempMin=?,textDay=?where id=?";
        try {
            connection = DBUtil.connection();
            //3.写sql
//            String sql = "insert into city values('2','福州','101230101','26.07530','119.30623','2002-1-13','15','7','多云')";
            //4.得到statement对象
            statement = connection.prepareStatement(sql);
            statement.setString(1,user.getName());
            statement.setString(2,user.getCity_id());
            statement.setDouble(3,user.getLat());
            statement.setDouble(4,user.getLon());
            statement.setDate(5,user.getFxDate());
            statement.setInt(6,user.getTempMax());
            statement.setInt(7,user.getTempMin());
            statement.setString(8,user.getTextDay());
            statement.setInt(9,user.getId());
            //5.执行sql
            resultCount = statement.executeUpdate();
            //6处理结果集
//            statement = connection.prepareStatement(sql);
//            statement.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultCount;
    }


    public void delete(int id){
        List<UserInfo> list = new ArrayList<>();
        ResultSet resultSet = null;
        PreparedStatement statement = null;
        Connection connection = null;
        String sql = "delete from city  where id=?";
        try {
            connection = DBUtil.connection();
            //3.写sql
//            String sql = "insert into city values('2','福州','101230101','26.07530','119.30623','2002-1-13','15','7','多云')";
            //4.得到statement对象
            statement = connection.prepareStatement(sql);
            statement.setInt(1,id);
            //5.执行sql
            statement.executeUpdate();
            //6处理结果集
//            statement = connection.prepareStatement(sql);
//            statement.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void deleteAll(){
        List<UserInfo> list = new ArrayList<>();
        ResultSet resultSet = null;
        PreparedStatement statement = null;
        Connection connection = null;
        String sql = "delete from city  where id>0";
        try {
            connection = DBUtil.connection();
            //3.写sql
//            String sql = "insert into city values('2','福州','101230101','26.07530','119.30623','2002-1-13','15','7','多云')";
            //4.得到statement对象
            statement = connection.prepareStatement(sql);
//            statement.setInt(1,id);
            //5.执行sql
            statement.executeUpdate();
            //6处理结果集
//            statement = connection.prepareStatement(sql);
//            statement.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
