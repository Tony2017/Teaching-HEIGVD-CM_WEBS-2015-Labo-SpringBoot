package ch.heigvd.ptl.sc.model;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Comment {
    @Id
    private String id;
    private String author;
    private Date date;
    private String content;
    
    public String getAuthor(){
        return author;
    }
    
    public Date getDate(){
        return date;
    }
    
    public String getContent(){
        return content;
    }
    
    public void setAuthor(String author){
        this.author = author;
    }
    
    public void setDate(){
        this.date = new Date();
    }
    
    public void setContent(String content){
        this.content = content;
    }
}
