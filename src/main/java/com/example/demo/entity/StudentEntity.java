package com.example.demo.entity;

@Entity

public class StudentEntity{
    private String username;
    private Integer id;
    private String email;
    private String password;
    private Date createAt;
    
    public String getname(){
        return name;
    }
    
    public String getemail(){
        return email;
    }
    
    public String getpassword(){
        return password;
    }
    
    public Integer getid(){
        return id;
    }
    
    public Date getcreateAt(){
        return createAt;
    }

    public String setName(String name){
        this.name=name;
    }
    public String setEmail(String email){
        this.email=email;
    }
    public String setPassword(String password){
        this.password=password;
    }
    public Integer setId(Integer id){
        this.id=id;
    }
    public void setCreated(Date created){
        this.name=created;
    }






    
}

