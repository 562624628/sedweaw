package helper;

import enums.JDBCENUM;
import objects.FieldObject;
import objects.TableMapObject;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: ConnectionHelper
 * @author: zhoulei
 * @date: 2022/2/25
 */
public class ConnectionHelper {
    private static final String SQL = "SELECT * FROM ";

    public static Connection getConnection(JDBCENUM jdbc) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(jdbc.url, jdbc.name, jdbc.password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;

    }

    public static List<TableMapObject> getTableNames(Connection conn) {

        List<TableMapObject> list = new ArrayList<>();
        ResultSet rs = null;
        try {
            //获取数据库的元数据
            DatabaseMetaData db = conn.getMetaData();
            //从元数据中获取到所有的表名
            rs = db.getTables(null, null, null, new String[]{"TABLE"});
            while (rs.next()) {
                System.out.println("-------------------------------------------------------------");
                String tableName = rs.getString(3);
                System.out.println(tableName);
                TableMapObject tableMapObject = new TableMapObject();
                tableMapObject.setTableName(tableName);
                List<FieldObject> columnNames = getColumnNames(tableName, conn);
                tableMapObject.setFieldObjectList(columnNames);
                list.add(tableMapObject);
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            closeConnection(conn);
        }
        return list;
    }

    public static List<FieldObject> getColumnNames(String tableName, Connection conn) {
        List<FieldObject> fieldObjects = new ArrayList<>();
        //与数据库的连接
        PreparedStatement pStemt = null;
        String tableSql = SQL + tableName;
        try {
            pStemt = conn.prepareStatement(tableSql);
            //结果集元数据
            ResultSetMetaData rsmd = pStemt.getMetaData();
            //表列数
            int size = rsmd.getColumnCount();
            for (int i = 0; i < size; i++) {
                FieldObject fieldObject = new FieldObject();
                fieldObject.setFieldName(rsmd.getColumnName(i + 1));
                fieldObject.setFieldType(rsmd.getColumnTypeName(i + 1));
                fieldObject.setFieldSize(rsmd.getColumnDisplaySize(i + 1));
                fieldObject.setCanIsNull(rsmd.isNullable(i+1)==0?"N":"Y");
                fieldObjects.add(fieldObject);
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                pStemt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return fieldObjects;
    }


    public static void closeConnection(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }


}
