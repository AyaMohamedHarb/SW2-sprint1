package controller;

import Repository.UserRep;

import javax.xml.ws.RequestWrapper;

@Entity
public class User {
    @Id
    String email;
    String name,pass;

    UserRep user;
    public void setEmail(String email) {
        this.email = email;
    }

    public void setPass(String pass) {

        this.pass = pass;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getEmail() {

        return email;
    }

    public String getPass() {

        return pass;
    }

    public String getName() {

        return name;
    }
    @RequestMapping(value = "/login/{name}/{pass}",method = RequestMethod.POST)
    boolean login(@PathVariable String n,@PathVariable String p)
    {

    }

    @RequestMapping(value = "/login/{name}/{email}/{pass}/{confirmpass}",method = RequestMethod.POST)
    boolean register(@PathVariable String n,@PathVariable String e,@PathVariable String p,@PathVariable String copass)
    {
        if(p.equals(copass))
        {
            return false;
        }
        User u=new Admin();
        u.setName(n);
        u.setEmail(e);
        u.getPass(p);
        user.save(u);

    }
}
