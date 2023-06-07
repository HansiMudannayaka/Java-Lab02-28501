
package com.mycompany.itemmain;

public class Item {
    protected int loc;
    protected String Desc;

   
    public Item(int loc, String Desc) {
        this.loc = loc;
        this.Desc = Desc;
    }

   
    public int getLocation() {
        return loc;
    }

  
    public void setLocation(int loc) {
        this.loc = loc;
    }

   
    public String getDescription() {
        return Desc;
    }

   
    public void setDescription(String Desc) {
        this.Desc = Desc;
    }
}

