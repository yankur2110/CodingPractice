package java_practice;

import java.util.HashSet;
import java.util.Set;

class StringHolder {
    private String string;
 
    public StringHolder(String s) {
        this.string = s;
    }
 
    public String getString() {
        return string;
    }
 
    public void setString(String string) {
        this.string = string;
    }
 
    public boolean equals(Object o) {
        if (this == o)
            return true;
        else if (o == null || !(o instanceof StringHolder))
            return false;
        else {
            final StringHolder other = (StringHolder) o;
            if (string == null)
                return (other.string == null);
            else
                return string.equals(other.string);
        }
    }
 
    public int hashCode() {
        return (string != null ? string.hashCode() : 0);
    }
 
    public String toString() {
        return string;
    }
}
 /*
  * In below example as we have changed the value of string instance variable, hashcode of object is getting changed and hence in hashset
  * we are are h.contains as false. However we expected true.
  */
public class WhyImmutableClass{
	 public static void main(String[] args){
	    StringHolder sh = new StringHolder("blert");
	    Set<StringHolder> h = new HashSet<>();
	    h.add(sh);
	    sh.setString("moo");
	    System.out.println(h.contains(sh));
	    System.out.println(h.size());
	    System.out.println(h.iterator().next());
	 }
}