package com.dstsystems.techforum.beans;

import java.math.BigDecimal;

public class Customer
{
   private BigDecimal id;
   private String first;
   private String middle;
   private String last;
   private String address;
   private String city;
   private String state;
   private String zip;

   public BigDecimal getId()
   {
      return id;
   }
   public void setId( BigDecimal id )
   {
      this.id = id;
   }
   public String getFirst()
   {
      return first;
   }
   public void setFirst( String first )
   {
      this.first = first;
   }
   public String getMiddle()
   {
      return middle;
   }
   public void setMiddle( String middle )
   {
      this.middle = middle;
   }
   public String getLast()
   {
      return last;
   }
   public void setLast( String last )
   {
      this.last = last;
   }
   public String getAddress()
   {
      return address;
   }
   public void setAddress( String address )
   {
      this.address = address;
   }
   public String getCity()
   {
      return city;
   }
   public void setCity( String city )
   {
      this.city = city;
   }
   public String getState()
   {
      return state;
   }
   public void setState( String state )
   {
      this.state = state;
   }
   public String getZip()
   {
      return zip;
   }
   public void setZip( String zip )
   {
      this.zip = zip;
   }
   
   

}

