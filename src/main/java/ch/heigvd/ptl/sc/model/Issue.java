
package ch.heigvd.ptl.sc.model;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Issue {
    @Id
    private String id;
    
    private String author;
    private String description;
    private Float longitude;
    private Float latitude;
   
    protected List<String> statusList;
    
    @DBRef
    protected List<Comment> commentList;
    
    @DBRef
    private IssueType issueType;
    
    public String getAuthor(){
        return author;
    }
    
    public String getDescription(){
        return description;
    }
    
    public Float getLongitude(){
        return longitude;
    }
    
    public Float getLatitude(){
        return latitude;
    }
    
    public void setAuthor(String author){
        this.author = author;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public void setLongitude(Float longitude){
        this.longitude = longitude;
    }
    
    public void setLatitude(Float latitude){
        this.latitude = latitude;
    }
    
    public IssueType getIssueType(){
        return issueType;
    }
    
    public List<String> getStatus(){
        return statusList;
    }
    
    public void setStatus(List<String> status){
        this.statusList = status;
    }
    
    public boolean hasStatus(String status){
        for(String issueStatus : statusList){
            if(issueStatus.equals(status)){
                return true;
            }
        }
        return false;
    }
    
    public String getId(){
        return id;
    }
    
    public List<Comment> getComment(){
        return commentList;
    }
}
