package ua.angelin.classes;

/**
 * Created by Ангелин on 24.10.2015.
 */
public class Post implements Comparable {
    int id;
    String txt;

    public Post() {

    }

    public Post(int id, String txt) {
        this.id = id;
        this.txt = txt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    @Override
    public int compareTo(Object object) {
        Post post = (Post) object;
        if (post.getId() < id) {
                return 1;
        }
        if (post.getId() > id){
            return -1;
        }
        return 0;
    }
}
