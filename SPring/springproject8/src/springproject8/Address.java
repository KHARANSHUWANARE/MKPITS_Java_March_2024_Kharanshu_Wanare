package springproject8;

public class Address {
String stateString;

public Address(String stateString) {
	super();
	this.stateString = stateString;
}

@Override
public String toString() {
	return "Address [stateString=" + stateString + "]";
}


}