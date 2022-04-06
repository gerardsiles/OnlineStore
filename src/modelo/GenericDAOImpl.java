package modelo;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GenericDAOImpl extends ConexionMysql implements GenericDAO {
    @Override
    public <T> List<T> selectQuery(Class<T> type, String query) throws SQLException {
        return null;
    }
}