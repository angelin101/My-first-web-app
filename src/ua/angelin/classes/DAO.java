package ua.angelin.classes;

import ua.angelin.classes.Post;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Ангелин on 24.10.2015.
 */
public class DAO {
    static List<Post> post;
    static{
        post = new ArrayList<>();
        post.add(new Post(1, "Andrey"));
        post.add(new Post(2, "Sveta"));
        post.add(new Post(3, "Vova"));
    }

    public static List<Post> getPost(){
        return post;
    }
    public static void deleteByID(int id){
        Iterator iterator = post.iterator();
        while (iterator.hasNext()){
            Post p = (Post)iterator.next();
            if (p.getId() == id){
                iterator.remove();
            }
        }
    }
}
