package ua.angelin.classes;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Ангелин on 24.10.2015.
 */
public class DAO {
    static List<Post> postList;
    /*static{
        postList = new ArrayList<>();
        postList.add(new Post(1, "Andrey"));
        postList.add(new Post(2, "Sveta"));
        postList.add(new Post(3, "Vova"));
    }*/

    public static List<Post> getPostList(){
        Connection connection = DBConnection.getConnection();
        postList = new ArrayList<>();
        try {
            Statement st = connection.createStatement();
            ResultSet resultSet = st.executeQuery("SELECT * FROM post");
            while(resultSet.next()){
                Post post = new Post();
                post.setId(resultSet.getInt("ID"));
                post.setTxt(resultSet.getNString("name"));
                postList.add(post);
                Collections.sort(postList);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            DBConnection.closeConnection();
        }
        return postList;

    }

    public static void deleteByID(int id){
        /*Iterator iterator = postList.iterator();
        while (iterator.hasNext()){
            Post p = (Post)iterator.next();
            if (p.getId() == id){
                iterator.remove();
            }
        }*/

        Connection connection = DBConnection.getConnection();
        try {
            PreparedStatement st = connection.prepareStatement("DELETE FROM post WHERE ID=?");
            st.setInt(1, id);
            st.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            DBConnection.closeConnection();
        }
    }

    public static void addPost(String txt){
        Post post = new Post(postList.size() + 1, txt);
        Connection connection = DBConnection.getConnection();
        try {
            PreparedStatement st = connection.prepareStatement("INSERT INTO post(name) VALUES(?)");
            st.setString(1, txt);
            st.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            DBConnection.closeConnection();
        }
    }
}
