
package ch.heigvd.ptl.sc.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Issue {
    @Id
    private String id;
    
    private String author;
    private String description;
    private String coordinate;
    
    @DBRef
    private IssueType issueType;
    
    public String getAuthor(){
        return author;
    }
    
    public String getDescription(){
        return description;
    }
    
    public String getCoordinate(){
        return coordinate;
    }
    
    public void setAuthor(String author){
        this.author = author;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public void setCoordinate(String coordinate){
        this.coordinate = coordinate;
    }
}
