
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Momshie Langs
 */
public class Users {
    
    private String id;
    private String fname;
    private String mname;
    private String lname;
    private String username;
    private String email;
    private String contact;
    private String role;
    
    public String getID() {
        return id;
    }
    
    public String setID(String id){
        return this.id = id;
    }
    
    public String getFname() {
        return fname;
    }
    
    public String setFname(String fname){
        return this.fname = fname;
    }
    
    public String getMname() {
        return mname;
    }
    
    public String setMname(String mname){
        return this.mname = mname;
    }
    
    public String getLname() {
        return lname;
    }
    
    public String setLname(String lname){
        return this.lname = lname;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String setUsername(String username){
        return this.username = username;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String setEmail(String email){
        return this.email = email;
    }
    
    public String getContact() {
        return contact;
    }
    
    public String setContact(String contact){
        return this.contact = contact;
    }
    
    public String getRole() {
        return role;
    }
    
    public String setRole(String role){
        return this.role = role;
    }
    
    public static List<Users> fromJson(String json) {
        Gson gson = new Gson();
        JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();
        Type listType = new TypeToken<List<Users>>() {
        }.getType();
        return gson.fromJson(jsonObject.get("data"), listType);
    }
}
