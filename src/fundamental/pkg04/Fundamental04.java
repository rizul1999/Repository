/*
 *  Rizul handa
 *  Student id:991527061
 *  SYST10199- web programming
 */
 
package fundamental.pkg04;

/**
 *
 * @author rizuh
 */


public class Fundamental04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
public class Address {
	private String street, city, state, zip;

	public Address()
	{
		street = "29 locomotive cres ";
		city = "Brampton";
		state = "Ontario";
		zip = "L7A0T6";
	}

	public Address(String street, String city, String state, String zip) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

public void setStreet (String street)

    {

	this.street=street;
    }

 public String getstreet()

 {
	 return this.street;
	 }


public void setCity (String city)

    {

	this.city=city;
    }

 public String getcity()

 {
	 return this.city;
	 }


public void setState (String state)

    {

	this.state=state;
    }

 public String getstate()

 {
	 return this.state;
	 }


	 public void setZip (String zip)

	     {

	 	this.zip=zip;
	     }

	  public String getzip()

	  {
	 	 return this.zip;
	 }



	public String toString() {
		return  (street + ", " + city + ", " + state + " " + zip);
	}
 public boolean equals (Object obj)
{
	Address a = (Address)obj;
	return (this.getstreet()==a.getstreet() &&  this.getcity()==a.getcity() && this.getstate()==a.getstate() && this.getzip()==a.getzip() );
}
}
}
