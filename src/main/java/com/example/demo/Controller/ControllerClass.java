package com.example.demo.Controller;

import com.couchbase.client.java.repository.Repository;
import com.example.demo.Entity.Product;
import com.example.demo.Entity.User;
import com.example.demo.Repository.ProductRep;
import com.example.demo.Repository.UserRep;

import groovy.util.ConfigBinding;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@EnableJpaRepositories("Repository")
//@EntityScan("Entity")
public class ControllerClass {
    @Autowired
    private ProductRep p;
    @Autowired
    private UserRep use;

    @GetMapping("/login")
    public String index()
    {
        return "login";
    }

    @GetMapping("/login")
    public String Login()
    {
    	
        return "login";
    }

    
    @RequestMapping ("/Register")
    public String signUp() {
        
        //System.out.println(name+"  "+pass + "  " + email + "  " + type);
        return "Register";
    }
    
    @RequestMapping ("/Register")
    public String register(@RequestParam("name") String name,
    		@RequestParam("email") String email,@RequestParam("pass") String pass,
    		@RequestParam("confirmpass") String conPass)
    {
    	
    	User user=new User (name,email,pass);
    	if(use.existsById(email)==true)
    	{
    		System.out.println("exists!!");
    	}
    	else
    	{
    		use.save(user);
    	}
    	return "Register";
    	
    }
    
    /*public boolean AddProduct(@PathVariable  String n, @PathVariable String price, @PathVariable String c, @PathVariable String bname){
        Product pro=new Product(n,price,bname,c);
        p.save(pro);
        return true;

    }*/
    
    
}









