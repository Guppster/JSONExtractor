package com.company;

/**
 * @author: Gurpreet
 */
public class Object 
{
    private int id;
    private int type;
    private String content; 
    private boolean active;
    
    public Object(int id, int type, String content, boolean active)
    {
        this.id = id;
        this.type = type;
        this.content = content;
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
    public String toString()
    {
        String output = "ID: " + id + "\nType: " + type + "\nContent: " + content + "\nActive: " + active;
        return output;
    }
}//End of Object class
