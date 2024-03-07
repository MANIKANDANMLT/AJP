package example4;


public class customobject {
     int id;
     String name;
     
	public customobject(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
    @Override
    public String toString() {
    	return "Custom object: "+ " id:"+id+",name :"+ name;
    }
}
